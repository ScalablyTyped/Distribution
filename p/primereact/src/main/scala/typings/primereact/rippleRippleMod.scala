package typings.primereact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rippleRippleMod {
  
  @JSImport("primereact/ripple/ripple", "Ripple")
  @js.native
  open class Ripple protected () extends Component[RippleProps, Any, Any] {
    def this(props: RippleProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: RippleProps, context: Any) = this()
  }
  
  trait RippleProps extends StObject {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object RippleProps {
    
    inline def apply(): RippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RippleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RippleProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
