package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNetworkRelayObservableMod {
  type ObservableFromValue[T] = Subscribable[T] | js.Promise[T] | T
  type Source[T] = js.Function1[/* sink */ Sink[T], Unit | Subscription | js.Function0[js.Any]]
}
