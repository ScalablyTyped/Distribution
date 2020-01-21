package typings.qRetry.mod

import typings.q.mod.IWhenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q-retry", "race")
@js.native
object race extends js.Object {
  def apply[T](promises: js.Array[IWhenable[T]]): typings.q.mod.Promise[T] = js.native
}

