package typings.reactForm

import typings.react.mod.ComponentType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.reactForm.mod.FieldProps
import typings.reactForm.mod.StyledProps
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFormComponents extends reactFormProps {
  @scala.inline
  def Checkbox: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.Checkbox.asInstanceOf[ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]]]
  @scala.inline
  def Form: ComponentType[FormProps] = js.constructorOf[typings.reactForm.mod.Form].asInstanceOf[ComponentType[FormProps]]
  @scala.inline
  def NestedForm: ComponentType[NestedFormProps] = typings.reactForm.mod.NestedForm.asInstanceOf[ComponentType[NestedFormProps]]
  @scala.inline
  def Radio: ComponentType[RadioProps] = typings.reactForm.mod.Radio.asInstanceOf[ComponentType[RadioProps]]
  @scala.inline
  def RadioGroup: ComponentType[RadioGroupProps] = js.constructorOf[typings.reactForm.mod.RadioGroup].asInstanceOf[ComponentType[RadioGroupProps]]
  @scala.inline
  def Select: ComponentType[SelectProps] = typings.reactForm.mod.Select.asInstanceOf[ComponentType[SelectProps]]
  @scala.inline
  def StyledCheckbox: ComponentType[StyledCheckboxProps] = typings.reactForm.mod.StyledCheckbox.asInstanceOf[ComponentType[StyledCheckboxProps]]
  @scala.inline
  def StyledRadio: ComponentType[StyledRadioProps] = typings.reactForm.mod.StyledRadio.asInstanceOf[ComponentType[StyledRadioProps]]
  @scala.inline
  def StyledRadioGroup: ComponentType[StyledRadioGroupProps] = js.constructorOf[typings.reactForm.mod.StyledRadioGroup].asInstanceOf[ComponentType[StyledRadioGroupProps]]
  @scala.inline
  def StyledSelect: ComponentType[
    StyledProps with typings.reactForm.mod.SelectProps with InputHTMLAttributes[HTMLSelectElement]
  ] = typings.reactForm.mod.StyledSelect.asInstanceOf[ComponentType[
    StyledProps with typings.reactForm.mod.SelectProps with InputHTMLAttributes[HTMLSelectElement]
  ]]
  @scala.inline
  def StyledText: ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.StyledText.asInstanceOf[ComponentType[StyledProps with InputHTMLAttributes[HTMLInputElement]]]
  @scala.inline
  def StyledTextArea: ComponentType[StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactForm.mod.StyledTextArea.asInstanceOf[ComponentType[StyledProps with TextareaHTMLAttributes[HTMLTextAreaElement]]]
  @scala.inline
  def Text: ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]] = typings.reactForm.mod.Text.asInstanceOf[ComponentType[FieldProps with InputHTMLAttributes[HTMLInputElement]]]
  @scala.inline
  def TextArea: ComponentType[FieldProps with TextareaHTMLAttributes[HTMLTextAreaElement]] = typings.reactForm.mod.TextArea.asInstanceOf[ComponentType[FieldProps with TextareaHTMLAttributes[HTMLTextAreaElement]]]
}

