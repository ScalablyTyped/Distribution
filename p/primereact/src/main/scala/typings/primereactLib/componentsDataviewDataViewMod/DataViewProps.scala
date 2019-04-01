package typings
package primereactLib.componentsDataviewDataViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewProps extends js.Object {
  var alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[java.lang.String] = js.undefined
  var emptyMessage: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[scala.Double] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element | java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* layout */ primereactLib.primereactLibStrings.grid | primereactLib.primereactLibStrings.list, 
      js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]
    ]
  ] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var onPage: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_FirstOriginalEvent, scala.Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[scala.Double] = js.undefined
  var paginator: js.UndefOr[scala.Boolean] = js.undefined
  var paginatorLeft: js.UndefOr[js.Any] = js.undefined
  var paginatorPosition: js.UndefOr[java.lang.String] = js.undefined
  var paginatorRight: js.UndefOr[js.Any] = js.undefined
  var paginatorTemplate: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  var sortOrder: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataViewProps {
  @scala.inline
  def apply(
    alwaysShowPaginator: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    currentPageReportTemplate: java.lang.String = null,
    emptyMessage: java.lang.String = null,
    first: scala.Int | scala.Double = null,
    footer: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    header: reactLib.reactMod.Global.JSXNs.Element | java.lang.String = null,
    id: java.lang.String = null,
    itemTemplate: (/* item */ js.Any, /* layout */ primereactLib.primereactLibStrings.grid | primereactLib.primereactLibStrings.list) => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    layout: java.lang.String = null,
    onPage: /* e */ primereactLib.Anon_FirstOriginalEvent => scala.Unit = null,
    pageLinkSize: scala.Int | scala.Double = null,
    paginator: js.UndefOr[scala.Boolean] = js.undefined,
    paginatorLeft: js.Any = null,
    paginatorPosition: java.lang.String = null,
    paginatorRight: js.Any = null,
    paginatorTemplate: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[scala.Double] = null,
    sortField: java.lang.String = null,
    sortOrder: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    totalRecords: scala.Int | scala.Double = null,
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

