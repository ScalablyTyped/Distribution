package typings.reactMdMenu

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleChildrenMod {
  
  @JSImport("@react-md/menu/types/ToggleChildren", "ToggleChildren")
  @js.native
  def ToggleChildren(hasDropdownIconDisableDropdownIconChildrenVisible: ToggleChildrenProps): ReactElement = js.native
  
  @js.native
  trait ToggleChildrenProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var disableDropdownIcon: Boolean = js.native
    
    var dropdownIcon: ReactNode = js.native
    
    var visible: Boolean = js.native
  }
  object ToggleChildrenProps {
    
    @scala.inline
    def apply(disableDropdownIcon: Boolean, visible: Boolean): ToggleChildrenProps = {
      val __obj = js.Dynamic.literal(disableDropdownIcon = disableDropdownIcon.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleChildrenProps]
    }
    
    @scala.inline
    implicit class ToggleChildrenPropsMutableBuilder[Self <: ToggleChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableDropdownIcon(value: Boolean): Self = StObject.set(x, "disableDropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIcon(value: ReactNode): Self = StObject.set(x, "dropdownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownIconUndefined: Self = StObject.set(x, "dropdownIcon", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
