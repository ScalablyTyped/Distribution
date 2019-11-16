package typings.reactDashNativeDashTabDashView

import org.scalablytyped.runtime.Instantiable0
import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.SceneRendererProps
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.bottom
import typings.reactDashNativeDashTabDashView.reactDashNativeDashTabDashViewStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom[T /* <: Route */] extends js.Object {
  var gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]]
  var initialLayout: js.UndefOr[Anon_Height] = js.undefined
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var navigationState: NavigationState[T]
  var position: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any
  ] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var tabBarPosition: top | bottom
  def onIndexChange(index: Double): Unit
  def renderLazyPlaceholder(props: Anon_Route[T]): ReactNode
  def renderScene(props: SceneRendererProps with Anon_Route[T]): ReactNode
  def renderTabBar(props: SceneRendererProps with Anon_NavigationState[T]): ReactNode
}

object Anon_Bottom {
  @scala.inline
  def apply[T /* <: Route */](
    gestureHandlerProps: ComponentProps[Instantiable0[PanGestureHandler]],
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    onIndexChange: Double => Unit,
    renderLazyPlaceholder: Anon_Route[T] => ReactNode,
    renderScene: SceneRendererProps with Anon_Route[T] => ReactNode,
    renderTabBar: SceneRendererProps with Anon_NavigationState[T] => ReactNode,
    tabBarPosition: top | bottom,
    initialLayout: Anon_Height = null,
    position: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Animated.Value<number> */ js.Any = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    sceneContainerStyle: StyleProp[ViewStyle] = null,
    style: StyleProp[ViewStyle] = null
  ): Anon_Bottom[T] = {
    val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance, navigationState = navigationState, onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`)
    if (initialLayout != null) __obj.updateDynamic("initialLayout")(initialLayout)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (sceneContainerStyle != null) __obj.updateDynamic("sceneContainerStyle")(sceneContainerStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom[T]]
  }
}

