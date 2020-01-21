package typings.scheduler

import typings.scheduler.schedulerNumbers.`1`
import typings.scheduler.schedulerNumbers.`2`
import typings.scheduler.schedulerNumbers.`3`
import typings.scheduler.schedulerNumbers.`4`
import typings.scheduler.schedulerNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scheduler", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait CallbackNode extends js.Object {
    @JSName("callback")
    var callback_Original: FrameCallbackType = js.native
    var expirationTime: Double = js.native
    var next: CallbackNode | Null = js.native
    var prev: CallbackNode | Null = js.native
    var priorityLevel: Double = js.native
    def callback(): (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit = js.native
  }
  
  @JSName("unstable_IdlePriority")
  val unstableIdlePriority: `5` = js.native
  @JSName("unstable_ImmediatePriority")
  val unstableImmediatePriority: `1` = js.native
  @JSName("unstable_LowPriority")
  val unstableLowPriority: `4` = js.native
  @JSName("unstable_NormalPriority")
  val unstableNormalPriority: `3` = js.native
  @JSName("unstable_UserBlockingPriority")
  val unstableUserBlockingPriority: `2` = js.native
  @JSName("unstable_cancelCallback")
  def unstableCancelCallback(callbackNode: CallbackNode): Unit = js.native
  @JSName("unstable_continueExecution")
  def unstableContinueExecution(): Unit = js.native
  @JSName("unstable_getCurrentPriorityLevel")
  def unstableGetCurrentPriorityLevel(): Double = js.native
  @JSName("unstable_getFirstCallbackNode")
  def unstableGetFirstCallbackNode(): CallbackNode | Null = js.native
  @JSName("unstable_next")
  def unstableNext[T](eventHandler: js.Function0[T]): T = js.native
  @JSName("unstable_now")
  def unstableNow(): Double = js.native
  @JSName("unstable_pauseExecution")
  def unstablePauseExecution(): Unit = js.native
  @JSName("unstable_runWithPriority")
  def unstableRunWithPriority[T](priorityLevel: Double, eventHandler: js.Function0[T]): T = js.native
  @JSName("unstable_scheduleCallback")
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType): CallbackNode = js.native
  @JSName("unstable_scheduleCallback")
  def unstableScheduleCallback(priorityLevel: Double, callback: FrameCallbackType, options: AnonDelay): CallbackNode = js.native
  @JSName("unstable_shouldYield")
  def unstableShouldYield(): Boolean = js.native
  @JSName("unstable_wrapCallback")
  def unstableWrapCallback(callback: FrameCallbackType): js.Function0[FrameCallbackType] = js.native
  type FrameCallbackType = js.Function0[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
  ]
}

