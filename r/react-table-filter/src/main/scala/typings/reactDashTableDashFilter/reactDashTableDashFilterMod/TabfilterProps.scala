package typings.reactDashTableDashFilter.reactDashTableDashFilterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabfilterProps extends js.Object {
  var initialFilters: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.undefined
  var rowClass: js.UndefOr[String] = js.undefined
  var rows: String | js.Array[String] | StringDictionary[Boolean]
  def onFilterUpdate(filteredArray: js.Array[String], currentFilters: js.Array[_]): js.Array[_] | Unit
}

object TabfilterProps {
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[_]) => js.Array[_] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean],
    initialFilters: String | js.Array[String] | StringDictionary[Boolean] = null,
    rowClass: String = null
  ): TabfilterProps = {
    val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    if (initialFilters != null) __obj.updateDynamic("initialFilters")(initialFilters.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabfilterProps]
  }
}

