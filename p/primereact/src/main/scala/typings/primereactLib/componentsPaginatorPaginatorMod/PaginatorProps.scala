package typings
package primereactLib.componentsPaginatorPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var currentPageReportTemplate: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[scala.Double] = js.undefined
  var leftContent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var onPageChange: js.UndefOr[js.Function1[/* event */ PageState, scala.Unit]] = js.undefined
  var pageLinkSize: js.UndefOr[scala.Double] = js.undefined
  var rightContent: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
}

object PaginatorProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    currentPageReportTemplate: java.lang.String = null,
    first: scala.Int | scala.Double = null,
    leftContent: reactLib.reactMod.Global.JSXNs.Element = null,
    onPageChange: /* event */ PageState => scala.Unit = null,
    pageLinkSize: scala.Int | scala.Double = null,
    rightContent: reactLib.reactMod.Global.JSXNs.Element = null,
    rows: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[_] = null,
    style: js.Object = null,
    template: java.lang.String = null,
    totalRecords: scala.Int | scala.Double = null
  ): PaginatorProps = {
    val __obj = js.Dynamic.literal()
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

