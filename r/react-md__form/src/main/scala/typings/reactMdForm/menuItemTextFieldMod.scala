package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.anon.ReadonlyPropsWithRefHTMLA
import typings.reactMdForm.textFieldTextFieldMod.TextFieldProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemTextFieldMod {
  
  @JSImport("@react-md/form/types/menu/MenuItemTextField", "MenuItemTextField")
  @js.native
  val MenuItemTextField: ForwardRefExoticComponent[MenuItemTextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait MenuItemTextFieldProps
    extends StObject
       with TextFieldProps {
    
    /**
      * Any additional props or a `ref` to apply to the surrounding `<li>` element.
      */
    var liProps: js.UndefOr[ReadonlyPropsWithRefHTMLA] = js.undefined
  }
  object MenuItemTextFieldProps {
    
    inline def apply(id: String): MenuItemTextFieldProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemTextFieldProps]
    }
    
    extension [Self <: MenuItemTextFieldProps](x: Self) {
      
      inline def setLiProps(value: ReadonlyPropsWithRefHTMLA): Self = StObject.set(x, "liProps", value.asInstanceOf[js.Any])
      
      inline def setLiPropsUndefined: Self = StObject.set(x, "liProps", js.undefined)
    }
  }
}
