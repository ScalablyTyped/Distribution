package typings.rotJs.diggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var corridorLength: js.Tuple2[Double, Double]
  var dugPercentage: Double
  var roomHeight: js.Tuple2[Double, Double]
  var roomWidth: js.Tuple2[Double, Double]
  var timeLimit: Double
}

object Options {
  @scala.inline
  def apply(
    corridorLength: js.Tuple2[Double, Double],
    dugPercentage: Double,
    roomHeight: js.Tuple2[Double, Double],
    roomWidth: js.Tuple2[Double, Double],
    timeLimit: Double
  ): Options = {
    val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], dugPercentage = dugPercentage.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

