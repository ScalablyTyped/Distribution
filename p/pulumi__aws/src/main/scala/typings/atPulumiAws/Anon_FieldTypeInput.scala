package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldTypeInput extends js.Object {
  var field: js.UndefOr[Input[String]] = js.undefined
  var `type`: Input[String]
}

object Anon_FieldTypeInput {
  @scala.inline
  def apply(`type`: Input[String], field: Input[String] = null): Anon_FieldTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldTypeInput]
  }
}

