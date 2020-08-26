package typings.rmcPullToRefresh.propsTypeMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.down
import typings.rmcPullToRefresh.rmcPullToRefreshStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var className: js.UndefOr[String] = js.native
  var damping: js.UndefOr[Double] = js.native
  var direction: down | up = js.native
  var distanceToRefresh: Double = js.native
  var indicator: Indicator = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var refreshing: js.UndefOr[Boolean] = js.native
  var scale: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  def getScrollContainer(): ReactNode = js.native
  def onRefresh(): Unit = js.native
}

object PropsType {
  @scala.inline
  def apply(
    direction: down | up,
    distanceToRefresh: Double,
    getScrollContainer: () => ReactNode,
    indicator: Indicator,
    onRefresh: () => Unit
  ): PropsType = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distanceToRefresh = distanceToRefresh.asInstanceOf[js.Any], getScrollContainer = js.Any.fromFunction0(getScrollContainer), indicator = indicator.asInstanceOf[js.Any], onRefresh = js.Any.fromFunction0(onRefresh))
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setDirection(value: down | up): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceToRefresh(value: Double): Self = this.set("distanceToRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetScrollContainer(value: () => ReactNode): Self = this.set("getScrollContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setIndicator(value: Indicator): Self = this.set("indicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRefreshing(value: Boolean): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshing: Self = this.set("refreshing", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

