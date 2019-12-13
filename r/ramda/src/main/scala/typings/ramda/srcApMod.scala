package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/ap", JSImport.Namespace)
@js.native
object srcApMod extends js.Object {
  def default[T, U](fns: js.Array[js.Function1[/* a */ T, U]]): js.Function1[/* vs */ js.Array[T], js.Array[U]] = js.native
  def default[T, U](fns: js.Array[js.Function1[/* a */ T, U]], vs: js.Array[T]): js.Array[U] = js.native
  def default[X0, X1, R](fn: js.Function2[/* x1 */ X1, /* x0 */ X0, R], fn1: js.Function1[/* x1 */ X1, X0]): js.Function1[/* x1 */ X1, R] = js.native
}

