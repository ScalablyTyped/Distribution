package typings.ramda

import typings.ramda.toolsMod.Lens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/view", JSImport.Namespace)
@js.native
object srcViewMod extends js.Object {
  def default[T, U](lens: Lens): js.Function1[/* obj */ T, U] = js.native
  def default[T, U](lens: Lens, obj: T): U = js.native
}

