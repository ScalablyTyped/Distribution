package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerMixin extends js.Object {
  @JSName("cancelAnimationFrame")
  var cancelAnimationFrame_Original: js.Function1[/* handle */ scala.Double, scala.Unit] = js.native
  @JSName("clearImmediate")
  var clearImmediate_Original: js.Function1[/* handle */ scala.Double, scala.Unit] = js.native
  @JSName("clearInterval")
  var clearInterval_Original: js.Function1[/* handle */ scala.Double, scala.Unit] = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: js.Function1[/* handle */ scala.Double, scala.Unit] = js.native
  @JSName("requestAnimationFrame")
  var requestAnimationFrame_Original: js.Function1[/* callback */ js.Function1[/* time */ scala.Double, scala.Unit], scala.Double] = js.native
  @JSName("setImmediate")
  var setImmediate_Original: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Double] = js.native
  @JSName("setInterval")
  var setInterval_Original: reactDashNativeLib.Anon_Handler = js.native
  @JSName("setTimeout")
  var setTimeout_Original: reactDashNativeLib.Anon_Handler = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def clearImmediate(handle: scala.Double): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def requestAnimationFrame(callback: js.Function1[/* time */ scala.Double, scala.Unit]): scala.Double = js.native
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Double = js.native
  def setInterval(handler: js.Any): scala.Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double): scala.Double = js.native
  def setTimeout(handler: js.Any): scala.Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): scala.Double = js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, scala.Unit], timeout: scala.Double): scala.Double = js.native
}

