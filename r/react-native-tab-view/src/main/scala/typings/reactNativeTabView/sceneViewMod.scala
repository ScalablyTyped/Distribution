package typings.reactNativeTabView

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedInterpolation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Loading
import typings.reactNativeTabView.typesMod.EventEmitterProps
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.Listener
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/SceneView", JSImport.Default)
  @js.native
  open class default[T /* <: Route */] () extends SceneView[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/SceneView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: Props[Route], state: State): Loading | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Loading | Null]
  }
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps
       with EventEmitterProps {
    
    def children(props: Loading): ReactNode
    
    var index: Double
    
    var `lazy`: Boolean
    
    var lazyPreloadDistance: Double
    
    var navigationState: NavigationState[T]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      addEnterListener: Listener => js.Function0[Unit],
      children: Loading => ReactNode,
      index: Double,
      jumpTo: String => Unit,
      layout: Layout,
      `lazy`: Boolean,
      lazyPreloadDistance: Double,
      navigationState: NavigationState[T],
      position: AnimatedInterpolation[Double | String]
    ): Props[T] = {
      val __obj = js.Dynamic.literal(addEnterListener = js.Any.fromFunction1(addEnterListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setChildren(value: Loading => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SceneView[T /* <: Route */] extends Component[Props[T], State, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSceneView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSceneView(prevProps: Props[T], prevState: State): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSceneView(): Unit = js.native
    
    /* private */ var handleEnter: Any = js.native
    
    @JSName("state")
    var state_SceneView: Loading = js.native
    
    /* private */ var timerHandler: Any = js.native
    
    /* private */ var unsubscribe: Any = js.native
  }
  
  trait State extends StObject {
    
    var loading: Boolean
  }
  object State {
    
    inline def apply(loading: Boolean): State = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
}
