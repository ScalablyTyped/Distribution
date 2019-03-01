package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureParams extends js.Object {
  var cellCount: scala.Double
  var estimatedCellSize: scala.Double
}

object ConfigureParams {
  @scala.inline
  def apply(cellCount: scala.Double, estimatedCellSize: scala.Double): ConfigureParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellCount")(cellCount)
    __obj.updateDynamic("estimatedCellSize")(estimatedCellSize)
    __obj.asInstanceOf[ConfigureParams]
  }
}

