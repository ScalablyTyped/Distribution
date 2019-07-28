package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Args
import typings.reactDashNative.Anon_InteractionComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionManagerStatic extends EventEmitterListener {
  var Events: Anon_InteractionComplete = js.native
  /**
    * Notify manager that an interaction has completed.
    */
  def clearInteractionHandle(handle: Handle): Unit = js.native
  /**
    * Notify manager that an interaction has started.
    */
  def createInteractionHandle(): Handle = js.native
  /**
    * Schedule a function to run after all interactions have completed.
    * Returns a cancellable
    */
  def runAfterInteractions(): Anon_Args = js.native
  def runAfterInteractions(task: js.Function0[_]): Anon_Args = js.native
  def runAfterInteractions(task: PromiseTask): Anon_Args = js.native
  def runAfterInteractions(task: SimpleTask): Anon_Args = js.native
  /**
    * A positive number will use setTimeout to schedule any tasks after
    * the eventLoopRunningTime hits the deadline value, otherwise all
    * tasks will be executed in one setImmediate batch (default).
    */
  def setDeadline(deadline: Double): Unit = js.native
}

