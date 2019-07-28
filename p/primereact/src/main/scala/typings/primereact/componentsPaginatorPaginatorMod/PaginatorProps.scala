package typings.primereact.componentsPaginatorPaginatorMod

import typings.react.reactMod.Global.JSXNs.Element
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
    first: Int | Double = null,
    leftContent: Element = null,
    onPageChange: /* event */ PageState => Unit = null,
    pageLinkSize: Int | Double = null,
    rightContent: Element = null,
    rows: Int | Double = null,
    rowsPerPageOptions: js.Array[_] = null,
    style: js.Object = null,
    template: String = null,
    totalRecords: Int | Double = null
  ): PaginatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (className != null) __obj.updateDynamic("className")(className)
    if (currentPageReportTemplate != null) __obj.updateDynamic("currentPageReportTemplate")(currentPageReportTemplate)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent)
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (pageLinkSize != null) __obj.updateDynamic("pageLinkSize")(pageLinkSize.asInstanceOf[js.Any])
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template)
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorProps]
  }
}

