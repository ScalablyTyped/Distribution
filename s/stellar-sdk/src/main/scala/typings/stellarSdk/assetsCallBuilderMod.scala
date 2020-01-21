package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.AssetRecord
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/assets_call_builder", JSImport.Namespace)
@js.native
object assetsCallBuilderMod extends js.Object {
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: URI) = this()
    def forCode(value: String): AssetsCallBuilder = js.native
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
  
}

