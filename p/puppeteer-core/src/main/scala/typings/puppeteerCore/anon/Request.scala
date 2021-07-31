package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  val Request: js.Symbol
  
  val RequestFailed: js.Symbol
  
  val RequestFinished: js.Symbol
  
  val Response: js.Symbol
}
object Request {
  
  @scala.inline
  def apply(Request: js.Symbol, RequestFailed: js.Symbol, RequestFinished: js.Symbol, Response: js.Symbol): Request = {
    val __obj = js.Dynamic.literal(Request = Request.asInstanceOf[js.Any], RequestFailed = RequestFailed.asInstanceOf[js.Any], RequestFinished = RequestFinished.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: js.Symbol): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFailed(value: js.Symbol): Self = StObject.set(x, "RequestFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestFinished(value: js.Symbol): Self = StObject.set(x, "RequestFinished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: js.Symbol): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
  }
}
