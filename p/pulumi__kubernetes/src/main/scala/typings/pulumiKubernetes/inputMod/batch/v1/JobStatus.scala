package typings.pulumiKubernetes.inputMod.batch.v1

import typings.pulumiPulumi.outputMod.Input
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
  var active: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
    */
  var completionTime: js.UndefOr[Input[String]] = js.native
  /**
    * The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.UndefOr[Input[js.Array[Input[JobCondition]]]] = js.native
  /**
    * The number of pods which reached phase Failed.
    */
  var failed: js.UndefOr[Input[Double]] = js.native
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
    */
  var startTime: js.UndefOr[Input[String]] = js.native
  /**
    * The number of pods which reached phase Succeeded.
    */
  var succeeded: js.UndefOr[Input[Double]] = js.native
}

object JobStatus {
  @scala.inline
  def apply(): JobStatus = {
    val __obj = js.Dynamic.literal()
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
    def setActive(value: Input[Double]): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCompletionTime(value: Input[String]): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionTime: Self = this.set("completionTime", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Input[JobCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[JobCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setFailed(value: Input[Double]): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    @scala.inline
    def setStartTime(value: Input[String]): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setSucceeded(value: Input[Double]): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceeded: Self = this.set("succeeded", js.undefined)
  }
  
}

