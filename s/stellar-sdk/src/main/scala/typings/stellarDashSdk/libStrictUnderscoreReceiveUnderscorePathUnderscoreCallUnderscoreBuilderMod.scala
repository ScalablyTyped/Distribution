package typings.stellarDashSdk

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentPathRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/strict_receive_path_call_builder", JSImport.Namespace)
@js.native
object libStrictUnderscoreReceiveUnderscorePathUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class StrictReceivePathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(serverUrl: URI, source: String, destinationAsset: Asset, destinationAmount: String) = this()
    def this(serverUrl: URI, source: js.Array[Asset], destinationAsset: Asset, destinationAmount: String) = this()
  }
  
}

