package typings.rmcTrigger.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProptypes extends js.Object {
  var visible: Boolean = js.native
  def onClose(): Unit = js.native
  def onTargetClick(): Unit = js.native
}

object IProptypes {
  @scala.inline
  def apply(onClose: () => Unit, onTargetClick: () => Unit, visible: Boolean): IProptypes = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onTargetClick = js.Any.fromFunction0(onTargetClick), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProptypes]
  }
  @scala.inline
  implicit class IProptypesOps[Self <: IProptypes] (val x: Self) extends AnyVal {
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
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTargetClick(value: () => Unit): Self = this.set("onTargetClick", js.Any.fromFunction0(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

