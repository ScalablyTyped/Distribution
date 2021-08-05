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
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-tab-view/lib/typescript/src/Pager", "default.defaultProps")
    @js.native
    def defaultProps: SpringVelocityScale = js.native
    inline def defaultProps_=(x: SpringVelocityScale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ComponentState extends StObject {
    
    var childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]]
    
    var enabled: Boolean
  }
  object ComponentState {
    
    inline def apply(childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]], enabled: Boolean): ComponentState = {
      val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentState]
    }
    
    extension [Self <: ComponentState](x: Self) {
      
      inline def setChildPanGestureHandlerRefs(value: js.Array[RefObject[PanGestureHandler]]): Self = StObject.set(x, "childPanGestureHandlerRefs", value.asInstanceOf[js.Any])
      
      inline def setChildPanGestureHandlerRefsVarargs(value: RefObject[PanGestureHandler]*): Self = StObject.set(x, "childPanGestureHandlerRefs", js.Array(value :_*))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pager[T /* <: Route */]
    extends Component[Props[T], ComponentState, js.Any] {
    
    /* private */ var addListener: js.Any = js.native
    
    /* private */ var clock: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPager(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPager(prevProps: Props[T]): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPager(): Unit = js.native
    
    /* private */ var currentIndexValue: js.Any = js.native
    
    /* private */ var enterListeners: js.Any = js.native
    
    /* private */ var extrapolatedPosition: js.Any = js.native
    
    /* private */ var gestureHandlerRef: js.Any = js.native
    
    /* private */ var gestureState: js.Any = js.native
    
    /* private */ var gestureX: js.Any = js.native
    
    /* private */ var gesturesEnabled: js.Any = js.native
    
    /* private */ var getTranslateX: js.Any = js.native
    
    /* private */ var handleEnteredIndexChange: js.Any = js.native
    
    /* private */ var handleGestureEvent: js.Any = js.native
    
    /* private */ var index: js.Any = js.native
    
    /* private */ var indexAtSwipeEnd: js.Any = js.native
    
    /* private */ var initialVelocityForSpring: js.Any = js.native
    
    /* private */ var interactionHandle: js.Any = js.native
    
    /* private */ var isSwipeGesture: js.Any = js.native
    
    /* private */ var isSwiping: js.Any = js.native
    
    /* private */ var jumpTo: js.Any = js.native
    
    /* private */ var jumpToIndex: js.Any = js.native
    
    /* private */ var lastEnteredIndex: js.Any = js.native
    
    /* private */ var layoutWidth: js.Any = js.native
    
    /* private */ var maybeCancel: js.Any = js.native
    
    var mounted: Boolean = js.native
    
    /* private */ var nextIndex: js.Any = js.native
    
    /* private */ var offsetX: js.Any = js.native
    
    /* private */ var pendingIndexValue: js.Any = js.native
    
    /* private */ var position: js.Any = js.native
    
    /* private */ var previouslyFocusedTextInput: js.Any = js.native
    
    /* private */ var progress: js.Any = js.native
    
    /* private */ var providerVal: js.Any = js.native
    
    /* private */ var removeListener: js.Any = js.native
    
    /* private */ var routesLength: js.Any = js.native
    
    /* private */ var springConfig: js.Any = js.native
    
    /* private */ var springVelocityScale: js.Any = js.native
    
    @JSName("state")
    var state_Pager: ChildPanGestureHandlerRefs = js.native
    
    /* private */ var swipeVelocityImpact: js.Any = js.native
    
    /* private */ var timingConfig: js.Any = js.native
    
    /* private */ var toggleEnabled: js.Any = js.native
    
    /* private */ var transitionTo: js.Any = js.native
    
    /* private */ var translateX: js.Any = js.native
    
    /* private */ var velocityX: js.Any = js.native
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
    
    inline def apply[T /* <: Route */](
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
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setChildren(value: EventEmitterPropsposition => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    }
  }
}
