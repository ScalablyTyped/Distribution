package typings.ramda

import typings.ramda.toolsMod.Lens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/lens", JSImport.Namespace)
@js.native
object lensMod extends js.Object {
  def default[T, U, V](getter: js.Function1[/* s */ T, U], setter: js.Function2[/* a */ U, /* s */ T, V]): Lens = js.native
}

