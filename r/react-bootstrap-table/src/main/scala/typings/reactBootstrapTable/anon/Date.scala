package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: typings.std.Date | String
}

object Date {
  @scala.inline
  def apply(comparator: FilterComparator, date: typings.std.Date | String): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

