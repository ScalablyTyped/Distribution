package typings.reactNodeResolver

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-node-resolver", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  type NodeResolver = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var children: ReactElement
    
    var innerRef: RefCallback[HTMLElement]
  }
  object Props {
    
    inline def apply(children: ReactElement, innerRef: /* instance */ HTMLElement | Null => Unit): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], innerRef = js.Any.fromFunction1(innerRef))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    }
  }
}
