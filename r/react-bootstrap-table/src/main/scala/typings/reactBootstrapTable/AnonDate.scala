package typings.reactBootstrapTable

import typings.reactBootstrapTable.mod.FilterComparator
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: FilterComparator
  /**
  		 * Date value. String values will be automatically converted to dates.
  		 */
  var date: Date | String
}

object AnonDate {
  @scala.inline
  def apply(comparator: FilterComparator, date: Date | String): AnonDate = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDate]
  }
}

