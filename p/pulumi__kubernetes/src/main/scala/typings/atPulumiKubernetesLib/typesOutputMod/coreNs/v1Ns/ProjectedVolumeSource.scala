package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val defaultMode: scala.Double
  /**
    * list of volume projections
    */
  val sources: js.Array[VolumeProjection]
}

