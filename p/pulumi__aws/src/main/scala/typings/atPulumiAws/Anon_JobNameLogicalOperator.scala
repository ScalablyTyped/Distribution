package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobNameLogicalOperator extends js.Object {
  var jobName: Input[String]
  var logicalOperator: js.UndefOr[Input[String]] = js.undefined
  var state: Input[String]
}

object Anon_JobNameLogicalOperator {
  @scala.inline
  def apply(jobName: Input[String], state: Input[String], logicalOperator: Input[String] = null): Anon_JobNameLogicalOperator = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_JobNameLogicalOperator]
  }
}

