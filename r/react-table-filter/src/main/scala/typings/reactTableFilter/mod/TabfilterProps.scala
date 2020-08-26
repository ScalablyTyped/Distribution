package typings.reactTableFilter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabfilterProps extends js.Object {
  var initialFilters: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.native
  var rowClass: js.UndefOr[String] = js.native
  var rows: String | js.Array[String] | StringDictionary[Boolean] = js.native
  def onFilterUpdate(filteredArray: js.Array[String], currentFilters: js.Array[_]): js.Array[_] | Unit = js.native
}

object TabfilterProps {
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[_]) => js.Array[_] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean]
  ): TabfilterProps = {
    val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabfilterProps]
  }
  @scala.inline
  implicit class TabfilterPropsOps[Self <: TabfilterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnFilterUpdate(value: (js.Array[String], js.Array[_]) => js.Array[_] | Unit): Self = this.set("onFilterUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def setRowsVarargs(value: String*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: String | js.Array[String] | StringDictionary[Boolean]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialFiltersVarargs(value: String*): Self = this.set("initialFilters", js.Array(value :_*))
    @scala.inline
    def setInitialFilters(value: String | js.Array[String] | StringDictionary[Boolean]): Self = this.set("initialFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFilters: Self = this.set("initialFilters", js.undefined)
    @scala.inline
    def setRowClass(value: String): Self = this.set("rowClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowClass: Self = this.set("rowClass", js.undefined)
  }
  
}

