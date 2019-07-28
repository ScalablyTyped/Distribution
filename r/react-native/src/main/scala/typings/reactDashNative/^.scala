package typings.reactDashNative

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def cancelAnimationFrame(handle: Double): Unit = js.native
  def clearImmediate(handle: Double): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  def setInterval(handler: js.Any): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  def setTimeout(handler: js.Any): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
}

