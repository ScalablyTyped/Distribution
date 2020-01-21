package typings.pulumiKubernetes.inputMod.apps.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DeploymentCondition describes the state of a deployment at a certain point.
  */
trait DeploymentCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The last time this condition was updated.
    */
  var lastUpdateTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * A human readable message indicating details about the transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * The reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: Input[String]
  /**
    * Type of deployment condition.
    */
  var `type`: Input[String]
}

object DeploymentCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    lastTransitionTime: Input[String] = null,
    lastUpdateTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): DeploymentCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCondition]
  }
}

