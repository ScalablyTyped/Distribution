package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelHeadingMod {
  
  @JSImport("react-bootstrap/lib/PanelHeading", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelHeadingProps, js.Object, Any]
  
  type PanelHeading = Component[PanelHeadingProps, js.Object, Any]
  
  trait PanelHeadingProps
    extends StObject
       with HTMLProps[PanelHeading] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[String] = js.undefined
  }
  object PanelHeadingProps {
    
    inline def apply(): PanelHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelHeadingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelHeadingProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
