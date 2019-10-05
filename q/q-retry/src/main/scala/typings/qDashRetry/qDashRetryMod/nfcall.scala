package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "nfcall")
@js.native
object nfcall extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Promise[T] = js.native
}

