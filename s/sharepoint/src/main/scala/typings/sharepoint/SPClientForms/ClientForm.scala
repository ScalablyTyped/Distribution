package typings.sharepoint.SPClientForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientForm extends js.Object {
  def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: js.Any): Unit = js.native
  def RenderClientForm(): Unit = js.native
  def SubmitClientForm(): Boolean = js.native
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
  @scala.inline
  implicit class ClientFormOps[Self <: ClientForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotifyControlEvent(value: (FormManagerEvents, String, js.Any) => Unit): Self = this.set("NotifyControlEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setRenderClientForm(value: () => Unit): Self = this.set("RenderClientForm", js.Any.fromFunction0(value))
    @scala.inline
    def setSubmitClientForm(value: () => Boolean): Self = this.set("SubmitClientForm", js.Any.fromFunction0(value))
  }
  
}

