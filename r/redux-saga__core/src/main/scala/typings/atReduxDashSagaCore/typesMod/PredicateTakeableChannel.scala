package typings.atReduxDashSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredicateTakeableChannel[T] extends js.Object {
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  def take(
    cb: js.Function1[/* message */ T | END, Unit],
    matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ js.Any
  ): Unit = js.native
}

