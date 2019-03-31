package typings
package rmcDashPullDashToDashRefreshLib.esPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var damping: scala.Double
  var direction: rmcDashPullDashToDashRefreshLib.rmcDashPullDashToDashRefreshLibStrings.down | rmcDashPullDashToDashRefreshLib.rmcDashPullDashToDashRefreshLibStrings.up
  var distanceToRefresh: scala.Double
  var indicator: Indicator
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var refreshing: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  def getScrollContainer(): reactLib.reactMod.ReactNs.ReactNode
  def onRefresh(): scala.Unit
}

object PropsType {
  @scala.inline
  def apply(
    damping: scala.Double,
    direction: rmcDashPullDashToDashRefreshLib.rmcDashPullDashToDashRefreshLibStrings.down | rmcDashPullDashToDashRefreshLib.rmcDashPullDashToDashRefreshLibStrings.up,
    distanceToRefresh: scala.Double,
    getScrollContainer: () => reactLib.reactMod.ReactNs.ReactNode,
    indicator: Indicator,
    onRefresh: () => scala.Unit,
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    refreshing: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(damping = damping, direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh, getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator, onRefresh = js.Any.fromFunction0(onRefresh))
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PropsType]
  }
}

