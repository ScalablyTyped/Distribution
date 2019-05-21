package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerMixin extends js.Object {
  var cancelAnimationFrame: js.Function1[/* handle */ scala.Double, scala.Unit]
  var clearImmediate: js.Function1[/* handle */ scala.Double, scala.Unit]
  var clearInterval: js.Function1[/* handle */ scala.Double, scala.Unit]
  var clearTimeout: js.Function1[/* handle */ scala.Double, scala.Unit]
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ scala.Double, scala.Unit], scala.Double]
  var setImmediate: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Double]
  var setInterval: reactDashNativeLib.Anon_ArgsHandler
  var setTimeout: reactDashNativeLib.Anon_ArgsHandler
}

object TimerMixin {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* handle */ scala.Double => scala.Unit,
    clearImmediate: /* handle */ scala.Double => scala.Unit,
    clearInterval: /* handle */ scala.Double => scala.Unit,
    clearTimeout: /* handle */ scala.Double => scala.Unit,
    requestAnimationFrame: /* callback */ js.Function1[/* time */ scala.Double, scala.Unit] => scala.Double,
    setImmediate: /* handler */ js.Function1[/* repeated */ js.Any, scala.Unit] => scala.Double,
    setInterval: reactDashNativeLib.Anon_ArgsHandler,
    setTimeout: reactDashNativeLib.Anon_ArgsHandler
  ): TimerMixin = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), setImmediate = js.Any.fromFunction1(setImmediate), setInterval = setInterval, setTimeout = setTimeout)
  
    __obj.asInstanceOf[TimerMixin]
  }
}

