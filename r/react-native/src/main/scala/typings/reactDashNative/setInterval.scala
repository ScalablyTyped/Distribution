package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setInterval")
@js.native
object setInterval extends js.Object {
  def apply(handler: js.Any): Double = js.native
  def apply(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def apply(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
}

