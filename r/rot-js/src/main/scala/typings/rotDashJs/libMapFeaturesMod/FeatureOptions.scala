package typings.rotDashJs.libMapFeaturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureOptions
  extends RoomOptions
     with CorridorOptions

object FeatureOptions {
  @scala.inline
  def apply(
    corridorLength: js.Tuple2[Double, Double],
    roomHeight: js.Tuple2[Double, Double],
    roomWidth: js.Tuple2[Double, Double]
  ): FeatureOptions = {
    val __obj = js.Dynamic.literal(corridorLength = corridorLength, roomHeight = roomHeight, roomWidth = roomWidth)
  
    __obj.asInstanceOf[FeatureOptions]
  }
}

