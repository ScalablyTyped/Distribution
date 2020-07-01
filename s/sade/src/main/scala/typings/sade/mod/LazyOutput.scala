package typings.sade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LazyOutput extends js.Object {
  var args: js.Array[String] = js.native
  @JSName("handler")
  var handler_Original: Handler = js.native
  var name: String = js.native
  def handler(args: js.Any*): js.Any = js.native
}

