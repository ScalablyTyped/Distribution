package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactBootstrap.dropdownMod.DropdownBaseProps
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.mod.Sizes
import typings.reactBootstrap.reactBootstrapStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownButtonMod {
  
  @JSImport("react-bootstrap/lib/DropdownButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownButtonProps, js.Object, js.Any]
  
  @js.native
  trait DropdownButton
    extends Component[DropdownButtonProps, js.Object, js.Any]
  
  @js.native
  trait DropdownButtonBaseProps extends DropdownBaseProps {
    
    var block: js.UndefOr[Boolean] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String | Null] = js.native
    
    var navItem: js.UndefOr[Boolean] = js.native
    
    var noCaret: js.UndefOr[Boolean] = js.native
    
    var title: ReactNode = js.native
  }
  object DropdownButtonBaseProps {
    
    @scala.inline
    def apply(id: String): DropdownButtonBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonBaseProps]
    }
    
    @scala.inline
    implicit class DropdownButtonBasePropsMutableBuilder[Self <: DropdownButtonBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleNull: Self = StObject.set(x, "bsStyle", null)
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setNavItem(value: Boolean): Self = StObject.set(x, "navItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavItemUndefined: Self = StObject.set(x, "navItem", js.undefined)
      
      @scala.inline
      def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type DropdownButtonProps = DropdownButtonBaseProps with (Omit[HTMLProps[DropdownButton], title])
}
