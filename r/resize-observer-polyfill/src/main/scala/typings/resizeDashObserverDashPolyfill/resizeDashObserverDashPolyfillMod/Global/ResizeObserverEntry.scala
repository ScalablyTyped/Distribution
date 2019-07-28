package typings.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod.Global

import typings.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod.DOMRectReadOnly
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverEntry extends js.Object {
  val contentRect: DOMRectReadOnly
  val target: Element
}

object ResizeObserverEntry {
  @scala.inline
  def apply(contentRect: DOMRectReadOnly, target: Element): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect, target = target)
  
    __obj.asInstanceOf[ResizeObserverEntry]
  }
}

