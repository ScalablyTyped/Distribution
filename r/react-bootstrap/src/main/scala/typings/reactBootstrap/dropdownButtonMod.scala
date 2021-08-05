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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownButtonMod {
  
  @JSImport("react-bootstrap/lib/DropdownButton", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[DropdownButtonProps, js.Object, js.Any]
  
  @js.native
  trait DropdownButton
    extends Component[DropdownButtonProps, js.Object, js.Any]
  
  trait DropdownButtonBaseProps
    extends StObject
       with DropdownBaseProps {
    
    var block: js.UndefOr[Boolean] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String | Null] = js.undefined
    
    var navItem: js.UndefOr[Boolean] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var title: ReactNode
  }
  object DropdownButtonBaseProps {
    
    inline def apply(id: String): DropdownButtonBaseProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonBaseProps]
    }
    
    extension [Self <: DropdownButtonBaseProps](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleNull: Self = StObject.set(x, "bsStyle", null)
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setNavItem(value: Boolean): Self = StObject.set(x, "navItem", value.asInstanceOf[js.Any])
      
      inline def setNavItemUndefined: Self = StObject.set(x, "navItem", js.undefined)
      
      inline def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      inline def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type DropdownButtonProps = DropdownButtonBaseProps & (Omit[HTMLProps[DropdownButton], title])
}
