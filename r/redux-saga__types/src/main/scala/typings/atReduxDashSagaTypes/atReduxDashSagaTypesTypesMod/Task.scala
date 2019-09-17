package typings.atReduxDashSagaTypes.atReduxDashSagaTypesTypesMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Cancels the task (If it is still running)
    */
  def cancel(): Unit
  /**
    * Returns task thrown error. `undefined` if task is still running
    */
  def error(): js.UndefOr[js.Any]
  /**
    * Returns true if the task has been cancelled
    */
  def isCancelled(): Boolean
  /**
    * Returns true if the task hasn't yet returned or thrown an error
    */
  def isRunning(): Boolean
  /**
    * Returns task return value. `undefined` if task is still running
    */
  def result[T](): js.UndefOr[T]
  def setContext[C /* <: js.Object */](props: Partial[C]): Unit
  /**
    * Returns a Promise which is either:
    * - resolved with task's return value
    * - rejected with task's thrown error
    */
  def toPromise[T](): js.Promise[T]
}

object Task {
  @scala.inline
  def apply(
    cancel: () => Unit,
    error: () => js.UndefOr[js.Any],
    isCancelled: () => Boolean,
    isRunning: () => Boolean,
    result: () => js.UndefOr[js.Any],
    setContext: Partial[js.Any] => Unit,
    toPromise: () => js.Promise[js.Any]
  ): Task = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), error = js.Any.fromFunction0(error), isCancelled = js.Any.fromFunction0(isCancelled), isRunning = js.Any.fromFunction0(isRunning), result = js.Any.fromFunction0(result), setContext = js.Any.fromFunction1(setContext), toPromise = js.Any.fromFunction0(toPromise))
  
    __obj.asInstanceOf[Task]
  }
}

