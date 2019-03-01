package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val lastHeartbeatTime: java.lang.String
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
    * Type of node condition.
    */
  val `type`: java.lang.String
}

object NodeCondition {
  @scala.inline
  def apply(
    lastHeartbeatTime: java.lang.String,
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): NodeCondition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("lastHeartbeatTime")(lastHeartbeatTime)
    __obj.updateDynamic("lastTransitionTime")(lastTransitionTime)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[NodeCondition]
  }
}

