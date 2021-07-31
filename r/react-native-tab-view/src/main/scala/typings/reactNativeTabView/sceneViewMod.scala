package typings.reactNativeTabView

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.anon.Loading
import typings.reactNativeTabView.reactNativeTabViewStrings.enter
import typings.reactNativeTabView.typesMod.EventEmitterProps
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.Listener
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneViewMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/SceneView", JSImport.Default)
  @js.native
  class default[T /* <: Route */] () extends SceneView[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/src/SceneView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getDerivedStateFromProps(props: Props[Route], state: State): Loading | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Loading | Null]
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
    
    @scala.inline
    def apply[T /* <: Route */](
      addListener: (enter, Listener) => Unit,
      children: Loading => ReactNode,
      index: Double,
      jumpTo: String => Unit,
      layout: Layout,
      `lazy`: Boolean,
      lazyPreloadDistance: Double,
      navigationState: NavigationState[T],
      position: Node,
      removeListener: (enter, Listener) => Unit
    ): Props[T] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener))
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?], T /* <: Route */] (val x: Self & Props[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Loading => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyPreloadDistance(value: Double): Self = StObject.set(x, "lazyPreloadDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait SceneView[T /* <: Route */]
    extends Component[Props[T], State, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MSceneView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSceneView(prevProps: Props[T], prevState: State): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSceneView(): Unit = js.native
    
    var handleEnter: js.Any = js.native
    
    @JSName("state")
    var state_SceneView: Loading = js.native
  }
  
  trait State extends StObject {
    
    var loading: Boolean
  }
  object State {
    
    @scala.inline
    def apply(loading: Boolean): State = {
      val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
}
