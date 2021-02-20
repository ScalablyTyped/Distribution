package typings.reactstrap

import typings.react.mod.Component
import typings.reactstrap.dropdownMod.DropdownProps
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputGroupButtonDropdownMod {
  
  @JSImport("reactstrap/lib/InputGroupButtonDropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputGroupButtonDropdownProps, js.Object, js.Any]
  
  type InputGroupButtonDropdown = Component[InputGroupButtonDropdownProps, js.Object, js.Any]
  
  @js.native
  trait InputGroupButtonDropdownProps extends DropdownProps {
    
    @JSName("addonType")
    var addonType_InputGroupButtonDropdownProps: prepend | append = js.native
  }
  object InputGroupButtonDropdownProps {
    
    @scala.inline
    def apply(addonType: prepend | append): InputGroupButtonDropdownProps = {
      val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputGroupButtonDropdownProps]
    }
    
    @scala.inline
    implicit class InputGroupButtonDropdownPropsMutableBuilder[Self <: InputGroupButtonDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonType(value: prepend | append): Self = StObject.set(x, "addonType", value.asInstanceOf[js.Any])
    }
  }
}
