package typings.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "mcall")
@js.native
object mcall extends js.Object {
  def apply[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
}

