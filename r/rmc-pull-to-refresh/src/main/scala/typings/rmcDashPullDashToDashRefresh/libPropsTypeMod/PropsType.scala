package typings.rmcDashPullDashToDashRefresh.libPropsTypeMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.rmcDashPullDashToDashRefresh.rmcDashPullDashToDashRefreshStrings.down
import typings.rmcDashPullDashToDashRefresh.rmcDashPullDashToDashRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var damping: Double
  var direction: down | up
  var distanceToRefresh: Double
  var indicator: Indicator
  var prefixCls: js.UndefOr[String] = js.undefined
  var refreshing: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def getScrollContainer(): ReactNode
  def onRefresh(): Unit
}

object PropsType {
  @scala.inline
  def apply(
    damping: Double,
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => ReactNode,
    indicator: Indicator,
    onRefresh: () => Unit,
    className: String = null,
    prefixCls: String = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(damping = damping, direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh, getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator, onRefresh = js.Any.fromFunction0(onRefresh))
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PropsType]
  }
}

