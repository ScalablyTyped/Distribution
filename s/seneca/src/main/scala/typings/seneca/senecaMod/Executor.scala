package typings.seneca.senecaMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executor extends js.Object {
  @JSName("cb")
  var cb_Original: ExecutorCallback = js.native
  var desc: String = js.native
  var execute: UnknownType = js.native
  @JSName("fn")
  var fn_Original: ExecutorWorker = js.native
  var gate: Boolean = js.native
  var id: String = js.native
  var ungate: Boolean = js.native
  def cb(err: Error, result: js.Any): Unit = js.native
  def fn(callback: js.Any): Unit = js.native
}

