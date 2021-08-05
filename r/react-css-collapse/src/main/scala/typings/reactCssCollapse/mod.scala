package typings.reactCssCollapse

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-css-collapse", JSImport.Default)
  @js.native
  class default () extends Collapse
  
  @js.native
  trait Collapse
    extends Component[Props, js.Object, js.Any]
  
  trait Props extends StObject {
    
    var className: js.UndefOr[String | Null] = js.undefined
    
    var isOpen: Boolean
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var transition: js.UndefOr[String | Null] = js.undefined
  }
  object Props {
    
    inline def apply(isOpen: Boolean): Props = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionNull: Self = StObject.set(x, "transition", null)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
