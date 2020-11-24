package typings.stellarSdk

import typings.stellarSdk.callBuilderMod.CallBuilder
import typings.stellarSdk.serverApiMod.ServerApi.CollectionPage
import typings.stellarSdk.serverApiMod.ServerApi.LedgerRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/ledger_call_builder", JSImport.Namespace)
@js.native
object ledgerCallBuilderMod extends js.Object {
  
  @js.native
  class LedgerCallBuilder protected () extends CallBuilder[CollectionPage[LedgerRecord]] {
    def this(serverUrl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URI */ js.Any) = this()
    
    def ledger(sequence: String): this.type = js.native
    def ledger(sequence: Double): this.type = js.native
  }
}
