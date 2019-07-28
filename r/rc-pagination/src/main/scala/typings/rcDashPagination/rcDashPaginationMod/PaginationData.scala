package typings.rcDashPagination.rcDashPaginationMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationData extends js.Object {
  var className: String
  var current: Double
  var defaultCurrent: Double
  var defaultPageSize: Double
  var hideOnSinglePage: Boolean
  var jumpNextIcon: ComponentType[js.Object] | ReactNode
  var jumpPrevIcon: ComponentType[js.Object] | ReactNode
  var locale: js.Object
  var nextIcon: ComponentType[js.Object] | ReactNode
  var pageSize: Double
  var pageSizeOptions: js.Array[String]
  var prefixCls: String
  var prevIcon: ComponentType[js.Object] | ReactNode
  var selectComponentClass: ComponentType[js.Object]
  var selectPrefixCls: String
  var showLessItems: Boolean
  var showPrevNextJumpers: Boolean
  var showQuickJumper: Boolean | js.Object
  var showSizeChanger: Boolean
  var showTitle: Boolean
  var style: CSSProperties
  var total: Double
}

object PaginationData {
  @scala.inline
  def apply(
    className: String,
    current: Double,
    defaultCurrent: Double,
    defaultPageSize: Double,
    hideOnSinglePage: Boolean,
    jumpNextIcon: ComponentType[js.Object] | ReactNode,
    jumpPrevIcon: ComponentType[js.Object] | ReactNode,
    locale: js.Object,
    nextIcon: ComponentType[js.Object] | ReactNode,
    pageSize: Double,
    pageSizeOptions: js.Array[String],
    prefixCls: String,
    prevIcon: ComponentType[js.Object] | ReactNode,
    selectComponentClass: ComponentType[js.Object],
    selectPrefixCls: String,
    showLessItems: Boolean,
    showPrevNextJumpers: Boolean,
    showQuickJumper: Boolean | js.Object,
    showSizeChanger: Boolean,
    showTitle: Boolean,
    style: CSSProperties,
    total: Double
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className, current = current, defaultCurrent = defaultCurrent, defaultPageSize = defaultPageSize, hideOnSinglePage = hideOnSinglePage, jumpNextIcon = jumpNextIcon.asInstanceOf[js.Any], jumpPrevIcon = jumpPrevIcon.asInstanceOf[js.Any], locale = locale, nextIcon = nextIcon.asInstanceOf[js.Any], pageSize = pageSize, pageSizeOptions = pageSizeOptions, prefixCls = prefixCls, prevIcon = prevIcon.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls, showLessItems = showLessItems, showPrevNextJumpers = showPrevNextJumpers, showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger, showTitle = showTitle, style = style, total = total)
  
    __obj.asInstanceOf[PaginationData]
  }
}

