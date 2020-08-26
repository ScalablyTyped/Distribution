package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
  */
@js.native
trait RBDVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  var fsType: js.UndefOr[Input[String]] = js.native
  /**
    * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: Input[String] = js.native
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: js.UndefOr[Input[String]] = js.native
  /**
    * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]] = js.native
  /**
    * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: js.UndefOr[Input[String]] = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.native
  /**
    * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.native
}

object RBDVolumeSource {
  @scala.inline
  def apply(image: Input[String], monitors: Input[js.Array[Input[String]]]): RBDVolumeSource = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDVolumeSource]
  }
  @scala.inline
  implicit class RBDVolumeSourceOps[Self <: RBDVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: Input[String]): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitorsVarargs(value: Input[String]*): Self = this.set("monitors", js.Array(value :_*))
    @scala.inline
    def setMonitors(value: Input[js.Array[Input[String]]]): Self = this.set("monitors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFsType(value: Input[String]): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFsType: Self = this.set("fsType", js.undefined)
    @scala.inline
    def setKeyring(value: Input[String]): Self = this.set("keyring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyring: Self = this.set("keyring", js.undefined)
    @scala.inline
    def setPool(value: Input[String]): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecretRef: Self = this.set("secretRef", js.undefined)
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

