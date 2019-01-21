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

