package typings.restify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptions extends js.Object {
  
  var contentType: js.UndefOr[String | js.Array[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String | RegExp] = js.native
  
  var url: js.UndefOr[String | RegExp] = js.native
  
  var urlParamPattern: js.UndefOr[RegExp] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var versions: js.UndefOr[js.Array[String]] = js.native
}
object RouteOptions {
  
  @scala.inline
  def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
    
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
    def setContentTypeVarargs(value: String*): Self = this.set("contentType", js.Array(value :_*))
    
    @scala.inline
    def setContentType(value: String | js.Array[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String | RegExp): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setUrl(value: String | RegExp): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlParamPattern(value: RegExp): Self = this.set("urlParamPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlParamPattern: Self = this.set("urlParamPattern", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
