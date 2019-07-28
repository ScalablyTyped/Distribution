package typings.reactDashForm

import typings.react.reactMod.ComponentType
import typings.react.reactMod.InputHTMLAttributes
import typings.react.reactMod.TextareaHTMLAttributes
import typings.reactDashForm.reactDashFormMod.FieldProps
import typings.reactDashForm.reactDashFormMod.FormProps
import typings.reactDashForm.reactDashFormMod.StyledProps
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashFormComponents extends reactDashFormProps {
  @scala.inline
  def Checkbox: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactDashForm.reactDashFormMod.^.Checkbox.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FieldProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def Form: ComponentType[FormProps with Anon_Children] = js.constructorOf[typings.reactDashForm.reactDashFormMod.Form].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FormProps with typings.reactDashForm.Anon_Children]]
  @scala.inline
  def NestedForm: ComponentType[FieldProps] = typings.reactDashForm.reactDashFormMod.^.NestedForm.asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashForm.reactDashFormMod.FieldProps]]
  @scala.inline
  def Radio: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement] with Anon_Group] = typings.reactDashForm.reactDashFormMod.^.Radio.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FieldProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactDashForm.Anon_Group]]
  @scala.inline
  def RadioGroup: ComponentType[FieldProps with Anon_ChildrenProps] = js.constructorOf[typings.reactDashForm.reactDashFormMod.RadioGroup].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FieldProps with typings.reactDashForm.Anon_ChildrenProps]]
  @scala.inline
  def Select: ComponentType[typings.reactDashForm.reactDashFormMod.SelectProps] = typings.reactDashForm.reactDashFormMod.^.Select.asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashForm.reactDashFormMod.SelectProps]]
  @scala.inline
  def StyledCheckbox: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement] with Anon_LabelString] = typings.reactDashForm.reactDashFormMod.^.StyledCheckbox.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactDashForm.Anon_LabelString]]
  @scala.inline
  def StyledRadio: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement] with Anon_GroupLabel] = typings.reactDashForm.reactDashFormMod.^.StyledRadio.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactDashForm.Anon_GroupLabel]]
  @scala.inline
  def StyledRadioGroup: ComponentType[StyledProps with Anon_ChildrenProps] = js.constructorOf[typings.reactDashForm.reactDashFormMod.StyledRadioGroup].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.reactDashForm.Anon_ChildrenProps]]
  @scala.inline
  def StyledSelect: ComponentType[
    StyledProps with typings.reactDashForm.reactDashFormMod.SelectProps with InputHTMLAttributes[HTMLSelectElement]
  ] = typings.reactDashForm.reactDashFormMod.^.StyledSelect.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.reactDashForm.reactDashFormMod.SelectProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLSelectElement]]]
  @scala.inline
  def StyledText: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactDashForm.reactDashFormMod.^.StyledText.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def StyledTextArea: ComponentType[StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactDashForm.reactDashFormMod.^.StyledTextArea.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.StyledProps with typings.react.reactMod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]]]
  @scala.inline
  def Text: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactDashForm.reactDashFormMod.^.Text.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FieldProps with typings.react.reactMod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def TextArea: ComponentType[FieldProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactDashForm.reactDashFormMod.^.TextArea.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashForm.reactDashFormMod.FieldProps with typings.react.reactMod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]]]
}

