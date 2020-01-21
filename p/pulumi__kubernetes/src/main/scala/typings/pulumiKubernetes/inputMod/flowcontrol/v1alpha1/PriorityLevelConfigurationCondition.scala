package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationCondition defines the condition of priority level.
  */
trait PriorityLevelConfigurationCondition extends js.Object {
  /**
    * `lastTransitionTime` is the last time the condition transitioned from one status to
    * another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * `message` is a human-readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * `type` is the type of the condition. Required.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object PriorityLevelConfigurationCondition {
  @scala.inline
  def apply(
    lastTransitionTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null,
    `type`: Input[String] = null
  ): PriorityLevelConfigurationCondition = {
    val __obj = js.Dynamic.literal()
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationCondition]
  }
}

