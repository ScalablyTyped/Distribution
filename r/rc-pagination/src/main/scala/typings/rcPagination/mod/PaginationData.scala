package typings.rcPagination.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationData extends js.Object {
  
  var className: String = js.native
  
  var current: Double = js.native
  
  var defaultCurrent: Double = js.native
  
  var defaultPageSize: Double = js.native
  
  var hideOnSinglePage: Boolean = js.native
  
  var jumpNextIcon: ComponentType[js.Object] | ReactNode = js.native
  
  var jumpPrevIcon: ComponentType[js.Object] | ReactNode = js.native
  
  var locale: js.Object = js.native
  
  var nextIcon: ComponentType[js.Object] | ReactNode = js.native
  
  var pageSize: Double = js.native
  
  var pageSizeOptions: js.Array[String] = js.native
  
  var prefixCls: String = js.native
  
  var prevIcon: ComponentType[js.Object] | ReactNode = js.native
  
  var selectComponentClass: ComponentType[js.Object] = js.native
  
  var selectPrefixCls: String = js.native
  
  var showLessItems: Boolean = js.native
  
  var showPrevNextJumpers: Boolean = js.native
  
  var showQuickJumper: Boolean | js.Object = js.native
  
  var showSizeChanger: Boolean = js.native
  
  var showTitle: Boolean = js.native
  
  var simple: Boolean = js.native
  
  var style: CSSProperties = js.native
  
  var total: Double = js.native
}
object PaginationData {
  
  @scala.inline
  def apply(
    className: String,
    current: Double,
    defaultCurrent: Double,
    defaultPageSize: Double,
    hideOnSinglePage: Boolean,
    locale: js.Object,
    pageSize: Double,
    pageSizeOptions: js.Array[String],
    prefixCls: String,
    selectComponentClass: ComponentType[js.Object],
    selectPrefixCls: String,
    showLessItems: Boolean,
    showPrevNextJumpers: Boolean,
    showQuickJumper: Boolean | js.Object,
    showSizeChanger: Boolean,
    showTitle: Boolean,
    simple: Boolean,
    style: CSSProperties,
    total: Double
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationData]
  }
  
  @scala.inline
  implicit class PaginationDataOps[Self <: PaginationData] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCurrent(value: Double): Self = this.set("defaultCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPageSize(value: Double): Self = this.set("defaultPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnSinglePage(value: Boolean): Self = this.set("hideOnSinglePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Object): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeOptionsVarargs(value: String*): Self = this.set("pageSizeOptions", js.Array(value :_*))
    
    @scala.inline
    def setPageSizeOptions(value: js.Array[String]): Self = this.set("pageSizeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectComponentClass(value: ComponentType[js.Object]): Self = this.set("selectComponentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectPrefixCls(value: String): Self = this.set("selectPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLessItems(value: Boolean): Self = this.set("showLessItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPrevNextJumpers(value: Boolean): Self = this.set("showPrevNextJumpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowQuickJumper(value: Boolean | js.Object): Self = this.set("showQuickJumper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSizeChanger(value: Boolean): Self = this.set("showSizeChanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpNextIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("jumpNextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumpNextIcon: Self = this.set("jumpNextIcon", js.undefined)
    
    @scala.inline
    def setJumpPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("jumpPrevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJumpPrevIcon: Self = this.set("jumpPrevIcon", js.undefined)
    
    @scala.inline
    def setNextIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    
    @scala.inline
    def setPrevIcon(value: ComponentType[js.Object] | ReactNode): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
  }
}
