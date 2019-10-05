package typings.atPulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a
  * certain point.
  */
trait HorizontalPodAutoscalerCondition extends js.Object {
  /**
    * lastTransitionTime is the last time the condition transitioned from one status to another
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * message is a human-readable explanation containing details about the transition
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * reason is the reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * status is the status of the condition (True, False, Unknown)
    */
  var status: Input[String]
  /**
    * type describes the current condition
    */
  var `type`: Input[String]
}

object HorizontalPodAutoscalerCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    lastTransitionTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): HorizontalPodAutoscalerCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscalerCondition]
  }
}

