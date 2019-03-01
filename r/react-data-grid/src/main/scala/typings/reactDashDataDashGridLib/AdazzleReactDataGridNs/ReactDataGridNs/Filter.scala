package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

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
  var columnKey: java.lang.String
  /**
    * The term to filter by.
    */
  var filterTerm: java.lang.String
}

object Filter {
  @scala.inline
  def apply(columnKey: java.lang.String, filterTerm: java.lang.String): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnKey")(columnKey)
    __obj.updateDynamic("filterTerm")(filterTerm)
    __obj.asInstanceOf[Filter]
  }
}

