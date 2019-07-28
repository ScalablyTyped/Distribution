package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobName extends js.Object {
  var jobName: String
  var logicalOperator: js.UndefOr[String] = js.undefined
  var state: String
}

object Anon_JobName {
  @scala.inline
  def apply(jobName: String, state: String, logicalOperator: String = null): Anon_JobName = {
    val __obj = js.Dynamic.literal(jobName = jobName, state = state)
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator)
    __obj.asInstanceOf[Anon_JobName]
  }
}

