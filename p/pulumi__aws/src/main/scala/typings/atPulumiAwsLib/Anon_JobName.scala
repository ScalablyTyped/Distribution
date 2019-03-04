package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JobName extends js.Object {
  var jobName: java.lang.String
  var logicalOperator: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
}

object Anon_JobName {
  @scala.inline
  def apply(jobName: java.lang.String, state: java.lang.String, logicalOperator: java.lang.String = null): Anon_JobName = {
    val __obj = js.Dynamic.literal(jobName = jobName, state = state)
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator)
    __obj.asInstanceOf[Anon_JobName]
  }
}

