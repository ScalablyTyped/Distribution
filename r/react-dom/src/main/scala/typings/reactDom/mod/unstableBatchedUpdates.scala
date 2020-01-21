package typings.reactDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_batchedUpdates")
@js.native
object unstableBatchedUpdates extends js.Object {
  def apply(callback: js.Function0[_]): Unit = js.native
  def apply[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  def apply[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
}

