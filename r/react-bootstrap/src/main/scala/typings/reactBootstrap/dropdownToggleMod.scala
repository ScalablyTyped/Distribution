package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownToggleMod {
  
  @JSImport("react-bootstrap/lib/DropdownToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[DropdownToggleProps, js.Object, Any]
  
  type DropdownToggle = Component[DropdownToggleProps, js.Object, Any]
  
  trait DropdownToggleProps
    extends StObject
       with HTMLProps[DropdownToggle] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsRole: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[String] = js.undefined
    
    // Added since v0.30.0
    var bsStyle: js.UndefOr[String | Null] = js.undefined
    
    var noCaret: js.UndefOr[Boolean] = js.undefined
    
    var useAnchor: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownToggleProps {
    
    inline def apply(): DropdownToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownToggleProps]
    }
    
    extension [Self <: DropdownToggleProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsRole(value: String): Self = StObject.set(x, "bsRole", value.asInstanceOf[js.Any])
      
      inline def setBsRoleUndefined: Self = StObject.set(x, "bsRole", js.undefined)
      
      inline def setBsSize(value: String): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleNull: Self = StObject.set(x, "bsStyle", null)
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setNoCaret(value: Boolean): Self = StObject.set(x, "noCaret", value.asInstanceOf[js.Any])
      
      inline def setNoCaretUndefined: Self = StObject.set(x, "noCaret", js.undefined)
      
      inline def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
      
      inline def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
    }
  }
}
