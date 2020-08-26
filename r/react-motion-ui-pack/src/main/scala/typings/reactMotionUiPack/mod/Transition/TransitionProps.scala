package typings.reactMotionUiPack.mod.Transition

import typings.react.mod.ReactElement
import typings.reactMotion.mod.PlainStyle
import typings.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionProps extends js.Object {
  var appear: js.UndefOr[Style] = js.native
  var component: js.UndefOr[String | Boolean | ReactElement] = js.native
  var enter: js.UndefOr[Style] = js.native
  var leave: js.UndefOr[Style] = js.native
  var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.native
  var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.native
  var runOnMount: js.UndefOr[Boolean] = js.native
}

object TransitionProps {
  @scala.inline
  def apply(): TransitionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps]
  }
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps] (val x: Self) extends AnyVal {
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
    def setAppear(value: Style): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    @scala.inline
    def setComponent(value: String | Boolean | ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setEnter(value: Style): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setLeave(value: Style): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setOnEnter(value: /* style */ PlainStyle => Unit): Self = this.set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnLeave(value: /* style */ Style => Unit): Self = this.set("onLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    @scala.inline
    def setRunOnMount(value: Boolean): Self = this.set("runOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunOnMount: Self = this.set("runOnMount", js.undefined)
  }
  
}

