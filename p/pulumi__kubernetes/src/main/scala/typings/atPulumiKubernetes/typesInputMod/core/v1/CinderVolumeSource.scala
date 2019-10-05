package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting
  * to a container. The volume must also be in the same region as the kubelet. Cinder volumes
  * support ownership management and SELinux relabeling.
  */
trait CinderVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More
    * info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
  /**
    * volume id used to identify the volume in cinder. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var volumeID: Input[String]
}

object CinderVolumeSource {
  @scala.inline
  def apply(
    volumeID: Input[String],
    fsType: Input[String] = null,
    readOnly: Input[Boolean] = null,
    secretRef: Input[LocalObjectReference] = null
  ): CinderVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CinderVolumeSource]
  }
}

