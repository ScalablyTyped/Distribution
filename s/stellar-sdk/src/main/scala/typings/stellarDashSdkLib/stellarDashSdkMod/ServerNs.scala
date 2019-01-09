package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
object ServerNs extends js.Object {
  @js.native
  abstract class AccountCallBuilder () extends CallBuilder[AccountRecord] {
    def accountId(id: java.lang.String): this.type = js.native
  }
  
  @js.native
  trait AccountMergeOperationRecord extends BaseOperationRecord {
    var into: java.lang.String = js.native
    @JSName("type")
    var type_AccountMergeOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.account_merge = js.native
  }
  
  @js.native
  trait AccountRecord extends Record {
    var account_id: java.lang.String = js.native
    var balances: js.Array[BalanceLine[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE]] = js.native
    var data_attr: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var flags: stellarDashSdkLib.Anon_Authrequired = js.native
    var id: java.lang.String = js.native
    @JSName("offers")
    var offers_Original: CallCollectionFunction[OfferRecord] = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    var paging_token: java.lang.String = js.native
    @JSName("payments")
    var payments_Original: CallCollectionFunction[PaymentOperationRecord] = js.native
    var sequence: scala.Double = js.native
    var signers: js.Array[stellarDashSdkLib.Anon_Publickey] = js.native
    var subentry_count: scala.Double = js.native
    var thresholds: stellarDashSdkLib.Anon_Highthreshold = js.native
    @JSName("trades")
    var trades_Original: CallCollectionFunction[TradeRecord] = js.native
    def data(options: stellarDashSdkLib.Anon_Value): js.Promise[stellarDashSdkLib.Anon_Value] = js.native
    def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def offers(): js.Promise[CollectionRecord[OfferRecord]] = js.native
    def offers(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OfferRecord]] = js.native
    def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def payments(): js.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
    def payments(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[PaymentOperationRecord]] = js.native
    def trades(): js.Promise[CollectionRecord[TradeRecord]] = js.native
    def trades(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[TradeRecord]] = js.native
  }
  
  @js.native
  class AccountResponse protected () extends AccountRecord {
    def this(response: AccountRecord) = this()
    /* CompleteClass */
    override var _links: org.scalablytyped.runtime.StringDictionary[RecordLink] = js.native
    @JSName("_links")
    var _links_AccountResponse: org.scalablytyped.runtime.StringDictionary[stellarDashSdkLib.Anon_Href] = js.native
    var inflation_destination: js.UndefOr[js.Any] = js.native
    def accountId(): java.lang.String = js.native
    def incrementSequenceNumber(): scala.Unit = js.native
    def sequenceNumber(): java.lang.String = js.native
  }
  
  @js.native
  trait AllowTrustOperationRecord extends BaseOperationRecord {
    var asset_code: java.lang.String = js.native
    var asset_issuer: java.lang.String = js.native
    var asset_type: java.lang.String = js.native
    var authorize: scala.Boolean = js.native
    var trustee: java.lang.String = js.native
    var trustor: java.lang.String = js.native
    @JSName("type")
    var type_AllowTrustOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.allow_trust = js.native
  }
  
  trait AssetRecord extends Record {
    var amount: java.lang.String
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE
    var flags: stellarDashSdkLib.Anon_Authrequired
    var num_accounts: scala.Double
    var paging_token: java.lang.String
  }
  
  @js.native
  abstract class AssetsCallBuilder () extends CallBuilder[AssetRecord] {
    def forCode(value: java.lang.String): this.type = js.native
    def forIssuer(value: java.lang.String): this.type = js.native
  }
  
  trait BalanceLineAsset[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE */] extends js.Object {
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: T
    var balance: java.lang.String
    var limit: java.lang.String
  }
  
  trait BalanceLineNative extends js.Object {
    var asset_type: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE
    var balance: java.lang.String
  }
  
  @js.native
  trait BaseOperationRecord extends Record {
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var id: java.lang.String = js.native
    var paging_token: java.lang.String = js.native
    @JSName("precedes")
    var precedes_Original: CallFunction[OperationRecord] = js.native
    @JSName("self")
    var self_Original: CallFunction[OperationRecord] = js.native
    var source_account: java.lang.String = js.native
    @JSName("succeeds")
    var succeeds_Original: CallFunction[OperationRecord] = js.native
    @JSName("transaction")
    var transaction_Original: CallFunction[TransactionRecord] = js.native
    var `type`: java.lang.String = js.native
    var type_i: scala.Double = js.native
    def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def precedes(): js.Promise[OperationRecord] = js.native
    def self(): js.Promise[OperationRecord] = js.native
    def succeeds(): js.Promise[OperationRecord] = js.native
    def transaction(): js.Promise[TransactionRecord] = js.native
  }
  
  @js.native
  trait BumpSequenceOperationRecord extends BaseOperationRecord {
    var bump_to: java.lang.String = js.native
    @JSName("type")
    var type_BumpSequenceOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.bump_sequence = js.native
  }
  
  @js.native
  abstract class CallBuilder[T /* <: Record */] protected () extends js.Object {
    def this(serverUrl: java.lang.String) = this()
    def call(): js.Promise[CollectionPage[T]] = js.native
    def cursor(cursor: java.lang.String): this.type = js.native
    def limit(limit: java.lang.String): this.type = js.native
    def limit(limit: scala.Double): this.type = js.native
    @JSName("order")
    def order_asc(direction: stellarDashSdkLib.stellarDashSdkLibStrings.asc): this.type = js.native
    @JSName("order")
    def order_desc(direction: stellarDashSdkLib.stellarDashSdkLibStrings.desc): this.type = js.native
    def stream(): js.Function0[scala.Unit] = js.native
    def stream(options: stellarDashSdkLib.Anon_Error[T]): js.Function0[scala.Unit] = js.native
  }
  
  trait CallFunctionTemplateOptions extends js.Object {
    var cursor: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var order: js.UndefOr[
        stellarDashSdkLib.stellarDashSdkLibStrings.asc | stellarDashSdkLib.stellarDashSdkLibStrings.desc
      ] = js.undefined
  }
  
  @js.native
  trait ChangeTrustOperationRecord extends BaseOperationRecord {
    var asset_code: java.lang.String = js.native
    var asset_issuer: java.lang.String = js.native
    var asset_type: java.lang.String = js.native
    var limit: java.lang.String = js.native
    var trustee: java.lang.String = js.native
    var trustor: java.lang.String = js.native
    @JSName("type")
    var type_ChangeTrustOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.change_trust = js.native
  }
  
  trait CollectionPage[T /* <: Record */] extends js.Object {
    var records: js.Array[T]
    def next(): js.Promise[CollectionPage[T]]
    def prev(): js.Promise[CollectionPage[T]]
  }
  
  /* Due to a bug with the recursive function requests */
  trait CollectionRecord[T /* <: Record */] extends js.Object {
    var _embedded: stellarDashSdkLib.Anon_Records[T]
    var _links: stellarDashSdkLib.Anon_Next
  }
  
  @js.native
  trait CreateAccountOperationRecord extends BaseOperationRecord {
    var account: java.lang.String = js.native
    var funder: java.lang.String = js.native
    var starting_balance: java.lang.String = js.native
    @JSName("type")
    var type_CreateAccountOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.create_account = js.native
  }
  
  @js.native
  abstract class EffectCallBuilder () extends CallBuilder[EffectRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forOperation(operationId: scala.Double): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  trait EffectRecord extends Record {
    var account: java.lang.String
    var amount: js.UndefOr[js.Any] = js.undefined
    var operation: js.UndefOr[CallFunction[OperationRecord]] = js.undefined
    var paging_token: java.lang.String
    var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
    var starting_balance: java.lang.String
    var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
    var `type`: java.lang.String
    var type_i: java.lang.String
  }
  
  @js.native
  trait InflationOperationRecord extends BaseOperationRecord {
    @JSName("type")
    var type_InflationOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.inflation = js.native
  }
  
  @js.native
  abstract class LedgerCallBuilder () extends CallBuilder[LedgerRecord]
  
  @js.native
  trait LedgerRecord extends Record {
    var base_fee: scala.Double = js.native
    var base_fee_in_stroops: scala.Double = js.native
    var base_reserve: java.lang.String = js.native
    var base_reserve_in_stroops: scala.Double = js.native
    var closed_at: java.lang.String = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var fee_pool: java.lang.String = js.native
    var hash: java.lang.String = js.native
    var header_xdr: java.lang.String = js.native
    var id: java.lang.String = js.native
    var max_tx_set_size: scala.Double = js.native
    var operation_count: scala.Double = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    var paging_token: java.lang.String = js.native
    var prev_hash: java.lang.String = js.native
    var protocol_version: scala.Double = js.native
    @JSName("self")
    var self_Original: CallFunction[LedgerRecord] = js.native
    var sequence: scala.Double = js.native
    var total_coins: java.lang.String = js.native
    var transaction_count: scala.Double = js.native
    @JSName("transactions")
    var transactions_Original: CallCollectionFunction[TransactionRecord] = js.native
    def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def self(): js.Promise[LedgerRecord] = js.native
    def transactions(): js.Promise[CollectionRecord[TransactionRecord]] = js.native
    def transactions(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[TransactionRecord]] = js.native
  }
  
  @js.native
  trait ManageDataOperationRecord extends BaseOperationRecord {
    var name: java.lang.String = js.native
    @JSName("type")
    var type_ManageDataOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.manage_data = js.native
    var value: nodeLib.Buffer = js.native
  }
  
  @js.native
  trait ManageOfferOperationRecord extends BaseOperationRecord {
    var amount: java.lang.String = js.native
    var buying_asset_code: js.UndefOr[java.lang.String] = js.native
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var buying_asset_type: java.lang.String = js.native
    var offer_id: scala.Double = js.native
    var price: java.lang.String = js.native
    var price_r: stellarDashSdkLib.Anon_Denominator = js.native
    var selling_asset_code: js.UndefOr[java.lang.String] = js.native
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var selling_asset_type: java.lang.String = js.native
    @JSName("type")
    var type_ManageOfferOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.manage_offer = js.native
  }
  
  @js.native
  abstract class OfferCallBuilder () extends CallBuilder[OfferRecord]
  
  trait OfferRecord extends Record {
    var amount: java.lang.String
    var buying: stellarDashSdkLib.stellarDashSdkMod.Asset
    var id: java.lang.String
    var paging_token: java.lang.String
    var price: java.lang.String
    var price_r: stellarDashSdkLib.Anon_Denominator
    var seller: js.UndefOr[CallFunction[AccountRecord]] = js.undefined
    var seller_attr: java.lang.String
    var selling: stellarDashSdkLib.stellarDashSdkMod.Asset
  }
  
  @js.native
  abstract class OperationCallBuilder () extends CallBuilder[OperationRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  trait Options extends js.Object {
    var allowHttp: scala.Boolean
  }
  
  @js.native
  abstract class OrderbookCallBuilder () extends CallBuilder[OrderbookRecord]
  
  trait OrderbookRecord extends Record {
    var asks: js.Array[stellarDashSdkLib.Anon_Amount]
    var bids: js.Array[stellarDashSdkLib.Anon_Amount]
    var buying: stellarDashSdkLib.stellarDashSdkMod.Asset
    var selling: stellarDashSdkLib.stellarDashSdkMod.Asset
  }
  
  @js.native
  trait PassiveOfferOperationRecord extends BaseOperationRecord {
    var amount: java.lang.String = js.native
    var buying_asset_code: js.UndefOr[java.lang.String] = js.native
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var buying_asset_type: java.lang.String = js.native
    var offer_id: scala.Double = js.native
    var price: java.lang.String = js.native
    var price_r: stellarDashSdkLib.Anon_Denominator = js.native
    var selling_asset_code: js.UndefOr[java.lang.String] = js.native
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var selling_asset_type: java.lang.String = js.native
    @JSName("type")
    var type_PassiveOfferOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.create_passive_offer = js.native
  }
  
  @js.native
  abstract class PathCallBuilder () extends CallBuilder[PaymentPathRecord]
  
  @js.native
  trait PathPaymentOperationRecord extends BaseOperationRecord {
    var amount: java.lang.String = js.native
    var asset_code: js.UndefOr[java.lang.String] = js.native
    var asset_issuer: js.UndefOr[java.lang.String] = js.native
    var asset_type: java.lang.String = js.native
    var from: java.lang.String = js.native
    var source_amount: java.lang.String = js.native
    var source_asset_code: js.UndefOr[java.lang.String] = js.native
    var source_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var source_asset_type: java.lang.String = js.native
    var source_max: java.lang.String = js.native
    var to: java.lang.String = js.native
    @JSName("type")
    var type_PathPaymentOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.path_payment = js.native
  }
  
  @js.native
  abstract class PaymentCallBuilder () extends CallBuilder[PaymentOperationRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  @js.native
  trait PaymentOperationRecord extends BaseOperationRecord {
    var amount: java.lang.String = js.native
    var asset_code: js.UndefOr[java.lang.String] = js.native
    var asset_issuer: js.UndefOr[java.lang.String] = js.native
    var asset_type: java.lang.String = js.native
    var from: java.lang.String = js.native
    @JSName("receiver")
    var receiver_Original: CallFunction[AccountRecord] = js.native
    @JSName("sender")
    var sender_Original: CallFunction[AccountRecord] = js.native
    var to: java.lang.String = js.native
    @JSName("type")
    var type_PaymentOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.payment = js.native
    def receiver(): js.Promise[AccountRecord] = js.native
    def sender(): js.Promise[AccountRecord] = js.native
  }
  
  trait PaymentPathRecord extends Record {
    var destination_amount: java.lang.String
    var destination_asset_code: java.lang.String
    var destination_asset_issuer: java.lang.String
    var destination_asset_type: java.lang.String
    var path: js.Array[stellarDashSdkLib.Anon_Assetcode]
    var source_amount: java.lang.String
    var source_asset_code: java.lang.String
    var source_asset_issuer: java.lang.String
    var source_asset_type: java.lang.String
  }
  
  trait Record extends js.Object {
    var _links: org.scalablytyped.runtime.StringDictionary[RecordLink]
  }
  
  trait RecordLink extends js.Object {
    var href: java.lang.String
    var templated: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  trait SetOptionsOperationRecord extends BaseOperationRecord {
    var clear_flags: js.Array[
        stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
      ] = js.native
    var clear_flags_s: js.Array[
        stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
      ] = js.native
    var high_threshold: js.UndefOr[scala.Double] = js.native
    var home_domain: js.UndefOr[java.lang.String] = js.native
    var low_threshold: js.UndefOr[scala.Double] = js.native
    var master_key_weight: js.UndefOr[scala.Double] = js.native
    var med_threshold: js.UndefOr[scala.Double] = js.native
    var set_flags: js.Array[
        stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
      ] = js.native
    var set_flags_s: js.Array[
        stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
      ] = js.native
    var signer_key: js.UndefOr[java.lang.String] = js.native
    var signer_weight: js.UndefOr[scala.Double] = js.native
    @JSName("type")
    var type_SetOptionsOperationRecord: stellarDashSdkLib.stellarDashSdkLibStrings.set_options = js.native
  }
  
  @js.native
  abstract class TradeAggregationCallBuilder () extends CallBuilder[TradeAggregationRecord]
  
  trait TradeAggregationRecord extends Record {
    var avg: java.lang.String
    var base_volume: java.lang.String
    var close: java.lang.String
    var counter_volume: java.lang.String
    var high: java.lang.String
    var low: java.lang.String
    var open: java.lang.String
    var timestamp: java.lang.String
    var trade_count: scala.Double
  }
  
  @js.native
  trait TradeRecord extends Record {
    @JSName("base")
    var base_Original: CallFunction[AccountRecord] = js.native
    var base_account: java.lang.String = js.native
    var base_amount: java.lang.String = js.native
    var base_asset_code: java.lang.String = js.native
    var base_asset_issuer: java.lang.String = js.native
    var base_asset_type: java.lang.String = js.native
    var base_is_seller: scala.Boolean = js.native
    @JSName("counter")
    var counter_Original: CallFunction[AccountRecord] = js.native
    var counter_account: java.lang.String = js.native
    var counter_amount: java.lang.String = js.native
    var counter_asset_code: java.lang.String = js.native
    var counter_asset_issuer: java.lang.String = js.native
    var counter_asset_type: java.lang.String = js.native
    var id: java.lang.String = js.native
    var ledger_close_time: java.lang.String = js.native
    @JSName("operation")
    var operation_Original: CallFunction[OperationRecord] = js.native
    var paging_token: java.lang.String = js.native
    def base(): js.Promise[AccountRecord] = js.native
    def counter(): js.Promise[AccountRecord] = js.native
    def operation(): js.Promise[OperationRecord] = js.native
  }
  
  @js.native
  abstract class TradesCallBuilder () extends CallBuilder[TradeRecord] {
    def forAssetPair(
      base: stellarDashSdkLib.stellarDashSdkMod.Asset,
      counter: stellarDashSdkLib.stellarDashSdkMod.Asset
    ): this.type = js.native
    def forOffer(offerId: java.lang.String): this.type = js.native
  }
  
  @js.native
  abstract class TransactionCallBuilder () extends CallBuilder[TransactionRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forLedger(sequence: scala.Double): this.type = js.native
    def transaction(transactionId: java.lang.String): this.type = js.native
  }
  
  @js.native
  trait TransactionRecord extends Record {
    @JSName("account")
    var account_Original: CallFunction[AccountRecord] = js.native
    var created_at: java.lang.String = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var envelope: js.Any = js.native
    var envelope_xdr: java.lang.String = js.native
    var fee_paid: scala.Double = js.native
    var hash: java.lang.String = js.native
    var id: java.lang.String = js.native
    @JSName("ledger")
    var ledger_Original: CallFunction[LedgerRecord] = js.native
    var ledger_attr: scala.Double = js.native
    var max_fee: scala.Double = js.native
    var memo: java.lang.String = js.native
    var memo_type: js.Any = js.native
    var operation_count: scala.Double = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    var paging_token: java.lang.String = js.native
    @JSName("precedes")
    var precedes_Original: CallFunction[TransactionRecord] = js.native
    var result_code: scala.Double = js.native
    var result_code_s: java.lang.String = js.native
    var result_meta_xdr: java.lang.String = js.native
    var result_xdr: java.lang.String = js.native
    @JSName("self")
    var self_Original: CallFunction[TransactionRecord] = js.native
    var source_account: java.lang.String = js.native
    var source_account_sequence: java.lang.String = js.native
    @JSName("succeeds")
    var succeeds_Original: CallFunction[TransactionRecord] = js.native
    def account(): js.Promise[AccountRecord] = js.native
    def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def ledger(): js.Promise[LedgerRecord] = js.native
    def operations(): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def operations(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[OperationRecord]] = js.native
    def precedes(): js.Promise[TransactionRecord] = js.native
    def self(): js.Promise[TransactionRecord] = js.native
    def succeeds(): js.Promise[TransactionRecord] = js.native
  }
  
  type BalanceLine[T /* <: stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE */] = BalanceLineNative | BalanceLineAsset[stellarDashSdkLib.stellarDashSdkMod.StellarBaseNs.ASSET_TYPE] | BalanceLineAsset[T]
  type CallCollectionFunction[T /* <: Record */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    js.Promise[CollectionRecord[T]]
  ]
  type CallFunction[T /* <: Record */] = js.Function0[js.Promise[T]]
  type OperationRecord = CreateAccountOperationRecord | PaymentOperationRecord | PathPaymentOperationRecord | ManageOfferOperationRecord | PassiveOfferOperationRecord | SetOptionsOperationRecord | ChangeTrustOperationRecord | AllowTrustOperationRecord | AccountMergeOperationRecord | InflationOperationRecord | ManageDataOperationRecord | BumpSequenceOperationRecord
}

