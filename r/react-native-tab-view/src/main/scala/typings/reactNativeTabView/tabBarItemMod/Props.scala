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

@js.native
trait Props[T /* <: Route */] extends js.Object {
  var activeColor: js.UndefOr[String] = js.native
  var inactiveColor: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var navigationState: NavigationState[T] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any = js.native
  var pressColor: js.UndefOr[String] = js.native
  var pressOpacity: js.UndefOr[Double] = js.native
  var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], ReactNode]] = js.native
  var renderIcon: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.native
  var renderLabel: js.UndefOr[js.Function1[/* scene */ Focused[T], ReactNode]] = js.native
  var route: T = js.native
  var style: StyleProp[ViewStyle] = js.native
  def getAccessibilityLabel(scene: Scene[T]): js.UndefOr[String] = js.native
  def getAccessible(scene: Scene[T]): js.UndefOr[Boolean] = js.native
  def getLabelText(scene: Scene[T]): js.UndefOr[String] = js.native
  def getTestID(scene: Scene[T]): js.UndefOr[String] = js.native
  def onLongPress(): Unit = js.native
  def onPress(): Unit = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](
    getAccessibilityLabel: Scene[T] => js.UndefOr[String],
    getAccessible: Scene[T] => js.UndefOr[Boolean],
    getLabelText: Scene[T] => js.UndefOr[String],
    getTestID: Scene[T] => js.UndefOr[String],
    navigationState: NavigationState[T],
    onLongPress: () => Unit,
    onPress: () => Unit,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    route: T
  ): Props[T] = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigationState = navigationState.asInstanceOf[js.Any], onLongPress = js.Any.fromFunction0(onLongPress), onPress = js.Any.fromFunction0(onPress), position = position.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
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
    def setNavigationState(value: NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def setPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: T): Self = this.set("route", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveColor(value: String): Self = this.set("activeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveColor: Self = this.set("activeColor", js.undefined)
    @scala.inline
    def setInactiveColor(value: String): Self = this.set("inactiveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInactiveColor: Self = this.set("inactiveColor", js.undefined)
    @scala.inline
    def setLabelStyle(value: StyleProp[TextStyle]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLabelStyleNull: Self = this.set("labelStyle", null)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
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
    def setRenderIcon(value: /* scene */ Focused[T] => ReactNode): Self = this.set("renderIcon", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderIcon: Self = this.set("renderIcon", js.undefined)
    @scala.inline
    def setRenderLabel(value: /* scene */ Focused[T] => ReactNode): Self = this.set("renderLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderLabel: Self = this.set("renderLabel", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

