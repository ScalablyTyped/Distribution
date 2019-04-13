package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStats extends js.Object {
  /** maximum value in the channel */
  var max: scala.Double
  /** x-coordinate of one of the pixel where the maximum lies */
  var maxX: scala.Double
  /** y-coordinate of one of the pixel where the maximum lies */
  var maxY: scala.Double
  /** mean of the values in a channel */
  var mean: scala.Double
  /** minimum value in the channel */
  var min: scala.Double
  /** x-coordinate of one of the pixel where the minimum lies */
  var minX: scala.Double
  /** y-coordinate of one of the pixel where the minimum lies */
  var minY: scala.Double
  /** sum of squared values in a channel */
  var squaresSum: scala.Double
  /** standard deviation for the values in a channel */
  var stdev: scala.Double
  /** sum of all values in a channel */
  var sum: scala.Double
}

object ChannelStats {
  @scala.inline
  def apply(
    max: scala.Double,
    maxX: scala.Double,
    maxY: scala.Double,
    mean: scala.Double,
    min: scala.Double,
    minX: scala.Double,
    minY: scala.Double,
    squaresSum: scala.Double,
    stdev: scala.Double,
    sum: scala.Double
  ): ChannelStats = {
    val __obj = js.Dynamic.literal(max = max, maxX = maxX, maxY = maxY, mean = mean, min = min, minX = minX, minY = minY, squaresSum = squaresSum, stdev = stdev, sum = sum)
  
    __obj.asInstanceOf[ChannelStats]
  }
}

