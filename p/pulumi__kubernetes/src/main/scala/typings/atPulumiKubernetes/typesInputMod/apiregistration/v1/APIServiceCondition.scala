package typings.atPulumiKubernetes.typesInputMod.apiregistration.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceCondition describes the state of an APIService at a particular point
  */
trait APIServiceCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * Human-readable message indicating details about last transition.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * Status is the status of the condition. Can be True, False, Unknown.
    */
  var status: Input[String]
  /**
    * Type is the type of the condition.
    */
  var `type`: Input[String]
}

object APIServiceCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    lastTransitionTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): APIServiceCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIServiceCondition]
  }
}

