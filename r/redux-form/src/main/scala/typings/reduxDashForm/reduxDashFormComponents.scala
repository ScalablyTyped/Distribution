package typings.reduxDashForm

import typings.react.reactMod.ComponentType
import typings.reduxDashForm.libFieldArrayMod.BaseFieldArrayProps
import typings.reduxDashForm.libFieldMod.BaseFieldProps
import typings.reduxDashForm.libFieldMod.GenericFieldHTMLAttributes
import typings.reduxDashForm.libFieldsMod.BaseFieldsProps
import typings.reduxDashForm.libFormSectionMod.FormSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashFormComponents extends reduxDashFormProps {
  @scala.inline
  def Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */]: ComponentType[P] = js.constructorOf[typings.reduxDashForm.libFieldMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def FieldArray[P, FieldValue]: ComponentType[BaseFieldArrayProps[P, FieldValue]] = js.constructorOf[typings.reduxDashForm.immutableMod.FieldArray[P, FieldValue]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFieldArrayMod.BaseFieldArrayProps[P, FieldValue]]]
  @scala.inline
  def Fields[P]: ComponentType[BaseFieldsProps[P] with P] = js.constructorOf[typings.reduxDashForm.immutableMod.Fields[P]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFieldsMod.BaseFieldsProps[P] with P]]
  @scala.inline
  def Form[FormData, P, ErrorType]: ComponentType[typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[typings.reduxDashForm.libFormMod.Form[FormData, P, ErrorType]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]]]
  @scala.inline
  def FormName: ComponentType[typings.reduxDashForm.libFormNameMod.FormNameProps] = typings.reduxDashForm.libFormNameMod.^.default.asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFormNameMod.FormNameProps]]
  @scala.inline
  def FormSection[P]: ComponentType[FormSectionProps[P] with P] = js.constructorOf[typings.reduxDashForm.libFormSectionMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFormSectionMod.FormSectionProps[P] with P]]
  @scala.inline
  def GenericForm[FormData, P, ErrorType]: ComponentType[typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[typings.reduxDashForm.libFormMod.GenericForm[FormData, P, ErrorType]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]]]
}

