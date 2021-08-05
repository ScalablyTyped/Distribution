package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelGroupMod {
  
  @JSImport("react-bootstrap/lib/PanelGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PanelGroupProps, js.Object, js.Any]
  
  @js.native
  trait PanelGroup
    extends Component[PanelGroupProps, js.Object, js.Any]
  
  trait PanelGroupProps
    extends StObject
       with HTMLProps[PanelGroup] {
    
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.UndefOr[js.Any] = js.undefined
    
    var defaultActiveKey: js.UndefOr[js.Any] = js.undefined
    
    var generateChildId: js.UndefOr[js.Function] = js.undefined
    
    @JSName("onSelect")
    var onSelect_PanelGroupProps: js.UndefOr[SelectCallback] = js.undefined
  }
  object PanelGroupProps {
    
    inline def apply(): PanelGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelGroupProps]
    }
    
    extension [Self <: PanelGroupProps](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setActiveKey(value: js.Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setDefaultActiveKey(value: js.Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      inline def setGenerateChildId(value: js.Function): Self = StObject.set(x, "generateChildId", value.asInstanceOf[js.Any])
      
      inline def setGenerateChildIdUndefined: Self = StObject.set(x, "generateChildId", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
