package typings.setIntervalAsync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamicMod {
  
  @JSImport("set-interval-async/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("set-interval-async/dynamic", "SetIntervalAsyncError")
  @js.native
  open class SetIntervalAsyncError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def clearIntervalAsync(timer: SetIntervalAsyncTimer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIntervalAsync")(timer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIntervalAsync(handler: js.Function1[/* repeated */ Any, Any], interval: Double, args: Any*): SetIntervalAsyncTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntervalAsync")((scala.List(handler.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SetIntervalAsyncTimer]
  
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
