package typings.reactBootstrapTable.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterValue extends _FilterValueData {
  var comparator: FilterComparator
  var date: Date | String
}

object DateFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, date: Date | String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterValue]
  }
}

