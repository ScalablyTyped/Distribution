package typings.sade

import typings.sade.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  var args: js.Array[String] = js.native
  @JSName("handler")
  var handler_Original: Handler = js.native
  var name: String = js.native
  def handler(args: js.Any*): Unit = js.native
}

