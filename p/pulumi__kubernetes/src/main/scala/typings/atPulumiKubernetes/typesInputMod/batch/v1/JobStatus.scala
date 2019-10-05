package typings.atPulumiKubernetes.typesInputMod.batch.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobStatus represents the current state of a Job.
  */
trait JobStatus extends js.Object {
  /**
    * The number of actively running pods.
    */
  var active: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in
    * happens-before order across separate operations. It is represented in RFC3339 form and is
    * in UTC.
    */
  var completionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The latest available observations of an object's current state. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var conditions: js.UndefOr[Input[js.Array[Input[JobCondition]]]] = js.undefined
  /**
    * The number of pods which reached phase Failed.
    */
  var failed: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed
    * to be set in happens-before order across separate operations. It is represented in RFC3339
    * form and is in UTC.
    */
  var startTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of pods which reached phase Succeeded.
    */
  var succeeded: js.UndefOr[Input[Double]] = js.undefined
}

object JobStatus {
  @scala.inline
  def apply(
    active: Input[Double] = null,
    completionTime: Input[String] = null,
    conditions: Input[js.Array[Input[JobCondition]]] = null,
    failed: Input[Double] = null,
    startTime: Input[String] = null,
    succeeded: Input[Double] = null
  ): JobStatus = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (completionTime != null) __obj.updateDynamic("completionTime")(completionTime.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (succeeded != null) __obj.updateDynamic("succeeded")(succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatus]
  }
}

