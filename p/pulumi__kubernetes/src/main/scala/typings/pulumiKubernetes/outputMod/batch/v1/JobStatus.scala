package typings.pulumiKubernetes.outputMod.batch.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobStatus represents the current state of a Job.
  */
@js.native
trait JobStatus extends js.Object {
  /**
    * The number of actively running pods.
    */
  var active: Double = js.native
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
    */
  var completionTime: String = js.native
  /**
    * The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.Array[JobCondition] = js.native
  /**
    * The number of pods which reached phase Failed.
    */
  var failed: Double = js.native
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
    */
  var startTime: String = js.native
  /**
    * The number of pods which reached phase Succeeded.
    */
  var succeeded: Double = js.native
}

object JobStatus {
  @scala.inline
  def apply(
    active: Double,
    completionTime: String,
    conditions: js.Array[JobCondition],
    failed: Double,
    startTime: String,
    succeeded: Double
  ): JobStatus = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
  @scala.inline
  implicit class JobStatusOps[Self <: JobStatus] (val x: Self) extends AnyVal {
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletionTime(value: String): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: JobCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[JobCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

