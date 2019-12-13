package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/endsWith", JSImport.Namespace)
@js.native
object srcEndsWithMod extends js.Object {
  def default(a: String): js.Function1[/* list */ String, Boolean] = js.native
  def default(a: String, list: String): Boolean = js.native
  def default[T](a: T): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](a: T, list: js.Array[T]): Boolean = js.native
  def default[T](a: js.Array[T]): js.Function1[/* list */ js.Array[T], Boolean] = js.native
  def default[T](a: js.Array[T], list: js.Array[T]): Boolean = js.native
}

