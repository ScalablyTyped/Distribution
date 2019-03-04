package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterData extends FilterValue {
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.DateFilter
  var value: DateFilterValue
}

object DateFilterData {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.DateFilter,
    value: DateFilterValue
  ): DateFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DateFilterData]
  }
}

