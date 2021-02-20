package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.AssetRecord
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/assets_call_builder", "AssetsCallBuilder")
  @js.native
  class AssetsCallBuilder protected () extends CallBuilder[CollectionPage[AssetRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def forCode(value: String): AssetsCallBuilder = js.native
    
    def forIssuer(value: String): AssetsCallBuilder = js.native
  }
}
