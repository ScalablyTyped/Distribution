package typings.reactNativeTabView.tabViewMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeTabView.AnonDamping
import typings.reactNativeTabView.AnonDuration
import typings.reactNativeTabView.AnonHeight
import typings.reactNativeTabView.AnonNavigationState
import typings.reactNativeTabView.AnonRoute
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
  var initialLayout: js.UndefOr[AnonHeight] = js.undefined
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
  var springConfig: AnonDamping
  var springVelocityScale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var swipeEnabled: Boolean
  var swipeVelocityImpact: js.UndefOr[Double] = js.undefined
  var tabBarPosition: top | bottom
  var timingConfig: AnonDuration
  def onIndexChange(index: Double): Unit
  def renderLazyPlaceholder(props: AnonRoute[T]): ReactNode
  def renderPager(props: typings.reactNativeTabView.pagerMod.Props[T]): ReactNode
  def renderScene(props: SceneRendererProps with AnonRoute[T]): ReactNode
  def renderTabBar(props: SceneRendererProps with AnonNavigationState[T]): ReactNode
}

object Props {
  @scala.inline
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    keyboardDismissMode: none | `on-drag` | auto,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: AnonRoute[T] => ReactNode,
    renderPager: typings.reactNativeTabView.pagerMod.Props[T] => ReactNode,
    renderScene: SceneRendererProps with AnonRoute[T] => ReactNode,
    renderTabBar: SceneRendererProps with AnonNavigationState[T] => ReactNode,
    springConfig: AnonDamping,
    swipeEnabled: Boolean,
    tabBarPosition: top | bottom,
    timingConfig: AnonDuration,
    initialLayout: AnonHeight = null,
    onSwipeEnd: () => Unit = null,
    onSwipeStart: () => Unit = null,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    springVelocityScale: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    swipeVelocityImpact: Int | Double = null
  ): Props[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout.asInstanceOf[js.Any])
    if (onSwipeEnd != null) __obj.updateDynamic("onSwipeEnd")(js.Any.fromFunction0(onSwipeEnd))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (springVelocityScale != null) __obj.updateDynamic("springVelocityScale")(springVelocityScale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeVelocityImpact != null) __obj.updateDynamic("swipeVelocityImpact")(swipeVelocityImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

