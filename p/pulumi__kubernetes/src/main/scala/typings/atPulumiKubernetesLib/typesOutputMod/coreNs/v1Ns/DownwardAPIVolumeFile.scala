package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val fieldRef: ObjectFieldSelector
  /**
    * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not
    * specified, the volume defaultMode will be used. This might be in conflict with other
    * options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  val mode: scala.Double
  /**
    * Required: Path is  the relative path name of the file to be created. Must not be absolute
    * or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must
    * not start with '..'
    */
  val path: java.lang.String
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, requests.cpu and requests.memory) are currently supported.
    */
  val resourceFieldRef: ResourceFieldSelector
}

object DownwardAPIVolumeFile {
  @scala.inline
  def apply(
    fieldRef: ObjectFieldSelector,
    mode: scala.Double,
    path: java.lang.String,
    resourceFieldRef: ResourceFieldSelector
  ): DownwardAPIVolumeFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fieldRef")(fieldRef)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("resourceFieldRef")(resourceFieldRef)
    __obj.asInstanceOf[DownwardAPIVolumeFile]
  }
}

