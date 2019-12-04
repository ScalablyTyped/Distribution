package typings.stellarDashSdk

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentPathRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_send_path_call_builder", JSImport.Namespace)
@js.native
object libStrictUnderscoreSendUnderscorePathUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class StrictSendPathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(serverUrl: URI, sourceAsset: Asset, sourceAmount: String, destination: String) = this()
    def this(serverUrl: URI, sourceAsset: Asset, sourceAmount: String, destination: js.Array[Asset]) = this()
  }
  
}

