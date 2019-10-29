package typings.stellarDashSdk

import typings.stellarDashSdk.libCallUnderscoreBuilderMod.CallBuilder
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentOperationRecord
import typings.urijs.uri.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/payment_call_builder", JSImport.Namespace)
@js.native
object libPaymentUnderscoreCallUnderscoreBuilderMod extends js.Object {
  @js.native
  class PaymentCallBuilder protected () extends CallBuilder[CollectionPage[PaymentOperationRecord]] {
    def this(serverUrl: URI) = this()
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
}

