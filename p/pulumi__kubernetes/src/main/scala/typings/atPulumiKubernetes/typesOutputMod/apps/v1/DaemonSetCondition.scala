package typings.atPulumiKubernetes.typesOutputMod.apps.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetCondition describes the state of a DaemonSet at a certain point.
  */
trait DaemonSetCondition extends js.Object {
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * A human readable message indicating details about the transition.
    */
  val message: String
  /**
    * The reason for the condition's last transition.
    */
  val reason: String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: String
  /**
    * Type of DaemonSet condition.
    */
  val `type`: String
}

object DaemonSetCondition {
  @scala.inline
  def apply(lastTransitionTime: String, message: String, reason: String, status: String, `type`: String): DaemonSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DaemonSetCondition]
  }
}

