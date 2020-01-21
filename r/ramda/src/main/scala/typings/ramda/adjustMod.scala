package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/adjust", JSImport.Namespace)
@js.native
object adjustMod extends js.Object {
  def default[T](index: Double, fn: js.Function1[/* a */ T, T]): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](index: Double, fn: js.Function1[/* a */ T, T], list: js.Array[T]): js.Array[T] = js.native
}

