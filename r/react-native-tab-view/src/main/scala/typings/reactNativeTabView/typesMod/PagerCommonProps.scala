package typings.reactNativeTabView.typesMod

import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerCommonProps extends js.Object {
  var keyboardDismissMode: none | `on-drag` | auto
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var springConfig: Damping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var timingConfig: Duration
}

object PagerCommonProps {
  @scala.inline
  def apply(
    keyboardDismissMode: none | `on-drag` | auto,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    springVelocityScale: js.UndefOr[Double] = js.undefined,
    swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  ): PagerCommonProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (!js.isUndefined(springVelocityScale)) __obj.updateDynamic("springVelocityScale")(springVelocityScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeVelocityImpact)) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerCommonProps]
  }
}

