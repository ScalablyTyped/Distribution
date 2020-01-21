package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API
  * volumes support ownership management and SELinux relabeling.
  */
trait DownwardAPIVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Defaults to 0644. Directories within the path are not affected by this setting. This might
    * be in conflict with other options that affect the file mode, like fsGroup, and the result
    * can be other mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Items is a list of downward API volume file
    */
  var items: js.UndefOr[Input[js.Array[Input[DownwardAPIVolumeFile]]]] = js.undefined
}

object DownwardAPIVolumeSource {
  @scala.inline
  def apply(defaultMode: Input[Double] = null, items: Input[js.Array[Input[DownwardAPIVolumeFile]]] = null): DownwardAPIVolumeSource = {
    val __obj = js.Dynamic.literal()
    if (defaultMode != null) __obj.updateDynamic("defaultMode")(defaultMode.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeSource]
  }
}

