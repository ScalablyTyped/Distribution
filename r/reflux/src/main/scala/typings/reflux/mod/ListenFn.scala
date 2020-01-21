package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenFn extends js.Object {
  var completed: js.Function = js.native
  var failed: js.Function = js.native
  def apply(params: js.Any*): js.Any = js.native
}

