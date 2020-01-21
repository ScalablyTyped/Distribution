package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/defaultTo", JSImport.Namespace)
@js.native
object defaultToMod extends js.Object {
  def default[T](a: T): js.Function1[/* b */ js.UndefOr[js.Any | Null], T | _] = js.native
  def default[T, U](a: T, b: U): T | U = js.native
  @JSName("default")
  def default_TU_Union[T, U](a: T): T | U = js.native
}

