package typings
package resizeDashObserverDashPolyfillLib.resizeDashObserverDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserver extends js.Object {
  def disconnect(): scala.Unit
  def observe(target: stdLib.Element): scala.Unit
  def unobserve(target: stdLib.Element): scala.Unit
}

object ResizeObserver {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    observe: stdLib.Element => scala.Unit,
    unobserve: stdLib.Element => scala.Unit
  ): ResizeObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), unobserve = js.Any.fromFunction1(unobserve))
  
    __obj.asInstanceOf[ResizeObserver]
  }
}

