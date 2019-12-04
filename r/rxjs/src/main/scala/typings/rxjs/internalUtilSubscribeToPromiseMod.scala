package typings.rxjs

import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/subscribeToPromise", JSImport.Namespace)
@js.native
object internalUtilSubscribeToPromiseMod extends js.Object {
  def subscribeToPromise[T](promise: js.Thenable[T]): js.Function1[/* subscriber */ Subscriber[T], Subscriber[T]] = js.native
}

