package typings.rxjs.anon

import typings.rxjs.distTypesInternalSchedulerTimeoutProviderMod.ClearTimeoutFunction
import typings.rxjs.distTypesInternalSchedulerTimeoutProviderMod.SetTimeoutFunction
import typings.rxjs.distTypesInternalSchedulerTimerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTimeout extends StObject {
  
  def clearTimeout(handle: TimerHandle): Unit
  @JSName("clearTimeout")
  var clearTimeout_Original: ClearTimeoutFunction
  
  def setTimeout(handler: js.Function0[Unit], timeout: Double, args: Any*): TimerHandle
  def setTimeout(handler: js.Function0[Unit], timeout: Unit, args: Any*): TimerHandle
  @JSName("setTimeout")
  var setTimeout_Original: SetTimeoutFunction
}
object ClearTimeout {
  
  inline def apply(clearTimeout: /* handle */ TimerHandle => Unit, setTimeout: SetTimeoutFunction): ClearTimeout = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = setTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearTimeout] (val x: Self) extends AnyVal {
    
    inline def setClearTimeout(value: /* handle */ TimerHandle => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
    
    inline def setSetTimeout(value: SetTimeoutFunction): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
  }
}
