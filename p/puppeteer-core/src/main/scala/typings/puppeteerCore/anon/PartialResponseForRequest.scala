package typings.puppeteerCore.anon

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<puppeteer-core.puppeteer-core.ResponseForRequest> */
trait PartialResponseForRequest extends StObject {
  
  var body: js.UndefOr[String | Buffer] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[Record[String, Any]] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
}
object PartialResponseForRequest {
  
  inline def apply(): PartialResponseForRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResponseForRequest]
  }
  
  extension [Self <: PartialResponseForRequest](x: Self) {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
