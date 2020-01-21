package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  def default(list1: String): js.Function1[/* list2 */ String, String] = js.native
  def default(list1: String, list2: String): String = js.native
  def default[T](list1: js.Array[T]): js.Function1[/* list2 */ js.Array[T], js.Array[T]] = js.native
  def default[T](list1: js.Array[T], list2: js.Array[T]): js.Array[T] = js.native
  def default[T](placeholder: Placeholder): js.Function2[/* list2 */ js.Array[T], /* list1 */ js.Array[T], js.Array[T]] = js.native
  def default[T](placeholder: Placeholder, list2: js.Array[T]): js.Function1[/* list1 */ js.Array[T], js.Array[T]] = js.native
}

