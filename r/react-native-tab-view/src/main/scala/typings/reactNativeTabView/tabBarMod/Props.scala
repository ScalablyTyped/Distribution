package typings.reactNativeTabView.tabBarMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Color
import typings.reactNativeTabView.typesMod.Event
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   scrollEnabled ? :boolean,   bounces ? :boolean,   activeColor ? :string,   inactiveColor ? :string,   pressColor ? :string,   pressOpacity ? :number, getLabelText (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getAccessible (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): boolean | undefined, getAccessibilityLabel (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getTestID (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, renderLabel ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderIcon ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused  :boolean,   color  :string}): react.react.ReactNode, renderBadge ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): react.react.ReactNode, renderIndicator (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarIndicator.Props<T>): react.react.ReactNode, onTabPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Event): void, onTabLongPress ? (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): void,   tabStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   indicatorContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   labelStyle ? :react-native.react-native.StyleProp<react-native.react-native.TextStyle>,   contentContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveColor: js.UndefOr[String] = js.undefined
  var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var layout: Layout
  var navigationState: NavigationState[T]
  var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
  var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] with Event, Unit]] = js.undefined
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  var pressColor: js.UndefOr[String] = js.undefined
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, ReactNode]] = js.undefined
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, ReactNode]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String]
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean]
  def getLabelText(scene: Scene[T]): js.UndefOr[String]
  def getTestID(scene: Scene[T]): js.UndefOr[String]
  def jumpTo(key: String): Unit
  def renderIndicator(props: typings.reactNativeTabView.tabBarIndicatorMod.Props[T]): ReactNode
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    jumpTo: String => Unit,
    layout: Layout,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    renderIndicator: typings.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactNode,
    activeColor: String = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    contentContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inactiveColor: String = null,
    indicatorContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    labelStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    onTabLongPress: /* scene */ Scene[T] => Unit = null,
    onTabPress: /* scene */ Scene[T] with Event => Unit = null,
    pressColor: String = null,
    pressOpacity: js.UndefOr[Double] = js.undefined,
    renderBadge: /* scene */ Scene[T] => ReactNode = null,
    renderIcon: /* scene */ Scene[T] with Color => ReactNode = null,
    renderLabel: /* scene */ Scene[T] with Color => ReactNode = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderIndicator = js.Any.fromFunction1(renderIndicator))
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contentContainerStyle)) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorContainerStyle)) __obj.updateDynamic("indicatorContainerStyle")(indicatorContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (onTabLongPress != null) __obj.updateDynamic("onTabLongPress")(js.Any.fromFunction1(onTabLongPress))
    if (onTabPress != null) __obj.updateDynamic("onTabPress")(js.Any.fromFunction1(onTabPress))
    if (pressColor != null) __obj.updateDynamic("pressColor")(pressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(pressOpacity)) __obj.updateDynamic("pressOpacity")(pressOpacity.get.asInstanceOf[js.Any])
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction1(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1(renderIcon))
    if (renderLabel != null) __obj.updateDynamic("renderLabel")(js.Any.fromFunction1(renderLabel))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabStyle)) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

