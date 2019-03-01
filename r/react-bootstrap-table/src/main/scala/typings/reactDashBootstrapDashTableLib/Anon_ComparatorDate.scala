package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComparatorDate extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.FilterComparator
  /**
  		 * Date value. String values will be automatically converted to dates.
  		 */
  var date: stdLib.Date | java.lang.String
}

object Anon_ComparatorDate {
  @scala.inline
  def apply(
    comparator: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.FilterComparator,
    date: stdLib.Date | java.lang.String
  ): Anon_ComparatorDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comparator")(comparator)
    __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ComparatorDate]
  }
}

