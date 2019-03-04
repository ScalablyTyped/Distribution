package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodCondition contains details for the current condition of this pod.
  */
trait PodCondition extends js.Object {
  /**
    * Last time we probed the condition.
    */
  val lastProbeTime: java.lang.String
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: java.lang.String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: java.lang.String
  /**
    * Unique, one-word, CamelCase reason for the condition's last transition.
    */
  val reason: java.lang.String
  /**
    * Status is the status of the condition. Can be True, False, Unknown. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  val status: java.lang.String
  /**
    * Type is the type of the condition. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
    */
  val `type`: java.lang.String
}

object PodCondition {
  @scala.inline
  def apply(
    lastProbeTime: java.lang.String,
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): PodCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime, lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PodCondition]
  }
}

