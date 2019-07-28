package typings.relayDashRuntime.relayDashRuntimeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./network/RelayObservable
@JSImport("relay-runtime", "Observable")
@js.native
class Observable[T] protected () extends RelayObservable[T] {
  // Use RelayObservable.create(source);
  protected def this(source: scala.Nothing) = this()
}

/* static members */
@JSImport("relay-runtime", "Observable")
@js.native
object Observable extends js.Object {
  def create[V](source: Source[V]): RelayObservable[V] = js.native
  def from[V](obj: ObservableFromValue[V]): RelayObservable[V] = js.native
  def fromLegacy[V](callback: js.Function1[/* observer */ LegacyObserver[V], Disposable | RelayObservable[V]]): RelayObservable[V] = js.native
  def onUnhandledError(callback: js.Function2[/* error */ Error, /* isUncaughtThrownError */ Boolean, Unit]): Unit = js.native
}

