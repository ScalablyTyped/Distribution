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
    @scala.inline
    def defaultProps_=(x: Bounces): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ScrollPager[T /* <: Route */]
    extends Component[Props[T] & Overscroll, State, js.Any] {
    
    var addListener: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MScrollPager(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MScrollPager(prevProps: Props[T]): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MScrollPager(): Unit = js.native
    
    var enterListeners: js.Any = js.native
    
    var initialOffset: js.Any = js.native
    
    var interactionHandle: js.Any = js.native
    
    var jumpTo: js.Any = js.native
    
    var layoutWidthNode: js.Any = js.native
    
    var onScroll: js.Any = js.native
    
    var position: js.Any = js.native
    
    var relativePosition: js.Any = js.native
    
    var removeListener: js.Any = js.native
    
    var scrollTo: js.Any = js.native
    
    var scrollViewRef: js.Any = js.native
    
    var wasTouched: js.Any = js.native
  }
  
  trait State extends StObject {
    
    var initialOffset: X
  }
  object State {
    
    @scala.inline
    def apply(initialOffset: X): State = {
      val __obj = js.Dynamic.literal(initialOffset = initialOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialOffset(value: X): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
    }
  }
}
