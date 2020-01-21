package typings.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "all")
@js.native
object all extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[T]] = js.native
}

