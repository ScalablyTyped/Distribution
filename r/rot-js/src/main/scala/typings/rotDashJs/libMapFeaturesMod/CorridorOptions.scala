package typings.rotDashJs.libMapFeaturesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorridorOptions extends js.Object {
  var corridorLength: js.Tuple2[Double, Double]
}

object CorridorOptions {
  @scala.inline
  def apply(corridorLength: js.Tuple2[Double, Double]): CorridorOptions = {
    val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CorridorOptions]
  }
}

