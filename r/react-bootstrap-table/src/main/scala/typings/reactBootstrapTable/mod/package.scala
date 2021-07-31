package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomAttrs = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]

type EditCheckboxOptionValue = java.lang.String

type EditSelectOptionValue = js.Array[scala.Double | java.lang.String | typings.reactBootstrapTable.anon.Value]

/* Rewritten from type alias, can be one of: 
  - typings.reactBootstrapTable.mod.TextFilter
  - typings.reactBootstrapTable.mod.SelectFilter
  - typings.reactBootstrapTable.mod.RegexFilter
  - typings.reactBootstrapTable.mod.NumberFilter
  - typings.reactBootstrapTable.mod.DateFilter
  - typings.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any]
*/
type Filter = typings.reactBootstrapTable.mod._Filter | (typings.reactBootstrapTable.mod.CustomFilter[js.Any, js.Any])

type FilterData[CustomFilterValue /* <: js.Object */] = org.scalablytyped.runtime.StringDictionary[typings.reactBootstrapTable.mod.FilterValue | CustomFilterValue]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - js.Array[scala.Double | java.lang.String]
  - typings.reactBootstrapTable.mod.DateFilterValue
  - typings.reactBootstrapTable.mod.NumberFilterValue
*/
type FilterValueData = typings.reactBootstrapTable.mod._FilterValueData | (js.Array[scala.Double | java.lang.String]) | java.lang.String | scala.Double

type SelectFilterOptionsType = (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]) & (org.scalablytyped.runtime.NumberDictionary[java.lang.String | scala.Double | scala.Boolean])

type SizePerPageList = js.Array[scala.Double | typings.reactBootstrapTable.anon.Text]
