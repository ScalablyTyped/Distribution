package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldValues extends js.Object {
  var field: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var values: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_FieldValues {
  @scala.inline
  def apply(
    field: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    values: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_FieldValues = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldValues]
  }
}

