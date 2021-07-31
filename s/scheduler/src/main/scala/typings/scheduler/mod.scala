package typings.scheduler

import typings.scheduler.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unstableCancelCallback(callbackNode: CallbackNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_cancelCallback")(callbackNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unstableContinueExecution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_continueExecution")().asInstanceOf[Unit]
  
  @scala.inline
  def unstableGetCurrentPriorityLevel(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getCurrentPriorityLevel")().asInstanceOf[Double]
  
  @scala.inline
  def unstableGetFirstCallbackNode(): CallbackNode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getFirstCallbackNode")().asInstanceOf[CallbackNode | Null]
  
  @JSImport("scheduler", "unstable_IdlePriority")
  @js.native
  val unstableIdlePriority: /* 5 */ Double = js.native
  
  @JSImport("scheduler", "unstable_ImmediatePriority")
  @js.native
  val unstableImmediatePriority: /* 1 */ Double = js.native
  
  @JSImport("scheduler", "unstable_LowPriority")
  @js.native
  val unstableLowPriority: /* 4 */ Double = js.native
  
  @scala.inline
  def unstableNext[T](eventHandler: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_next")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("scheduler", "unstable_NormalPriority")
  @js.native
  val unstableNormalPriority: /* 3 */ Double = js.native
  
  @scala.inline
  def unstableNow(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_now")().asInstanceOf[Double]
  
  @scala.inline
  def unstablePauseExecution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_pauseExecution")().asInstanceOf[Unit]
  
  @scala.inline
  def unstableRunWithPriority[T](priorityLevel: Double, eventHandler: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_runWithPriority")(priorityLevel.asInstanceOf[js.Any], eventHandler.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleCallback")(priorityLevel.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  @scala.inline
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType, options: Delay): CallbackNode = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_scheduleCallback")(priorityLevel.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CallbackNode]
  
  @scala.inline
  def unstableShouldYield(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_shouldYield")().asInstanceOf[Boolean]
  
  @JSImport("scheduler", "unstable_UserBlockingPriority")
  @js.native
  val unstableUserBlockingPriority: /* 2 */ Double = js.native
  
  @scala.inline
  def unstableWrapCallback(callback: FrameCallbackType): js.Function0[FrameCallbackType] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_wrapCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[FrameCallbackType]]
  
  trait CallbackNode extends StObject {
    
    def callback(): (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
    @JSName("callback")
    var callback_Original: FrameCallbackType
    
    var expirationTime: Double
    
    var next: CallbackNode | Null
    
    var prev: CallbackNode | Null
    
    var priorityLevel: Double
  }
  object CallbackNode {
    
    @scala.inline
    def apply(
      callback: () => (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit,
      expirationTime: Double,
      priorityLevel: Double
    ): CallbackNode = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), expirationTime = expirationTime.asInstanceOf[js.Any], priorityLevel = priorityLevel.asInstanceOf[js.Any], next = null, prev = null)
      __obj.asInstanceOf[CallbackNode]
    }
    
    @scala.inline
    implicit class CallbackNodeMutableBuilder[Self <: CallbackNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(
        value: () => (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: CallbackNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrev(value: CallbackNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setPriorityLevel(value: Double): Self = StObject.set(x, "priorityLevel", value.asInstanceOf[js.Any])
    }
  }
  
  type FrameCallbackType = js.Function0[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
  ]
}
