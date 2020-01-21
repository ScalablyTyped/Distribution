package typings.reactNavigationStack

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.typesMod.SceneInterpolator
import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionConfig & react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderTransitionConfig */
trait TransitionConfigHeaderTransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerBackgroundInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLayoutInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftButtonInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftLabelInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerRightInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleFromLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: AnonTiming
}

object TransitionConfigHeaderTransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => js.Any,
    transitionSpec: AnonTiming,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null,
    headerBackgroundInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLayoutInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftButtonInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerLeftLabelInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerRightInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerTitleFromLeftInterpolator: /* props */ SceneInterpolatorProps => js.Any = null,
    headerTitleInterpolator: /* props */ SceneInterpolatorProps => js.Any = null
  ): TransitionConfigHeaderTransitionConfig = {
    val __obj = js.Dynamic.literal(screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    if (headerBackgroundInterpolator != null) __obj.updateDynamic("headerBackgroundInterpolator")(js.Any.fromFunction1(headerBackgroundInterpolator))
    if (headerLayoutInterpolator != null) __obj.updateDynamic("headerLayoutInterpolator")(js.Any.fromFunction1(headerLayoutInterpolator))
    if (headerLeftButtonInterpolator != null) __obj.updateDynamic("headerLeftButtonInterpolator")(js.Any.fromFunction1(headerLeftButtonInterpolator))
    if (headerLeftInterpolator != null) __obj.updateDynamic("headerLeftInterpolator")(js.Any.fromFunction1(headerLeftInterpolator))
    if (headerLeftLabelInterpolator != null) __obj.updateDynamic("headerLeftLabelInterpolator")(js.Any.fromFunction1(headerLeftLabelInterpolator))
    if (headerRightInterpolator != null) __obj.updateDynamic("headerRightInterpolator")(js.Any.fromFunction1(headerRightInterpolator))
    if (headerTitleFromLeftInterpolator != null) __obj.updateDynamic("headerTitleFromLeftInterpolator")(js.Any.fromFunction1(headerTitleFromLeftInterpolator))
    if (headerTitleInterpolator != null) __obj.updateDynamic("headerTitleInterpolator")(js.Any.fromFunction1(headerTitleInterpolator))
    __obj.asInstanceOf[TransitionConfigHeaderTransitionConfig]
  }
}

