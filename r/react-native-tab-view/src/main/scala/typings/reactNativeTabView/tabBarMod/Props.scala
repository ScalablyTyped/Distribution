package typings.reactNativeTabView.tabBarMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Color
import typings.reactNativeTabView.anon.Key
import typings.reactNativeTabView.typesMod.Event
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   scrollEnabled :boolean | undefined,   bounces :boolean | undefined,   activeColor :string | undefined,   inactiveColor :string | undefined,   pressColor :string | undefined,   pressOpacity :number | undefined, getLabelText (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getAccessible (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): boolean | undefined, getAccessibilityLabel (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined, getTestID (scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): string | undefined,   renderLabel :(scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused :boolean,   color :string}): react.react.ReactNode | undefined,   renderIcon :(scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & {  focused :boolean,   color :string}): react.react.ReactNode | undefined,   renderBadge :(scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): react.react.ReactNode | undefined, renderIndicator (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarIndicator.Props<T>): react.react.ReactNode,   renderTabBarItem :(props : react-native-tab-view.react-native-tab-view/lib/typescript/src/TabBarItem.Props<T> & {  key :string}): react.react.ReactElement | undefined,   onTabPress :(scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T> & react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Event): void | undefined,   onTabLongPress :(scene : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Scene<T>): void | undefined,   tabStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   indicatorStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   indicatorContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   labelStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   contentContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.native
  var bounces: js.UndefOr[Boolean] = js.native
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inactiveColor: js.UndefOr[String] = js.native
  var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var layout: Layout = js.native
  var navigationState: NavigationState[T] = js.native
  var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.native
  var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] with Event, Unit]] = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var pressColor: js.UndefOr[String] = js.native
  var pressOpacity: js.UndefOr[Double] = js.native
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.native
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, ReactNode]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] with Color, ReactNode]] = js.native
  var renderTabBarItem: js.UndefOr[
    js.Function1[
      /* props */ typings.reactNativeTabView.tabBarItemMod.Props[T] with Key, 
      ReactElement
    ]
  ] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String] = js.native
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean] = js.native
  def getLabelText(scene: Scene[T]): js.UndefOr[String] = js.native
  def getTestID(scene: Scene[T]): js.UndefOr[String] = js.native
  def jumpTo(key: String): Unit = js.native
  def renderIndicator(props: typings.reactNativeTabView.tabBarIndicatorMod.Props[T]): ReactNode = js.native
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
    renderIndicator: typings.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactNode
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[Props[T]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: typings.reactNativeTabView.typesMod.Route */ T] (val x: Self with Props[T]) extends AnyVal {
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
    def setGetAccessibilityLabel(value: Scene[T] => js.UndefOr[String]): Self = this.set("getAccessibilityLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAccessible(value: Scene[T] => js.UndefOr[Boolean]): Self = this.set("getAccessible", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabelText(value: Scene[T] => js.UndefOr[String]): Self = this.set("getLabelText", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTestID(value: Scene[T] => js.UndefOr[String]): Self = this.set("getTestID", js.Any.fromFunction1(value))
    @scala.inline
    def setJumpTo(value: String => Unit): Self = this.set("jumpTo", js.Any.fromFunction1(value))
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationState(value: NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderIndicator(value: typings.reactNativeTabView.tabBarIndicatorMod.Props[T] => ReactNode): Self = this.set("renderIndicator", js.Any.fromFunction1(value))
    @scala.inline
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    @scala.inline
    def setBounces(value: Boolean): Self = this.set("bounces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounces: Self = this.set("bounces", js.undefined)
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    @scala.inline
    def setInactiveColor(value: String): Self = this.set("inactiveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveColor: Self = this.set("inactiveColor", js.undefined)
    @scala.inline
    def setIndicatorContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorContainerStyle: Self = this.set("indicatorContainerStyle", js.undefined)
    @scala.inline
    def setIndicatorContainerStyleNull: Self = this.set("indicatorContainerStyle", null)
    @scala.inline
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setIndicatorStyleNull: Self = this.set("indicatorStyle", null)
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    @scala.inline
    def setOnTabLongPress(value: /* scene */ Scene[T] => Unit): Self = this.set("onTabLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabLongPress: Self = this.set("onTabLongPress", js.undefined)
    @scala.inline
    def setOnTabPress(value: /* scene */ Scene[T] with Event => Unit): Self = this.set("onTabPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTabPress: Self = this.set("onTabPress", js.undefined)
    @scala.inline
    def setPressColor(value: String): Self = this.set("pressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressColor: Self = this.set("pressColor", js.undefined)
    @scala.inline
    def setPressOpacity(value: Double): Self = this.set("pressOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressOpacity: Self = this.set("pressOpacity", js.undefined)
    @scala.inline
    def setRenderBadge(value: /* scene */ Scene[T] => ReactNode): Self = this.set("renderBadge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderBadge: Self = this.set("renderBadge", js.undefined)
    @scala.inline
    def setRenderIcon(value: /* scene */ Scene[T] with Color => ReactNode): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderIcon: Self = this.set("renderIcon", js.undefined)
    @scala.inline
    def setRenderLabel(value: /* scene */ Scene[T] with Color => ReactNode): Self = this.set("renderLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderLabel: Self = this.set("renderLabel", js.undefined)
    @scala.inline
    def setRenderTabBarItem(value: /* props */ typings.reactNativeTabView.tabBarItemMod.Props[T] with Key => ReactElement): Self = this.set("renderTabBarItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTabBarItem: Self = this.set("renderTabBarItem", js.undefined)
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setTabStyle(value: StyleProp[ViewStyle]): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    @scala.inline
    def setTabStyleNull: Self = this.set("tabStyle", null)
  }
  
}

