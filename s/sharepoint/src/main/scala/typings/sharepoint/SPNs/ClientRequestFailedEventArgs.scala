package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequestFailedEventArgs")
@js.native
class ClientRequestFailedEventArgs protected () extends ClientRequestEventArgs {
  def this(
    request: ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: js.Any
  ) = this()
  def this(
    request: ClientRequest,
    message: String,
    stackTrace: String,
    errorCode: Double,
    errorValue: String,
    errorTypeName: String,
    errorDetails: js.Any,
    errorTraceCorrelationId: String
  ) = this()
  def get_errorCode(): Double = js.native
  def get_errorDetails(): js.Any = js.native
  def get_errorTraceCorrelationId(): String = js.native
  def get_errorTypeName(): String = js.native
  def get_errorValue(): String = js.native
  def get_message(): String = js.native
  def get_stackTrace(): String = js.native
}

