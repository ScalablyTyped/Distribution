package typings.rotJs.diggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var corridorLength: js.Tuple2[Double, Double] = js.native
  var dugPercentage: Double = js.native
  var roomHeight: js.Tuple2[Double, Double] = js.native
  var roomWidth: js.Tuple2[Double, Double] = js.native
  var timeLimit: Double = js.native
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
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCorridorLength(value: js.Tuple2[Double, Double]): Self = this.set("corridorLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setDugPercentage(value: Double): Self = this.set("dugPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomHeight(value: js.Tuple2[Double, Double]): Self = this.set("roomHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoomWidth(value: js.Tuple2[Double, Double]): Self = this.set("roomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLimit(value: Double): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
  }
  
}

