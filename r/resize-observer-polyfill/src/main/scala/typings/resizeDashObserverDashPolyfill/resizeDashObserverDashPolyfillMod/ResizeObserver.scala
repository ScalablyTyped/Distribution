package typings.resizeDashObserverDashPolyfill.resizeDashObserverDashPolyfillMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserver extends js.Object {
  def disconnect(): Unit
  def observe(target: Element): Unit
  def unobserve(target: Element): Unit
}

object ResizeObserver {
  @scala.inline
  def apply(disconnect: () => Unit, observe: Element => Unit, unobserve: Element => Unit): ResizeObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
  
    __obj.asInstanceOf[ResizeObserver]
  }
}

