package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VolumeMount describes a mounting of a Volume within a container.
  */
@js.native
trait VolumeMount extends js.Object {
  /**
    * Path within the container at which the volume should be mounted.  Must not contain ':'.
    */
  var mountPath: String = js.native
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: String = js.native
  /**
    * This must match the Name of a Volume.
    */
  var name: String = js.native
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: Boolean = js.native
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
    */
  var subPath: String = js.native
  /**
    * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
    */
  var subPathExpr: String = js.native
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
  @scala.inline
  implicit class VolumeMountOps[Self <: VolumeMount] (val x: Self) extends AnyVal {
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
    def setMountPath(value: String): Self = this.set("mountPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountPropagation(value: String): Self = this.set("mountPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubPath(value: String): Self = this.set("subPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubPathExpr(value: String): Self = this.set("subPathExpr", value.asInstanceOf[js.Any])
  }
  
}

