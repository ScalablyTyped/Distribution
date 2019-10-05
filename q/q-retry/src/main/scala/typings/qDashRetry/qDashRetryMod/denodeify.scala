package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "denodeify")
@js.native
object denodeify extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, Promise[T]] = js.native
}

