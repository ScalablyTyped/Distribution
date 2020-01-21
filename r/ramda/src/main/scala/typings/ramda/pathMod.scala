package typings.ramda

import typings.ramda.toolsMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  def default[T](path: Path): js.Function1[/* obj */ js.Any, js.UndefOr[T]] = js.native
  def default[T](path: Path, obj: js.Any): js.UndefOr[T] = js.native
}

