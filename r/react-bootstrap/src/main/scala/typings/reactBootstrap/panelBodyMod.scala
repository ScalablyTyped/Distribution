package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBodyMod {
  
  @JSImport("react-bootstrap/lib/PanelBody", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelBodyProps, js.Object, js.Any]
  
  @js.native
  trait PanelBody
    extends Component[PanelBodyProps, js.Object, js.Any]
  
  trait PanelBodyProps
    extends StObject
       with HTMLProps[PanelBody] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[Boolean] = js.undefined
  }
  object PanelBodyProps {
    
    inline def apply(): PanelBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelBodyProps]
    }
    
    extension [Self <: PanelBodyProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    }
  }
}
