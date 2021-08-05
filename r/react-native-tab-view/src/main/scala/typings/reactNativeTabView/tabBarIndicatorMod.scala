package typings.reactNativeTabView

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeTabView.typesMod.Layout
import typings.reactNativeTabView.typesMod.NavigationState
import typings.reactNativeTabView.typesMod.Route
import typings.reactNativeTabView.typesMod.SceneRendererProps
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarIndicatorMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/TabBarIndicator", JSImport.Default)
  @js.native
  class default[T /* <: Route */] () extends TabBarIndicator[T]
  
  type GetTabWidth = js.Function1[/* index */ Double, Double]
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps {
    
    var getTabWidth: GetTabWidth
    
    var navigationState: NavigationState[T]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var width: String | Double
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      getTabWidth: /* index */ Double => Double,
      jumpTo: String => Unit,
      layout: Layout,
      navigationState: NavigationState[T],
      position: Node,
      width: String | Double
    ): Props[T] = {
      val __obj = js.Dynamic.literal(getTabWidth = js.Any.fromFunction1(getTabWidth), jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setGetTabWidth(value: /* index */ Double => Double): Self = StObject.set(x, "getTabWidth", js.Any.fromFunction1(value))
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabBarIndicator[T /* <: Route */]
    extends Component[Props[T], js.Object, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MTabBarIndicator(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabBarIndicator(): Unit = js.native
    
    /* private */ var fadeInIndicator: js.Any = js.native
    
    /* private */ var getTranslateX: js.Any = js.native
    
    /* private */ var getWidth: js.Any = js.native
    
    /* private */ var isIndicatorShown: js.Any = js.native
    
    /* private */ var opacity: js.Any = js.native
  }
}
