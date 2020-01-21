package typings.rmcPullToRefresh.propsTypeMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.up
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
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

