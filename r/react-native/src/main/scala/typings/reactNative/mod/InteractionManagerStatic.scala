package typings.reactNative.mod

import typings.reactNative.AnonCancel
import typings.reactNative.AnonInteractionComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionManagerStatic extends EventEmitterListener {
  var Events: AnonInteractionComplete = js.native
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
  def runAfterInteractions(): AnonCancel = js.native
  def runAfterInteractions(task: js.Function0[_]): AnonCancel = js.native
  def runAfterInteractions(task: PromiseTask): AnonCancel = js.native
  def runAfterInteractions(task: SimpleTask): AnonCancel = js.native
  /**
    * A positive number will use setTimeout to schedule any tasks after
    * the eventLoopRunningTime hits the deadline value, otherwise all
    * tasks will be executed in one setImmediate batch (default).
    */
  def setDeadline(deadline: Double): Unit = js.native
}

