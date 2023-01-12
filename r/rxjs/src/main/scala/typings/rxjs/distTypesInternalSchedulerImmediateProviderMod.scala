package typings.rxjs

import typings.rxjs.anon.ClearImmediate
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerImmediateProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/immediateProvider", "immediateProvider")
  @js.native
  val immediateProvider: ImmediateProvider_ = js.native
  
  type ClearImmediateFunction = js.Function1[/* handle */ TimerHandle, Unit]
  
  trait ImmediateProvider_ extends StObject {
    
    def clearImmediate(handle: TimerHandle): Unit
    @JSName("clearImmediate")
    var clearImmediate_Original: ClearImmediateFunction
    
    var delegate: js.UndefOr[ClearImmediate] = js.undefined
    
    def setImmediate(handler: js.Function0[Unit], args: Any*): TimerHandle
    @JSName("setImmediate")
    var setImmediate_Original: SetImmediateFunction
  }
  object ImmediateProvider_ {
    
    inline def apply(clearImmediate: /* handle */ TimerHandle => Unit, setImmediate: SetImmediateFunction): ImmediateProvider_ = {
      val __obj = js.Dynamic.literal(clearImmediate = js.Any.fromFunction1(clearImmediate), setImmediate = setImmediate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImmediateProvider_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImmediateProvider_] (val x: Self) extends AnyVal {
      
      inline def setClearImmediate(value: /* handle */ TimerHandle => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
      
      inline def setDelegate(value: ClearImmediate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setSetImmediate(value: SetImmediateFunction): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetImmediateFunction extends StObject {
    
    def apply(handler: js.Function0[Unit], args: Any*): TimerHandle = js.native
  }
}
