package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelCollapseMod {
  
  @JSImport("react-bootstrap/lib/PanelCollapse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelCollapseProps, js.Object, Any]
  
  type PanelCollapse = Component[PanelCollapseProps, js.Object, Any]
  
  trait PanelCollapseProps
    extends StObject
       with HTMLProps[PanelCollapse] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var onEnter: js.UndefOr[js.Function] = js.undefined
    
    var onEntered: js.UndefOr[js.Function] = js.undefined
    
    var onEntering: js.UndefOr[js.Function] = js.undefined
    
    var onExit: js.UndefOr[js.Function] = js.undefined
    
    var onExited: js.UndefOr[js.Function] = js.undefined
    
    var onExiting: js.UndefOr[js.Function] = js.undefined
  }
  object PanelCollapseProps {
    
    inline def apply(): PanelCollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelCollapseProps]
    }
    
    extension [Self <: PanelCollapseProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setOnEnter(value: js.Function): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: js.Function): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: js.Function): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: js.Function): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: js.Function): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: js.Function): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    }
  }
}
