package typings
package rxjsLib.internalObservableRaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/race", "RaceSubscriber")
@js.native
class RaceSubscriber[T] protected ()
  extends rxjsLib.internalOuterSubscriberMod.OuterSubscriber[T, T] {
  def this(destination: rxjsLib.internalSubscriberMod.Subscriber[T]) = this()
  var hasFirst: js.Any = js.native
  var observables: js.Any = js.native
  var subscriptions: js.Any = js.native
  /* protected */ def _next(observable: js.Any): scala.Unit = js.native
}

