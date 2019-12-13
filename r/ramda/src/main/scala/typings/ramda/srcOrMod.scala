package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/or", JSImport.Namespace)
@js.native
object srcOrMod extends js.Object {
  def default[T](a: T): js.Function1[/* b */ js.Any, T | _] = js.native
  def default[T, U](a: T, b: U): T | U = js.native
  @JSName("default")
  def default_T_Anon_AOr[T /* <: Anon_AOr */](fn1: T): js.Function1[/* val2 */ js.Any, T | _] = js.native
  @JSName("default")
  def default_T_Anon_AOrU[T /* <: Anon_AOr */, U](fn1: T, val2: U): T | U = js.native
}

