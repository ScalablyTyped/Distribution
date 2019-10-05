package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DownwardAPIVolumeFile represents information to create the file containing the pod field
  */
trait DownwardAPIVolumeFile extends js.Object {
  /**
    * Required: Selects a field of the pod: only annotations, labels, name and namespace are
    * supported.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.undefined
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute
    * or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must
    * not start with '..'
    */
  var path: Input[String]
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.undefined
}

object DownwardAPIVolumeFile {
  @scala.inline
  def apply(
    path: Input[String],
    fieldRef: Input[ObjectFieldSelector] = null,
    mode: Input[Double] = null,
    resourceFieldRef: Input[ResourceFieldSelector] = null
  ): DownwardAPIVolumeFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (fieldRef != null) __obj.updateDynamic("fieldRef")(fieldRef.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (resourceFieldRef != null) __obj.updateDynamic("resourceFieldRef")(resourceFieldRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeFile]
  }
}

