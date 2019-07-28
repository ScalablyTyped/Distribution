package typings.rxjs.internalObservableRaceMod

import typings.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", "RaceSubscriber")
@js.native
class RaceSubscriber[T] protected () extends OuterSubscriber[T, T] {
  def this(destination: Subscriber[T]) = this()
  var hasFirst: js.Any = js.native
  var observables: js.Any = js.native
  var subscriptions: js.Any = js.native
  /* protected */ def _next(observable: js.Any): Unit = js.native
}

