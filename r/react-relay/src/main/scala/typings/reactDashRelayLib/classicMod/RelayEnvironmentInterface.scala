package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayEnvironmentInterface extends js.Object {
  def forceFetch(
    querySet: relayDashRuntimeLib.relayDashRuntimeMod.RelayQuerySet,
    onReadyStateChange: relayDashRuntimeLib.relayDashRuntimeMod.ReadyStateChangeCallback
  ): relayDashRuntimeLib.relayDashRuntimeMod.Abortable = js.native
  def getFragmentResolver(fragment: js.Any, onNext: js.Function0[scala.Unit]): FragmentResolver = js.native
  def getStoreData(): RelayStoreData = js.native
  def primeCache(
    querySet: relayDashRuntimeLib.relayDashRuntimeMod.RelayQuerySet,
    onReadyStateChange: relayDashRuntimeLib.relayDashRuntimeMod.ReadyStateChangeCallback
  ): relayDashRuntimeLib.relayDashRuntimeMod.Abortable = js.native
  def read(node: js.Any, dataID: relayDashRuntimeLib.relayDashRuntimeMod.DataID): StoreReaderData | scala.Unit = js.native
  def read(node: js.Any, dataID: relayDashRuntimeLib.relayDashRuntimeMod.DataID, options: StoreReaderOptions): StoreReaderData | scala.Unit = js.native
  def readQuery(root: js.Any): js.Array[StoreReaderData] | scala.Unit = js.native
  def readQuery(root: js.Any, options: StoreReaderOptions): js.Array[StoreReaderData] | scala.Unit = js.native
}

