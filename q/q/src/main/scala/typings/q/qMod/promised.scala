package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "promised")
@js.native
object promised extends js.Object {
  def apply[T](callback: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
}

