package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionHandlingScope extends StObject {
  
  def get_errorMessage(): String
  
  def get_hasException(): Boolean
  
  def get_processed(): Boolean
  
  def get_serverErrorCode(): Double
  
  def get_serverErrorDetails(): Any
  
  def get_serverErrorTypeName(): String
  
  def get_serverErrorValue(): String
  
  def get_serverStackTrace(): String
  
  def startCatch(): Any
  
  def startFinally(): Any
  
  def startScope(): Any
  
  def startTry(): Any
}
object ExceptionHandlingScope {
  
  inline def apply(
    get_errorMessage: () => String,
    get_hasException: () => Boolean,
    get_processed: () => Boolean,
    get_serverErrorCode: () => Double,
    get_serverErrorDetails: () => Any,
    get_serverErrorTypeName: () => String,
    get_serverErrorValue: () => String,
    get_serverStackTrace: () => String,
    startCatch: () => Any,
    startFinally: () => Any,
    startScope: () => Any,
    startTry: () => Any
  ): ExceptionHandlingScope = {
    val __obj = js.Dynamic.literal(get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_hasException = js.Any.fromFunction0(get_hasException), get_processed = js.Any.fromFunction0(get_processed), get_serverErrorCode = js.Any.fromFunction0(get_serverErrorCode), get_serverErrorDetails = js.Any.fromFunction0(get_serverErrorDetails), get_serverErrorTypeName = js.Any.fromFunction0(get_serverErrorTypeName), get_serverErrorValue = js.Any.fromFunction0(get_serverErrorValue), get_serverStackTrace = js.Any.fromFunction0(get_serverStackTrace), startCatch = js.Any.fromFunction0(startCatch), startFinally = js.Any.fromFunction0(startFinally), startScope = js.Any.fromFunction0(startScope), startTry = js.Any.fromFunction0(startTry))
    __obj.asInstanceOf[ExceptionHandlingScope]
  }
  
  extension [Self <: ExceptionHandlingScope](x: Self) {
    
    inline def setGet_errorMessage(value: () => String): Self = StObject.set(x, "get_errorMessage", js.Any.fromFunction0(value))
    
    inline def setGet_hasException(value: () => Boolean): Self = StObject.set(x, "get_hasException", js.Any.fromFunction0(value))
    
    inline def setGet_processed(value: () => Boolean): Self = StObject.set(x, "get_processed", js.Any.fromFunction0(value))
    
    inline def setGet_serverErrorCode(value: () => Double): Self = StObject.set(x, "get_serverErrorCode", js.Any.fromFunction0(value))
    
    inline def setGet_serverErrorDetails(value: () => Any): Self = StObject.set(x, "get_serverErrorDetails", js.Any.fromFunction0(value))
    
    inline def setGet_serverErrorTypeName(value: () => String): Self = StObject.set(x, "get_serverErrorTypeName", js.Any.fromFunction0(value))
    
    inline def setGet_serverErrorValue(value: () => String): Self = StObject.set(x, "get_serverErrorValue", js.Any.fromFunction0(value))
    
    inline def setGet_serverStackTrace(value: () => String): Self = StObject.set(x, "get_serverStackTrace", js.Any.fromFunction0(value))
    
    inline def setStartCatch(value: () => Any): Self = StObject.set(x, "startCatch", js.Any.fromFunction0(value))
    
    inline def setStartFinally(value: () => Any): Self = StObject.set(x, "startFinally", js.Any.fromFunction0(value))
    
    inline def setStartScope(value: () => Any): Self = StObject.set(x, "startScope", js.Any.fromFunction0(value))
    
    inline def setStartTry(value: () => Any): Self = StObject.set(x, "startTry", js.Any.fromFunction0(value))
  }
}
