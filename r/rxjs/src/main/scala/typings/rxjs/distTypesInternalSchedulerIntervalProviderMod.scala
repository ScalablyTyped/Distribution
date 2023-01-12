package typings.rxjs

import typings.rxjs.anon.ClearInterval
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerIntervalProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/intervalProvider", "intervalProvider")
  @js.native
  val intervalProvider: IntervalProvider_ = js.native
  
  type ClearIntervalFunction = js.Function1[/* handle */ TimerHandle, Unit]
  
  trait IntervalProvider_ extends StObject {
    
    def clearInterval(handle: TimerHandle): Unit
    @JSName("clearInterval")
    var clearInterval_Original: ClearIntervalFunction
    
    var delegate: js.UndefOr[ClearInterval] = js.undefined
    
    def setInterval(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
    def setInterval(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
    @JSName("setInterval")
    var setInterval_Original: SetIntervalFunction
  }
  object IntervalProvider_ {
    
    inline def apply(clearInterval: /* handle */ TimerHandle => Unit, setInterval: SetIntervalFunction): IntervalProvider_ = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), setInterval = setInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalProvider_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntervalProvider_] (val x: Self) extends AnyVal {
      
      inline def setClearInterval(value: /* handle */ TimerHandle => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setDelegate(value: ClearInterval): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setSetInterval(value: SetIntervalFunction): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetIntervalFunction extends StObject {
    
    def apply(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle = js.native
    def apply(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle = js.native
  }
}
