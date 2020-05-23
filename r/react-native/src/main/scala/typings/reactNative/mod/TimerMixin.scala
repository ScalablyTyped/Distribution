package typings.reactNative.mod

import typings.reactNative.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerMixin extends js.Object {
  var cancelAnimationFrame: js.Function1[/* handle */ Double, Unit]
  var clearImmediate: js.Function1[/* handle */ Double, Unit]
  var clearInterval: js.Function1[/* handle */ Double, Unit]
  var clearTimeout: js.Function1[/* handle */ Double, Unit]
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double]
  var setImmediate: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, Unit], Double]
  var setInterval: FnCall
  var setTimeout: FnCall
}

object TimerMixin {
  @scala.inline
  def apply(
    cancelAnimationFrame: /* handle */ Double => Unit,
    clearImmediate: /* handle */ Double => Unit,
    clearInterval: /* handle */ Double => Unit,
    clearTimeout: /* handle */ Double => Unit,
    requestAnimationFrame: /* callback */ js.Function1[/* time */ Double, Unit] => Double,
    setImmediate: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => Double,
    setInterval: FnCall,
    setTimeout: FnCall
  ): TimerMixin = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), setImmediate = js.Any.fromFunction1(setImmediate), setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerMixin]
  }
}

