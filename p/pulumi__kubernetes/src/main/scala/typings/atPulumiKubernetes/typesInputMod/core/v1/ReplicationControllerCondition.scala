package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationControllerCondition describes the state of a replication controller at a certain
  * point.
  */
trait ReplicationControllerCondition extends js.Object {
  /**
    * The last time the condition transitioned from one status to another.
    */
  var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
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
    * Type of replication controller condition.
    */
  var `type`: Input[String]
}

object ReplicationControllerCondition {
  @scala.inline
  def apply(
    status: Input[String],
    `type`: Input[String],
    lastTransitionTime: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null
  ): ReplicationControllerCondition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lastTransitionTime != null) __obj.updateDynamic("lastTransitionTime")(lastTransitionTime.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationControllerCondition]
  }
}

