package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Some filter to be applied to the grid's contents
  */
trait Filter extends js.Object {
  /**
    * The key of the column being filtered.
    */
  var columnKey: String
  /**
    * The term to filter by.
    */
  var filterTerm: String
}

object Filter {
  @scala.inline
  def apply(columnKey: String, filterTerm: String): Filter = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], filterTerm = filterTerm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

