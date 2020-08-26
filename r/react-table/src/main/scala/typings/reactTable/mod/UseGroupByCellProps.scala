package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByCellProps[D /* <: js.Object */] extends js.Object {
  var isAggregated: Boolean = js.native
  var isGrouped: Boolean = js.native
  var isPlaceholder: Boolean = js.native
}

object UseGroupByCellProps {
  @scala.inline
  def apply[/* <: js.Object */ D](isAggregated: Boolean, isGrouped: Boolean, isPlaceholder: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
  @scala.inline
  implicit class UseGroupByCellPropsOps[Self <: UseGroupByCellProps[_], /* <: js.Object */ D] (val x: Self with UseGroupByCellProps[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsAggregated(value: Boolean): Self = this.set("isAggregated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPlaceholder(value: Boolean): Self = this.set("isPlaceholder", value.asInstanceOf[js.Any])
  }
  
}

