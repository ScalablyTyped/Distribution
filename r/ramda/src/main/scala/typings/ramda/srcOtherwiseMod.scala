package typings.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/otherwise", JSImport.Namespace)
@js.native
object srcOtherwiseMod extends js.Object {
  def default[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  def default[A, B](onError: js.Function1[/* error */ js.Any, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
}

