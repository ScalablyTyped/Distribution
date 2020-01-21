package typings.reactForm

import typings.react.mod.ComponentType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.reactForm.mod.FieldProps
import typings.reactForm.mod.FormProps
import typings.reactForm.mod.StyledProps
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFormComponents extends reactFormProps {
  @scala.inline
  def Checkbox: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.Checkbox.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.FieldProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def Form: ComponentType[FormProps with AnonChildren] = js.constructorOf[typings.reactForm.mod.Form].asInstanceOf[typings.react.mod.ComponentType[typings.reactForm.mod.FormProps with typings.reactForm.AnonChildren]]
  @scala.inline
  def NestedForm: ComponentType[NestedFormProps] = typings.reactForm.mod.NestedForm.asInstanceOf[typings.react.mod.ComponentType[NestedFormProps]]
  @scala.inline
  def Radio: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement] with AnonGroup] = typings.reactForm.mod.Radio.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.FieldProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactForm.AnonGroup]]
  @scala.inline
  def RadioGroup: ComponentType[FieldProps with AnonChildrenProps] = js.constructorOf[typings.reactForm.mod.RadioGroup].asInstanceOf[typings.react.mod.ComponentType[typings.reactForm.mod.FieldProps with typings.reactForm.AnonChildrenProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = typings.reactForm.mod.Select.asInstanceOf[typings.react.mod.ComponentType[SelectProps]]
  @scala.inline
  def StyledCheckbox: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement] with AnonLabelString] = typings.reactForm.mod.StyledCheckbox.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.StyledProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactForm.AnonLabelString]]
  @scala.inline
  def StyledRadio: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement] with AnonGroupLabel] = typings.reactForm.mod.StyledRadio.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.StyledProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.reactForm.AnonGroupLabel]]
  @scala.inline
  def StyledRadioGroup: ComponentType[StyledProps with AnonChildrenProps] = js.constructorOf[typings.reactForm.mod.StyledRadioGroup].asInstanceOf[typings.react.mod.ComponentType[typings.reactForm.mod.StyledProps with typings.reactForm.AnonChildrenProps]]
  @scala.inline
  def StyledSelect: ComponentType[
    StyledProps with typings.reactForm.mod.SelectProps with InputHTMLAttributes[HTMLSelectElement]
  ] = typings.reactForm.mod.StyledSelect.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.StyledProps with typings.reactForm.mod.SelectProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLSelectElement]]]
  @scala.inline
  def StyledText: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.StyledText.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.StyledProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def StyledTextArea: ComponentType[StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactForm.mod.StyledTextArea.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.StyledProps with typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]]]
  @scala.inline
  def Text: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.Text.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.FieldProps with typings.react.mod.InputHTMLAttributes[typings.std.HTMLInputElement]]]
  @scala.inline
  def TextArea: ComponentType[FieldProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactForm.mod.TextArea.asInstanceOf[typings.react.mod.ComponentType[
  typings.reactForm.mod.FieldProps with typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]]]
}

