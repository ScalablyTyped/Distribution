package typings.reactstrap

import typings.react.mod.Component
import typings.reactstrap.dropdownMod.DropdownProps
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupButtonDropdownMod {
  
  @JSImport("reactstrap/lib/InputGroupButtonDropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupButtonDropdownProps, js.Object, js.Any]
  
  type InputGroupButtonDropdown = Component[InputGroupButtonDropdownProps, js.Object, js.Any]
  
  trait InputGroupButtonDropdownProps
    extends StObject
       with DropdownProps {
    
    @JSName("addonType")
    var addonType_InputGroupButtonDropdownProps: prepend | append
  }
  object InputGroupButtonDropdownProps {
    
    inline def apply(addonType: prepend | append): InputGroupButtonDropdownProps = {
      val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputGroupButtonDropdownProps]
    }
    
    extension [Self <: InputGroupButtonDropdownProps](x: Self) {
      
      inline def setAddonType(value: prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
    }
  }
}
