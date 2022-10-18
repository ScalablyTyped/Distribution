package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelToggleMod {
  
  @JSImport("react-bootstrap/lib/PanelToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelToggleProps, js.Object, Any]
  
  type PanelToggle = Component[PanelToggleProps, js.Object, Any]
  
  trait PanelToggleProps
    extends StObject
       with HTMLProps[PanelToggle] {
    
    var componentClass: js.UndefOr[String] = js.undefined
  }
  object PanelToggleProps {
    
    inline def apply(): PanelToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelToggleProps]
    }
    
    extension [Self <: PanelToggleProps](x: Self) {
      
      inline def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
