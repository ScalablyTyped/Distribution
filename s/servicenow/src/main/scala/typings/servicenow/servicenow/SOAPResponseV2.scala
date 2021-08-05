package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SOAPResponseV2 extends StObject {
  
  def getBody(): String
  
  def getErrorCode(): Double
  
  def getErrorMessage(): String
  
  def getHeader(name: String): String
  
  def getHeaders(): js.Object
  
  def getStatusCode(): Double
  
  def haveError(): Boolean
  
  def waitForResponse(timeoutSecs: Double): Unit
}
object SOAPResponseV2 {
  
  inline def apply(
    getBody: () => String,
    getErrorCode: () => Double,
    getErrorMessage: () => String,
    getHeader: String => String,
    getHeaders: () => js.Object,
    getStatusCode: () => Double,
    haveError: () => Boolean,
    waitForResponse: Double => Unit
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction0(getHeaders), getStatusCode = js.Any.fromFunction0(getStatusCode), haveError = js.Any.fromFunction0(haveError), waitForResponse = js.Any.fromFunction1(waitForResponse))
    __obj.asInstanceOf[SOAPResponseV2]
  }
  
  extension [Self <: SOAPResponseV2](x: Self) {
    
    inline def setGetBody(value: () => String): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
    
    inline def setGetErrorCode(value: () => Double): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    inline def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaders(value: () => js.Object): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    inline def setGetStatusCode(value: () => Double): Self = StObject.set(x, "getStatusCode", js.Any.fromFunction0(value))
    
    inline def setHaveError(value: () => Boolean): Self = StObject.set(x, "haveError", js.Any.fromFunction0(value))
    
    inline def setWaitForResponse(value: Double => Unit): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1(value))
  }
}
