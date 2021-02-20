package typings.setIntervalAsync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyMod {
  
  @JSImport("set-interval-async/legacy", "SetIntervalAsyncError")
  @js.native
  class SetIntervalAsyncError () extends Error
  
  @JSImport("set-interval-async/legacy", "clearIntervalAsync")
  @js.native
  def clearIntervalAsync(timer: SetIntervalAsyncTimer): js.Promise[Unit] = js.native
  
  @JSImport("set-interval-async/legacy", "setIntervalAsync")
  @js.native
  def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
  
  @js.native
  trait SetIntervalAsyncTimer extends StObject {
    
    var id: Double = js.native
  }
  object SetIntervalAsyncTimer {
    
    @scala.inline
    def apply(id: Double): SetIntervalAsyncTimer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIntervalAsyncTimer]
    }
    
    @scala.inline
    implicit class SetIntervalAsyncTimerMutableBuilder[Self <: SetIntervalAsyncTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
