package typings.ramda

import typings.ramda.toolsMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/paths", JSImport.Namespace)
@js.native
object pathsMod extends js.Object {
  def default[T](paths: js.Array[Path]): js.Function1[/* obj */ js.Any, js.UndefOr[js.Array[T]]] = js.native
  def default[T](paths: js.Array[Path], obj: js.Any): js.UndefOr[js.Array[T]] = js.native
}

