package typings.sharepoint.SP

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestFailedEventArgs extends ClientRequestEventArgs {
  def get_errorCode(): Double
  def get_errorDetails(): js.Any
  def get_errorTraceCorrelationId(): String
  def get_errorTypeName(): String
  def get_errorValue(): String
  def get_message(): String
  def get_stackTrace(): String
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
}

