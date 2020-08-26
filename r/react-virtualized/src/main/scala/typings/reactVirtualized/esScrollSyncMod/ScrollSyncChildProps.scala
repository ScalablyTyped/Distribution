package typings.reactVirtualized.esScrollSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSyncChildProps extends js.Object {
  var clientHeight: Double = js.native
  var clientWidth: Double = js.native
  var scrollHeight: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var scrollWidth: Double = js.native
  def onScroll(params: OnScrollParams): Unit = js.native
}

object ScrollSyncChildProps {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    onScroll: OnScrollParams => Unit,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double
  ): ScrollSyncChildProps = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSyncChildProps]
  }
  @scala.inline
  implicit class ScrollSyncChildPropsOps[Self <: ScrollSyncChildProps] (val x: Self) extends AnyVal {
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
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnScroll(value: OnScrollParams => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
  }
  
}

