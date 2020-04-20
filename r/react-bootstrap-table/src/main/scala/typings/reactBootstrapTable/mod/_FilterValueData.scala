package typings.reactBootstrapTable.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FilterValueData extends js.Object

object _FilterValueData {
  @scala.inline
  def DateFilterValue(comparator: FilterComparator, date: Date | String): _FilterValueData = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FilterValueData]
  }
  @scala.inline
  def NumberFilterValue(comparator: FilterComparator, number: Double | String): _FilterValueData = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FilterValueData]
  }
}

