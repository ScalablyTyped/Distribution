package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/sort", JSImport.Namespace)
@js.native
object srcSortMod extends js.Object {
  def default[T](fn: js.Function2[/* a */ T, /* b */ T, Double]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](fn: js.Function2[/* a */ T, /* b */ T, Double], list: js.Array[T]): js.Array[T] = js.native
}

