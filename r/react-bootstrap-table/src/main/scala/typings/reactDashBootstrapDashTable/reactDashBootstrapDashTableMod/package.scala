package typings.reactDashBootstrapDashTable

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.reactDashBootstrapDashTable.Anon_Text
import typings.reactDashBootstrapDashTable.Anon_TextValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTableMod {
  type CustomAttrs = StringDictionary[String | Double | Boolean]
  type EditCheckboxOptionValue = String
  type EditSelectOptionValue = js.Array[Anon_TextValue | Double | String]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.TextFilter
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.SelectFilter
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.RegexFilter
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.NumberFilter
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DateFilter
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.CustomFilter[js.Any, js.Any]
  */
  type Filter = _Filter | (CustomFilter[js.Any, js.Any])
  type FilterData[CustomFilterValue /* <: js.Object */] = StringDictionary[FilterValue | CustomFilterValue]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.DateFilterValue
    - typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod.NumberFilterValue
  */
  type FilterValueData = _FilterValueData | (js.Array[Double | String]) | String | Double
  type SelectFilterOptionsType = (StringDictionary[String | Double | Boolean]) with (NumberDictionary[String | Double | Boolean])
  type SizePerPageList = js.Array[Anon_Text | Double]
}
