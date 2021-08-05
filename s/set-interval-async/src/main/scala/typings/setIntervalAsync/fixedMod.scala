package typings.setIntervalAsync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedMod {
  
  @JSImport("set-interval-async/fixed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("set-interval-async/fixed", "SetIntervalAsyncError")
  @js.native
  class SetIntervalAsyncError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def clearIntervalAsync(timer: SetIntervalAsyncTimer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIntervalAsync")(timer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, js.Any], interval: Double, args: js.Any*): SetIntervalAsyncTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntervalAsync")(handler.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SetIntervalAsyncTimer]
  
  trait SetIntervalAsyncTimer extends StObject {
    
    var id: Double
  }
  object SetIntervalAsyncTimer {
    
    inline def apply(id: Double): SetIntervalAsyncTimer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIntervalAsyncTimer]
    }
    
    extension [Self <: SetIntervalAsyncTimer](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
