package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Represents the actual resources of the underlying volume.
    */
  var capacity: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Current Condition of persistent volume claim. If underlying persistent volume is being
    * resized then the Condition will be set to 'ResizeStarted'.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[PersistentVolumeClaimCondition]]]] = js.undefined
  /**
    * Phase represents the current phase of PersistentVolumeClaim.
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
}

object PersistentVolumeClaimStatus {
  @scala.inline
  def apply(
    accessModes: Input[js.Array[Input[String]]] = null,
    capacity: Input[js.Object] = null,
    conditions: Input[js.Array[Input[PersistentVolumeClaimCondition]]] = null,
    phase: Input[String] = null
  ): PersistentVolumeClaimStatus = {
    val __obj = js.Dynamic.literal()
    if (accessModes != null) __obj.updateDynamic("accessModes")(accessModes.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimStatus]
  }
}

