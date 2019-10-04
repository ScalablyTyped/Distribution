package typings.relayDashRuntime.libStoreRelayResponseNormalizerMod

import typings.relayDashRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RelayResponsePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/store/RelayResponseNormalizer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = js.native
}

