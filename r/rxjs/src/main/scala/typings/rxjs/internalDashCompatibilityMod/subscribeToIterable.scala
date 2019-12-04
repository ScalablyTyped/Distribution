package typings.rxjs.internalDashCompatibilityMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeToIterable")
@js.native
object subscribeToIterable extends js.Object {
  def apply[T](iterable: Iterable[T]): js.Function1[
    /* subscriber */ typings.rxjs.internalSubscriberMod.Subscriber[T], 
    typings.rxjs.internalSubscriberMod.Subscriber[T]
  ] = js.native
}

