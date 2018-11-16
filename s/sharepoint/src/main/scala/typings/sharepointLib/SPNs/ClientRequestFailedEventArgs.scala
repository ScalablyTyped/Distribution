package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientRequestFailedEventArgs")
@js.native
class ClientRequestFailedEventArgs protected () extends ClientRequestEventArgs {
  def this(request: ClientRequest, message: java.lang.String, stackTrace: java.lang.String, errorCode: scala.Double, errorValue: java.lang.String, errorTypeName: java.lang.String, errorDetails: js.Any) = this()
  def this(request: ClientRequest, message: java.lang.String, stackTrace: java.lang.String, errorCode: scala.Double, errorValue: java.lang.String, errorTypeName: java.lang.String, errorDetails: js.Any, errorTraceCorrelationId: java.lang.String) = this()
  def get_errorCode(): scala.Double = js.native
  def get_errorDetails(): js.Any = js.native
  def get_errorTraceCorrelationId(): java.lang.String = js.native
  def get_errorTypeName(): java.lang.String = js.native
  def get_errorValue(): java.lang.String = js.native
  def get_message(): java.lang.String = js.native
  def get_stackTrace(): java.lang.String = js.native
}

