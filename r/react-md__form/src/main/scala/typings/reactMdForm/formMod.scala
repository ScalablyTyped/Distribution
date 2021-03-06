package typings.reactMdForm

import typings.react.mod.FormHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("@react-md/form/types/Form", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps with RefAttributes[HTMLFormElement]] = js.native
  
  @js.native
  trait FormProps extends FormHTMLAttributes[HTMLFormElement] {
    
    /**
      * Boolean if the form should no longer prevent default submit behavior. If
      * you enable this prop you should honestly just use a `<form>` element
      * instead
      */
    var disablePreventDefault: js.UndefOr[Boolean] = js.native
  }
  object FormProps {
    
    @scala.inline
    def apply(): FormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps]
    }
    
    @scala.inline
    implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisablePreventDefault(value: Boolean): Self = StObject.set(x, "disablePreventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePreventDefaultUndefined: Self = StObject.set(x, "disablePreventDefault", js.undefined)
    }
  }
}
