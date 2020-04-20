package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalFieldData extends Meta {
  var value: StoreValue
}

object InternalFieldData {
  @scala.inline
  def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validating: Boolean,
    value: StoreValue
  ): InternalFieldData = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFieldData]
  }
}

