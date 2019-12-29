package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByCellProps[D /* <: js.Object */] extends js.Object {
  var isAggregated: Boolean
  var isGrouped: Boolean
  var isRepeatedValue: Boolean
}

object UseGroupByCellProps {
  @scala.inline
  def apply[D /* <: js.Object */](isAggregated: Boolean, isGrouped: Boolean, isRepeatedValue: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isRepeatedValue = isRepeatedValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
}

