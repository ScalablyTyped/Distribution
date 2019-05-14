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
  @JSName("getFragmentResolver")
  def getFragmentResolver_Fragment(
    fragment: /* import warning: ImportType.apply Failed type conversion: react-relay.react-relay/classic.RelayQuery['Fragment'] */ js.Any,
    onNext: js.Function0[scala.Unit]
  ): FragmentResolver = js.native
  def getStoreData(): RelayStoreData = js.native
  def primeCache(
    querySet: relayDashRuntimeLib.relayDashRuntimeMod.RelayQuerySet,
    onReadyStateChange: relayDashRuntimeLib.relayDashRuntimeMod.ReadyStateChangeCallback
  ): relayDashRuntimeLib.relayDashRuntimeMod.Abortable = js.native
  @JSName("readQuery")
  def readQuery_Root(
    root: /* import warning: ImportType.apply Failed type conversion: react-relay.react-relay/classic.RelayQuery['Root'] */ js.Any
  ): js.Array[StoreReaderData] | scala.Unit = js.native
  @JSName("readQuery")
  def readQuery_Root(
    root: /* import warning: ImportType.apply Failed type conversion: react-relay.react-relay/classic.RelayQuery['Root'] */ js.Any,
    options: StoreReaderOptions
  ): js.Array[StoreReaderData] | scala.Unit = js.native
  @JSName("read")
  def read_Node(
    node: /* import warning: ImportType.apply Failed type conversion: react-relay.react-relay/classic.RelayQuery['Node'] */ js.Any,
    dataID: relayDashRuntimeLib.relayDashRuntimeMod.DataID
  ): StoreReaderData | scala.Unit = js.native
  @JSName("read")
  def read_Node(
    node: /* import warning: ImportType.apply Failed type conversion: react-relay.react-relay/classic.RelayQuery['Node'] */ js.Any,
    dataID: relayDashRuntimeLib.relayDashRuntimeMod.DataID,
    options: StoreReaderOptions
  ): StoreReaderData | scala.Unit = js.native
}

