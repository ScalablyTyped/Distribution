package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterValue extends _FilterValueData {
  var comparator: FilterComparator
  var date: stdLib.Date | java.lang.String
}

object DateFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, date: stdLib.Date | java.lang.String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator, date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateFilterValue]
  }
}

