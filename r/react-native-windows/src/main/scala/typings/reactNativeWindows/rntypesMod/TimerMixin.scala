package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.FnCall
import typings.reactNativeWindows.anon.FnCallHandlerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerMixin extends StObject {
  
  var cancelAnimationFrame: js.Function1[/* handle */ Double, Unit]
  
  var clearImmediate: js.Function1[/* handle */ Double, Unit]
  
  var clearInterval: js.Function1[/* handle */ Double, Unit]
  
  var clearTimeout: js.Function1[/* handle */ Double, Unit]
  
  var requestAnimationFrame: js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double]
  
  var setImmediate: FnCallHandlerArgs
  
  var setInterval: FnCall
  
  var setTimeout: FnCall
}
object TimerMixin {
  
  inline def apply(
    cancelAnimationFrame: /* handle */ Double => Unit,
    clearImmediate: /* handle */ Double => Unit,
    clearInterval: /* handle */ Double => Unit,
    clearTimeout: /* handle */ Double => Unit,
    requestAnimationFrame: /* callback */ js.Function1[/* time */ Double, Unit] => Double,
    setImmediate: FnCallHandlerArgs,
    setInterval: FnCall,
    setTimeout: FnCall
  ): TimerMixin = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame), setImmediate = setImmediate.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerMixin]
  }
  
  extension [Self <: TimerMixin](x: Self) {
    
    inline def setCancelAnimationFrame(value: /* handle */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setClearImmediate(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
    
    inline def setClearInterval(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
    
    inline def setClearTimeout(value: /* handle */ Double => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
    
    inline def setRequestAnimationFrame(value: /* callback */ js.Function1[/* time */ Double, Unit] => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setSetImmediate(value: FnCallHandlerArgs): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
    
    inline def setSetInterval(value: FnCall): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    
    inline def setSetTimeout(value: FnCall): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
  }
}
