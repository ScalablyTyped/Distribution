package typings.reactMdTabs

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelGroupMod {
  
  @JSImport("@react-md/tabs/types/PanelGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PanelGroup(hasPersistentDisableTransitionChildren: PanelGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("PanelGroup")(hasPersistentDisableTransitionChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait PanelGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disableTransition: Boolean
    
    var persistent: Boolean
  }
  object PanelGroupProps {
    
    inline def apply(disableTransition: Boolean, persistent: Boolean): PanelGroupProps = {
      val __obj = js.Dynamic.literal(disableTransition = disableTransition.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelGroupProps]
    }
    
    extension [Self <: PanelGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
}
