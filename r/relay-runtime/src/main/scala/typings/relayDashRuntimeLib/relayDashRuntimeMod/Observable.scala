package typings
package relayDashRuntimeLib.relayDashRuntimeMod

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
  def create[V](source: relayDashRuntimeLib.relayDashRuntimeMod.Source[V]): relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V] = js.native
  def from[V](obj: relayDashRuntimeLib.relayDashRuntimeMod.ObservableFromValue[V]): relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V] = js.native
  def fromLegacy[V](
    callback: js.Function1[
      /* observer */ relayDashRuntimeLib.relayDashRuntimeMod.LegacyObserver[V], 
      relayDashRuntimeLib.relayDashRuntimeMod.Disposable | relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V]
    ]
  ): relayDashRuntimeLib.relayDashRuntimeMod.RelayObservable[V] = js.native
  def onUnhandledError(
    callback: js.Function2[/* error */ stdLib.Error, /* isUncaughtThrownError */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
}

