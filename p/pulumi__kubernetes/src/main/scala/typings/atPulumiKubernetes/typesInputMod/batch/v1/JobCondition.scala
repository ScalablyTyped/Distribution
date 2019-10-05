package typings.atPulumiKubernetes.typesInputMod.batch.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var lastProbeTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * Last time the condition transit from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * Human readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * (brief) reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  /**
    * Type of job condition, Complete or Failed.
    */
  var `type`: Input[String]
}

object JobCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    lastProbeTime: Input[String] = null,
    lastTransitionTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): JobCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastProbeTime != null) __obj.updateDynamic("lastProbeTime")(lastProbeTime.asInstanceOf[js.Any])
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCondition]
  }
}

