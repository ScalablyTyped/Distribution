package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.mod.TextFilterData
  - typings.reactBootstrapTable.mod.SelectFilterData
  - typings.reactBootstrapTable.mod.RegexFilterData
  - typings.reactBootstrapTable.mod.NumberFilterData
  - typings.reactBootstrapTable.mod.DateFilterData
  - typings.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends js.Object

object FilterValue {
  @scala.inline
  def NumberFilterData(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def RegexFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def ArrayFilterData(`type`: ArrayFilter, value: js.Array[Double | String]): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def TextFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def SelectFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter, value: String): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
  @scala.inline
  def DateFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter, value: DateFilterValue): FilterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterValue]
  }
}

