package typings.primereact.componentsDataviewDataViewMod

import typings.primereact.Anon_FirstOriginalEvent
import typings.primereact.primereactStrings.grid
import typings.primereact.primereactStrings.list
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[String] = js.undefined
  var emptyMessage: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var footer: js.UndefOr[Element | String] = js.undefined
  var header: js.UndefOr[Element | String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function2[/* item */ js.Any, /* layout */ grid | list, js.UndefOr[Element]]] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ Anon_FirstOriginalEvent, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var paginator: js.UndefOr[Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var sortField: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var totalRecords: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataViewProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    currentPageReportTemplate: String = null,
    emptyMessage: String = null,
    first: Int | Double = null,
    footer: Element | String = null,
    header: Element | String = null,
    id: String = null,
    itemTemplate: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[Element] = null,
    layout: String = null,
    onPage: /* e */ Anon_FirstOriginalEvent => Unit = null,
    pageLinkSize: Int | Double = null,
    paginator: js.UndefOr[Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: String = null,
    rows: Int | Double = null,
    rowsPerPageOptions: js.Array[Double] = null,
    sortField: String = null,
    sortOrder: Int | Double = null,
    style: String = null,
    totalRecords: Int | Double = null,
    value: js.Array[_] = null
  ): DataViewProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowPaginator)) __obj.updateDynamic("alwaysShowPaginator")(alwaysShowPaginator)
    if (className != null) __obj.updateDynamic("className")(className)
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate)
    if (emptyMessage != null) __obj.updateDynamic("emptyMessage")(emptyMessage)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction2(itemTemplate))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (onPage != null) __obj.updateDynamic("onPage")(js.Any.fromFunction1(onPage))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginator)) __obj.updateDynamic("paginator")(paginator)
    if (paginatorLeft != null) __obj.updateDynamic("paginatorLeft")(paginatorLeft)
    if (paginatorPosition != null) __obj.updateDynamic("paginatorPosition")(paginatorPosition)
    if (paginatorRight != null) __obj.updateDynamic("paginatorRight")(paginatorRight)
    if (paginatorTemplate != null) __obj.updateDynamic("paginatorTemplate")(paginatorTemplate)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataViewProps]
  }
}

