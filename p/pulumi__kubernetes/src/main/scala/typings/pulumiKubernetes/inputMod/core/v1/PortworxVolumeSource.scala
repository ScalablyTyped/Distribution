package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PortworxVolumeSource represents a Portworx volume resource.
  */
trait PortworxVolumeSource extends js.Object {
  /**
    * FSType represents the filesystem type to mount Must be a filesystem type supported by the
    * host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * VolumeID uniquely identifies a Portworx volume
    */
  var volumeID: Input[String]
}

object PortworxVolumeSource {
  @scala.inline
  def apply(volumeID: Input[String], fsType: Input[String] = null, readOnly: Input[Boolean] = null): PortworxVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortworxVolumeSource]
  }
}

