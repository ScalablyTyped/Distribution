package typings.reactMdTransition.useFixedPositioningMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<@react-md/transition.@react-md/transition/types/useFixedPositioning.TransitionHooks> */
@js.native
trait ReturnValue extends js.Object {
  var onEnter: js.Any = js.native
  var onEntered: js.Any = js.native
  var onEntering: js.Any = js.native
  var onExited: js.Any = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def updateStyle(): Unit = js.native
}

object ReturnValue {
  @scala.inline
  def apply(onEnter: js.Any, onEntered: js.Any, onEntering: js.Any, onExited: js.Any, updateStyle: () => Unit): ReturnValue = {
    val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any], updateStyle = js.Any.fromFunction0(updateStyle))
    __obj.asInstanceOf[ReturnValue]
  }
  @scala.inline
  implicit class ReturnValueOps[Self <: ReturnValue] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEntered(value: js.Any): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEntering(value: js.Any): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnExited(value: js.Any): Self = this.set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateStyle(value: () => Unit): Self = this.set("updateStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

