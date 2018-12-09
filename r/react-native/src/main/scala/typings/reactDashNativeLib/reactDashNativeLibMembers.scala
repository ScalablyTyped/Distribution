package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object reactDashNativeLibMembers extends js.Object {
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def fetchBundle(
    bundleId: scala.Double,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ scala.Double, scala.Unit]): scala.Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Function1[/* repeated */js.Any, scala.Unit], timeout: scala.Double): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Function1[/* repeated */js.Any, scala.Unit], timeout: scala.Double): scala.Double = js.native
}

