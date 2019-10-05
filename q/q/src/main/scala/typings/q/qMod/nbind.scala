package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "nbind")
@js.native
object nbind extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
}

