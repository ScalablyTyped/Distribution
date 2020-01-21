package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.serverApiMod.ServerApi.PaymentPathRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_send_path_call_builder", JSImport.Namespace)
@js.native
object strictSendPathCallBuilderMod extends js.Object {
  @js.native
  class StrictSendPathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(serverUrl: URI, sourceAsset: Asset, sourceAmount: String, destination: String) = this()
    def this(serverUrl: URI, sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]) = this()
  }
  
}

