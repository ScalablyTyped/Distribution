package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeValue extends js.Object {
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_NameTypeValue {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_NameTypeValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameTypeValue]
  }
}

