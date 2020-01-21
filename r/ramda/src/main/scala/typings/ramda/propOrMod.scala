package typings.ramda

import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/propOr", JSImport.Namespace)
@js.native
object propOrMod extends js.Object {
  def default[U](__ : Placeholder, p: String, obj: U): js.Function1[/* val */ js.Any, _] = js.native
  def default[T](`val`: T): js.Function2[/* p */ String, /* obj */ js.Any, _] = js.native
  def default[T](`val`: T, p: String): js.Function1[/* obj */ js.Any, _] = js.native
  def default[T, U](`val`: T, __ : Placeholder, obj: U): js.Function1[/* p */ String, _] = js.native
  def default[T, U, V](`val`: T, p: String, obj: U): V = js.native
}

