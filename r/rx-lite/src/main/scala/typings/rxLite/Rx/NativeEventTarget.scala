package typings.rxLite.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeEventTarget extends StObject {
  
  def off(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
  
  def on(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit = js.native
}
object NativeEventTarget {
  
  @scala.inline
  def apply(
    off: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[NativeEventTarget]
  }
  
  @scala.inline
  implicit class NativeEventTargetMutableBuilder[Self <: NativeEventTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOff(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function1[/* e */ js.Any, _]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
