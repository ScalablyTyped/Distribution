package typings
package sharepointLib.SPClientFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientForms.ClientForm")
@js.native
class ClientForm protected () extends js.Object {
  def this(qualifier: java.lang.String) = this()
  def NotifyControlEvent(eventName: FormManagerEvents, fldName: java.lang.String, eventArg: js.Any): scala.Unit = js.native
  def RenderClientForm(): scala.Unit = js.native
  def SubmitClientForm(): scala.Boolean = js.native
}

