package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "race")
@js.native
object race extends js.Object {
  def apply[T](promises: js.Array[IWhenable[T]]): Promise[T] = js.native
}

