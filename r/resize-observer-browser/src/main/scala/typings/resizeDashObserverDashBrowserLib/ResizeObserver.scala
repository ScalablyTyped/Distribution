package typings
package resizeDashObserverDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ResizeObserver")
@js.native
class ResizeObserver protected () extends js.Object {
  def this(callback: ResizeObserverCallback) = this()
  def disconnect(): scala.Unit = js.native
  def observe(target: stdLib.Element): scala.Unit = js.native
  def unobserve(target: stdLib.Element): scala.Unit = js.native
}

