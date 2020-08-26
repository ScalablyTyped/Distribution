package typings.reactImageMagnifiers.mod

import typings.reactImageMagnifiers.anon.ClickMoveLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MagnifierProps extends CommonProps {
  var cursorStyleActive: js.UndefOr[String] = js.native
  var dragToMove: js.UndefOr[Boolean] = js.native
  var interactionSettings: js.UndefOr[ClickMoveLimit] = js.native
  var mouseActivation: js.UndefOr[MouseActivation] = js.native
  var touchActivation: js.UndefOr[TouchActivation] = js.native
}

object MagnifierProps {
  @scala.inline
  def apply(imageSrc: String): MagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierProps]
  }
  @scala.inline
  implicit class MagnifierPropsOps[Self <: MagnifierProps] (val x: Self) extends AnyVal {
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
    def setCursorStyleActive(value: String): Self = this.set("cursorStyleActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorStyleActive: Self = this.set("cursorStyleActive", js.undefined)
    @scala.inline
    def setDragToMove(value: Boolean): Self = this.set("dragToMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragToMove: Self = this.set("dragToMove", js.undefined)
    @scala.inline
    def setInteractionSettings(value: ClickMoveLimit): Self = this.set("interactionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionSettings: Self = this.set("interactionSettings", js.undefined)
    @scala.inline
    def setMouseActivation(value: MouseActivation): Self = this.set("mouseActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseActivation: Self = this.set("mouseActivation", js.undefined)
    @scala.inline
    def setTouchActivation(value: TouchActivation): Self = this.set("touchActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchActivation: Self = this.set("touchActivation", js.undefined)
  }
  
}

