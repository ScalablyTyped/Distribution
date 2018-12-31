package typings
package reactDashTableDashFilterLib.reactDashTableDashFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabfilterProps extends js.Object {
  var initialFilters: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var rowClass: js.UndefOr[java.lang.String] = js.undefined
  var rows: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  def onFilterUpdate(filteredArray: js.Array[java.lang.String], currentFilters: js.Array[_]): js.Array[_] | scala.Unit
}

