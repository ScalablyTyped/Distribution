package typings.reactNavigationStack.typesMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.AnonTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: AnonTiming
}

object TransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => js.Any,
    transitionSpec: AnonTiming,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}

