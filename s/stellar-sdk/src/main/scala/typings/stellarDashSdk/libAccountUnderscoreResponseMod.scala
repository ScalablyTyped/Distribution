package typings.stellarDashSdk

import typings.std.Record
import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.AccountThresholds
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.BalanceLine
import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.Flags
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AccountRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.AccountRecordSigners
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CallFunctionTemplateOptions
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.CollectionPage
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.EffectRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OfferRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.OperationRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.PaymentOperationRecord
import typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi.TradeRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/account_response", JSImport.Namespace)
@js.native
object libAccountUnderscoreResponseMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord extends any ? std.Pick<stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, utility-types.utility-types/dist/mapped-types.SetComplement<keyof stellar-sdk.stellar-sdk/lib/server_api.ServerApi.AccountRecord, '_links'>> : never */ @js.native
  class AccountResponse protected () extends js.Object {
    def this(response: AccountRecord) = this()
    val _baseAccount: js.Any = js.native
    val account_id: String = js.native
    val balances: js.Array[BalanceLine[AssetType]] = js.native
    val data_attr: Record[String, String] = js.native
    val flags: Flags = js.native
    val id: String = js.native
    val inflation_destination: String = js.native
    val last_modified_ledger: Double = js.native
    val paging_token: String = js.native
    var sequence: String = js.native
    val signers: js.Array[AccountRecordSigners] = js.native
    val subentry_count: Double = js.native
    val thresholds: AccountThresholds = js.native
    def accountId(): String = js.native
    def data(options: Anon_Value): js.Promise[Anon_Value] = js.native
    def effects(): js.Promise[CollectionPage[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[EffectRecord]] = js.native
    def incrementSequenceNumber(): Unit = js.native
    def offers(): js.Promise[CollectionPage[OfferRecord]] = js.native
    def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OfferRecord]] = js.native
    def operations(): js.Promise[CollectionPage[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[OperationRecord]] = js.native
    def payments(): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[PaymentOperationRecord]] = js.native
    def sequenceNumber(): String = js.native
    def trades(): js.Promise[CollectionPage[TradeRecord]] = js.native
    def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionPage[TradeRecord]] = js.native
  }
  
}

