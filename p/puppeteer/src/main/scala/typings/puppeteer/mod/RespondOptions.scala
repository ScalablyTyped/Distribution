package typings.puppeteer.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RespondOptions extends StObject {
  
  /** Specifies the response body. */
  var body: js.UndefOr[Buffer | String] = js.undefined
  
  /** Specifies the Content-Type response header. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Specifies the response headers. */
  var headers: js.UndefOr[Headers] = js.undefined
  
  /**
    * Specifies the response status code.
    * @default 200
    */
  var status: js.UndefOr[Double] = js.undefined
}
object RespondOptions {
  
  inline def apply(): RespondOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondOptions]
  }
  
  extension [Self <: RespondOptions](x: Self) {
    
    inline def setBody(value: Buffer | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
