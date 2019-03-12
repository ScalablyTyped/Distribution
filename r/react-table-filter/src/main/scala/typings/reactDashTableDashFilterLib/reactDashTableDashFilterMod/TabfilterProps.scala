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

object TabfilterProps {
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[java.lang.String], js.Array[_]) => js.Array[_] | scala.Unit,
    rows: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    initialFilters: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    rowClass: java.lang.String = null
  ): TabfilterProps = {
    val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    if (initialFilters != null) __obj.updateDynamic("initialFilters")(initialFilters.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass)
    __obj.asInstanceOf[TabfilterProps]
  }
}

