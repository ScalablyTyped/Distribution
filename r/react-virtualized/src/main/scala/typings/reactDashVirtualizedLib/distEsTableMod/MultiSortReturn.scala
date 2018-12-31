package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortReturn extends js.Object {
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  var sort: js.Function1[/* params */ SortParams, scala.Unit]
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[java.lang.String]
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap
}

