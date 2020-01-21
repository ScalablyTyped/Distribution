package typings.stellarSdk

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
    def this(serverUrl: URI, resource: String, resourceParams: String*) = this()
  }
  
}

