package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SortDirection extends js.Object {
  var sortDirection: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.SortDirectionType] = js.undefined
}

object Anon_SortDirection {
  @scala.inline
  def apply(sortDirection: reactDashVirtualizedLib.distEsTableMod.SortDirectionType = null): Anon_SortDirection = {
    val __obj = js.Dynamic.literal()
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[Anon_SortDirection]
  }
}

