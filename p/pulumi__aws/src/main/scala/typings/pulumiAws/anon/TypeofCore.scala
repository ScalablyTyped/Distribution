package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCore extends js.Object {
  def HTTP_DATA(): Unit = js.native
  def SEND(): Unit = js.native
  def VALIDATE_CREDENTIALS(): Unit = js.native
  def VALIDATE_PARAMETERS(): Unit = js.native
  def VALIDATE_REGION(): Unit = js.native
  def removeListener(eventName: String, eventListener: js.Function): Unit = js.native
}

object TypeofCore {
  @scala.inline
  def apply(
    HTTP_DATA: () => Unit,
    SEND: () => Unit,
    VALIDATE_CREDENTIALS: () => Unit,
    VALIDATE_PARAMETERS: () => Unit,
    VALIDATE_REGION: () => Unit,
    removeListener: (String, js.Function) => Unit
  ): TypeofCore = {
    val __obj = js.Dynamic.literal(HTTP_DATA = js.Any.fromFunction0(HTTP_DATA), SEND = js.Any.fromFunction0(SEND), VALIDATE_CREDENTIALS = js.Any.fromFunction0(VALIDATE_CREDENTIALS), VALIDATE_PARAMETERS = js.Any.fromFunction0(VALIDATE_PARAMETERS), VALIDATE_REGION = js.Any.fromFunction0(VALIDATE_REGION), removeListener = js.Any.fromFunction2(removeListener))
    __obj.asInstanceOf[TypeofCore]
  }
  @scala.inline
  implicit class TypeofCoreOps[Self <: TypeofCore] (val x: Self) extends AnyVal {
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
    def setHTTP_DATA(value: () => Unit): Self = this.set("HTTP_DATA", js.Any.fromFunction0(value))
    @scala.inline
    def setSEND(value: () => Unit): Self = this.set("SEND", js.Any.fromFunction0(value))
    @scala.inline
    def setVALIDATE_CREDENTIALS(value: () => Unit): Self = this.set("VALIDATE_CREDENTIALS", js.Any.fromFunction0(value))
    @scala.inline
    def setVALIDATE_PARAMETERS(value: () => Unit): Self = this.set("VALIDATE_PARAMETERS", js.Any.fromFunction0(value))
    @scala.inline
    def setVALIDATE_REGION(value: () => Unit): Self = this.set("VALIDATE_REGION", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveListener(value: (String, js.Function) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
  }
  
}

