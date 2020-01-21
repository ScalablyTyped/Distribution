package typings.reactVirtualized

import typings.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortBy extends js.Object {
  var sortBy: String
  var sortDirection: SortDirectionType
}

object AnonSortBy {
  @scala.inline
  def apply(sortBy: String, sortDirection: SortDirectionType): AnonSortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSortBy]
  }
}

