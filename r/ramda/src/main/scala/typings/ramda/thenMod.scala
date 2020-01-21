package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/then", JSImport.Namespace)
@js.native
object thenMod extends js.Object {
  def default[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  def default[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
}

