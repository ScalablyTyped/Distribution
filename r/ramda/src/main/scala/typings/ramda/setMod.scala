package typings.ramda

import typings.ramda.toolsMod.Lens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/set", JSImport.Namespace)
@js.native
object setMod extends js.Object {
  def default(lens: Lens): js.Function2[/* a */ js.Any, /* obj */ js.Any, _] = js.native
  def default[U](lens: Lens, a: U): js.Function1[/* obj */ js.Any, _] = js.native
  def default[T, U](lens: Lens, a: U, obj: T): T = js.native
}

