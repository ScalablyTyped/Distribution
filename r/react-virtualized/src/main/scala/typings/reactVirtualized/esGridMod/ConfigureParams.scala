package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureParams extends js.Object {
  var cellCount: Double
  var estimatedCellSize: Double
}

object ConfigureParams {
  @scala.inline
  def apply(cellCount: Double, estimatedCellSize: Double): ConfigureParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], estimatedCellSize = estimatedCellSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigureParams]
  }
}

