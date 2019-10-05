package typings.scheduler

import typings.scheduler.schedulerMod.CallbackNode
import typings.scheduler.schedulerMod.FrameCallbackType
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
object schedulerMod extends js.Object {
  @js.native
  trait CallbackNode extends js.Object {
    @JSName("callback")
    var callback_Original: FrameCallbackType = js.native
    var expirationTime: Double = js.native
    var next: CallbackNode | Null = js.native
    var prev: CallbackNode | Null = js.native
    var priorityLevel: Double = js.native
    def callback(): (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit = js.native
  }
  
  val unstable_IdlePriority: `5` = js.native
  val unstable_ImmediatePriority: `1` = js.native
  val unstable_LowPriority: `4` = js.native
  val unstable_NormalPriority: `3` = js.native
  val unstable_UserBlockingPriority: `2` = js.native
  def unstable_cancelCallback(callbackNode: CallbackNode): Unit = js.native
  def unstable_continueExecution(): Unit = js.native
  def unstable_getCurrentPriorityLevel(): Double = js.native
  def unstable_getFirstCallbackNode(): CallbackNode | Null = js.native
  def unstable_now(): Double = js.native
  def unstable_pauseExecution(): Unit = js.native
  def unstable_runWithPriority[T](priorityLevel: Double, eventHandler: js.Function0[T]): js.UndefOr[T] = js.native
  def unstable_scheduleCallback(priorityLevel: Double, callback: FrameCallbackType): CallbackNode = js.native
  def unstable_scheduleCallback(priorityLevel: Double, callback: FrameCallbackType, options: Anon_Delay): CallbackNode = js.native
  def unstable_shouldYield(): Boolean = js.native
  def unstable_wrapCallback(callback: FrameCallbackType): js.Function0[js.UndefOr[FrameCallbackType]] = js.native
  type FrameCallbackType = js.Function0[
    (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias scheduler.scheduler.FrameCallbackType */ js.Object) | Unit
  ]
}

