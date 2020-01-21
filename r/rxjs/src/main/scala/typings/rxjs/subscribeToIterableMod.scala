package typings.rxjs

import typings.rxjs.subscriberMod.Subscriber
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToIterable", JSImport.Namespace)
@js.native
object subscribeToIterableMod extends js.Object {
  def subscribeToIterable[T](iterable: Iterable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

