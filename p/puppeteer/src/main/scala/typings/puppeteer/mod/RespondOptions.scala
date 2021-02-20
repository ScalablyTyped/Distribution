package typings.puppeteer.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RespondOptions extends StObject {
  
  /** Specifies the response body. */
  var body: js.UndefOr[Buffer | String] = js.native
  
  /** Specifies the Content-Type response header. */
  var contentType: js.UndefOr[String] = js.native
  
  /** Specifies the response headers. */
  var headers: js.UndefOr[Headers] = js.native
  
  /**
    * Specifies the response status code.
    * @default 200
    */
  var status: js.UndefOr[Double] = js.native
}
object RespondOptions {
  
  @scala.inline
  def apply(): RespondOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondOptions]
  }
  
  @scala.inline
  implicit class RespondOptionsMutableBuilder[Self <: RespondOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Buffer | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
