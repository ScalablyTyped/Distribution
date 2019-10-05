package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RequestVariable")
@js.native
class RequestVariable protected () extends ClientObject {
  def this(context: ClientRuntimeContext) = this()
  def append(value: String): Unit = js.native
  def get_value(): String = js.native
  def set(value: String): Unit = js.native
}

/* static members */
@JSGlobal("SP.RequestVariable")
@js.native
object RequestVariable extends js.Object {
  def newObject(context: ClientRuntimeContext): RequestVariable = js.native
}

