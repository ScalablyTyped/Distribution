package typings.schedule

import typings.schedule.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schedule", "unstable_cancelScheduledWork")
  @js.native
  def unstableCancelScheduledWork(callbackNode: CallbackNode): Unit = js.native
  
  @JSImport("schedule", "unstable_now")
  @js.native
  def unstableNow(): Double = js.native
  
  @JSImport("schedule", "unstable_scheduleWork")
  @js.native
  def unstableScheduleWork(callback: FrameCallbackType): CallbackNode = js.native
  @JSImport("schedule", "unstable_scheduleWork")
  @js.native
  def unstableScheduleWork(callback: FrameCallbackType, options: Timeout): CallbackNode = js.native
  
  @js.native
  trait CallbackNode extends StObject {
    
    def callback(deadline: Deadline): Unit = js.native
    @JSName("callback")
    var callback_Original: FrameCallbackType = js.native
    
    var next: CallbackNode | Null = js.native
    
    var prev: CallbackNode | Null = js.native
    
    var timesOutAt: Double = js.native
  }
  
  @js.native
  trait Deadline extends StObject {
    
    var didTimeout: Boolean = js.native
    
    def timeRemaining(): Double = js.native
  }
  object Deadline {
    
    @scala.inline
    def apply(didTimeout: Boolean, timeRemaining: () => Double): Deadline = {
      val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
      __obj.asInstanceOf[Deadline]
    }
    
    @scala.inline
    implicit class DeadlineMutableBuilder[Self <: Deadline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidTimeout(value: Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeRemaining(value: () => Double): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
    }
  }
  
  type FrameCallbackType = js.Function1[/* deadline */ Deadline, Unit]
}
