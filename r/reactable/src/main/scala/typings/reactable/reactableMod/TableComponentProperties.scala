package typings.reactable.reactableMod

import typings.reactable.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponentProperties[T] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnsType]] = js.undefined
  var currentPage: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Array[T]] = js.undefined
  var defaultSort: js.UndefOr[Anon_Column] = js.undefined
  var filterBy: js.UndefOr[String] = js.undefined
  var filterable: js.UndefOr[js.Array[String]] = js.undefined
  var hideFilterInput: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  var noDataText: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[FilterMethodType] = js.undefined
  var pageButtonLimit: js.UndefOr[Double] = js.undefined
  var sortBy: js.UndefOr[Boolean] = js.undefined
  var sortable: js.UndefOr[js.Array[String] | Boolean] = js.undefined
}

object TableComponentProperties {
  @scala.inline
  def apply[T](
    className: String = null,
    columns: js.Array[ColumnsType] = null,
    currentPage: Int | Double = null,
    data: js.Array[T] = null,
    defaultSort: Anon_Column = null,
    filterBy: String = null,
    filterable: js.Array[String] = null,
    hideFilterInput: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemsPerPage: Int | Double = null,
    noDataText: String = null,
    onFilter: FilterMethodType = null,
    pageButtonLimit: Int | Double = null,
    sortBy: js.UndefOr[Boolean] = js.undefined,
    sortable: js.Array[String] | Boolean = null
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

