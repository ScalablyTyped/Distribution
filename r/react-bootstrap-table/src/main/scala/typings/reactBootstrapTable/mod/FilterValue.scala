package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.reactBootstrapTableStrings.ArrayFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.mod.TextFilterData
  - typings.reactBootstrapTable.mod.SelectFilterData
  - typings.reactBootstrapTable.mod.RegexFilterData
  - typings.reactBootstrapTable.mod.NumberFilterData
  - typings.reactBootstrapTable.mod.DateFilterData
  - typings.reactBootstrapTable.mod.ArrayFilterData
*/
trait FilterValue extends StObject
object FilterValue {
  
  @scala.inline
  def ArrayFilterData(`type`: ArrayFilter, value: js.Array[Double | String]): typings.reactBootstrapTable.mod.ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.ArrayFilterData]
  }
  
  @scala.inline
  def DateFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.DateFilter, value: DateFilterValue): typings.reactBootstrapTable.mod.DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.DateFilterData]
  }
  
  @scala.inline
  def NumberFilterData(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    value: NumberFilterValue
  ): typings.reactBootstrapTable.mod.NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.NumberFilterData]
  }
  
  @scala.inline
  def RegexFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter, value: String): typings.reactBootstrapTable.mod.RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.RegexFilterData]
  }
  
  @scala.inline
  def SelectFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter, value: String): typings.reactBootstrapTable.mod.SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.SelectFilterData]
  }
  
  @scala.inline
  def TextFilterData(`type`: typings.reactBootstrapTable.reactBootstrapTableStrings.TextFilter, value: String): typings.reactBootstrapTable.mod.TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.TextFilterData]
  }
}
