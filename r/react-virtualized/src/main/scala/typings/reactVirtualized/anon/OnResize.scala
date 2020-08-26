package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnResize extends js.Object {
  var scrollElement: js.UndefOr[Window] = js.native
  var scrollingResetTimeInterval: /* 150 */ Double = js.native
  var serverHeight: `0` = js.native
  var serverWidth: `0` = js.native
  def onResize(): Unit = js.native
  def onScroll(): Unit = js.native
}

object OnResize {
  @scala.inline
  def apply(
    onResize: () => Unit,
    onScroll: () => Unit,
    scrollingResetTimeInterval: /* 150 */ Double,
    serverHeight: `0`,
    serverWidth: `0`
  ): OnResize = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction0(onResize), onScroll = js.Any.fromFunction0(onScroll), scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = serverHeight.asInstanceOf[js.Any], serverWidth = serverWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnResize]
  }
  @scala.inline
  implicit class OnResizeOps[Self <: OnResize] (val x: Self) extends AnyVal {
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
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerHeight(value: `0`): Self = this.set("serverHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerWidth(value: `0`): Self = this.set("serverWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollElement(value: Window): Self = this.set("scrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollElement: Self = this.set("scrollElement", js.undefined)
  }
  
}

