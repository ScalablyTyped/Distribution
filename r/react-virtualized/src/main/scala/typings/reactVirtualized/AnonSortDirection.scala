package typings.reactVirtualized

import typings.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortDirection extends js.Object {
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object AnonSortDirection {
  @scala.inline
  def apply(sortDirection: SortDirectionType = null): AnonSortDirection = {
    val __obj = js.Dynamic.literal()
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortDirection]
  }
}

