package typings.primereact.paginatorMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorProps extends js.Object {
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[String] = js.undefined
  var first: js.UndefOr[Double] = js.undefined
  var leftContent: js.UndefOr[Element] = js.undefined
  var onPageChange: js.UndefOr[js.Function1[/* event */ PageState, Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[Double] = js.undefined
  var rightContent: js.UndefOr[Element] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var totalRecords: js.UndefOr[Double] = js.undefined
}

object PaginatorProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    currentPageReportTemplate: String = null,
    first: js.UndefOr[Double] = js.undefined,
    leftContent: Element = null,
    onPageChange: /* event */ PageState => Unit = null,
    pageLinkSize: js.UndefOr[Double] = js.undefined,
    rightContent: Element = null,
    rows: js.UndefOr[Double] = js.undefined,
    rowsPerPageOptions: js.Array[_] = null,
    style: js.Object = null,
    template: String = null,
    totalRecords: js.UndefOr[Double] = js.undefined
  ): PaginatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.get.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (!js.isUndefined(pageLinkSize)) __obj.updateDynamic("pageLinkSize")(pageLinkSize.get.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRecords)) __obj.updateDynamic("totalRecords")(totalRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorProps]
  }
}

