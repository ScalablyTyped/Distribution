package typings.reactMdTabs

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelGroupMod {
  
  @JSImport("@react-md/tabs/types/PanelGroup", "PanelGroup")
  @js.native
  def PanelGroup(hasPersistentDisableTransitionChildren: PanelGroupProps): ReactElement = js.native
  
  @js.native
  trait PanelGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var disableTransition: Boolean = js.native
    
    var persistent: Boolean = js.native
  }
  object PanelGroupProps {
    
    @scala.inline
    def apply(disableTransition: Boolean, persistent: Boolean): PanelGroupProps = {
      val __obj = js.Dynamic.literal(disableTransition = disableTransition.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelGroupProps]
    }
    
    @scala.inline
    implicit class PanelGroupPropsMutableBuilder[Self <: PanelGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    }
  }
}
