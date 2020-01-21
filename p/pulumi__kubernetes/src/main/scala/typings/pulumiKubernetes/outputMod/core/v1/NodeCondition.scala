package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeCondition contains condition information for a node.
  */
trait NodeCondition extends js.Object {
  /**
    * Last time we got an update on a given condition.
    */
  val lastHeartbeatTime: String
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
    * Type of node condition.
    */
  val `type`: String
}

object NodeCondition {
  @scala.inline
  def apply(
    lastHeartbeatTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): NodeCondition = {
    val __obj = js.Dynamic.literal(lastHeartbeatTime = lastHeartbeatTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCondition]
  }
}

