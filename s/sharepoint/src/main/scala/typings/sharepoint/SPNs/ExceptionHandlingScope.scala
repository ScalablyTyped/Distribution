package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ExceptionHandlingScope")
@js.native
class ExceptionHandlingScope protected () extends js.Object {
  def this(context: ClientRuntimeContext) = this()
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

