package typings.reactNativeTabView.typesMod

import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerCommonProps extends js.Object {
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var springConfig: Damping = js.native
  var springVelocityScale: js.UndefOr[Double] = js.native
  var swipeEnabled: Boolean = js.native
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  var timingConfig: Duration = js.native
}

object PagerCommonProps {
  @scala.inline
  def apply(
    keyboardDismissMode: none | `on-drag` | auto,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration
  ): PagerCommonProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerCommonProps]
  }
  @scala.inline
  implicit class PagerCommonPropsOps[Self <: PagerCommonProps] (val x: Self) extends AnyVal {
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
    def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpringConfig(value: Damping): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimingConfig(value: Duration): Self = this.set("timingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeEnd(value: () => Unit): Self = this.set("onSwipeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeEnd: Self = this.set("onSwipeEnd", js.undefined)
    @scala.inline
    def setOnSwipeStart(value: () => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    @scala.inline
    def setSpringVelocityScale(value: Double): Self = this.set("springVelocityScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringVelocityScale: Self = this.set("springVelocityScale", js.undefined)
    @scala.inline
    def setSwipeVelocityImpact(value: Double): Self = this.set("swipeVelocityImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeVelocityImpact: Self = this.set("swipeVelocityImpact", js.undefined)
  }
  
}

