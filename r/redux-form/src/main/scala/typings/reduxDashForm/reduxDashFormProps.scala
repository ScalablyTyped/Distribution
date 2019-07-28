package typings.reduxDashForm

import typings.reduxDashForm.libFieldArrayMod.BaseFieldArrayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reduxDashFormProps {
  type FieldArrayProps[P, FieldValue] = BaseFieldArrayProps[P, FieldValue]
  type FormProps[FormData, P, ErrorType] = typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]
  @scala.inline
  def FormNameProps: typings.reduxDashForm.libFormNameMod.FormNameProps.type = typings.reduxDashForm.libFormNameMod.FormNameProps
  type FormNameProps = typings.reduxDashForm.libFormNameMod.FormNameProps
  type GenericFormProps[FormData, P, ErrorType] = typings.reduxDashForm.libFormMod.FormProps[FormData, P, ErrorType]
}

