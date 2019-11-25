package typings.atPulumiKubernetes.typesOutputMod.batch.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobCondition describes current state of a job.
  */
trait JobCondition extends js.Object {
  /**
    * Last time the condition was checked.
    */
  val lastProbeTime: String
  /**
    * Last time the condition transit from one status to another.
    */
  val lastTransitionTime: String
  /**
    * Human readable message indicating details about last transition.
    */
  val message: String
  /**
    * (brief) reason for the condition's last transition.
    */
  val reason: String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: String
  /**
    * Type of job condition, Complete or Failed.
    */
  val `type`: String
}

object JobCondition {
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): JobCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCondition]
  }
}

