package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def ArrayFilterData(value: js.Array[Double | String]): typings.reactBootstrapTable.mod.ArrayFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.ArrayFilterData]
  }
  
  inline def DateFilterData(value: DateFilterValue): typings.reactBootstrapTable.mod.DateFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DateFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.DateFilterData]
  }
  
  inline def NumberFilterData(value: NumberFilterValue): typings.reactBootstrapTable.mod.NumberFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.NumberFilterData]
  }
  
  inline def RegexFilterData(value: String): typings.reactBootstrapTable.mod.RegexFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.RegexFilterData]
  }
  
  inline def SelectFilterData(value: String): typings.reactBootstrapTable.mod.SelectFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.SelectFilterData]
  }
  
  inline def TextFilterData(value: String): typings.reactBootstrapTable.mod.TextFilterData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TextFilter")
    __obj.asInstanceOf[typings.reactBootstrapTable.mod.TextFilterData]
  }
}
