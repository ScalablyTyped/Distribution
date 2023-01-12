package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.libButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleButtonMod {
  
  @JSImport("react-bootstrap/lib/ToggleButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ToggleButtonProps & ButtonProps, js.Object, Any]
  
  type ToggleButton = Component[ToggleButtonProps & ButtonProps, js.Object, Any]
  
  trait ToggleButtonProps
    extends StObject
       with HTMLProps[ToggleButton] {
    
    @JSName("value")
    var value_ToggleButtonProps: Double | String
  }
  object ToggleButtonProps {
    
    inline def apply(value: Double | String): ToggleButtonProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleButtonProps] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
