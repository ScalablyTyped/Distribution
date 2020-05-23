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
  var damping: js.UndefOr[Double] = js.undefined
  var direction: down | up
  var distanceToRefresh: Double
  var indicator: Indicator
  var prefixCls: js.UndefOr[String] = js.undefined
  var refreshing: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  def getScrollContainer(): ReactNode
  def onRefresh(): Unit
}

object PropsType {
  @scala.inline
  def apply(
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => ReactNode,
    indicator: Indicator,
    onRefresh: () => Unit,
    className: String = null,
    damping: js.UndefOr[Double] = js.undefined,
    prefixCls: String = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

