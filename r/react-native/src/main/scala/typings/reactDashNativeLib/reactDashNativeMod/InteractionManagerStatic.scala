package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionManagerStatic extends EventEmitterListener {
  var Events: reactDashNativeLib.Anon_InteractionStart = js.native
  /**
    * Notify manager that an interaction has completed.
    */
  def clearInteractionHandle(handle: Handle): scala.Unit = js.native
  /**
    * Notify manager that an interaction has started.
    */
  def createInteractionHandle(): Handle = js.native
  /**
    * Schedule a function to run after all interactions have completed.
    * Returns a cancellable
    */
  def runAfterInteractions(): reactDashNativeLib.Anon_Then = js.native
  def runAfterInteractions(task: js.Function0[_]): reactDashNativeLib.Anon_Then = js.native
  def runAfterInteractions(task: PromiseTask): reactDashNativeLib.Anon_Then = js.native
  def runAfterInteractions(task: SimpleTask): reactDashNativeLib.Anon_Then = js.native
  /**
    * A positive number will use setTimeout to schedule any tasks after
    * the eventLoopRunningTime hits the deadline value, otherwise all
    * tasks will be executed in one setImmediate batch (default).
    */
  def setDeadline(deadline: scala.Double): scala.Unit = js.native
}

