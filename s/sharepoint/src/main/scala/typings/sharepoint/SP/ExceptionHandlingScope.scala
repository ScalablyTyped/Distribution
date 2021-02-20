package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionHandlingScope extends StObject {
  
  def get_errorMessage(): String = js.native
  
  def get_hasException(): Boolean = js.native
  
  def get_processed(): Boolean = js.native
  
  def get_serverErrorCode(): Double = js.native
  
  def get_serverErrorDetails(): js.Any = js.native
  
  def get_serverErrorTypeName(): String = js.native
  
  def get_serverErrorValue(): String = js.native
  
  def get_serverStackTrace(): String = js.native
  
  def startCatch(): js.Any = js.native
  
  def startFinally(): js.Any = js.native
  
  def startScope(): js.Any = js.native
  
  def startTry(): js.Any = js.native
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
