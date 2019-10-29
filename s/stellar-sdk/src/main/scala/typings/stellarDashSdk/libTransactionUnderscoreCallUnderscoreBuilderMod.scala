package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.TransactionRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/transaction_call_builder", JSImport.Namespace)
@js.native
object libTransactionUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class TransactionCallBuilder protected () extends CallBuilder[CollectionPage[TransactionRecord]] {
    def this(serverUrl: URI) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def includeFailed(value: Boolean): this.type = js.native
    def transaction(transactionId: String): this.type = js.native
  }
  
}

