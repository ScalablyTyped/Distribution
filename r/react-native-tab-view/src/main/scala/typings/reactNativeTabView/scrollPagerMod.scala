package typings.reactNativeTabView

import typings.react.mod.Component
import typings.reactNativeTabView.anon.Bounces
import typings.reactNativeTabView.anon.Overscroll
import typings.reactNativeTabView.anon.X
import typings.reactNativeTabView.pagerMod.Props
import typings.reactNativeTabView.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollPagerMod {
  
  @JSImport("react-native-tab-view/lib/typescript/src/ScrollPager", JSImport.Default)
  @js.native
  class default[T /* <: Route */] () extends ScrollPager[T]
  /* static members */
  object default {
    
    @JSImport("react-native-tab-view/lib/typescript/src/ScrollPager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-tab-view/lib/typescript/src/ScrollPager", "default.defaultProps")
    @js.native
    def defaultProps: Bounces = js.native
    inline def defaultProps_=(x: Bounces): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ScrollPager[T /* <: Route */]
    extends Component[Props[T] & Overscroll, State, js.Any] {
    
    /* private */ var addListener: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MScrollPager(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MScrollPager(prevProps: Props[T]): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScrollPager(): Unit = js.native
    
    /* private */ var enterListeners: js.Any = js.native
    
    /* private */ var initialOffset: js.Any = js.native
    
    /* private */ var interactionHandle: js.Any = js.native
    
    /* private */ var jumpTo: js.Any = js.native
    
    /* private */ var layoutWidthNode: js.Any = js.native
    
    /* private */ var onScroll: js.Any = js.native
    
    /* private */ var position: js.Any = js.native
    
    /* private */ var relativePosition: js.Any = js.native
    
    /* private */ var removeListener: js.Any = js.native
    
    /* private */ var scrollTo: js.Any = js.native
    
    /* private */ var scrollViewRef: js.Any = js.native
    
    /* private */ var wasTouched: js.Any = js.native
  }
  
  trait State extends StObject {
    
    var initialOffset: X
  }
  object State {
    
    inline def apply(initialOffset: X): State = {
      val __obj = js.Dynamic.literal(initialOffset = initialOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setInitialOffset(value: X): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
    }
  }
}
