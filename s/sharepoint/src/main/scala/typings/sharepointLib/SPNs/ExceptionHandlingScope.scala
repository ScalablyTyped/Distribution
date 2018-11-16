package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ExceptionHandlingScope")
@js.native
class ExceptionHandlingScope protected () extends js.Object {
  def this(context: ClientRuntimeContext) = this()
  def get_errorMessage(): java.lang.String = js.native
  def get_hasException(): scala.Boolean = js.native
  def get_processed(): scala.Boolean = js.native
  def get_serverErrorCode(): scala.Double = js.native
  def get_serverErrorDetails(): js.Any = js.native
  def get_serverErrorTypeName(): java.lang.String = js.native
  def get_serverErrorValue(): java.lang.String = js.native
  def get_serverStackTrace(): java.lang.String = js.native
  def startCatch(): js.Any = js.native
  def startFinally(): js.Any = js.native
  def startScope(): js.Any = js.native
  def startTry(): js.Any = js.native
}

