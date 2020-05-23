package typings.std.global

import typings.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("postMessage")
@js.native
object postMessage extends js.Object {
  def apply(message: js.Any, targetOrigin: java.lang.String): Unit = js.native
  def apply(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
}

