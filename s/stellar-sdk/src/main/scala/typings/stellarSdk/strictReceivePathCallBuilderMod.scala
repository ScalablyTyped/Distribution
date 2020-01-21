package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.serverApiMod.ServerApi.PaymentPathRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_receive_path_call_builder", JSImport.Namespace)
@js.native
object strictReceivePathCallBuilderMod extends js.Object {
  @js.native
  class StrictReceivePathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(serverUrl: URI, source: String, destinationAsset: Asset, destinationAmount: String) = this()
    def this(serverUrl: URI, source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String) = this()
  }
  
}

