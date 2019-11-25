package typings.atPulumiKubernetes.typesOutputMod.batch.v1

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
  val active: Double
  /**
    * Represents time when the job was completed. It is not guaranteed to be set in
    * happens-before order across separate operations. It is represented in RFC3339 form and is
    * in UTC.
    */
  val completionTime: String
  /**
    * The latest available observations of an object's current state. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  val conditions: js.Array[JobCondition]
  /**
    * The number of pods which reached phase Failed.
    */
  val failed: Double
  /**
    * Represents time when the job was acknowledged by the job controller. It is not guaranteed
    * to be set in happens-before order across separate operations. It is represented in RFC3339
    * form and is in UTC.
    */
  val startTime: String
  /**
    * The number of pods which reached phase Succeeded.
    */
  val succeeded: Double
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
}

