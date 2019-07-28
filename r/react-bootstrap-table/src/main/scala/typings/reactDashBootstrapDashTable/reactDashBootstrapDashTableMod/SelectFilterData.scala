package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFilterData extends FilterValue {
  var `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter
  var value: String
}

object SelectFilterData {
  @scala.inline
  def apply(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter,
    value: String
  ): SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectFilterData]
  }
}

