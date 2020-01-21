package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents downward API info for projecting into a projected volume. Note that this is
  * identical to a downwardAPI volume source without the default mode.
  */
trait DownwardAPIProjection extends js.Object {
  /**
    * Items is a list of DownwardAPIVolume file
    */
  var items: js.UndefOr[Input[js.Array[Input[DownwardAPIVolumeFile]]]] = js.undefined
}

object DownwardAPIProjection {
  @scala.inline
  def apply(items: Input[js.Array[Input[DownwardAPIVolumeFile]]] = null): DownwardAPIProjection = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIProjection]
  }
}

