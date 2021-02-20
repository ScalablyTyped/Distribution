package typings.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SOAPResponseV2 extends StObject {
  
  def getBody(): String = js.native
  
  def getErrorCode(): Double = js.native
  
  def getErrorMessage(): String = js.native
  
  def getHeader(name: String): String = js.native
  
  def getHeaders(): js.Object = js.native
  
  def getStatusCode(): Double = js.native
  
  def haveError(): Boolean = js.native
  
  def waitForResponse(timeoutSecs: Double): Unit = js.native
}
object SOAPResponseV2 {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SOAPResponseV2MutableBuilder[Self <: SOAPResponseV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBody(value: () => String): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Object): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusCode(value: () => Double): Self = StObject.set(x, "getStatusCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHaveError(value: () => Boolean): Self = StObject.set(x, "haveError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWaitForResponse(value: Double => Unit): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1(value))
  }
}
