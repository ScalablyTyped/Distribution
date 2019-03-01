package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1Ns

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
  val lastProbeTime: java.lang.String
  /**
    * Last time the condition transit from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * Human readable message indicating details about last transition.
    */
  val message: java.lang.String
  /**
    * (brief) reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type of job condition, Complete or Failed.
    */
  val `type`: java.lang.String
}

object JobCondition {
  @scala.inline
  def apply(
    lastProbeTime: java.lang.String,
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): JobCondition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("lastProbeTime")(lastProbeTime)
    __obj.updateDynamic("lastTransitionTime")(lastTransitionTime)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[JobCondition]
  }
}

