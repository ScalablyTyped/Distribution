package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestExpiryOptions extends StObject {
  
  /**
    * Header name of the absolute time for request expiration
    */
  var absoluteHeader: js.UndefOr[String] = js.undefined
  
  /**
    * Header name for the start time of the request
    */
  var startHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The header name for the time in milliseconds that should ellapse before the request is considered expired.
    */
  var timeoutHeader: js.UndefOr[String] = js.undefined
}
object RequestExpiryOptions {
  
  inline def apply(): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestExpiryOptions]
  }
  
  extension [Self <: RequestExpiryOptions](x: Self) {
    
    inline def setAbsoluteHeader(value: String): Self = StObject.set(x, "absoluteHeader", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteHeaderUndefined: Self = StObject.set(x, "absoluteHeader", js.undefined)
    
    inline def setStartHeader(value: String): Self = StObject.set(x, "startHeader", value.asInstanceOf[js.Any])
    
    inline def setStartHeaderUndefined: Self = StObject.set(x, "startHeader", js.undefined)
    
    inline def setTimeoutHeader(value: String): Self = StObject.set(x, "timeoutHeader", value.asInstanceOf[js.Any])
    
    inline def setTimeoutHeaderUndefined: Self = StObject.set(x, "timeoutHeader", js.undefined)
  }
}
