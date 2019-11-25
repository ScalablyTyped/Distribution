package typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod

import typings.reactDashNativeDashTabDashView.Anon_Damping
import typings.reactDashNativeDashTabDashView.Anon_Duration
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.`on-drag`
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.auto
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerCommonProps extends js.Object {
  var keyboardDismissMode: none | `on-drag` | auto
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var springConfig: Anon_Damping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var timingConfig: Anon_Duration
}

object PagerCommonProps {
  @scala.inline
  def apply(
    keyboardDismissMode: none | `on-drag` | auto,
    springConfig: Anon_Damping,
    swipeEnabled: Boolean,
    timingConfig: Anon_Duration,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    springVelocityScale: Int | Double = null,
    swipeVelocityImpact: Int | Double = null
  ): PagerCommonProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerCommonProps]
  }
}

