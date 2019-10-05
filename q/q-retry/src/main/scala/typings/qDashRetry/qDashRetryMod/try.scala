package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "try")
@js.native
object `try` extends js.Object {
  def apply[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): Promise[T] = js.native
}

