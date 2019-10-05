package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This
  * volume finds the bound PV and mounts that volume for the pod. A
  * PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume
  * that is owned by someone else (the system).
  */
trait PersistentVolumeClaimVolumeSource extends js.Object {
  /**
    * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using
    * this volume. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var claimName: Input[String]
  /**
    * Will force the ReadOnly setting in VolumeMounts. Default false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}

object PersistentVolumeClaimVolumeSource {
  @scala.inline
  def apply(claimName: Input[String], readOnly: Input[Boolean] = null): PersistentVolumeClaimVolumeSource = {
    val __obj = js.Dynamic.literal(claimName = claimName.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimVolumeSource]
  }
}

