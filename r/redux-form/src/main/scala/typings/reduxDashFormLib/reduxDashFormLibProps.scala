package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reduxDashFormLibProps {
  type FieldArrayProps[P, FieldValue] = reduxDashFormLib.libFieldArrayMod.BaseFieldArrayProps[P, FieldValue]
  type FormProps[FormData, P, ErrorType] = reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]
  @scala.inline
  def FormNameProps: reduxDashFormLib.libFormNameMod.FormNameProps.type = reduxDashFormLib.libFormNameMod.FormNameProps
  type FormNameProps = reduxDashFormLib.libFormNameMod.FormNameProps
  type GenericFormProps[FormData, P, ErrorType] = reduxDashFormLib.libFormMod.FormProps[FormData, P, ErrorType]
}

