package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventTarget extends StObject {
  
  def off(name: String, cb: js.Function1[/* e */ js.Any, js.Any]): Unit
  
  def on(name: String, cb: js.Function1[/* e */ js.Any, js.Any]): Unit
}
object NativeEventTarget {
  
  inline def apply(
    off: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit,
    on: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[NativeEventTarget]
  }
  
  extension [Self <: NativeEventTarget](x: Self) {
    
    inline def setOff(value: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, js.Function1[/* e */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
