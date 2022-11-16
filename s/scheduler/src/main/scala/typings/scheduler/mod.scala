package typings.scheduler

import typings.scheduler.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unstableCancelCallback(callbackNode: CallbackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_cancelCallback")(callbackNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unstableContinueExecution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_continueExecution")().asInstanceOf[Unit]
  
  inline def unstableGetCurrentPriorityLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getCurrentPriorityLevel")().asInstanceOf[Double]
  
  inline def unstableGetFirstCallbackNode(): CallbackNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getFirstCallbackNode")().asInstanceOf[CallbackNode | Null]
  
  @JSImport("scheduler", "unstable_IdlePriority")
  @js.native
  val unstableIdlePriority: /* 5 */ Double = js.native
  
  @JSImport("scheduler", "unstable_ImmediatePriority")
  @js.native
  val unstableImmediatePriority: /* 1 */ Double = js.native
  
  @JSImport("scheduler", "unstable_LowPriority")
  @js.native
  val unstableLowPriority: /* 4 */ Double = js.native
  
  inline def unstableNext[T](eventHandler: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_next")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("scheduler", "unstable_NormalPriority")
  @js.native
  val unstableNormalPriority: /* 3 */ Double = js.native
  
  inline def unstableNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_now")().asInstanceOf[Double]
  
  inline def unstablePauseExecution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_pauseExecution")().asInstanceOf[Unit]
  
  inline def unstableRunWithPriority[T](priorityLevel: Double, eventHandler: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_runWithPriority")(priorityLevel.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleCallback")(priorityLevel.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  inline def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType, options: Delay): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleCallback")(priorityLevel.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  
  inline def unstableShouldYield(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_shouldYield")().asInstanceOf[Boolean]
  
  @JSImport("scheduler", "unstable_UserBlockingPriority")
  @js.native
  val unstableUserBlockingPriority: /* 2 */ Double = js.native
  
  inline def unstableWrapCallback(callback: FrameCallbackType): js.Function0[FrameCallbackType] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_wrapCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[FrameCallbackType]]
  
  trait CallbackNode extends StObject {
    
    def callback(): FrameCallbackType | Unit
    @JSName("callback")
    var callback_Original: FrameCallbackType
    
    var expirationTime: Double
    
    var next: CallbackNode | Null
    
    var prev: CallbackNode | Null
    
    var priorityLevel: Double
  }
  object CallbackNode {
    
    inline def apply(callback: FrameCallbackType, expirationTime: Double, priorityLevel: Double): CallbackNode = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], priorityLevel = priorityLevel.asInstanceOf[js.Any], next = null, prev = null)
      __obj.asInstanceOf[CallbackNode]
    }
    
    extension [Self <: CallbackNode](x: Self) {
      
      inline def setCallback(value: FrameCallbackType): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      inline def setNext(value: CallbackNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: CallbackNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
      
      inline def setPriorityLevel(value: Double): Self = StObject.set(x, "priorityLevel", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FrameCallbackType = (): scheduler.scheduler.FrameCallbackType | void
  }}}
  to avoid circular code involving: 
  - scheduler.scheduler.FrameCallbackType
  */
  @js.native
  trait FrameCallbackType extends StObject {
    
    def apply(): FrameCallbackType | Unit = js.native
  }
}
