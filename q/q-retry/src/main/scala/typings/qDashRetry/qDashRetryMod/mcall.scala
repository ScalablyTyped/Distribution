package typings.qDashRetry.qDashRetryMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "mcall")
@js.native
object mcall extends js.Object {
  def apply[T](obj: js.Any, functionName: String, args: js.Any*): Promise[T] = js.native
}

