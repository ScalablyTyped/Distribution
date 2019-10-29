package typings.rotDashJs.libMapUniformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var roomDugPercentage: Double
  var roomHeight: js.Tuple2[Double, Double]
  var roomWidth: js.Tuple2[Double, Double]
  var timeLimit: Double
}

object Options {
  @scala.inline
  def apply(
    roomDugPercentage: Double,
    roomHeight: js.Tuple2[Double, Double],
    roomWidth: js.Tuple2[Double, Double],
    timeLimit: Double
  ): Options = {
    val __obj = js.Dynamic.literal(roomDugPercentage = roomDugPercentage, roomHeight = roomHeight, roomWidth = roomWidth, timeLimit = timeLimit)
  
    __obj.asInstanceOf[Options]
  }
}

