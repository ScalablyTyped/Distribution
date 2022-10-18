package typings.rxjs.anon

import typings.rxjs.distTypesInternalSchedulerImmediateProviderMod.ClearImmediateFunction
import typings.rxjs.distTypesInternalSchedulerImmediateProviderMod.SetImmediateFunction
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearImmediate extends StObject {
  
  def clearImmediate(handle: TimerHandle): Unit
  @JSName("clearImmediate")
  var clearImmediate_Original: ClearImmediateFunction
  
  def setImmediate(handler: js.Function0[Unit], args: Any*): TimerHandle
  @JSName("setImmediate")
  var setImmediate_Original: SetImmediateFunction
}
object ClearImmediate {
  
  inline def apply(clearImmediate: /* handle */ TimerHandle => Unit, setImmediate: SetImmediateFunction): ClearImmediate = {
    val __obj = js.Dynamic.literal(clearImmediate = js.Any.fromFunction1(clearImmediate), setImmediate = setImmediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearImmediate]
  }
  
  extension [Self <: ClearImmediate](x: Self) {
    
    inline def setClearImmediate(value: /* handle */ TimerHandle => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
    
    inline def setSetImmediate(value: SetImmediateFunction): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
  }
}
