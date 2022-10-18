package typings.reactInfiniteScrollComponent

import typings.react.mod.Component
import typings.reactInfiniteScrollComponent.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStoriesWindowInfiniteScrollComponentMod {
  
  @JSImport("react-infinite-scroll-component/dist/stories/WindowInfiniteScrollComponent", JSImport.Default)
  @js.native
  open class default () extends WindowInfiniteScrollComponent
  
  trait State extends StObject {
    
    var data: js.Array[Double]
  }
  object State {
    
    inline def apply(data: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  @js.native
  trait WindowInfiniteScrollComponent
    extends Component[js.Object, State, Any] {
    
    def next(): Unit = js.native
    
    @JSName("state")
    var state_WindowInfiniteScrollComponent: Data = js.native
  }
}
