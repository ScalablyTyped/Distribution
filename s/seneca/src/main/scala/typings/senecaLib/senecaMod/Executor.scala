package typings
package senecaLib.senecaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executor extends js.Object {
  @JSName("cb")
  var cb_Original: ExecutorCallback = js.native
  var desc: java.lang.String = js.native
  var execute: UnknownType = js.native
  @JSName("fn")
  var fn_Original: ExecutorWorker = js.native
  var gate: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var ungate: scala.Boolean = js.native
  def cb(err: stdLib.Error, result: js.Any): scala.Unit = js.native
  def fn(callback: js.Any): scala.Unit = js.native
}

