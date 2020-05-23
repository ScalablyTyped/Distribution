package typings.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientForm extends js.Object {
  def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit
  def RenderClientForm(): Unit
  def SubmitClientForm(): Boolean
}

object ClientForm {
  @scala.inline
  def apply(
    NotifyControlEvent: (FormManagerEvents, String, js.Any) => Unit,
    RenderClientForm: () => Unit,
    SubmitClientForm: () => Boolean
  ): ClientForm = {
    val __obj = js.Dynamic.literal(NotifyControlEvent = js.Any.fromFunction3(NotifyControlEvent), RenderClientForm = js.Any.fromFunction0(RenderClientForm), SubmitClientForm = js.Any.fromFunction0(SubmitClientForm))
    __obj.asInstanceOf[ClientForm]
  }
}

