package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerPerformanceTimestampProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/performanceTimestampProvider", "performanceTimestampProvider")
  @js.native
  val performanceTimestampProvider: PerformanceTimestampProvider_ = js.native
  
  trait PerformanceTimestampProvider_
    extends StObject
       with TimestampProvider {
    
    var delegate: js.UndefOr[TimestampProvider] = js.undefined
  }
  object PerformanceTimestampProvider_ {
    
    inline def apply(now: () => Double): PerformanceTimestampProvider_ = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[PerformanceTimestampProvider_]
    }
    
    extension [Self <: PerformanceTimestampProvider_](x: Self) {
      
      inline def setDelegate(value: TimestampProvider): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
