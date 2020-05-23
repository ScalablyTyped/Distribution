package typings.pulumiAws.outputMod.cloudwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetBatchTarget extends js.Object {
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var arraySize: js.UndefOr[Double] = js.native
  /**
    * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
    */
  var jobAttempts: js.UndefOr[Double] = js.native
  /**
    * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
    */
  var jobDefinition: String = js.native
  /**
    * The name to use for this execution of the job, if the target is an AWS Batch job.
    */
  var jobName: String = js.native
}

object EventTargetBatchTarget {
  @scala.inline
  def apply(
    jobDefinition: String,
    jobName: String,
    arraySize: js.UndefOr[Double] = js.undefined,
    jobAttempts: js.UndefOr[Double] = js.undefined
  ): EventTargetBatchTarget = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    if (!js.isUndefined(arraySize)) __obj.updateDynamic("arraySize")(arraySize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jobAttempts)) __obj.updateDynamic("jobAttempts")(jobAttempts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetBatchTarget]
  }
}

