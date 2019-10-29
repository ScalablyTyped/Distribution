package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OfferRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/offer_call_builder", JSImport.Namespace)
@js.native
object libOfferUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class OfferCallBuilder protected () extends CallBuilder[CollectionPage[OfferRecord]] {
    def this(serverUrl: URI, resource: String, resourceParams: String*) = this()
  }
  
}

