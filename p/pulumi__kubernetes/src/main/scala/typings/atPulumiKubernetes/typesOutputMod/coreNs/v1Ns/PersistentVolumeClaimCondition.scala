package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val lastProbeTime: String
  /**
    * Last time the condition transitioned from one status to another.
    */
  val lastTransitionTime: String
  /**
    * Human-readable message indicating details about last transition.
    */
  val message: String
  /**
    * Unique, this should be a short, machine understandable string that gives the reason for
    * condition's last transition. If it reports "ResizeStarted" that means the underlying
    * persistent volume is being resized.
    */
  val reason: String
  val status: String
  val `type`: String
}

object PersistentVolumeClaimCondition {
  @scala.inline
  def apply(
    lastProbeTime: String,
    lastTransitionTime: String,
    message: String,
    reason: String,
    status: String,
    `type`: String
  ): PersistentVolumeClaimCondition = {
    val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime, lastTransitionTime = lastTransitionTime, message = message, reason = reason, status = status)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PersistentVolumeClaimCondition]
  }
}

