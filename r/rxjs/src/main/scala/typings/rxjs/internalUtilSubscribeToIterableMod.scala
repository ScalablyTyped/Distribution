package typings.rxjs

import typings.rxjs.internalSubscriberMod.Subscriber
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToIterable", JSImport.Namespace)
@js.native
object internalUtilSubscribeToIterableMod extends js.Object {
  def subscribeToIterable[T](iterable: Iterable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

