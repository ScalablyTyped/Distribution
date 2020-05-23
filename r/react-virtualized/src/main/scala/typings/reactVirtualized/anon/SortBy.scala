package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortBy extends js.Object {
  var sortBy: String
  var sortDirection: SortDirectionType
}

object SortBy {
  @scala.inline
  def apply(sortBy: String, sortDirection: SortDirectionType): SortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortBy]
  }
}

