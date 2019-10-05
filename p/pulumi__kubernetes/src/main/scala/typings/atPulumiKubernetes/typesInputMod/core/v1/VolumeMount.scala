package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var mountPath: Input[String]
  /**
    * mountPropagation determines how mounts are propagated from the host to container and the
    * other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
    */
  var mountPropagation: js.UndefOr[Input[String]] = js.undefined
  /**
    * This must match the Name of a Volume.
    */
  var name: Input[String]
  /**
    * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Path within the volume from which the container's volume should be mounted. Defaults to ""
    * (volume's root).
    */
  var subPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * Expanded path within the volume from which the container's volume should be mounted.
    * Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded
    * using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath
    * are mutually exclusive. This field is beta in 1.15.
    */
  var subPathExpr: js.UndefOr[Input[String]] = js.undefined
}

object VolumeMount {
  @scala.inline
  def apply(
    mountPath: Input[String],
    name: Input[String],
    mountPropagation: Input[String] = null,
    readOnly: Input[Boolean] = null,
    subPath: Input[String] = null,
    subPathExpr: Input[String] = null
  ): VolumeMount = {
    val __obj = js.Dynamic.literal(mountPath = mountPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (mountPropagation != null) __obj.updateDynamic("mountPropagation")(mountPropagation.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (subPath != null) __obj.updateDynamic("subPath")(subPath.asInstanceOf[js.Any])
    if (subPathExpr != null) __obj.updateDynamic("subPathExpr")(subPathExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeMount]
  }
}

