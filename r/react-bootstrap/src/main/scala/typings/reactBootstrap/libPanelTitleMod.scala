package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelTitleMod {
  
  @JSImport("react-bootstrap/lib/PanelTitle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelTitleProps, js.Object, Any]
  
  type PanelTitle = Component[PanelTitleProps, js.Object, Any]
  
  trait PanelTitleProps
    extends StObject
       with HTMLProps[PanelTitle] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[String] = js.undefined
    
    var toggle: js.UndefOr[Boolean] = js.undefined
  }
  object PanelTitleProps {
    
    inline def apply(): PanelTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelTitleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PanelTitleProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: String): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
