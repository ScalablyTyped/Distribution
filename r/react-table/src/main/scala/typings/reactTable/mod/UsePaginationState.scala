package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsePaginationState[D /* <: js.Object */] extends js.Object {
  var pageIndex: Double
  var pageSize: Double
}

object UsePaginationState {
  @scala.inline
  def apply[/* <: js.Object */ D](pageIndex: Double, pageSize: Double): UsePaginationState[D] = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationState[D]]
  }
}

