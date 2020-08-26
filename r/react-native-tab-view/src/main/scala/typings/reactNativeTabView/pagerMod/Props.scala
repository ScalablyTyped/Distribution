package typings.reactNativeTabView.pagerMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.anon.EventEmitterPropsposition
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {onIndexChange (index : number): void,   navigationState :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>,   layout :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.Layout,   removeClippedSubviews :boolean | undefined, children (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void}): react.react.ReactNode,   gestureHandlerProps :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>} */
@js.native
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]] = js.native
  var keyboardDismissMode: none | `on-drag` | auto = js.native
  var layout: Layout = js.native
  var navigationState: NavigationState[T] = js.native
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var springConfig: Damping = js.native
  var springVelocityScale: js.UndefOr[Double] = js.native
  var swipeEnabled: Boolean = js.native
  var swipeVelocityImpact: js.UndefOr[Double] = js.native
  var timingConfig: Duration = js.native
  def children(props: EventEmitterPropsposition): ReactNode = js.native
  def onIndexChange(index: Double): Unit = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactNativeTabView.typesMod.Route */ T](
    children: EventEmitterPropsposition => ReactNode,
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    layout: Layout,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    springConfig: Damping,
    swipeEnabled: Boolean,
    timingConfig: Duration
  ): Props[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
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
    def setChildren(value: EventEmitterPropsposition => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setGestureHandlerProps(value: ComponentProps[Instantiable0[PanGestureHandler]]): Self = this.set("gestureHandlerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardDismissMode(value: none | `on-drag` | auto): Self = this.set("keyboardDismissMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationState(value: NavigationState[T]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnIndexChange(value: Double => Unit): Self = this.set("onIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def setSpringConfig(value: Damping): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimingConfig(value: Duration): Self = this.set("timingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSwipeEnd(value: () => Unit): Self = this.set("onSwipeEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeEnd: Self = this.set("onSwipeEnd", js.undefined)
    @scala.inline
    def setOnSwipeStart(value: () => Unit): Self = this.set("onSwipeStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSwipeStart: Self = this.set("onSwipeStart", js.undefined)
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    @scala.inline
    def setSpringVelocityScale(value: Double): Self = this.set("springVelocityScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringVelocityScale: Self = this.set("springVelocityScale", js.undefined)
    @scala.inline
    def setSwipeVelocityImpact(value: Double): Self = this.set("swipeVelocityImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeVelocityImpact: Self = this.set("swipeVelocityImpact", js.undefined)
  }
  
}

