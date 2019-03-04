package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFilterData extends FilterValue {
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.SelectFilter
  var value: java.lang.String
}

object SelectFilterData {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.SelectFilter,
    value: java.lang.String
  ): SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectFilterData]
  }
}

