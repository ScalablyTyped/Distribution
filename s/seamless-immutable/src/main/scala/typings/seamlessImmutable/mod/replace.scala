package typings.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seamless-immutable", "replace")
@js.native
object replace extends js.Object {
  def apply[T, S](obj: Immutable[T, js.Object], valueObj: S): Immutable[S, js.Object] = js.native
  def apply[T, S](obj: Immutable[T, js.Object], valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
}

