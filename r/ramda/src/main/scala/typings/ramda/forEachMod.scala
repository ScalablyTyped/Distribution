package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/forEach", JSImport.Namespace)
@js.native
object forEachMod extends js.Object {
  def default[T](fn: js.Function1[/* x */ T, Unit]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](fn: js.Function1[/* x */ T, Unit], list: js.Array[T]): js.Array[T] = js.native
}

