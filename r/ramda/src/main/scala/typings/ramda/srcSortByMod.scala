package typings.ramda

import typings.ramda.toolsMod.Ord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/sortBy", JSImport.Namespace)
@js.native
object srcSortByMod extends js.Object {
  def default(fn: js.Function1[/* a */ js.Any, Ord]): js.Function1[/* list */ js.Array[_], js.Array[_]] = js.native
  def default[T](fn: js.Function1[/* a */ T, Ord], list: js.Array[T]): js.Array[T] = js.native
}

