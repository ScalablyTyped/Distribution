package typings
package reactDashAsyncLib.reactDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncState[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var error: js.UndefOr[stdLib.Error] = js.native
  var finishedAt: js.UndefOr[stdLib.Date] = js.native
  var initialValue: js.UndefOr[T] = js.native
  var isLoading: scala.Boolean = js.native
  var startedAt: js.UndefOr[stdLib.Date] = js.native
  def cancel(): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def run(args: js.Any*): js.Promise[T] = js.native
  def setData(data: T): T = js.native
  def setData(data: T, callback: js.Function0[scala.Unit]): T = js.native
  def setError(error: stdLib.Error): stdLib.Error = js.native
  def setError(error: stdLib.Error, callback: js.Function0[scala.Unit]): stdLib.Error = js.native
}

