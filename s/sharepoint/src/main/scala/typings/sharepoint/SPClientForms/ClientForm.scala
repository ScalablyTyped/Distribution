package typings.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientForms.ClientForm")
@js.native
class ClientForm protected () extends js.Object {
  def this(qualifier: String) = this()
  def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit = js.native
  def RenderClientForm(): Unit = js.native
  def SubmitClientForm(): Boolean = js.native
}

