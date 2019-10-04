package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerPredicateCondition extends js.Object {
  /**
    * The name of the job to watch.
    */
  var jobName: String
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[String] = js.undefined
  /**
    * The condition state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`.
    */
  var state: String
}

object TriggerPredicateCondition {
  @scala.inline
  def apply(jobName: String, state: String, logicalOperator: String = null): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal(jobName = jobName, state = state)
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator)
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
}

