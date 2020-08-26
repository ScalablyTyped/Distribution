package typings.reactEventListener.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOptions extends js.Object {
  /**
    * @default false
    */
  var capture: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var passive: js.UndefOr[Boolean] = js.native
}

object EventOptions {
  @scala.inline
  def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  @scala.inline
  implicit class EventOptionsOps[Self <: EventOptions] (val x: Self) extends AnyVal {
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
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
  }
  
}

