package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
  */
trait PersistentVolumeClaimStatus extends js.Object {
  /**
    * AccessModes contains the actual access modes the volume backing the PVC has. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  val accessModes: js.Array[java.lang.String]
  /**
    * Represents the actual resources of the underlying volume.
    */
  val capacity: js.Object
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being
    * resized then the Condition will be set to 'ResizeStarted'.
    */
  val conditions: js.Array[PersistentVolumeClaimCondition]
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  val phase: java.lang.String
}

object PersistentVolumeClaimStatus {
  @scala.inline
  def apply(
    accessModes: js.Array[java.lang.String],
    capacity: js.Object,
    conditions: js.Array[PersistentVolumeClaimCondition],
    phase: java.lang.String
  ): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal(accessModes = accessModes, capacity = capacity, conditions = conditions, phase = phase)
  
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
}

