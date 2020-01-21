package typings.ramda

import typings.ramda.toolsMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/pathOr", JSImport.Namespace)
@js.native
object pathOrMod extends js.Object {
  def default[T](defaultValue: T): js.Any = js.native
  def default[T](defaultValue: T, path: Path): js.Function1[/* obj */ js.Any, T] = js.native
  def default[T](defaultValue: T, path: Path, obj: js.Any): T = js.native
}

