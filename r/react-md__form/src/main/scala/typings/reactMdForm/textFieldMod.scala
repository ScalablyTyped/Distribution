package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.anon.FormMessagePropsPartialFo
import typings.reactMdForm.passwordMod.PasswordProps
import typings.reactMdForm.textAreaMod.TextAreaProps
import typings.reactMdForm.textFieldAddonMod.TextFieldAddonProps
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerProps
import typings.reactMdForm.textFieldTextFieldMod.TextFieldProps
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@react-md/form/types/text-field", "FormMessage")
  @js.native
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  @JSImport("@react-md/form/types/text-field", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
}
