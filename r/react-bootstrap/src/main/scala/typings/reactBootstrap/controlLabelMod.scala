package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlLabelMod {
  
  @JSImport("react-bootstrap/lib/ControlLabel", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ControlLabelProps, js.Object, js.Any]
  
  @js.native
  trait ControlLabel
    extends Component[ControlLabelProps, js.Object, js.Any]
  
  trait ControlLabelProps
    extends StObject
       with HTMLProps[ControlLabel] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var srOnly: js.UndefOr[Boolean] = js.undefined
  }
  object ControlLabelProps {
    
    inline def apply(): ControlLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlLabelProps]
    }
    
    extension [Self <: ControlLabelProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      inline def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
    }
  }
}
