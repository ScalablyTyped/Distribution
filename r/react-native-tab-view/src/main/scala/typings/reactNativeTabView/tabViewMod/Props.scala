package typings.reactNativeTabView.tabViewMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.anon.Height
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.bottom
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.reactNativeTabViewStrings.top
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.PagerCommonProps & {  position ? :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> * / any, onIndexChange (index : number): void,   navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>, renderScene (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  route  :T}): react.react.ReactNode, renderLazyPlaceholder (props : {  route  :T}): react.react.ReactNode, renderTabBar (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/types.SceneRendererProps & {  navigationState  :react-native-tab-view.react-native-tab-view/lib/typescript/src/types.NavigationState<T>}): react.react.ReactNode,   tabBarPosition  :'top' | 'bottom',   initialLayout ? :{  width ? :number,   height ? :number},   lazy  :boolean,   lazyPreloadDistance  :number,   removeClippedSubviews ? :boolean,   sceneContainerStyle ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   style ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   gestureHandlerProps  :react.react.ComponentProps<new (): react-native-gesture-handler.react-native-gesture-handler.PanGestureHandler>, renderPager (props : react-native-tab-view.react-native-tab-view/lib/typescript/src/Pager.Props<T>): react.react.ReactNode} */
trait Props[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var initialLayout: js.UndefOr[Height] = js.undefined
  var keyboardDismissMode: none | `on-drag` | auto
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var onSwipeEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var springConfig: Damping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var tabBarPosition: top | bottom
  var timingConfig: Duration
  def onIndexChange(index: Double): Unit
  def renderLazyPlaceholder(props: typings.reactNativeTabView.anon.Route[T]): ReactNode
  def renderPager(props: typings.reactNativeTabView.pagerMod.Props[T]): ReactNode
  def renderScene(props: SceneRendererProps with typings.reactNativeTabView.anon.Route[T]): ReactNode
  def renderTabBar(props: SceneRendererProps with typings.reactNativeTabView.anon.NavigationState[T]): ReactNode
}

object Props {
  @scala.inline
  def apply[T](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: typings.reactNativeTabView.anon.Route[T] => ReactNode,
    renderPager: typings.reactNativeTabView.pagerMod.Props[T] => ReactNode,
    renderScene: SceneRendererProps with typings.reactNativeTabView.anon.Route[T] => ReactNode,
    renderTabBar: SceneRendererProps with typings.reactNativeTabView.anon.NavigationState[T] => ReactNode,
    springConfig: Damping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: Duration,
    initialLayout: Height = null,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    springVelocityScale: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  ): Props[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sceneContainerStyle)) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(springVelocityScale)) __obj.updateDynamic("springVelocityScale")(springVelocityScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeVelocityImpact)) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

