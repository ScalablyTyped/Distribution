package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyMethodName extends js.Object {
  var applyMethod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ApplyMethodName {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    applyMethod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ApplyMethodName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (applyMethod != null) __obj.updateDynamic("applyMethod")(applyMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplyMethodName]
  }
}

