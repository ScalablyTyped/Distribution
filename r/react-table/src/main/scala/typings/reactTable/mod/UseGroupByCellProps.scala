package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByCellProps[D /* <: js.Object */] extends js.Object {
  var isAggregated: Boolean
  var isGrouped: Boolean
  var isPlaceholder: Boolean
}

object UseGroupByCellProps {
  @scala.inline
  def apply[/* <: js.Object */ D](isAggregated: Boolean, isGrouped: Boolean, isPlaceholder: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
}

