package typings.reactVirtualized.anon

import typings.reactVirtualized.esTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortDirection extends js.Object {
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object SortDirection {
  @scala.inline
  def apply(sortDirection: SortDirectionType = null): SortDirection = {
    val __obj = js.Dynamic.literal()
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortDirection]
  }
}

