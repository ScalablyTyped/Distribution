package typings.stellarDashSdk

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentPathRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/path_call_builder", JSImport.Namespace)
@js.native
object libPathUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class PathCallBuilder protected () extends CallBuilder[CollectionPage[PaymentPathRecord]] {
    def this(
      serverUrl: URI,
      source: String,
      destination: String,
      destinationAsset: Asset,
      destinationAmount: String
    ) = this()
  }
  
}

