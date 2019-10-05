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
    style: CSSProperties,
    total: Double,
    jumpNextIcon: ComponentType[js.Object] | ReactNode = null,
    jumpPrevIcon: ComponentType[js.Object] | ReactNode = null,
    nextIcon: ComponentType[js.Object] | ReactNode = null,
    prevIcon: ComponentType[js.Object] | ReactNode = null
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className, current = current, defaultCurrent = defaultCurrent, defaultPageSize = defaultPageSize, hideOnSinglePage = hideOnSinglePage, locale = locale, pageSize = pageSize, pageSizeOptions = pageSizeOptions, prefixCls = prefixCls, selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls, showLessItems = showLessItems, showPrevNextJumpers = showPrevNextJumpers, showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger, showTitle = showTitle, style = style, total = total)
    if (jumpNextIcon != null) __obj.updateDynamic("jumpNextIcon")(jumpNextIcon.asInstanceOf[js.Any])
    if (jumpPrevIcon != null) __obj.updateDynamic("jumpPrevIcon")(jumpPrevIcon.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationData]
  }
}

