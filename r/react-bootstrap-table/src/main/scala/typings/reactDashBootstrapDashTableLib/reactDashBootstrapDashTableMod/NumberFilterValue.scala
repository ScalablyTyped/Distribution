package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilterValue extends _FilterValueData {
  var comparator: FilterComparator
  var number: scala.Double | java.lang.String
}

object NumberFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, number: scala.Double | java.lang.String): NumberFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator, number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberFilterValue]
  }
}

