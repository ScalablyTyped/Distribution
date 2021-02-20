package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.AccountRecord
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/account_call_builder", "AccountCallBuilder")
  @js.native
  class AccountCallBuilder protected () extends CallBuilder[CollectionPage[AccountRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def accountId(id: String): CallBuilder[AccountRecord] = js.native
    
    def forAsset(asset: Asset): this.type = js.native
    
    def forSigner(id: String): this.type = js.native
    
    def sponsor(id: String): this.type = js.native
  }
}
