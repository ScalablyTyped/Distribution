package typings.reactElemental.mod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalState extends js.Object {
  val modal: HTMLDivElement = js.native
  val windowHeight: Double = js.native
  val windowWidth: Double = js.native
}

object ModalState {
  @scala.inline
  def apply(modal: HTMLDivElement, windowHeight: Double, windowWidth: Double): ModalState = {
    val __obj = js.Dynamic.literal(modal = modal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalState]
  }
  @scala.inline
  implicit class ModalStateOps[Self <: ModalState] (val x: Self) extends AnyVal {
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
    def setModal(value: HTMLDivElement): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
  
}

