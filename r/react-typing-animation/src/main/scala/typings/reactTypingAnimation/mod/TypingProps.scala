package typings.reactTypingAnimation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypingProps extends js.Object {
  var children: ReactNode = js.native
  var className: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[ReactNode] = js.native
  var cursorClassName: js.UndefOr[String] = js.native
  var hideCursor: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var onAfterType: js.UndefOr[js.Function0[Unit]] = js.native
  var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.native
  var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.native
  var speed: js.UndefOr[Double] = js.native
  var startDelay: js.UndefOr[Double] = js.native
}

object TypingProps {
  @scala.inline
  def apply(): TypingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypingProps]
  }
  @scala.inline
  implicit class TypingPropsOps[Self <: TypingProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCursor(value: ReactNode): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCursorClassName(value: String): Self = this.set("cursorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorClassName: Self = this.set("cursorClassName", js.undefined)
    @scala.inline
    def setHideCursor(value: Boolean): Self = this.set("hideCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideCursor: Self = this.set("hideCursor", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setOnAfterType(value: () => Unit): Self = this.set("onAfterType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAfterType: Self = this.set("onAfterType", js.undefined)
    @scala.inline
    def setOnBeforeType(value: () => Unit): Self = this.set("onBeforeType", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBeforeType: Self = this.set("onBeforeType", js.undefined)
    @scala.inline
    def setOnFinishedTyping(value: () => Unit): Self = this.set("onFinishedTyping", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFinishedTyping: Self = this.set("onFinishedTyping", js.undefined)
    @scala.inline
    def setOnStartedTyping(value: () => Unit): Self = this.set("onStartedTyping", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStartedTyping: Self = this.set("onStartedTyping", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
  }
  
}

