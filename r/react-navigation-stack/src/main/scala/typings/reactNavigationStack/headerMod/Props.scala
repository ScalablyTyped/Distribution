package typings.reactNavigationStack.headerMod

import typings.reactNative.mod.Animated.Value
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.typesMod.HeaderLayoutPreset
import typings.reactNavigationStack.typesMod.HeaderMode
import typings.reactNavigationStack.typesMod.HeaderTransitionPreset
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.Scene
import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import typings.reactNavigationStack.typesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderProps & {leftLabelInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, leftButtonInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, titleFromLeftInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, layoutInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any,   theme  :string} */
trait Props extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var isLandscape: Boolean
  var layout: TransitionerLayout
  var layoutPreset: HeaderLayoutPreset
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var theme: String
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
  def layoutInterpolator(props: SceneInterpolatorProps): js.Any
  def leftButtonInterpolator(props: SceneInterpolatorProps): js.Any
  def leftLabelInterpolator(props: SceneInterpolatorProps): js.Any
  def titleFromLeftInterpolator(props: SceneInterpolatorProps): js.Any
}

object Props {
  @scala.inline
  def apply(
    isLandscape: Boolean,
    layout: TransitionerLayout,
    layoutInterpolator: SceneInterpolatorProps => js.Any,
    layoutPreset: HeaderLayoutPreset,
    leftButtonInterpolator: SceneInterpolatorProps => js.Any,
    leftLabelInterpolator: SceneInterpolatorProps => js.Any,
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    titleFromLeftInterpolator: SceneInterpolatorProps => js.Any,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    transitionPreset: HeaderTransitionPreset = null
  ): Props = {
    val __obj = js.Dynamic.literal(isLandscape = isLandscape.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], layoutInterpolator = js.Any.fromFunction1(layoutInterpolator), layoutPreset = layoutPreset.asInstanceOf[js.Any], leftButtonInterpolator = js.Any.fromFunction1(leftButtonInterpolator), leftLabelInterpolator = js.Any.fromFunction1(leftLabelInterpolator), mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], titleFromLeftInterpolator = js.Any.fromFunction1(titleFromLeftInterpolator))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1(backgroundInterpolator))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1(leftInterpolator))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1(rightInterpolator))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1(titleInterpolator))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

