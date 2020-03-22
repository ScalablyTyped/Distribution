package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.serverApiMod.ServerApi.OfferRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/offer_call_builder", JSImport.Namespace)
@js.native
object offerCallBuilderMod extends js.Object {
  @js.native
  class OfferCallBuilder protected () extends CallBuilder[CollectionPage[OfferRecord]] {
    def this(serverUrl: URI) = this()
    def buying(asset: Asset): this.type = js.native
    def forAccount(id: String): this.type = js.native
    def offer(offerId: String): CallBuilder[OfferRecord] = js.native
    def selling(asset: Asset): this.type = js.native
  }
  
}

