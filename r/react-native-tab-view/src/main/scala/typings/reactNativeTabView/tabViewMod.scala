package typings.reactNativeTabView

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeReanimated.mod.Animated.Value
import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.anon.GestureHandlerProps
import typings.reactNativeTabView.anon.Height
import typings.reactNativeTabView.anon.ReadonlyPanGestureHandler
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.bottom
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.reactNativeTabViewStrings.top
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.PagerCommonProps
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/TabView", JSImport.Default)
  @js.native
  class default[T /* <: Route */] () extends TabView[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/src/TabView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view/lib/typescript/src/TabView", "default.defaultProps")
    @js.native
    def defaultProps: GestureHandlerProps = js.native
    @scala.inline
    def defaultProps_=(x: GestureHandlerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Props[T /* <: Route */]
    extends StObject
       with PagerCommonProps {
    
    var gestureHandlerProps: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]
    
    var initialLayout: js.UndefOr[Height] = js.undefined
    
    var `lazy`: Boolean
    
    var lazyPreloadDistance: Double
    
    var navigationState: NavigationState[T]
    
    def onIndexChange(index: Double): Unit
    
    var position: js.UndefOr[Value] = js.undefined
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    def renderLazyPlaceholder(props: typings.reactNativeTabView.anon.Route[T]): ReactNode
    
    def renderPager(props: typings.reactNativeTabView.pagerMod.Props[T]): ReactNode
    
    def renderScene(props: SceneRendererProps & typings.reactNativeTabView.anon.Route[T]): ReactNode
    
    def renderTabBar(props: SceneRendererProps & typings.reactNativeTabView.anon.NavigationState[T]): ReactNode
    
    var sceneContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var tabBarPosition: top | bottom
  }
  object Props {
    
    @scala.inline
    def apply[T /* <: Route */](
      gestureHandlerProps: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]],
      keyboardDismissMode: none | `on-drag` | auto,
      `lazy`: Boolean,
      lazyPreloadDistance: Double,
      navigationState: NavigationState[T],
      onIndexChange: Double => Unit,
      renderLazyPlaceholder: typings.reactNativeTabView.anon.Route[T] => ReactNode,
      renderPager: typings.reactNativeTabView.pagerMod.Props[T] => ReactNode,
      renderScene: SceneRendererProps & typings.reactNativeTabView.anon.Route[T] => ReactNode,
      renderTabBar: SceneRendererProps & typings.reactNativeTabView.anon.NavigationState[T] => ReactNode,
      springConfig: Damping,
      swipeEnabled: Boolean,
      tabBarPosition: top | bottom,
      timingConfig: Duration
    ): Props[T] = {
      val __obj = js.Dynamic.literal(gestureHandlerProps = gestureHandlerProps.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderLazyPlaceholder = js.Any.fromFunction1(renderLazyPlaceholder), renderPager = js.Any.fromFunction1(renderPager), renderScene = js.Any.fromFunction1(renderScene), renderTabBar = js.Any.fromFunction1(renderTabBar), springConfig = springConfig.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any], timingConfig = timingConfig.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?], T /* <: Route */] (val x: Self & Props[T]) extends AnyVal {
      
      @scala.inline
      def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLayout(value: Height): Self = StObject.set(x, "initialLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLayoutUndefined: Self = StObject.set(x, "initialLayout", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPosition(value: Value): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderLazyPlaceholder(value: typings.reactNativeTabView.anon.Route[T] => ReactNode): Self = StObject.set(x, "renderLazyPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderPager(value: typings.reactNativeTabView.pagerMod.Props[T] => ReactNode): Self = StObject.set(x, "renderPager", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderScene(value: SceneRendererProps & typings.reactNativeTabView.anon.Route[T] => ReactNode): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTabBar(value: SceneRendererProps & typings.reactNativeTabView.anon.NavigationState[T] => ReactNode): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSceneContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneContainerStyleNull: Self = StObject.set(x, "sceneContainerStyle", null)
      
      @scala.inline
      def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabBarPosition(value: top | bottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var layout: Layout
  }
  object State {
    
    @scala.inline
    def apply(layout: Layout): State = {
      val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabView[T /* <: Route */]
    extends Component[Props[T], State, js.Any] {
    
    var handleLayout: js.Any = js.native
    
    var jumpToIndex: js.Any = js.native
    
    @JSName("state")
    var state_TabView: typings.reactNativeTabView.anon.Layout = js.native
  }
}
