package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerRequest extends StObject {
  
  var headers: StringDictionary[String]
  
  var httpVersion: Double
  
  var method: String
  
  var post: String
  
  var postRaw: String
  
  var url: String
}
object WebServerRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: WebServerRequest] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHttpVersion(value: Double): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostRaw(value: String): Self = StObject.set(x, "postRaw", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
