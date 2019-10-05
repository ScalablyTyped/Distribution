package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val items: js.Array[DownwardAPIVolumeFile]
}

object DownwardAPIProjection {
  @scala.inline
  def apply(items: js.Array[DownwardAPIVolumeFile]): DownwardAPIProjection = {
    val __obj = js.Dynamic.literal(items = items)
  
    __obj.asInstanceOf[DownwardAPIProjection]
  }
}

