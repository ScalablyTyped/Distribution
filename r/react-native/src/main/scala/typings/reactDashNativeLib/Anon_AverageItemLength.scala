package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AverageItemLength extends js.Object {
  var averageItemLength: scala.Double
  var highestMeasuredFrameIndex: scala.Double
  var index: scala.Double
}

object Anon_AverageItemLength {
  @scala.inline
  def apply(averageItemLength: scala.Double, highestMeasuredFrameIndex: scala.Double, index: scala.Double): Anon_AverageItemLength = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageItemLength")(averageItemLength)
    __obj.updateDynamic("highestMeasuredFrameIndex")(highestMeasuredFrameIndex)
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[Anon_AverageItemLength]
  }
}

