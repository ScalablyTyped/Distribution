package typings
package reactDashFormLib.reactDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-form", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Checkbox: reactLib.reactMod.StatelessComponent[FieldProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]] = js.native
  val NestedForm: reactLib.reactMod.StatelessComponent[FieldProps] = js.native
  val Radio: reactLib.reactMod.StatelessComponent[
    FieldProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] with reactDashFormLib.Anon_Group
  ] = js.native
  val Select: reactLib.reactMod.StatelessComponent[SelectProps] = js.native
  val StyledCheckbox: reactLib.reactMod.StatelessComponent[
    StyledProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] with reactDashFormLib.Anon_LabelString
  ] = js.native
  val StyledRadio: reactLib.reactMod.StatelessComponent[
    StyledProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] with reactDashFormLib.Anon_GroupLabel
  ] = js.native
  val StyledSelect: reactLib.reactMod.StatelessComponent[
    StyledProps with SelectProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLSelectElement]
  ] = js.native
  val StyledText: reactLib.reactMod.StatelessComponent[StyledProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]] = js.native
  val StyledTextArea: reactLib.reactMod.StatelessComponent[
    StyledProps with reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement]
  ] = js.native
  val Text: reactLib.reactMod.StatelessComponent[FieldProps with reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]] = js.native
  val TextArea: reactLib.reactMod.StatelessComponent[
    FieldProps with reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement]
  ] = js.native
  def FormField(component: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
}

