package typings.pulumiKubernetes.outputMod.core.v1

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
  val monitors: js.Array[String]
  /**
    * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
    */
  val path: String
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val readOnly: Boolean
  /**
    * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val secretFile: String
  /**
    * Optional: SecretRef is reference to the authentication secret for User, default is empty.
    * More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val secretRef: LocalObjectReference
  /**
    * Optional: User is the rados user name, default is admin More info:
    * https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
    */
  val user: String
}

object CephFSVolumeSource {
  @scala.inline
  def apply(
    monitors: js.Array[String],
    path: String,
    readOnly: Boolean,
    secretFile: String,
    secretRef: LocalObjectReference,
    user: String
  ): CephFSVolumeSource = {
    val __obj = js.Dynamic.literal(monitors = monitors.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], secretFile = secretFile.asInstanceOf[js.Any], secretRef = secretRef.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CephFSVolumeSource]
  }
}

