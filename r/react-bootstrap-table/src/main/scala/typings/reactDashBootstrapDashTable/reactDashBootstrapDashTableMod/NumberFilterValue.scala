package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilterValue extends _FilterValueData {
  var comparator: FilterComparator
  var number: Double | String
}

object NumberFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, number: Double | String): NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberFilterValue]
  }
}

