package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionHandlingScope extends StObject {
  
  def get_errorMessage(): String
  
  def get_hasException(): Boolean
  
  def get_processed(): Boolean
  
  def get_serverErrorCode(): Double
  
  def get_serverErrorDetails(): js.Any
  
  def get_serverErrorTypeName(): String
  
  def get_serverErrorValue(): String
  
  def get_serverStackTrace(): String
  
  def startCatch(): js.Any
  
  def startFinally(): js.Any
  
  def startScope(): js.Any
  
  def startTry(): js.Any
}
object ExceptionHandlingScope {
  
  @scala.inline
  def apply(
    get_errorMessage: () => String,
    get_hasException: () => Boolean,
    get_processed: () => Boolean,
    get_serverErrorCode: () => Double,
    get_serverErrorDetails: () => js.Any,
    get_serverErrorTypeName: () => String,
    get_serverErrorValue: () => String,
    get_serverStackTrace: () => String,
    startCatch: () => js.Any,
    startFinally: () => js.Any,
    startScope: () => js.Any,
    startTry: () => js.Any
  ): ExceptionHandlingScope = {
    val __obj = js.Dynamic.literal(get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_hasException = js.Any.fromFunction0(get_hasException), get_processed = js.Any.fromFunction0(get_processed), get_serverErrorCode = js.Any.fromFunction0(get_serverErrorCode), get_serverErrorDetails = js.Any.fromFunction0(get_serverErrorDetails), get_serverErrorTypeName = js.Any.fromFunction0(get_serverErrorTypeName), get_serverErrorValue = js.Any.fromFunction0(get_serverErrorValue), get_serverStackTrace = js.Any.fromFunction0(get_serverStackTrace), startCatch = js.Any.fromFunction0(startCatch), startFinally = js.Any.fromFunction0(startFinally), startScope = js.Any.fromFunction0(startScope), startTry = js.Any.fromFunction0(startTry))
    __obj.asInstanceOf[ExceptionHandlingScope]
  }
  
  @scala.inline
  implicit class ExceptionHandlingScopeMutableBuilder[Self <: ExceptionHandlingScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_hasException(value: () => Boolean): Self = StObject.set(x, "get_hasException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_processed(value: () => Boolean): Self = StObject.set(x, "get_processed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorCode(value: () => Double): Self = StObject.set(x, "get_serverErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorDetails(value: () => js.Any): Self = StObject.set(x, "get_serverErrorDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorTypeName(value: () => String): Self = StObject.set(x, "get_serverErrorTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorValue(value: () => String): Self = StObject.set(x, "get_serverErrorValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverStackTrace(value: () => String): Self = StObject.set(x, "get_serverStackTrace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartCatch(value: () => js.Any): Self = StObject.set(x, "startCatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartFinally(value: () => js.Any): Self = StObject.set(x, "startFinally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartScope(value: () => js.Any): Self = StObject.set(x, "startScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartTry(value: () => js.Any): Self = StObject.set(x, "startTry", js.Any.fromFunction0(value))
  }
}
