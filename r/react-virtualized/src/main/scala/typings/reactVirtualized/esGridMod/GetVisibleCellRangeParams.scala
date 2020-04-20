package typings.reactVirtualized.esGridMod

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
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVisibleCellRangeParams]
  }
}

