package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/eqBy", JSImport.Namespace)
@js.native
object eqByMod extends js.Object {
  def default[T, U](fn: js.Function1[/* a */ T, U]): js.Any = js.native
  def default[T, U](fn: js.Function1[/* a */ T, U], a: T): js.Function1[/* b */ T, Boolean] = js.native
  def default[T, U](fn: js.Function1[/* a */ T, U], a: T, b: T): Boolean = js.native
}

