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
    disconnect: js.Function0[scala.Unit],
    observe: js.Function1[stdLib.Element, scala.Unit],
    unobserve: js.Function1[stdLib.Element, scala.Unit]
  ): ResizeObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("observe")(observe)
    __obj.updateDynamic("unobserve")(unobserve)
    __obj.asInstanceOf[ResizeObserver]
  }
}

