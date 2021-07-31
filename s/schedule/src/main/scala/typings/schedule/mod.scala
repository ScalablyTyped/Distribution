package typings.schedule

import typings.schedule.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("schedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unstableCancelScheduledWork(callbackNode: CallbackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_cancelScheduledWork")(callbackNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unstableNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_now")().asInstanceOf[Double]
  
  @scala.inline
  def unstableScheduleWork(callback: FrameCallbackType): CallbackNode = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleWork")(callback.asInstanceOf[js.Any]).asInstanceOf[CallbackNode]
  @scala.inline
  def unstableScheduleWork(callback: FrameCallbackType, options: Timeout): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleWork")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  
  trait CallbackNode extends StObject {
    
    def callback(deadline: Deadline): Unit
    @JSName("callback")
    var callback_Original: FrameCallbackType
    
    var next: CallbackNode | Null
    
    var prev: CallbackNode | Null
    
    var timesOutAt: Double
  }
  object CallbackNode {
    
    @scala.inline
    def apply(callback: /* deadline */ Deadline => Unit, timesOutAt: Double): CallbackNode = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), timesOutAt = timesOutAt.asInstanceOf[js.Any], next = null, prev = null)
      __obj.asInstanceOf[CallbackNode]
    }
    
    @scala.inline
    implicit class CallbackNodeMutableBuilder[Self <: CallbackNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* deadline */ Deadline => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: CallbackNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrev(value: CallbackNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setTimesOutAt(value: Double): Self = StObject.set(x, "timesOutAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Deadline extends StObject {
    
    var didTimeout: Boolean
    
    def timeRemaining(): Double
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
