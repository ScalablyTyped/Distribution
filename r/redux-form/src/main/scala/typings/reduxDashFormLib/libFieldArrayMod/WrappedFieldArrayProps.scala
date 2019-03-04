package typings
package reduxDashFormLib.libFieldArrayMod

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
    val __obj = js.Dynamic.literal(fields = fields, meta = meta)
  
    __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
  }
}

