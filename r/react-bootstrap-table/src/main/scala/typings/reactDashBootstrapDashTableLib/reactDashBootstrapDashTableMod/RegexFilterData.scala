package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexFilterData extends FilterValue {
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.RegexFilter
  var value: java.lang.String
}

object RegexFilterData {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.RegexFilter,
    value: java.lang.String
  ): RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegexFilterData]
  }
}

