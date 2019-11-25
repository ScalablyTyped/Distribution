package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStats extends js.Object {
  /** maximum value in the channel */
  var max: Double
  /** x-coordinate of one of the pixel where the maximum lies */
  var maxX: Double
  /** y-coordinate of one of the pixel where the maximum lies */
  var maxY: Double
  /** mean of the values in a channel */
  var mean: Double
  /** minimum value in the channel */
  var min: Double
  /** x-coordinate of one of the pixel where the minimum lies */
  var minX: Double
  /** y-coordinate of one of the pixel where the minimum lies */
  var minY: Double
  /** sum of squared values in a channel */
  var squaresSum: Double
  /** standard deviation for the values in a channel */
  var stdev: Double
  /** sum of all values in a channel */
  var sum: Double
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
}

