package typings
package resizeDashObserverDashBrowserLib.resizeDashObserverDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverEntry extends js.Object {
  val contentRect: stdLib.DOMRectReadOnly
  val target: stdLib.Element
}

object ResizeObserverEntry {
  @scala.inline
  def apply(contentRect: stdLib.DOMRectReadOnly, target: stdLib.Element): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect, target = target)
  
    __obj.asInstanceOf[ResizeObserverEntry]
  }
}

