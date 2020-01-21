package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/none", JSImport.Namespace)
@js.native
object noneMod extends js.Object {
  def default[T](fn: js.Function1[/* a */ T, Boolean]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](fn: js.Function1[/* a */ T, Boolean], list: js.Array[T]): Boolean = js.native
}

