package typings.rockset.rocksetMod

import typings.rockset.rocksetStrings.PASS
import typings.rockset.rocksetStrings.SKIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputField extends js.Object {
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.undefined
  // Define the behaviour if fieldName is missing or is null
  var if_missing: js.UndefOr[SKIP | PASS] = js.undefined
  // If true, then drop fieldName from the document
  var is_drop: js.UndefOr[Boolean] = js.undefined
  // Sql parameter name
  var param: js.UndefOr[String] = js.undefined
}

object InputField {
  @scala.inline
  def apply(
    field_name: String = null,
    if_missing: SKIP | PASS = null,
    is_drop: js.UndefOr[Boolean] = js.undefined,
    param: String = null
  ): InputField = {
    val __obj = js.Dynamic.literal()
    if (field_name != null) __obj.updateDynamic("field_name")(field_name)
    if (if_missing != null) __obj.updateDynamic("if_missing")(if_missing.asInstanceOf[js.Any])
    if (!js.isUndefined(is_drop)) __obj.updateDynamic("is_drop")(is_drop)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[InputField]
  }
}

