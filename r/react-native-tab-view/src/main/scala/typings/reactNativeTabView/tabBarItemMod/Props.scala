package typings.reactNativeTabView.tabBarItemMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Focused
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.undefined
  var inactiveColor: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var navigationState: NavigationState[T]
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.undefined
  var route: T
  var style: StyleProp[ViewStyle]
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
  def getLabelText(scene: Scene[T]): js.UndefOr[String]
  def getTestID(scene: Scene[T]): js.UndefOr[String]
  def onLongPress(): Unit
  def onPress(): Unit
}

object Props {
  @scala.inline
  def apply[T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: () => Unit,
    onPress: () => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T,
    activeColor: String = null,
    inactiveColor: String = null,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    pressColor: String = null,
    pressOpacity: js.UndefOr[Double] = js.undefined,
    renderBadge: /* scene */ Scene[T] => ReactNode = null,
    renderIcon: /* scene */ Focused[T] => ReactNode = null,
    renderLabel: /* scene */ Focused[T] => ReactNode = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pressOpacity)) __obj.updateDynamic("pressOpacity")(pressOpacity.get.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

