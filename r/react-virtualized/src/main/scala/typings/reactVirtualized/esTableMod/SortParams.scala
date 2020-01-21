package typings.reactVirtualized.esTableMod

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
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortParams]
  }
}

