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
  
  @scala.inline
  def apply(): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestExpiryOptions]
  }
  
  @scala.inline
  implicit class RequestExpiryOptionsMutableBuilder[Self <: RequestExpiryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteHeader(value: String): Self = StObject.set(x, "absoluteHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteHeaderUndefined: Self = StObject.set(x, "absoluteHeader", js.undefined)
    
    @scala.inline
    def setStartHeader(value: String): Self = StObject.set(x, "startHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHeaderUndefined: Self = StObject.set(x, "startHeader", js.undefined)
    
    @scala.inline
    def setTimeoutHeader(value: String): Self = StObject.set(x, "timeoutHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutHeaderUndefined: Self = StObject.set(x, "timeoutHeader", js.undefined)
  }
}
