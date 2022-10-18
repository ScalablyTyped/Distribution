package typings.reactDraggableList

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnUpdateMod {
  
  @JSImport("react-draggable-list/dist/src/OnUpdate", JSImport.Default)
  @js.native
  open class default () extends OnUpdate
  
  @js.native
  trait OnUpdate
    extends Component[Props, js.Object, Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOnUpdate(): Unit = js.native
  }
  
  trait Props extends StObject {
    
    def cb(): Unit
  }
  object Props {
    
    inline def apply(cb: () => Unit): Props = {
      val __obj = js.Dynamic.literal(cb = js.Any.fromFunction0(cb))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setCb(value: () => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction0(value))
    }
  }
}
