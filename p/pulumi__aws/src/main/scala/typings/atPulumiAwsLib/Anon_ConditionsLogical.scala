package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConditionsLogical extends js.Object {
  var conditions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_JobNameLogicalOperator]]]
  var logical: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ConditionsLogical {
  @scala.inline
  def apply(
    conditions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_JobNameLogicalOperator]]],
    logical: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ConditionsLogical = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    if (logical != null) __obj.updateDynamic("logical")(logical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConditionsLogical]
  }
}

