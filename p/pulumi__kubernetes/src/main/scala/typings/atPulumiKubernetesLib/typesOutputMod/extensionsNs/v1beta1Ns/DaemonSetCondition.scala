package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

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
  val lastTransitionTime: java.lang.String
  /**
    * A human readable message indicating details about the transition.
    */
  val message: java.lang.String
  /**
    * The reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  val status: java.lang.String
  /**
    * Type of DaemonSet condition.
    */
  val `type`: java.lang.String
}

object DaemonSetCondition {
  @scala.inline
  def apply(
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): DaemonSetCondition = {
    val __obj = js.Dynamic.literal(lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DaemonSetCondition]
  }
}

