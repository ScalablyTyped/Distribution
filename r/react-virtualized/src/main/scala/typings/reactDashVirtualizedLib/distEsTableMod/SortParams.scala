package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortParams extends js.Object {
  var defaultSortDirection: SortDirectionType
  var event: stdLib.MouseEvent
  var sortBy: java.lang.String
}

object SortParams {
  @scala.inline
  def apply(defaultSortDirection: SortDirectionType, event: stdLib.MouseEvent, sortBy: java.lang.String): SortParams = {
    val __obj = js.Dynamic.literal(defaultSortDirection = defaultSortDirection, event = event, sortBy = sortBy)
  
    __obj.asInstanceOf[SortParams]
  }
}

