package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueName extends js.Object {
  var defaultValue: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DefaultValueName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    namespace: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    defaultValue: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DefaultValueName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValueName]
  }
}

