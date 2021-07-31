package typings.reactNativeTabView

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNativeTabView.anon.ChildPanGestureHandlerRefs
import typings.reactNativeTabView.anon.Damping
import typings.reactNativeTabView.anon.Duration
import typings.reactNativeTabView.anon.EventEmitterPropsposition
import typings.reactNativeTabView.anon.ReadonlyPanGestureHandler
import typings.reactNativeTabView.anon.SpringVelocityScale
import typings.reactNativeTabView.reactNativeTabViewStrings.`on-drag`
import typings.reactNativeTabView.reactNativeTabViewStrings.auto
import typings.reactNativeTabView.reactNativeTabViewStrings.none
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.PagerCommonProps
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/Pager", JSImport.Default)
  @js.native
  class default[T /* <: Route */] () extends Pager[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/src/Pager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view/lib/typescript/src/Pager", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    @scala.inline
    def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-tab-view/lib/typescript/src/Pager", "default.defaultProps")
    @js.native
    def defaultProps: SpringVelocityScale = js.native
    @scala.inline
    def defaultProps_=(x: SpringVelocityScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ComponentState extends StObject {
    
    var childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]]
    
    var enabled: Boolean
  }
  object ComponentState {
    
    @scala.inline
    def apply(childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]], enabled: Boolean): ComponentState = {
      val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentState]
    }
    
    @scala.inline
    implicit class ComponentStateMutableBuilder[Self <: ComponentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildPanGestureHandlerRefs(value: js.Array[RefObject[PanGestureHandler]]): Self = StObject.set(x, "childPanGestureHandlerRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildPanGestureHandlerRefsVarargs(value: RefObject[PanGestureHandler]*): Self = StObject.set(x, "childPanGestureHandlerRefs", js.Array(value :_*))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pager[T /* <: Route */]
    extends Component[Props[T], ComponentState, js.Any] {
    
    var addListener: js.Any = js.native
    
    var clock: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPager(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPager(prevProps: Props[T]): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPager(): Unit = js.native
    
    var currentIndexValue: js.Any = js.native
    
    var enterListeners: js.Any = js.native
    
    var extrapolatedPosition: js.Any = js.native
    
    var gestureHandlerRef: js.Any = js.native
    
    var gestureState: js.Any = js.native
    
    var gestureX: js.Any = js.native
    
    var gesturesEnabled: js.Any = js.native
    
    var getTranslateX: js.Any = js.native
    
    var handleEnteredIndexChange: js.Any = js.native
    
    var handleGestureEvent: js.Any = js.native
    
    var index: js.Any = js.native
    
    var indexAtSwipeEnd: js.Any = js.native
    
    var initialVelocityForSpring: js.Any = js.native
    
    var interactionHandle: js.Any = js.native
    
    var isSwipeGesture: js.Any = js.native
    
    var isSwiping: js.Any = js.native
    
    var jumpTo: js.Any = js.native
    
    var jumpToIndex: js.Any = js.native
    
    var lastEnteredIndex: js.Any = js.native
    
    var layoutWidth: js.Any = js.native
    
    var maybeCancel: js.Any = js.native
    
    var mounted: Boolean = js.native
    
    var nextIndex: js.Any = js.native
    
    var offsetX: js.Any = js.native
    
    var pendingIndexValue: js.Any = js.native
    
    var position: js.Any = js.native
    
    var previouslyFocusedTextInput: js.Any = js.native
    
    var progress: js.Any = js.native
    
    var providerVal: js.Any = js.native
    
    var removeListener: js.Any = js.native
    
    var routesLength: js.Any = js.native
    
    var springConfig: js.Any = js.native
    
    var springVelocityScale: js.Any = js.native
    
    @JSName("state")
    var state_Pager: ChildPanGestureHandlerRefs = js.native
    
    var swipeVelocityImpact: js.Any = js.native
    
    var timingConfig: js.Any = js.native
    
    var toggleEnabled: js.Any = js.native
    
    var transitionTo: js.Any = js.native
    
    var translateX: js.Any = js.native
    
    var velocityX: js.Any = js.native
  }
  
  trait Props[T /* <: Route */]
    extends StObject
       with PagerCommonProps {
    
    def children(props: EventEmitterPropsposition): ReactNode
    
    var gestureHandlerProps: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]
    
    var layout: Layout
    
    var navigationState: NavigationState[T]
    
    def onIndexChange(index: Double): Unit
    
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply[T /* <: Route */](
      children: EventEmitterPropsposition => ReactNode,
      gestureHandlerProps: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]],
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
    implicit class PropsMutableBuilder[Self <: Props[?], T /* <: Route */] (val x: Self & Props[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: EventEmitterPropsposition => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    }
  }
}
