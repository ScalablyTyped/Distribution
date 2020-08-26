package typings.resizeObserverBrowser

import typings.std.DOMRectReadOnly
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverEntry extends js.Object {
  val borderBoxSize: ResizeObserverSize = js.native
  val contentBoxSize: ResizeObserverSize = js.native
  val contentRect: DOMRectReadOnly = js.native
  val target: Element = js.native
}

object ResizeObserverEntry {
  @scala.inline
  def apply(
    borderBoxSize: ResizeObserverSize,
    contentBoxSize: ResizeObserverSize,
    contentRect: DOMRectReadOnly,
    target: Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  @scala.inline
  implicit class ResizeObserverEntryOps[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
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
    def setBorderBoxSize(value: ResizeObserverSize): Self = this.set("borderBoxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentBoxSize(value: ResizeObserverSize): Self = this.set("contentBoxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentRect(value: DOMRectReadOnly): Self = this.set("contentRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

