package typings.sentryTypes.miscMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractedNodeRequestData
  extends /* key */ StringDictionary[js.Any] {
  
  /** String representing the cookies sent along with the request */
  var cookies: js.UndefOr[StringDictionary[String]] = js.native
  
  /** Any data sent in the request's body, as a JSON string */
  var data: js.UndefOr[String] = js.native
  
  /** Specific headers from the request */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**  The request's method */
  var method: js.UndefOr[String] = js.native
  
  /** The request's query string, without the leading '?' */
  var query_string: js.UndefOr[String] = js.native
  
  /** The request's URL, including query string */
  var url: js.UndefOr[String] = js.native
}
object ExtractedNodeRequestData {
  
  @scala.inline
  def apply(): ExtractedNodeRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractedNodeRequestData]
  }
  
  @scala.inline
  implicit class ExtractedNodeRequestDataOps[Self <: ExtractedNodeRequestData] (val x: Self) extends AnyVal {
    
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
    def setCookies(value: StringDictionary[String]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQuery_string(value: String): Self = this.set("query_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_string: Self = this.set("query_string", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
