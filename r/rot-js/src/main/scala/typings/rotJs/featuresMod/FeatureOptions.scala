package typings.rotJs.featuresMod

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
    val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureOptions]
  }
}

