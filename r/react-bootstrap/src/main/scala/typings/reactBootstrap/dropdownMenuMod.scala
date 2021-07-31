package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  @JSImport("react-bootstrap/lib/DropdownMenu", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownMenuProps, js.Object, js.Any]
  
  @js.native
  trait DropdownMenu
    extends Component[DropdownMenuProps, js.Object, js.Any]
  
  trait DropdownMenuProps
    extends StObject
       with HTMLProps[DropdownMenu] {
    
    var labelledBy: js.UndefOr[String | Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    @JSName("onSelect")
    var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class DropdownMenuPropsMutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelledBy(value: String | Double): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
