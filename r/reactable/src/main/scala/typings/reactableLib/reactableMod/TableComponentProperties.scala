package typings
package reactableLib.reactableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponentProperties[T] extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnsType]] = js.undefined
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Array[T]] = js.undefined
  var defaultSort: js.UndefOr[reactableLib.Anon_Column] = js.undefined
  var filterBy: js.UndefOr[java.lang.String] = js.undefined
  var filterable: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hideFilterInput: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemsPerPage: js.UndefOr[scala.Double] = js.undefined
  var noDataText: js.UndefOr[java.lang.String] = js.undefined
  var onFilter: js.UndefOr[FilterMethodType] = js.undefined
  var pageButtonLimit: js.UndefOr[scala.Double] = js.undefined
  var sortBy: js.UndefOr[scala.Boolean] = js.undefined
  var sortable: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
}

object TableComponentProperties {
  @scala.inline
  def apply[T](
    className: java.lang.String = null,
    columns: js.Array[ColumnsType] = null,
    currentPage: scala.Int | scala.Double = null,
    data: js.Array[T] = null,
    defaultSort: reactableLib.Anon_Column = null,
    filterBy: java.lang.String = null,
    filterable: js.Array[java.lang.String] = null,
    hideFilterInput: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    itemsPerPage: scala.Int | scala.Double = null,
    noDataText: java.lang.String = null,
    onFilter: FilterMethodType = null,
    pageButtonLimit: scala.Int | scala.Double = null,
    sortBy: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.Array[java.lang.String] | scala.Boolean = null
  ): TableComponentProperties[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultSort != null) __obj.updateDynamic("defaultSort")(defaultSort)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable)
    if (!js.isUndefined(hideFilterInput)) __obj.updateDynamic("hideFilterInput")(hideFilterInput)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText)
    if (onFilter != null) __obj.updateDynamic("onFilter")(onFilter)
    if (pageButtonLimit != null) __obj.updateDynamic("pageButtonLimit")(pageButtonLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(sortBy)) __obj.updateDynamic("sortBy")(sortBy)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponentProperties[T]]
  }
}

