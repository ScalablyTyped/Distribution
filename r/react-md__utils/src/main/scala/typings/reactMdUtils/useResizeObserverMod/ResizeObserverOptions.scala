package typings.reactMdUtils.useResizeObserverMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverOptions[E /* <: HTMLElement */] extends js.Object {
  var disableHeight: js.UndefOr[Boolean] = js.native
  var disableWidth: js.UndefOr[Boolean] = js.native
  var onResize: ObservedResizeEventHandler = js.native
  var target: ResizeObserverTarget[E] = js.native
}

object ResizeObserverOptions {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](onResize: /* event */ ObservedResizeData => Unit): ResizeObserverOptions[E] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeObserverOptions[E]]
  }
  @scala.inline
  implicit class ResizeObserverOptionsOps[Self <: ResizeObserverOptions[_], /* <: typings.std.HTMLElement */ E] (val x: Self with ResizeObserverOptions[E]) extends AnyVal {
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
    def setOnResize(value: /* event */ ObservedResizeData => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    @scala.inline
    def setTargetFunction0(value: () => E | Null): Self = this.set("target", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: ResizeObserverTarget[E]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
  
}

