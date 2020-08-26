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
  def apply(jobDefinition: String, jobName: String): EventTargetBatchTarget = {
    val __obj = js.Dynamic.literal(jobDefinition = jobDefinition.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetBatchTarget]
  }
  @scala.inline
  implicit class EventTargetBatchTargetOps[Self <: EventTargetBatchTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobDefinition(value: String): Self = this.set("jobDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setArraySize(value: Double): Self = this.set("arraySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArraySize: Self = this.set("arraySize", js.undefined)
    @scala.inline
    def setJobAttempts(value: Double): Self = this.set("jobAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobAttempts: Self = this.set("jobAttempts", js.undefined)
  }
  
}

