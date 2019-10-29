package typings.stellarDashSdk

import typings.stellarDashBase.stellarDashBaseMod.Asset
import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OrderbookRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/orderbook_call_builder", JSImport.Namespace)
@js.native
object libOrderbookUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class OrderbookCallBuilder protected () extends CallBuilder[OrderbookRecord] {
    def this(serverUrl: URI, selling: Asset, buying: Asset) = this()
  }
  
}

