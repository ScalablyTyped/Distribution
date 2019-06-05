package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxDashFormLibComponents {
  @scala.inline
  def Field[P /* <: reduxDashFormLib.libFieldMod.GenericFieldHTMLAttributes | reduxDashFormLib.libFieldMod.BaseFieldProps[js.Object] */]: reactLib.reactMod.ComponentType[P] = js.constructorOf[reduxDashFormLib.libFieldMod.default[P]].asInstanceOf[reactLib.reactMod.ComponentType[P]]
  @scala.inline
  def FieldArray[P, FieldValue]: reactLib.reactMod.ComponentType[reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P, FieldValue]] = js.constructorOf[reduxDashFormLib.immutableMod.FieldArray[P, FieldValue]].asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P, FieldValue]]]
  type FieldArrayProps[P, FieldValue] = reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P, FieldValue]
  @scala.inline
  def Fields[P]: reactLib.reactMod.ComponentType[reduxDashFormLib.libFieldsMod.BaseFieldsProps[P] with P] = js.constructorOf[reduxDashFormLib.immutableMod.Fields[P]].asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFieldsMod.BaseFieldsProps[P] with P]]
  @scala.inline
  def Form[FormData, P, ErrorType]: reactLib.reactMod.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[reduxDashFormLib.libFormMod.Form[FormData, P, ErrorType]].asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]]]
  type FormProps[FormData, P, ErrorType] = reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]
  @scala.inline
  def FormName: reactLib.reactMod.ComponentType[reduxDashFormLib.libFormNameMod.FormNameProps] = reduxDashFormLib.libFormNameMod.^.default.asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFormNameMod.FormNameProps]]
  @scala.inline
  def FormNameProps: reduxDashFormLib.libFormNameMod.FormNameProps.type = reduxDashFormLib.libFormNameMod.FormNameProps
  type FormNameProps = reduxDashFormLib.libFormNameMod.FormNameProps
  @scala.inline
  def FormSection[P]: reactLib.reactMod.ComponentType[reduxDashFormLib.libFormSectionMod.FormSectionProps[P] with P] = js.constructorOf[reduxDashFormLib.libFormSectionMod.default[P]].asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFormSectionMod.FormSectionProps[P] with P]]
  @scala.inline
  def GenericForm[FormData, P, ErrorType]: reactLib.reactMod.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]] = js.constructorOf[reduxDashFormLib.libFormMod.GenericForm[FormData, P, ErrorType]].asInstanceOf[reactLib.reactMod.ComponentType[reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]]]
  type GenericFormProps[FormData, P, ErrorType] = reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]
}

