package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerPredicateCondition extends js.Object {
  /**
    * The name of the job to watch.
    */
  var jobName: Input[String]
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[Input[String]] = js.undefined
  /**
    * The condition state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`.
    */
  var state: Input[String]
}

object TriggerPredicateCondition {
  @scala.inline
  def apply(jobName: Input[String], state: Input[String], logicalOperator: Input[String] = null): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal(jobName = jobName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
}

