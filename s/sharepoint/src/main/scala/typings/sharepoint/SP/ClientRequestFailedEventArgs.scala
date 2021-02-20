package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientRequestFailedEventArgs extends ClientRequestEventArgs {
  
  def get_errorCode(): Double = js.native
  
  def get_errorDetails(): js.Any = js.native
  
  def get_errorTraceCorrelationId(): String = js.native
  
  def get_errorTypeName(): String = js.native
  
  def get_errorValue(): String = js.native
  
  def get_message(): String = js.native
  
  def get_stackTrace(): String = js.native
}
object ClientRequestFailedEventArgs {
  
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_errorCode: () => Double,
    get_errorDetails: () => js.Any,
    get_errorTraceCorrelationId: () => String,
    get_errorTypeName: () => String,
    get_errorValue: () => String,
    get_message: () => String,
    get_request: () => ClientRequest,
    get_stackTrace: () => String
  ): ClientRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorCode = js.Any.fromFunction0(get_errorCode), get_errorDetails = js.Any.fromFunction0(get_errorDetails), get_errorTraceCorrelationId = js.Any.fromFunction0(get_errorTraceCorrelationId), get_errorTypeName = js.Any.fromFunction0(get_errorTypeName), get_errorValue = js.Any.fromFunction0(get_errorValue), get_message = js.Any.fromFunction0(get_message), get_request = js.Any.fromFunction0(get_request), get_stackTrace = js.Any.fromFunction0(get_stackTrace))
    __obj.asInstanceOf[ClientRequestFailedEventArgs]
  }
  
  @scala.inline
  implicit class ClientRequestFailedEventArgsMutableBuilder[Self <: ClientRequestFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_errorCode(value: () => Double): Self = StObject.set(x, "get_errorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errorDetails(value: () => js.Any): Self = StObject.set(x, "get_errorDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errorTraceCorrelationId(value: () => String): Self = StObject.set(x, "get_errorTraceCorrelationId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errorTypeName(value: () => String): Self = StObject.set(x, "get_errorTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errorValue(value: () => String): Self = StObject.set(x, "get_errorValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_message(value: () => String): Self = StObject.set(x, "get_message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_stackTrace(value: () => String): Self = StObject.set(x, "get_stackTrace", js.Any.fromFunction0(value))
  }
}
