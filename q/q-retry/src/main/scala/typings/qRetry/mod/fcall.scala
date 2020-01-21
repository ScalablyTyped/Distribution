package typings.qRetry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "fcall")
@js.native
object fcall extends js.Object {
  def apply[T](method: js.Function1[/* repeated */ js.Any, T], args: js.Any*): typings.q.mod.Promise[T] = js.native
}

