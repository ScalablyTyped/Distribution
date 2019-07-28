package typings.reactDashVirtualized.distEsTableMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortParams extends js.Object {
  var defaultSortDirection: SortDirectionType
  var event: MouseEvent
  var sortBy: String
}

object SortParams {
  @scala.inline
  def apply(defaultSortDirection: SortDirectionType, event: MouseEvent, sortBy: String): SortParams = {
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection, event = event, sortBy = sortBy)
  
    __obj.asInstanceOf[SortParams]
  }
}

