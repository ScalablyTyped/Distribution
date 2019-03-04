package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypeInput extends js.Object {
  var data: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DataTypeInput {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    data: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DataTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataTypeInput]
  }
}

