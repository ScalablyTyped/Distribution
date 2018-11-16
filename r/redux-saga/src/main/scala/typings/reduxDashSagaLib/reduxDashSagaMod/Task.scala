package typings
package reduxDashSagaLib.reduxDashSagaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  var done: stdLib.Promise[_] = js.native
  def cancel(): scala.Unit = js.native
  def error(): js.UndefOr[_] = js.native
  def isCancelled(): scala.Boolean = js.native
  def isRunning(): scala.Boolean = js.native
  def result(): js.UndefOr[_] = js.native
  @JSName("result")
  def result_T[T](): js.UndefOr[T] = js.native
  def setContext[C /* <: js.Object */](props: stdLib.Partial[C]): scala.Unit = js.native
}

