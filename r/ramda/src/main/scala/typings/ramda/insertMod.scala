package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/insert", JSImport.Namespace)
@js.native
object insertMod extends js.Object {
  def default(index: Double): js.Function2[/* elt */ js.Any, /* list */ js.Array[_], js.Array[_]] = js.native
  def default[T](index: Double, elt: T): js.Function1[/* list */ js.Array[T], js.Array[T]] = js.native
  def default[T](index: Double, elt: T, list: js.Array[T]): js.Array[T] = js.native
}

