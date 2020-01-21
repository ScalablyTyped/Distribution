package typings.ramda

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/eqProps", JSImport.Namespace)
@js.native
object eqPropsMod extends js.Object {
  def default[P /* <: String */](prop: P): js.Function2[/* obj1 */ Record[P, _], /* obj2 */ Record[P, _], Boolean] = js.native
  def default[T](prop: String, obj1: T): js.Function1[/* obj2 */ js.Any, Boolean] = js.native
  def default[T, U](prop: String, obj1: T, obj2: U): Boolean = js.native
}

