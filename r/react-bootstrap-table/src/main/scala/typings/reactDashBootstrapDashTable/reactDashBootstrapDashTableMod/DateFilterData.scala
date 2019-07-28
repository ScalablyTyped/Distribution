package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilterData extends FilterValue {
  var `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter
  var value: DateFilterValue
}

object DateFilterData {
  @scala.inline
  def apply(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter,
    value: DateFilterValue
  ): DateFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DateFilterData]
  }
}

