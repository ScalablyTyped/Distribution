package typings.ramda

import typings.ramda.toolsMod.Path
import typings.ramda.toolsMod.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/assocPath", JSImport.Namespace)
@js.native
object assocPathMod extends js.Object {
  def default[T, U](__ : Placeholder, `val`: T, obj: U): js.Function1[/* path */ Path, U] = js.native
  def default[T, U](path: Path): js.Any = js.native
  def default[T, U](path: Path, __ : Placeholder, obj: U): js.Function1[/* val */ T, U] = js.native
  def default[T, U](path: Path, `val`: T): js.Function1[/* obj */ U, U] = js.native
  def default[T, U](path: Path, `val`: T, obj: U): U = js.native
}

