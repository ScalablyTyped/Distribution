package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBootstrapDashTableMod {
  type EditCheckboxOptionValue = java.lang.String
  type EditSelectOptionValue = js.Array[reactDashBootstrapDashTableLib.Anon_TextValue] | js.Array[java.lang.String] | js.Array[scala.Double]
  /* Rewritten from type alias, can be one of: 
    - TextFilter
    - SelectFilter
    - RegexFilter
    - NumberFilter
    - DateFilter
    - CustomFilter[js.Any, js.Any]
  */
  type Filter = _Filter | (CustomFilter[js.Any, js.Any])
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Array[java.lang.String]
    - js.Array[scala.Double]
    - DateFilterValue
    - NumberFilterValue
  */
  type FilterValueData = _FilterValueData | js.Array[java.lang.String] | js.Array[scala.Double] | java.lang.String | scala.Double
  type SizePerPageList = js.Array[scala.Double] | js.Array[reactDashBootstrapDashTableLib.Anon_Text]
}
