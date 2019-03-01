package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EvaluateTargetHealthName extends js.Object {
  var evaluateTargetHealth: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EvaluateTargetHealthName {
  @scala.inline
  def apply(
    evaluateTargetHealth: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    zoneId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_EvaluateTargetHealthName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluateTargetHealth")(evaluateTargetHealth.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EvaluateTargetHealthName]
  }
}

