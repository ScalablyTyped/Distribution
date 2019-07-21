package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputField extends js.Object {
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[java.lang.String] = js.undefined
  // Error in Mapping execution: 'skip' or 'fail'
  var on_error: js.UndefOr[rocksetLib.rocksetLibStrings.SKIP | rocksetLib.rocksetLibStrings.FAIL] = js.undefined
  // The name of a sql function
  var value: js.UndefOr[SqlExpression] = js.undefined
}

object OutputField {
  @scala.inline
  def apply(
    field_name: java.lang.String = null,
    on_error: rocksetLib.rocksetLibStrings.SKIP | rocksetLib.rocksetLibStrings.FAIL = null,
    value: SqlExpression = null
  ): OutputField = {
    val __obj = js.Dynamic.literal()
    if (field_name != null) __obj.updateDynamic("field_name")(field_name)
    if (on_error != null) __obj.updateDynamic("on_error")(on_error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OutputField]
  }
}

