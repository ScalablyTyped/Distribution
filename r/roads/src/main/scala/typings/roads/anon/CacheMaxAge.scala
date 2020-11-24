package typings.roads.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheMaxAge extends js.Object {
  
  var cacheMaxAge: js.UndefOr[Double] = js.native
  
  var requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var responseHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var supportsCredentials: js.UndefOr[Boolean] = js.native
  
  var validMethods: js.UndefOr[js.Array[String]] = js.native
  
  var validOrigins: js.UndefOr[js.Array[String]] = js.native
}
object CacheMaxAge {
  
  @scala.inline
  def apply(): CacheMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheMaxAge]
  }
  
  @scala.inline
  implicit class CacheMaxAgeOps[Self <: CacheMaxAge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheMaxAge(value: Double): Self = this.set("cacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheMaxAge: Self = this.set("cacheMaxAge", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: StringDictionary[js.Any]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setResponseHeaders(value: StringDictionary[js.Any]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    
    @scala.inline
    def setSupportsCredentials(value: Boolean): Self = this.set("supportsCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsCredentials: Self = this.set("supportsCredentials", js.undefined)
    
    @scala.inline
    def setValidMethodsVarargs(value: String*): Self = this.set("validMethods", js.Array(value :_*))
    
    @scala.inline
    def setValidMethods(value: js.Array[String]): Self = this.set("validMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidMethods: Self = this.set("validMethods", js.undefined)
    
    @scala.inline
    def setValidOriginsVarargs(value: String*): Self = this.set("validOrigins", js.Array(value :_*))
    
    @scala.inline
    def setValidOrigins(value: js.Array[String]): Self = this.set("validOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidOrigins: Self = this.set("validOrigins", js.undefined)
  }
}
