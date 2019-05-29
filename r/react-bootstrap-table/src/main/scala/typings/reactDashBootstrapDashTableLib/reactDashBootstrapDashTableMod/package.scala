package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTableMod {
  type CustomAttrs = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  type EditCheckboxOptionValue = java.lang.String
  type EditSelectOptionValue = js.Array[reactDashBootstrapDashTableLib.Anon_TextValue | scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - TextFilter
    - SelectFilter
    - RegexFilter
    - NumberFilter
    - DateFilter
    - CustomFilter[js.Any, js.Any]
  */
  type Filter = _Filter | (CustomFilter[js.Any, js.Any])
  type FilterData[CustomFilterValue /* <: js.Object */] = org.scalablytyped.runtime.StringDictionary[FilterValue | CustomFilterValue]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[scala.Double | java.lang.String]
    - DateFilterValue
    - NumberFilterValue
  */
  type FilterValueData = _FilterValueData | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double
  type SelectFilterOptionsType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]) with (org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double | scala.Boolean])
  type SizePerPageList = js.Array[reactDashBootstrapDashTableLib.Anon_Text | scala.Double]
}
