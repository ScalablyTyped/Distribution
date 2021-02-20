package typings.scheduler

import typings.scheduler.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scheduler", "unstable_cancelCallback")
  @js.native
  def unstableCancelCallback(callbackNode: CallbackNode): Unit = js.native
  
  @JSImport("scheduler", "unstable_continueExecution")
  @js.native
  def unstableContinueExecution(): Unit = js.native
  
  @JSImport("scheduler", "unstable_getCurrentPriorityLevel")
  @js.native
  def unstableGetCurrentPriorityLevel(): Double = js.native
  
  @JSImport("scheduler", "unstable_getFirstCallbackNode")
  @js.native
  def unstableGetFirstCallbackNode(): CallbackNode | Null = js.native
  
  @JSImport("scheduler", "unstable_IdlePriority")
  @js.native
  val unstableIdlePriority: /* 5 */ Double = js.native
  
  @JSImport("scheduler", "unstable_ImmediatePriority")
  @js.native
  val unstableImmediatePriority: /* 1 */ Double = js.native
  
  @JSImport("scheduler", "unstable_LowPriority")
  @js.native
  val unstableLowPriority: /* 4 */ Double = js.native
  
  @JSImport("scheduler", "unstable_next")
  @js.native
  def unstableNext[T](eventHandler: js.Function0[T]): T = js.native
  
  @JSImport("scheduler", "unstable_NormalPriority")
  @js.native
  val unstableNormalPriority: /* 3 */ Double = js.native
  
  @JSImport("scheduler", "unstable_now")
  @js.native
  def unstableNow(): Double = js.native
  
  @JSImport("scheduler", "unstable_pauseExecution")
  @js.native
  def unstablePauseExecution(): Unit = js.native
  
  @JSImport("scheduler", "unstable_runWithPriority")
  @js.native
  def unstableRunWithPriority[T](priorityLevel: Double, eventHandler: js.Function0[T]): T = js.native
  
  @JSImport("scheduler", "unstable_scheduleCallback")
  @js.native
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType): CallbackNode = js.native
  @JSImport("scheduler", "unstable_scheduleCallback")
  @js.native
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType, options: Delay): CallbackNode = js.native
  
  @JSImport("scheduler", "unstable_shouldYield")
  @js.native
  def unstableShouldYield(): Boolean = js.native
  
  @JSImport("scheduler", "unstable_UserBlockingPriority")
  @js.native
  val unstableUserBlockingPriority: /* 2 */ Double = js.native
  
  @JSImport("scheduler", "unstable_wrapCallback")
  @js.native
  def unstableWrapCallback(callback: FrameCallbackType): js.Function0[FrameCallbackType] = js.native
  
  @js.native
  trait CallbackNode extends StObject {
    
    def callback(): (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit = js.native
    @JSName("callback")
    var callback_Original: FrameCallbackType = js.native
    
    var expirationTime: Double = js.native
    
    var next: CallbackNode | Null = js.native
    
    var prev: CallbackNode | Null = js.native
    
    var priorityLevel: Double = js.native
  }
  
  type FrameCallbackType = js.Function0[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
  ]
}
