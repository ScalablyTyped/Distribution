package typings.ramda.toolsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssocPartialOne[K /* <: String */] extends js.Object {
  def apply[T](`val`: T): js.Function1[/* obj */ js.Any, (Record[K, T]) with js.Any] = js.native
  def apply[T, U](`val`: T, obj: U): (Record[K, T]) with U = js.native
}

