package typings.pulumiKubernetes.outputMod.core.v1

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
  val fsType: String
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val readOnly: Boolean
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  val secretRef: LocalObjectReference
  /**
    * volume id used to identify the volume in cinder. More info:
    * https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  val volumeID: String
}

object CinderVolumeSource {
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, secretRef: LocalObjectReference, volumeID: String): CinderVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], volumeID = volumeID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CinderVolumeSource]
  }
}

