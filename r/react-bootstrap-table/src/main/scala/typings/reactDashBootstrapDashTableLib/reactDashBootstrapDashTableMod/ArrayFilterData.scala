package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFilterData extends FilterValue {
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.ArrayFilter
  var value: js.Array[java.lang.String] | js.Array[scala.Double]
}

object ArrayFilterData {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.ArrayFilter,
    value: js.Array[java.lang.String] | js.Array[scala.Double]
  ): ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArrayFilterData]
  }
}

