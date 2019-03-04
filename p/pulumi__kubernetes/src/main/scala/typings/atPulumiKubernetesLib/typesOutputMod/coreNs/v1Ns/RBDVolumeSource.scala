package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support
  * ownership management and SELinux relabeling.
  */
trait RBDVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  val fsType: java.lang.String
  /**
    * The rados image name. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val image: java.lang.String
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val keyring: java.lang.String
  /**
    * A collection of Ceph monitors. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val monitors: js.Array[java.lang.String]
  /**
    * The rados pool name. Default is rbd. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val pool: java.lang.String
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val readOnly: scala.Boolean
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
    * Default is nil. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val secretRef: LocalObjectReference
  /**
    * The rados user name. Default is admin. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
    */
  val user: java.lang.String
}

object RBDVolumeSource {
  @scala.inline
  def apply(
    fsType: java.lang.String,
    image: java.lang.String,
    keyring: java.lang.String,
    monitors: js.Array[java.lang.String],
    pool: java.lang.String,
    readOnly: scala.Boolean,
    secretRef: LocalObjectReference,
    user: java.lang.String
  ): RBDVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType, image = image, keyring = keyring, monitors = monitors, pool = pool, readOnly = readOnly, secretRef = secretRef, user = user)
  
    __obj.asInstanceOf[RBDVolumeSource]
  }
}

