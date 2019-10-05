package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SingularReaderSelector
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.DataID
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "createReaderSelector")
@js.native
object createReaderSelector extends js.Object {
  def apply(fragment: ReaderFragment, dataID: DataID, variables: Variables, request: RequestDescriptor): SingularReaderSelector = js.native
}

