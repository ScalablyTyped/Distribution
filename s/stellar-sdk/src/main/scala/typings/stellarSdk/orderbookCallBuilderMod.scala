package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.OrderbookRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/orderbook_call_builder", JSImport.Namespace)
@js.native
object orderbookCallBuilderMod extends js.Object {
  @js.native
  class OrderbookCallBuilder protected () extends CallBuilder[OrderbookRecord] {
    def this(serverUrl: URI, selling: Asset, buying: Asset) = this()
  }
  
}

