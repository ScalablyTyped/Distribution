package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimCondition contails details about state of pvc
  */
trait PersistentVolumeClaimCondition extends js.Object {
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
    * Unique, this should be a short, machine understandable string that gives the reason for
    * condition's last transition. If it reports "ResizeStarted" that means the underlying
    * persistent volume is being resized.
    */
  val reason: java.lang.String
  val status: java.lang.String
  val `type`: java.lang.String
}

object PersistentVolumeClaimCondition {
  @scala.inline
  def apply(
    lastProbeTime: java.lang.String,
    lastTransitionTime: java.lang.String,
    message: java.lang.String,
    reason: java.lang.String,
    status: java.lang.String,
    `type`: java.lang.String
  ): PersistentVolumeClaimCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime, lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PersistentVolumeClaimCondition]
  }
}

