package typings
package resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverEntry extends js.Object {
  val contentRect: resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod.DOMRectReadOnly
  val target: stdLib.Element
}

object ResizeObserverEntry {
  @scala.inline
  def apply(
    contentRect: resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod.DOMRectReadOnly,
    target: stdLib.Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentRect")(contentRect)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ResizeObserverEntry]
  }
}

