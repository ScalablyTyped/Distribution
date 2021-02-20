package typings.reactNative.mod

import typings.reactNative.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerMixin extends StObject {
  
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
  implicit class TimerMixinMutableBuilder[Self <: TimerMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelAnimationFrame(value: /* handle */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearImmediate(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearInterval(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearTimeout(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestAnimationFrame(value: /* callback */ js.Function1[/* time */ Double, Unit] => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImmediate(value: /* handler */ js.Function1[/* repeated */ js.Any, Unit] => Double): Self = StObject.set(x, "setImmediate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInterval(value: FnCall): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTimeout(value: FnCall): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
  }
}
