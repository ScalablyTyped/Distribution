package typings
package rcDashPaginationLib.rcDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationData extends js.Object {
  var className: java.lang.String
  var current: scala.Double
  var defaultCurrent: scala.Double
  var defaultPageSize: scala.Double
  var hideOnSinglePage: scala.Boolean
  var jumpNextIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode
  var jumpPrevIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode
  var locale: js.Object
  var nextIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode
  var pageSize: scala.Double
  var pageSizeOptions: js.Array[java.lang.String]
  var pervIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode
  var prefixCls: java.lang.String
  var selectComponentClass: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var selectPrefixCls: java.lang.String
  var showLessItems: scala.Boolean
  var showPrevNextJumpers: scala.Boolean
  var showQuickJumper: scala.Boolean | js.Object
  var showSizeChanger: scala.Boolean
  var showTitle: scala.Boolean
  var style: reactLib.reactMod.ReactNs.CSSProperties
  var total: scala.Double
}

object PaginationData {
  @scala.inline
  def apply(
    className: java.lang.String,
    current: scala.Double,
    defaultCurrent: scala.Double,
    defaultPageSize: scala.Double,
    hideOnSinglePage: scala.Boolean,
    jumpNextIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode,
    jumpPrevIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode,
    locale: js.Object,
    nextIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode,
    pageSize: scala.Double,
    pageSizeOptions: js.Array[java.lang.String],
    pervIcon: reactLib.reactMod.ReactNs.ComponentType[js.Object] | reactLib.reactMod.ReactNs.ReactNode,
    prefixCls: java.lang.String,
    selectComponentClass: reactLib.reactMod.ReactNs.ComponentType[js.Object],
    selectPrefixCls: java.lang.String,
    showLessItems: scala.Boolean,
    showPrevNextJumpers: scala.Boolean,
    showQuickJumper: scala.Boolean | js.Object,
    showSizeChanger: scala.Boolean,
    showTitle: scala.Boolean,
    style: reactLib.reactMod.ReactNs.CSSProperties,
    total: scala.Double
  ): PaginationData = {
    val __obj = js.Dynamic.literal(className = className, current = current, defaultCurrent = defaultCurrent, defaultPageSize = defaultPageSize, hideOnSinglePage = hideOnSinglePage, jumpNextIcon = jumpNextIcon.asInstanceOf[js.Any], jumpPrevIcon = jumpPrevIcon.asInstanceOf[js.Any], locale = locale, nextIcon = nextIcon.asInstanceOf[js.Any], pageSize = pageSize, pageSizeOptions = pageSizeOptions, pervIcon = pervIcon.asInstanceOf[js.Any], prefixCls = prefixCls, selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls, showLessItems = showLessItems, showPrevNextJumpers = showPrevNextJumpers, showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger, showTitle = showTitle, style = style, total = total)
  
    __obj.asInstanceOf[PaginationData]
  }
}

