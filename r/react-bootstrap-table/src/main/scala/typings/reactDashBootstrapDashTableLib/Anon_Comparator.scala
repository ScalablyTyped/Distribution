package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comparator extends js.Object {
  /**
  		 * Comparator value.
  		 */
  var comparator: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.FilterComparator
  /**
  		 * Number value.
  		 */
  var number: scala.Double
}

object Anon_Comparator {
  @scala.inline
  def apply(
    comparator: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod.FilterComparator,
    number: scala.Double
  ): Anon_Comparator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comparator")(comparator)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Anon_Comparator]
  }
}

