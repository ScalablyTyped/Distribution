package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val monitors: js.Array[java.lang.String]
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  val path: java.lang.String
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val readOnly: scala.Boolean
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val secretFile: java.lang.String
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val secretRef: LocalObjectReference
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
    */
  val user: java.lang.String
}

object CephFSVolumeSource {
  @scala.inline
  def apply(
    monitors: js.Array[java.lang.String],
    path: java.lang.String,
    readOnly: scala.Boolean,
    secretFile: java.lang.String,
    secretRef: LocalObjectReference,
    user: java.lang.String
  ): CephFSVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("monitors")(monitors)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("readOnly")(readOnly)
    __obj.updateDynamic("secretFile")(secretFile)
    __obj.updateDynamic("secretRef")(secretRef)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CephFSVolumeSource]
  }
}

