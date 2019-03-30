package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractState[T] extends js.Object {
  var counter: scala.Double = js.native
  var initialValue: js.UndefOr[T | stdLib.Error] = js.native
  def cancel(): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def run(args: js.Any*): js.Promise[T] = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[scala.Unit]): T = js.native
  def setError(error: stdLib.Error): stdLib.Error = js.native
  def setError(error: stdLib.Error, callback: js.Function0[scala.Unit]): stdLib.Error = js.native
}

