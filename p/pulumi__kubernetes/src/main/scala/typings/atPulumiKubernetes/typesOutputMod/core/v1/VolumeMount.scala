package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
trait VolumeMount extends js.Object {
  /**
    * Path within the container at which the volume should be mounted.  Must not contain ':'.
    */
  val mountPath: String
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the
    * other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  val mountPropagation: String
  /**
    * This must match the Name of a Volume.
    */
  val name: String
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  val readOnly: Boolean
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to ""
    * (volume's root).
    */
  val subPath: String
  /**
    * Expanded path within the volume from which the container's volume should be mounted.
    * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded
    * using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath
    * are mutually exclusive.
    */
  val subPathExpr: String
}

object VolumeMount {
  @scala.inline
  def apply(
    mountPath: String,
    mountPropagation: String,
    name: String,
    readOnly: Boolean,
    subPath: String,
    subPathExpr: String
  ): VolumeMount = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], mountPropagation = mountPropagation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], subPath = subPath.asInstanceOf[js.Any], subPathExpr = subPathExpr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VolumeMount]
  }
}

