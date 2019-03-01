package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeValueInputString extends js.Object {
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_TypeValueInputString {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_TypeValueInputString = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeValueInputString]
  }
}

