package typings.reactDashVirtualized.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVisibleCellRangeParams extends js.Object {
  var containerSize: Double
  var offset: Double
}

object GetVisibleCellRangeParams {
  @scala.inline
  def apply(containerSize: Double, offset: Double): GetVisibleCellRangeParams = {
    val __obj = js.Dynamic.literal(containerSize = containerSize, offset = offset)
  
    __obj.asInstanceOf[GetVisibleCellRangeParams]
  }
}

