package typings.stellarDashSdk

import typings.stellarDashSdk.libAssetsUnderscoreCallUnderscoreBuilderMod.AssetsCallBuilder
import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AssetRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/assets_call_builder", JSImport.Namespace)
@js.native
object libAssetsUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: URI) = this()
    def forCode(value: String): AssetsCallBuilder = js.native
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
  
}

