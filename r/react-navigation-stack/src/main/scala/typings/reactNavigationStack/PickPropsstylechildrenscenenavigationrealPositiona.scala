package typings.reactNavigationStack

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/StackViewCard.Props, 'style' | 'children' | 'scene' | 'navigation' | 'realPosition' | 'animatedStyle' | 'position' | 'transparent'> */
trait PickPropsstylechildrenscenenavigationrealPositiona extends js.Object {
  var animatedStyle: js.Any
  var children: ReactNode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: AnimatedInterpolation
  var realPosition: Value
  var scene: Scene
  var style: StyleProp[ViewStyle]
  var transparent: js.UndefOr[Boolean] = js.undefined
}

object PickPropsstylechildrenscenenavigationrealPositiona {
  @scala.inline
  def apply(
    animatedStyle: js.Any,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    realPosition: Value,
    scene: Scene,
    children: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    transparent: js.UndefOr[Boolean] = js.undefined
  ): PickPropsstylechildrenscenenavigationrealPositiona = {
    val __obj = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsstylechildrenscenenavigationrealPositiona]
  }
}

