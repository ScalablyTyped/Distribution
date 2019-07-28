package typings.reactDashForm.reactDashFormMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.StatelessComponent
import typings.react.reactMod.TextareaHTMLAttributes
import typings.reactDashForm.Anon_Group
import typings.reactDashForm.Anon_GroupLabel
import typings.reactDashForm.Anon_LabelString
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Checkbox: StatelessComponent[FieldProps with InputHTMLAttributes[HTMLInputElement]] = js.native
  val NestedForm: StatelessComponent[FieldProps] = js.native
  val Radio: StatelessComponent[FieldProps with InputHTMLAttributes[HTMLInputElement] with Anon_Group] = js.native
  val Select: StatelessComponent[SelectProps] = js.native
  val StyledCheckbox: StatelessComponent[StyledProps with InputHTMLAttributes[HTMLInputElement] with Anon_LabelString] = js.native
  val StyledRadio: StatelessComponent[StyledProps with InputHTMLAttributes[HTMLInputElement] with Anon_GroupLabel] = js.native
  val StyledSelect: StatelessComponent[StyledProps with SelectProps with InputHTMLAttributes[HTMLSelectElement]] = js.native
  val StyledText: StatelessComponent[StyledProps with InputHTMLAttributes[HTMLInputElement]] = js.native
  val StyledTextArea: StatelessComponent[StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = js.native
  val Text: StatelessComponent[FieldProps with InputHTMLAttributes[HTMLInputElement]] = js.native
  val TextArea: StatelessComponent[FieldProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = js.native
  def FormField(component: ComponentType[_]): ComponentClass[_, ComponentState] = js.native
}

