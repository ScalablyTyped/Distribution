package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.ArrayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFilterData extends FilterValue {
  var `type`: ArrayFilter
  var value: js.Array[Double | String]
}

object ArrayFilterData {
  @scala.inline
  def apply(`type`: ArrayFilter, value: js.Array[Double | String]): ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFilterData]
  }
}

