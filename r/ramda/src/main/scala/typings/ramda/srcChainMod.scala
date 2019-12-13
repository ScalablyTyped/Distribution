package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/chain", JSImport.Namespace)
@js.native
object srcChainMod extends js.Object {
  def default[T, U](fn: js.Function1[/* n */ T, js.Array[U]]): js.Function1[/* list */ js.Array[T], js.Array[U]] = js.native
  def default[T, U](fn: js.Function1[/* n */ T, js.Array[U]], list: js.Array[T]): js.Array[U] = js.native
  def default[X0, X1, R](fn: js.Function2[/* x0 */ X0, /* x1 */ X1, R], fn1: js.Function1[/* x1 */ X1, X0]): js.Function1[/* x1 */ X1, R] = js.native
}

