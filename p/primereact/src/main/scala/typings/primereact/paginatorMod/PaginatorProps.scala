package typings.primereact.paginatorMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatorProps extends js.Object {
  var alwaysShow: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var currentPageReportTemplate: js.UndefOr[String] = js.native
  var first: js.UndefOr[Double] = js.native
  var leftContent: js.UndefOr[Element] = js.native
  var onPageChange: js.UndefOr[js.Function1[/* event */ PageState, Unit]] = js.native
  var pageLinkSize: js.UndefOr[Double] = js.native
  var rightContent: js.UndefOr[Element] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var template: js.UndefOr[String] = js.native
  var totalRecords: js.UndefOr[Double] = js.native
}

object PaginatorProps {
  @scala.inline
  def apply(): PaginatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorProps]
  }
  @scala.inline
  implicit class PaginatorPropsOps[Self <: PaginatorProps] (val x: Self) extends AnyVal {
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
    def setAlwaysShow(value: Boolean): Self = this.set("alwaysShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShow: Self = this.set("alwaysShow", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCurrentPageReportTemplate(value: String): Self = this.set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageReportTemplate: Self = this.set("currentPageReportTemplate", js.undefined)
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setLeftContent(value: Element): Self = this.set("leftContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftContent: Self = this.set("leftContent", js.undefined)
    @scala.inline
    def setOnPageChange(value: /* event */ PageState => Unit): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    @scala.inline
    def setPageLinkSize(value: Double): Self = this.set("pageLinkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLinkSize: Self = this.set("pageLinkSize", js.undefined)
    @scala.inline
    def setRightContent(value: Element): Self = this.set("rightContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightContent: Self = this.set("rightContent", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: js.Any*): Self = this.set("rowsPerPageOptions", js.Array(value :_*))
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[_]): Self = this.set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsPerPageOptions: Self = this.set("rowsPerPageOptions", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTotalRecords(value: Double): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
  }
  
}

