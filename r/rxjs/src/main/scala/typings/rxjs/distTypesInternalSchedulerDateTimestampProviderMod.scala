package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerDateTimestampProviderMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/dateTimestampProvider", "dateTimestampProvider")
  @js.native
  val dateTimestampProvider: DateTimestampProvider_ = js.native
  
  trait DateTimestampProvider_
    extends StObject
       with TimestampProvider {
    
    var delegate: js.UndefOr[TimestampProvider] = js.undefined
  }
  object DateTimestampProvider_ {
    
    inline def apply(now: () => Double): DateTimestampProvider_ = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[DateTimestampProvider_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimestampProvider_] (val x: Self) extends AnyVal {
      
      inline def setDelegate(value: TimestampProvider): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
