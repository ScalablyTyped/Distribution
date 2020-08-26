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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/text-field", JSImport.Namespace)
@js.native
object textFieldMod extends js.Object {
  /**
    * The `FormMessage` component is used to create additional helper messages or
    * error messages and generally placed below the related `TextField`. If a
    * `length` (of the `value`) and `maxLength` are provided, a counter will also
    * be displayed to the right of the `children`.
    *
    * This component can also be used to create form-level validation messages by
    * setting the `role` prop to `"alert"`.
    */
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  /**
    * This component is a simple wrapper of the `TextField` that can only be
    * rendered for password inputs. There is built-in functionality to be able to
    * temporarily show the password's value by swapping the `type` to `"text"`.
    */
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  /**
    * The text field is a wrapper of the `<input type="text" />` component with
    * some nice default themes. It can also be used to render other text input
    * types with _some_ support.
    */
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * This component is used to add an an icon before or after the text field with
    * correct styling.
    */
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  /**
    * This is a container component that is used to structure the text field with
    * different parts and themes.
    */
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
}

