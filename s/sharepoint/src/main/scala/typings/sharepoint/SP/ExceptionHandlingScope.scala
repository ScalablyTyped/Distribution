package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionHandlingScope extends js.Object {
  
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
  implicit class ExceptionHandlingScopeOps[Self <: ExceptionHandlingScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_errorMessage(value: () => String): Self = this.set("get_errorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_hasException(value: () => Boolean): Self = this.set("get_hasException", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_processed(value: () => Boolean): Self = this.set("get_processed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorCode(value: () => Double): Self = this.set("get_serverErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorDetails(value: () => js.Any): Self = this.set("get_serverErrorDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorTypeName(value: () => String): Self = this.set("get_serverErrorTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverErrorValue(value: () => String): Self = this.set("get_serverErrorValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_serverStackTrace(value: () => String): Self = this.set("get_serverStackTrace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartCatch(value: () => js.Any): Self = this.set("startCatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartFinally(value: () => js.Any): Self = this.set("startFinally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartScope(value: () => js.Any): Self = this.set("startScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartTry(value: () => js.Any): Self = this.set("startTry", js.Any.fromFunction0(value))
  }
}
