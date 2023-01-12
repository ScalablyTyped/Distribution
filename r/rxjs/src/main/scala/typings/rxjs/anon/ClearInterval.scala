package typings.rxjs.anon

import typings.rxjs.distTypesInternalSchedulerIntervalProviderMod.ClearIntervalFunction
import typings.rxjs.distTypesInternalSchedulerIntervalProviderMod.SetIntervalFunction
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearInterval extends StObject {
  
  def clearInterval(handle: TimerHandle): Unit
  @JSName("clearInterval")
  var clearInterval_Original: ClearIntervalFunction
  
  def setInterval(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
  def setInterval(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
  @JSName("setInterval")
  var setInterval_Original: SetIntervalFunction
}
object ClearInterval {
  
  inline def apply(clearInterval: /* handle */ TimerHandle => Unit, setInterval: SetIntervalFunction): ClearInterval = {
    val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), setInterval = setInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearInterval] (val x: Self) extends AnyVal {
    
    inline def setClearInterval(value: /* handle */ TimerHandle => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
    
    inline def setSetInterval(value: SetIntervalFunction): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
  }
}
