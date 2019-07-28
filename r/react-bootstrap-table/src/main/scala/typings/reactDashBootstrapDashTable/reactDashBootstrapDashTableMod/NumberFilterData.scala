package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilterData extends FilterValue {
  var `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.NumberFilter
  var value: NumberFilterValue
}

object NumberFilterData {
  @scala.inline
  def apply(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.NumberFilter,
    value: NumberFilterValue
  ): NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberFilterData]
  }
}

