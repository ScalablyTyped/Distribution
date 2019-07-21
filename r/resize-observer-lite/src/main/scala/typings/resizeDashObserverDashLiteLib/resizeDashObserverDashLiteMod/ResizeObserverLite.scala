package typings
package resizeDashObserverDashLiteLib.resizeDashObserverDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverLite extends js.Object {
  var erd: js.UndefOr[js.Any] = js.undefined
  var handler: js.Any
  var hasResizeObserver: js.Any
  var listenedElement: js.Any
  var rz: js.UndefOr[js.Any] = js.undefined
  def disconnect(): scala.Unit
  def observe(element: stdLib.Element): scala.Unit
}

object ResizeObserverLite {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    handler: js.Any,
    hasResizeObserver: js.Any,
    listenedElement: js.Any,
    observe: stdLib.Element => scala.Unit,
    erd: js.Any = null,
    rz: js.Any = null
  ): ResizeObserverLite = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), handler = handler, hasResizeObserver = hasResizeObserver, listenedElement = listenedElement, observe = js.Any.fromFunction1(observe))
    if (erd != null) __obj.updateDynamic("erd")(erd)
    if (rz != null) __obj.updateDynamic("rz")(rz)
    __obj.asInstanceOf[ResizeObserverLite]
  }
}

