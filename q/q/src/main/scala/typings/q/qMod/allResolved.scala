package typings.q.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("q", "allResolved")
@js.native
object allResolved extends js.Object {
  def apply[T](promises: IWhenable[js.Array[IWhenable[T]]]): Promise[js.Array[Promise[T]]] = js.native
}

