package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldValues extends js.Object {
  var field: js.UndefOr[Input[String]] = js.undefined
  var values: js.UndefOr[Input[String]] = js.undefined
}

object Anon_FieldValues {
  @scala.inline
  def apply(field: Input[String] = null, values: Input[String] = null): Anon_FieldValues = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldValues]
  }
}

