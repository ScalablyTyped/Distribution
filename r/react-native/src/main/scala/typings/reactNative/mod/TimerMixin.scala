package typings.reactNative.mod

import typings.reactNative.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerMixin extends js.Object {
  var cancelAnimationFrame: js.Function1[/* handle */ Double, Unit] = js.native
  var clearImmediate: js.Function1[/* handle */ Double, Unit] = js.native
  var clearInterval: js.Function1[/* handle */ Double, Unit] = js.native
  var clearTimeout: js.Function1[/* handle */ Double, Unit] = js.native
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double] = js.native
  var setImmediate: js.Function1[/* handler */ js.Function1[/* repeated */ js.Any, Unit], Double] = js.native
  var setInterval: FnCall = js.native
  var setTimeout: FnCall = js.native
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
  @scala.inline
  implicit class TimerMixinOps[Self <: TimerMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancelAnimationFrame(value: /* handle */ Double => Unit): Self = this.set("cancelAnimationFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setClearImmediate(value: /* handle */ Double => Unit): Self = this.set("clearImmediate", js.Any.fromFunction1(value))
    @scala.inline
    def setClearInterval(value: /* handle */ Double => Unit): Self = this.set("clearInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setClearTimeout(value: /* handle */ Double => Unit): Self = this.set("clearTimeout", js.Any.fromFunction1(value))
    @scala.inline
    def setRequestAnimationFrame(value: /* callback */ js.Function1[/* time */ Double, Unit] => Double): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImmediate(value: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => Double): Self = this.set("setImmediate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInterval(value: FnCall): Self = this.set("setInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetTimeout(value: FnCall): Self = this.set("setTimeout", value.asInstanceOf[js.Any])
  }
  
}

