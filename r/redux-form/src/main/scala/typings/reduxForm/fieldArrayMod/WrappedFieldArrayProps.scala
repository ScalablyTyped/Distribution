package typings.reduxForm.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedFieldArrayProps[FieldValue] extends js.Object {
  var fields: FieldArrayFieldsProps[FieldValue]
  var meta: FieldArrayMetaProps
}

object WrappedFieldArrayProps {
  @scala.inline
  def apply[FieldValue](fields: FieldArrayFieldsProps[FieldValue], meta: FieldArrayMetaProps): WrappedFieldArrayProps[FieldValue] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
  }
}

