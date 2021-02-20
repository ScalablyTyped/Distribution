package typings.reactNative.mod

import typings.reactNative.anon.Cancel
import typings.reactNative.anon.InteractionComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractionManagerStatic extends StObject {
  
  var Events: InteractionComplete = js.native
  
  /**
    * Adds a listener to be invoked when events of the specified type are
    * emitted. An optional calling context may be provided. The data arguments
    * emitted will be passed to the listener function.
    *
    * @param eventType - Name of the event to listen to
    * @param listener - Function to invoke when the specified event is
    *   emitted
    * @param context - Optional context object to use when invoking the
    *   listener
    */
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _]): EmitterSubscription = js.native
  def addListener(eventType: String, listener: js.Function1[/* repeated */ js.Any, _], context: js.Any): EmitterSubscription = js.native
  
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
  def runAfterInteractions(): Cancel = js.native
  def runAfterInteractions(task: js.Function0[_]): Cancel = js.native
  def runAfterInteractions(task: PromiseTask): Cancel = js.native
  def runAfterInteractions(task: SimpleTask): Cancel = js.native
  
  /**
    * A positive number will use setTimeout to schedule any tasks after
    * the eventLoopRunningTime hits the deadline value, otherwise all
    * tasks will be executed in one setImmediate batch (default).
    */
  def setDeadline(deadline: Double): Unit = js.native
}
