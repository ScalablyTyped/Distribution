package typings
package atReduxDashSagaTypesLib.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /**
    * Cancels the task (If it is still running)
    */
  def cancel(): scala.Unit
  /**
    * Returns task thrown error. `undefined` if task is still running
    */
  def error(): js.UndefOr[_]
  /**
    * Returns true if the task has been cancelled
    */
  def isCancelled(): scala.Boolean
  /**
    * Returns true if the task hasn't yet returned or thrown an error
    */
  def isRunning(): scala.Boolean
  /**
    * Returns task return value. `undefined` if task is still running
    */
  def result[T](): js.UndefOr[T]
  def setContext[C /* <: js.Object */](props: stdLib.Partial[C]): scala.Unit
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
    cancel: js.Function0[scala.Unit],
    error: js.Function0[js.UndefOr[_]],
    isCancelled: js.Function0[scala.Boolean],
    isRunning: js.Function0[scala.Boolean],
    result: js.Function0[js.UndefOr[js.Any]],
    setContext: js.Function1[stdLib.Partial[js.Any], scala.Unit],
    toPromise: js.Function0[js.Promise[js.Any]]
  ): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("isCancelled")(isCancelled)
    __obj.updateDynamic("isRunning")(isRunning)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("toPromise")(toPromise)
    __obj.asInstanceOf[Task]
  }
}

