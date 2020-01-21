package typings.ramda

import typings.ramda.toolsMod.ComposeWithFns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/composeWith", JSImport.Namespace)
@js.native
object composeWithMod extends js.Object {
  def default(composer: js.Function1[/* a */ js.Any, _]): js.Function1[/* fns */ ComposeWithFns[_, _], js.Function1[/* x */ _, _]] = js.native
  def default[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: ComposeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
}

