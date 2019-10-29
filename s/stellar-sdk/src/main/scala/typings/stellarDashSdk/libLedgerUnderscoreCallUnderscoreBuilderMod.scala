package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.LedgerRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/ledger_call_builder", JSImport.Namespace)
@js.native
object libLedgerUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class LedgerCallBuilder protected () extends CallBuilder[CollectionPage[LedgerRecord]] {
    def this(serverUrl: URI) = this()
    def ledger(sequence: String): this.type = js.native
    def ledger(sequence: Double): this.type = js.native
  }
  
}

