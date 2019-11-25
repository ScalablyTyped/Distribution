package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsTableMod.SortDirectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SortDirection extends js.Object {
  var sortDirection: js.UndefOr[SortDirectionType] = js.undefined
}

object Anon_SortDirection {
  @scala.inline
  def apply(sortDirection: SortDirectionType = null): Anon_SortDirection = {
    val __obj = js.Dynamic.literal()
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SortDirection]
  }
}

