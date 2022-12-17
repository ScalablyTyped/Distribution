package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.reactBootstrapTable.anon.Text
import typings.reactBootstrapTable.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomAttrs = StringDictionary[String | Double | Boolean]

type EditCheckboxOptionValue = String

type EditSelectOptionValue = js.Array[Double | String | Value]

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.mod.TextFilter
  - typings.reactBootstrapTable.mod.SelectFilter
  - typings.reactBootstrapTable.mod.RegexFilter
  - typings.reactBootstrapTable.mod.NumberFilter
  - typings.reactBootstrapTable.mod.DateFilter
  - typings.reactBootstrapTable.mod.CustomFilter[scala.Any, scala.Any]
*/
type Filter = _Filter | (CustomFilter[Any, Any])

type FilterData[CustomFilterValue /* <: js.Object */] = StringDictionary[FilterValue | CustomFilterValue]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
  - typings.reactBootstrapTable.mod.DateFilterValue
  - typings.reactBootstrapTable.mod.NumberFilterValue
*/
type FilterValueData = _FilterValueData | (js.Array[Double | String]) | String | Double

type SelectFilterOptionsType = (StringDictionary[String | Double | Boolean]) & (NumberDictionary[String | Double | Boolean])

type SizePerPageList = js.Array[Double | Text]
