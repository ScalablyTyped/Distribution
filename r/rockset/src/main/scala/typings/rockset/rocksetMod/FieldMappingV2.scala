package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMappingV2 extends js.Object {
  // A List of InputField for this mapping
  var input_fields: js.UndefOr[js.Array[InputField]] = js.undefined
  // A user specified string that is a name for this mapping
  var name: js.UndefOr[String] = js.undefined
  // An OutputField for this mapping
  var output_field: js.UndefOr[OutputField] = js.undefined
}

object FieldMappingV2 {
  @scala.inline
  def apply(input_fields: js.Array[InputField] = null, name: String = null, output_field: OutputField = null): FieldMappingV2 = {
    val __obj = js.Dynamic.literal()
    if (input_fields != null) __obj.updateDynamic("input_fields")(input_fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (output_field != null) __obj.updateDynamic("output_field")(output_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldMappingV2]
  }
}

