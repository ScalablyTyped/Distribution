package typings.reduxForm

import typings.react.mod.ComponentType
import typings.reduxForm.fieldMod.BaseFieldProps
import typings.reduxForm.fieldMod.GenericFieldHTMLAttributes
import typings.reduxForm.fieldsMod.BaseFieldsProps
import typings.reduxForm.formSectionMod.FormSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxFormComponents extends reduxFormProps {
  @scala.inline
  def Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */]: ComponentType[P] = js.constructorOf[typings.reduxForm.fieldMod.default[P]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def FieldArray[P, FieldValue]: ComponentType[FieldArrayProps[P, FieldValue]] = js.constructorOf[typings.reduxForm.mod.FieldArray[P, FieldValue]].asInstanceOf[typings.react.mod.ComponentType[FieldArrayProps[P, FieldValue]]]
  @scala.inline
  def Fields[P]: ComponentType[BaseFieldsProps[P] with P] = js.constructorOf[typings.reduxForm.mod.Fields[P]].asInstanceOf[typings.react.mod.ComponentType[typings.reduxForm.fieldsMod.BaseFieldsProps[P] with P]]
  @scala.inline
  def Form[FormData, P, ErrorType]: ComponentType[FormProps[FormData, P, ErrorType]] = js.constructorOf[typings.reduxForm.mod.Form[FormData, P, ErrorType]].asInstanceOf[typings.react.mod.ComponentType[FormProps[FormData, P, ErrorType]]]
  @scala.inline
  def FormName: ComponentType[FormNameProps] = typings.reduxForm.formNameMod.default.asInstanceOf[typings.react.mod.ComponentType[FormNameProps]]
  @scala.inline
  def FormSection[P]: ComponentType[FormSectionProps[P] with P] = js.constructorOf[typings.reduxForm.formSectionMod.default[P]].asInstanceOf[typings.react.mod.ComponentType[typings.reduxForm.formSectionMod.FormSectionProps[P] with P]]
  @scala.inline
  def GenericForm[FormData, P, ErrorType]: ComponentType[GenericFormProps[FormData, P, ErrorType]] = js.constructorOf[typings.reduxForm.mod.GenericForm[FormData, P, ErrorType]].asInstanceOf[typings.react.mod.ComponentType[GenericFormProps[FormData, P, ErrorType]]]
}

