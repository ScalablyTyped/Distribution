package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelStats extends js.Object {
  /** maximum value in the channel */
  var max: Double = js.native
  /** x-coordinate of one of the pixel where the maximum lies */
  var maxX: Double = js.native
  /** y-coordinate of one of the pixel where the maximum lies */
  var maxY: Double = js.native
  /** mean of the values in a channel */
  var mean: Double = js.native
  /** minimum value in the channel */
  var min: Double = js.native
  /** x-coordinate of one of the pixel where the minimum lies */
  var minX: Double = js.native
  /** y-coordinate of one of the pixel where the minimum lies */
  var minY: Double = js.native
  /** sum of squared values in a channel */
  var squaresSum: Double = js.native
  /** standard deviation for the values in a channel */
  var stdev: Double = js.native
  /** sum of all values in a channel */
  var sum: Double = js.native
}

object ChannelStats {
  @scala.inline
  def apply(
    max: Double,
    maxX: Double,
    maxY: Double,
    mean: Double,
    min: Double,
    minX: Double,
    minY: Double,
    squaresSum: Double,
    stdev: Double,
    sum: Double
  ): ChannelStats = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], squaresSum = squaresSum.asInstanceOf[js.Any], stdev = stdev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStats]
  }
  @scala.inline
  implicit class ChannelStatsOps[Self <: ChannelStats] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSquaresSum(value: Double): Self = this.set("squaresSum", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdev(value: Double): Self = this.set("stdev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSum(value: Double): Self = this.set("sum", value.asInstanceOf[js.Any])
  }
  
}

