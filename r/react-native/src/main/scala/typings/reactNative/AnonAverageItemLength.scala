package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAverageItemLength extends js.Object {
  var averageItemLength: Double
  var highestMeasuredFrameIndex: Double
  var index: Double
}

object AnonAverageItemLength {
  @scala.inline
  def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AnonAverageItemLength = {
    val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAverageItemLength]
  }
}

