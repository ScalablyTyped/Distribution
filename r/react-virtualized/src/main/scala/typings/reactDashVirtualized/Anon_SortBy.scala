package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SortBy extends js.Object {
  var sortBy: String
  var sortDirection: SortDirectionType
}

object Anon_SortBy {
  @scala.inline
  def apply(sortBy: String, sortDirection: SortDirectionType): Anon_SortBy = {
    val __obj = js.Dynamic.literal(sortBy = sortBy.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SortBy]
  }
}

