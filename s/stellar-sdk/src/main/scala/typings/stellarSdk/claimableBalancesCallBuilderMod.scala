package typings.stellarSdk

import typings.stellarBase.mod.Asset
import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.ClaimableBalanceRecord
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object claimableBalancesCallBuilderMod {
  
  @JSImport("stellar-sdk/lib/claimable_balances_call_builder", "ClaimableBalanceCallBuilder")
  @js.native
  class ClaimableBalanceCallBuilder protected () extends CallBuilder[CollectionPage[ClaimableBalanceRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def asset(asset: Asset): this.type = js.native
    
    def claimableBalance(claimableBalanceId: String): CallBuilder[ClaimableBalanceRecord] = js.native
    
    def claimant(claimant: String): this.type = js.native
    
    def sponsor(sponsor: String): this.type = js.native
  }
}
