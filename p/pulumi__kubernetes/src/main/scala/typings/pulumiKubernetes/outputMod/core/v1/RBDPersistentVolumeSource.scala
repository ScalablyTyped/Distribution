package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
  */
@js.native
trait RBDPersistentVolumeSource extends js.Object {
  /**
    * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
    */
  var fsType: String = js.native
  /**
    * The rados image name. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var image: String = js.native
  /**
    * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var keyring: String = js.native
  /**
    * A collection of Ceph monitors. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var monitors: js.Array[String] = js.native
  /**
    * The rados pool name. Default is rbd. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var pool: String = js.native
  /**
    * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var readOnly: Boolean = js.native
  /**
    * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var secretRef: SecretReference = js.native
  /**
    * The rados user name. Default is admin. More info: https://examples.k8s.io/volumes/rbd/README.md#how-to-use-it
    */
  var user: String = js.native
}

object RBDPersistentVolumeSource {
  @scala.inline
  def apply(
    fsType: String,
    image: String,
    keyring: String,
    monitors: js.Array[String],
    pool: String,
    readOnly: Boolean,
    secretRef: SecretReference,
    user: String
  ): RBDPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(fsType = fsType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], keyring = keyring.asInstanceOf[js.Any], monitors = monitors.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RBDPersistentVolumeSource]
  }
  @scala.inline
  implicit class RBDPersistentVolumeSourceOps[Self <: RBDPersistentVolumeSource] (val x: Self) extends AnyVal {
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
    def setFsType(value: String): Self = this.set("fsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyring(value: String): Self = this.set("keyring", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitorsVarargs(value: String*): Self = this.set("monitors", js.Array(value :_*))
    @scala.inline
    def setMonitors(value: js.Array[String]): Self = this.set("monitors", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(value: String): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretRef(value: SecretReference): Self = this.set("secretRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

