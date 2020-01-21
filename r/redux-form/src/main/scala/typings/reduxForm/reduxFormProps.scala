package typings.reduxForm

import typings.reduxForm.fieldArrayMod.BaseFieldArrayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reduxFormProps {
  type FieldArrayProps[P, FieldValue] = BaseFieldArrayProps[P, FieldValue]
  type FormProps[FormData, P, ErrorType] = typings.reduxForm.formMod.FormProps[FormData, P, ErrorType]
  @scala.inline
  def FormNameProps: typings.reduxForm.formNameMod.FormNameProps.type = typings.reduxForm.formNameMod.FormNameProps
  type FormNameProps = typings.reduxForm.formNameMod.FormNameProps
  type GenericFormProps[FormData, P, ErrorType] = typings.reduxForm.formMod.FormProps[FormData, P, ErrorType]
}

