package typings.reactDashAsync.reactDashAsyncMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractState[T] extends js.Object {
  var counter: Double = js.native
  var initialValue: js.UndefOr[T | Error] = js.native
  var promise: js.Promise[T] = js.native
  def cancel(): Unit = js.native
  def reload(): Unit = js.native
  def run(args: js.Any*): Unit = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[Unit]): T = js.native
  def setError(error: Error): Error = js.native
  def setError(error: Error, callback: js.Function0[Unit]): Error = js.native
}

