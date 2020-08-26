package typings.rcPagination.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<rc-pagination.rc-pagination.PaginationData> */
@js.native
trait PaginationProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var current: js.UndefOr[Double] = js.native
  var defaultCurrent: js.UndefOr[Double] = js.native
  var defaultPageSize: js.UndefOr[Double] = js.native
  var hideOnSinglePage: js.UndefOr[Boolean] = js.native
  var itemRender: js.UndefOr[
    js.Function3[/* page */ Double, /* type */ String, /* element */ ReactNode, ReactNode]
  ] = js.native
  var jumpNextIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.native
  var jumpPrevIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.native
  var locale: js.UndefOr[js.Object] = js.native
  var nextIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.native
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.native
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageSizeOptions: js.UndefOr[js.Array[String]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prevIcon: js.UndefOr[ComponentType[js.Object] | ReactNode] = js.native
  var selectComponentClass: js.UndefOr[ComponentType[js.Object]] = js.native
  var selectPrefixCls: js.UndefOr[String] = js.native
  var showLessItems: js.UndefOr[Boolean] = js.native
  var showPrevNextJumpers: js.UndefOr[Boolean] = js.native
  var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.native
  var showSizeChanger: js.UndefOr[Boolean] = js.native
  var showTitle: js.UndefOr[Boolean] = js.native
  var showTotal: js.UndefOr[
    js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactNode]
  ] = js.native
  var simple: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var total: js.UndefOr[Double] = js.native
}

object PaginationProps {
  @scala.inline
  def apply(): PaginationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setDefaultCurrent(value: Double): Self = this.set("defaultCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCurrent: Self = this.set("defaultCurrent", js.undefined)
    @scala.inline
    def setDefaultPageSize(value: Double): Self = this.set("defaultPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPageSize: Self = this.set("defaultPageSize", js.undefined)
    @scala.inline
    def setHideOnSinglePage(value: Boolean): Self = this.set("hideOnSinglePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnSinglePage: Self = this.set("hideOnSinglePage", js.undefined)
    @scala.inline
    def setItemRender(value: (/* page */ Double, /* type */ String, /* element */ ReactNode) => ReactNode): Self = this.set("itemRender", js.Any.fromFunction3(value))
    @scala.inline
    def deleteItemRender: Self = this.set("itemRender", js.undefined)
    @scala.inline
    def setJumpNextIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("jumpNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpNextIcon: Self = this.set("jumpNextIcon", js.undefined)
    @scala.inline
    def setJumpPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("jumpPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJumpPrevIcon: Self = this.set("jumpPrevIcon", js.undefined)
    @scala.inline
    def setLocale(value: js.Object): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNextIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    @scala.inline
    def setOnChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = this.set("onShowSizeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShowSizeChange: Self = this.set("onShowSizeChange", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizeOptionsVarargs(value: String*): Self = this.set("pageSizeOptions", js.Array(value :_*))
    @scala.inline
    def setPageSizeOptions(value: js.Array[String]): Self = this.set("pageSizeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizeOptions: Self = this.set("pageSizeOptions", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    @scala.inline
    def setSelectComponentClass(value: ComponentType[js.Object]): Self = this.set("selectComponentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectComponentClass: Self = this.set("selectComponentClass", js.undefined)
    @scala.inline
    def setSelectPrefixCls(value: String): Self = this.set("selectPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectPrefixCls: Self = this.set("selectPrefixCls", js.undefined)
    @scala.inline
    def setShowLessItems(value: Boolean): Self = this.set("showLessItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLessItems: Self = this.set("showLessItems", js.undefined)
    @scala.inline
    def setShowPrevNextJumpers(value: Boolean): Self = this.set("showPrevNextJumpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPrevNextJumpers: Self = this.set("showPrevNextJumpers", js.undefined)
    @scala.inline
    def setShowQuickJumper(value: Boolean | js.Object): Self = this.set("showQuickJumper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowQuickJumper: Self = this.set("showQuickJumper", js.undefined)
    @scala.inline
    def setShowSizeChanger(value: Boolean): Self = this.set("showSizeChanger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSizeChanger: Self = this.set("showSizeChanger", js.undefined)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode): Self = this.set("showTotal", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShowTotal: Self = this.set("showTotal", js.undefined)
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

