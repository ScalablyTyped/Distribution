package typings.puppeteer.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseForRequest extends StObject {
  
  var body: String | Buffer
  
  var contentType: String
  
  /**
    * Optional response headers. All values are converted to strings.
    */
  var headers: Record[String, Any]
  
  var status: Double
}
object ResponseForRequest {
  
  inline def apply(body: String | Buffer, contentType: String, headers: Record[String, Any], status: Double): ResponseForRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseForRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseForRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
