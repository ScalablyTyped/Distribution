package typings.reactDashBootstrapDashTable

import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.FilterComparator
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparatorDate extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: FilterComparator
  /**
  		 * Date value. String values will be automatically converted to dates.
  		 */
  var date: Date | String
}

object Anon_ComparatorDate {
  @scala.inline
  def apply(comparator: FilterComparator, date: Date | String): Anon_ComparatorDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ComparatorDate]
  }
}

