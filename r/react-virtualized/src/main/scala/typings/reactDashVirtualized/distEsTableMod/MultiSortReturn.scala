package typings.reactDashVirtualized.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSortReturn extends js.Object {
  /**
    * Specifies the fields currently responsible for sorting data,
    * In order of importance.
    */
  var sortBy: js.Array[String]
  /**
    * Specifies the direction a specific field is being sorted in.
    */
  var sortDirection: SortDirectionMap
  /**
    * Sort property to be passed to the `Table` component.
    * This function updates `sortBy` and `sortDirection` values.
    */
  def sort(params: SortParams): Unit
}

object MultiSortReturn {
  @scala.inline
  def apply(sort: SortParams => Unit, sortBy: js.Array[String], sortDirection: SortDirectionMap): MultiSortReturn = {
    val __obj = js.Dynamic.literal(sort = js.Any.fromFunction1(sort), sortBy = sortBy, sortDirection = sortDirection)
  
    __obj.asInstanceOf[MultiSortReturn]
  }
}

