package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support
  * ownership management and SELinux relabeling.
  */
trait RBDPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type
    * is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly
    * inferred to be "ext4" if unspecified. More info:
    * https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The rados image name. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: Input[String]
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: js.UndefOr[Input[String]] = js.undefined
  /**
    * A collection of Ceph monitors. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]]
  /**
    * The rados pool name. Default is rbd. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: js.UndefOr[Input[String]] = js.undefined
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More
    * info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring.
    * Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[SecretReference]] = js.undefined
  /**
    * The rados user name. Default is admin. More info:
    * https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}

object RBDPersistentVolumeSource {
  @scala.inline
  def apply(
    image: Input[String],
    monitors: Input[js.Array[Input[String]]],
    fsType: Input[String] = null,
    keyring: Input[String] = null,
    pool: Input[String] = null,
    readOnly: Input[Boolean] = null,
    secretRef: Input[SecretReference] = null,
    user: Input[String] = null
  ): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any])
    if (fsType != null) __obj.updateDynamic("fsType")(fsType.asInstanceOf[js.Any])
    if (keyring != null) __obj.updateDynamic("keyring")(keyring.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
}

