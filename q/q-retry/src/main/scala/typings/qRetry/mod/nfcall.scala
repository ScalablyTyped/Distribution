package typings.qRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "nfcall")
@js.native
object nfcall extends js.Object {
  def apply[T](nodeFunction: js.Function1[/* repeated */ js.Any, _], args: js.Any*): typings.q.mod.Promise[T] = js.native
}

