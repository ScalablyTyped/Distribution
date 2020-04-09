package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rax", "useState")
@js.native
object useState extends js.Object {
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    */
  def apply[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  /**
    * Returns a stateful value, and a function to update it.
    */
  def apply[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  def apply[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
}

