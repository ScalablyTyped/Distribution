package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelFooterMod {
  
  @JSImport("react-bootstrap/lib/PanelFooter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelFooterProps, js.Object, Any]
  
  type PanelFooter = Component[PanelFooterProps, js.Object, Any]
  
  trait PanelFooterProps
    extends StObject
       with HTMLProps[PanelFooter] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PanelFooterProps {
    
    inline def apply(): PanelFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelFooterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelFooterProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
