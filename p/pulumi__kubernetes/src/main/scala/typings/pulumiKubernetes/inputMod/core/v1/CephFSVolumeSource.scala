package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not
  * support ownership management or SELinux relabeling.
  */
trait CephFSVolumeSource extends js.Object {
  /**
    * Required: Monitors is a collection of Ceph monitors More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var monitors: Input[js.Array[Input[String]]]
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretFile: js.UndefOr[Input[String]] = js.undefined
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}

object CephFSVolumeSource {
  @scala.inline
  def apply(
    monitors: Input[js.Array[Input[String]]],
    path: Input[String] = null,
    readOnly: Input[Boolean] = null,
    secretFile: Input[String] = null,
    secretRef: Input[LocalObjectReference] = null,
    user: Input[String] = null
  ): CephFSVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (secretFile != null) __obj.updateDynamic("secretFile")(secretFile.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSVolumeSource]
  }
}

