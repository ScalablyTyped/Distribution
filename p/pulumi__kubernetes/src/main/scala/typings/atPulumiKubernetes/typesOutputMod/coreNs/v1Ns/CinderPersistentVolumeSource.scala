package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting
  * to a container. The volume must also be in the same region as the kubelet. Cinder volumes
  * support ownership management and SELinux relabeling.
  */
trait CinderPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system.
    * Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More
    * info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
    */
  val fsType: String
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
    */
  val readOnly: Boolean
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  val secretRef: SecretReference
  /**
    * volume id used to identify the volume in cinder More info:
    * https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
    */
  val volumeID: String
}

object CinderPersistentVolumeSource {
  @scala.inline
  def apply(fsType: String, readOnly: Boolean, secretRef: SecretReference, volumeID: String): CinderPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType, readOnly = readOnly, secretRef = secretRef, volumeID = volumeID)
  
    __obj.asInstanceOf[CinderPersistentVolumeSource]
  }
}

