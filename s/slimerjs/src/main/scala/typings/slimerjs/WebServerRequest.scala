package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServerRequest extends StObject {
  
  var headers: StringDictionary[String] = js.native
  
  var httpVersion: Double = js.native
  
  var method: String = js.native
  
  var post: String = js.native
  
  var postRaw: String = js.native
  
  var url: String = js.native
}
object WebServerRequest {
  
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    httpVersion: Double,
    method: String,
    post: String,
    postRaw: String,
    url: String
  ): WebServerRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], postRaw = postRaw.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerRequest]
  }
  
  @scala.inline
  implicit class WebServerRequestMutableBuilder[Self <: WebServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpVersion(value: Double): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostRaw(value: String): Self = StObject.set(x, "postRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
