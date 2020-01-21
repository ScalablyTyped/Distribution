package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a projected volume source
  */
trait ProjectedVolumeSource extends js.Object {
  /**
    * Mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Directories within the path are not affected by this setting. This might be in conflict
    * with other options that affect the file mode, like fsGroup, and the result can be other
    * mode bits set.
    */
  var defaultMode: js.UndefOr[Input[Double]] = js.undefined
  /**
    * list of volume projections
    */
  var sources: Input[js.Array[Input[VolumeProjection]]]
}

object ProjectedVolumeSource {
  @scala.inline
  def apply(sources: Input[js.Array[Input[VolumeProjection]]], defaultMode: Input[Double] = null): ProjectedVolumeSource = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    if (defaultMode != null) __obj.updateDynamic("defaultMode")(defaultMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSource]
  }
}

