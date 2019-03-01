package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortReturn extends js.Object {
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[java.lang.String]
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  def sort(params: SortParams): scala.Unit
}

object MultiSortReturn {
  @scala.inline
  def apply(
    sort: js.Function1[SortParams, scala.Unit],
    sortBy: js.Array[java.lang.String],
    sortDirection: SortDirectionMap
  ): MultiSortReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sort")(sort)
    __obj.updateDynamic("sortBy")(sortBy)
    __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[MultiSortReturn]
  }
}

