package typings.reactBootstrapTable

import typings.reactBootstrapTable.mod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComparator extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: FilterComparator
  /**
  		 * Number value.
  		 */
  var number: Double
}

object AnonComparator {
  @scala.inline
  def apply(comparator: FilterComparator, number: Double): AnonComparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComparator]
  }
}

