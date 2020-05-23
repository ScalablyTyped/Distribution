package typings.ramda

import typings.ramda.anon.Or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/or", JSImport.Namespace)
@js.native
object orMod extends js.Object {
  def default[T /* <: Or */](fn1: T): js.Function1[/* val2 */ js.Any, T | _] = js.native
  def default[T, U](a: T, b: U): T | U = js.native
  @JSName("default")
  def default_T[T](a: T): js.Function1[/* b */ js.Any, T | _] = js.native
  @JSName("default")
  def default_T_OrU[T /* <: Or */, U](fn1: T, val2: U): T | U = js.native
}

