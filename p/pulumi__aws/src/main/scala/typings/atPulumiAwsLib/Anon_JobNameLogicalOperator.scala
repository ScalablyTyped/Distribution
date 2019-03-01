package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobNameLogicalOperator extends js.Object {
  var jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var logicalOperator: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var state: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_JobNameLogicalOperator {
  @scala.inline
  def apply(
    jobName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    state: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    logicalOperator: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_JobNameLogicalOperator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobNameLogicalOperator]
  }
}

