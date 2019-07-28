package typings.stellarDashSdk.stellarDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit12
import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit4
import typings.stellarDashSdk.Anon_Amount
import typings.stellarDashSdk.Anon_Assetcode
import typings.stellarDashSdk.Anon_Error
import typings.stellarDashSdk.Anon_Next
import typings.stellarDashSdk.Anon_Publickey
import typings.stellarDashSdk.Anon_Records
import typings.stellarDashSdk.Anon_Value
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AccountSigner
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AccountThresholds
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BalanceLine
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BaseOperationResponse
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BaseResponse
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.Flags
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.accountMerge
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.allowTrust
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.bumpSequence
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.changeTrust
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.createAccount
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.createPassiveOffer
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.inflation
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.manageData
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.manageOffer
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.pathPayment
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.payment
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.setOptions
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.PriceR
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AccountRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AssetRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.BaseOperationRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CallBuilder
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CallCollectionFunction
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CallFunction
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CallFunctionTemplateOptions
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CollectionPage
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CollectionRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.EffectRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.LedgerRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OfferRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OperationRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.OrderbookRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PaymentOperationRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PaymentPathRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TradeAggregationRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TradeRecord
import typings.stellarDashSdk.stellarDashSdkMod.ServerNs.TransactionRecord
import typings.stellarDashSdk.stellarDashSdkNumbers.`1`
import typings.stellarDashSdk.stellarDashSdkNumbers.`2`
import typings.stellarDashSdk.stellarDashSdkStrings.asc
import typings.stellarDashSdk.stellarDashSdkStrings.auth_required_flag
import typings.stellarDashSdk.stellarDashSdkStrings.auth_revocable_flag
import typings.stellarDashSdk.stellarDashSdkStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server")
@js.native
object ServerNs extends js.Object {
  @js.native
  abstract class AccountCallBuilder () extends CallBuilder[AccountRecord] {
    def accountId(id: String): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
  trait AccountMergeOperationRecord
    extends BaseOperationRecord[
          accountMerge, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.accountMerge
        ]
       with OperationRecord {
    var into: String = js.native
  }
  
  @js.native
  trait AccountRecord
    extends BaseResponse[scala.Nothing] {
    var account_id: String = js.native
    var balances: js.Array[BalanceLine[AssetType]] = js.native
    var data_attr: StringDictionary[String] = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var flags: Flags = js.native
    var id: String = js.native
    @JSName("offers")
    var offers_Original: CallCollectionFunction[OfferRecord] = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    var paging_token: String = js.native
    @JSName("payments")
    var payments_Original: CallCollectionFunction[PaymentOperationRecord] = js.native
    var sequence: Double = js.native
    var signers: js.Array[Anon_Publickey] = js.native
    var subentry_count: Double = js.native
    var thresholds: AccountThresholds = js.native
    @JSName("trades")
    var trades_Original: CallCollectionFunction[TradeRecord] = js.native
    def data(options: Anon_Value): js.Promise[Anon_Value] = js.native
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
    override var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any = js.native
    @JSName("_links")
    var _links_AccountResponse: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ typings.stellarDashSdk.stellarDashSdkStrings.AccountResponse with js.Any = js.native
    var inflation_destination: js.UndefOr[js.Any] = js.native
    @JSName("signers")
    var signers_AccountResponse: js.Array[AccountSigner] = js.native
    def accountId(): String = js.native
    def incrementSequenceNumber(): Unit = js.native
    def sequenceNumber(): String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AllowTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, authorize, trustee, trustor */ @js.native
  trait AllowTrustOperationRecord
    extends BaseOperationRecord[
          allowTrust, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.allowTrust
        ]
       with OperationRecord {
    var asset_code: String = js.native
    var asset_issuer: String = js.native
    var asset_type: AssetType = js.native
    var authorize: Boolean = js.native
    var trustee: String = js.native
    var trustor: String = js.native
  }
  
  trait AssetRecord
    extends BaseResponse[scala.Nothing] {
    var amount: String
    var asset_code: String
    var asset_issuer: String
    var asset_type: credit4 | credit12
    var flags: Flags
    var num_accounts: Double
    var paging_token: String
  }
  
  @js.native
  abstract class AssetsCallBuilder () extends CallBuilder[AssetRecord] {
    def forCode(value: String): this.type = js.native
    def forIssuer(value: String): this.type = js.native
  }
  
  @js.native
  trait BaseOperationRecord[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseOperationResponse[T, TI] {
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    @JSName("precedes")
    var precedes_Original: CallFunction[OperationRecord] = js.native
    @JSName("self")
    var self_Original: CallFunction[OperationRecord] = js.native
    @JSName("succeeds")
    var succeeds_Original: CallFunction[OperationRecord] = js.native
    @JSName("transaction")
    var transaction_Original: CallFunction[TransactionRecord] = js.native
    def effects(): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def effects(options: CallFunctionTemplateOptions): js.Promise[CollectionRecord[EffectRecord]] = js.native
    def precedes(): js.Promise[OperationRecord] = js.native
    def self(): js.Promise[OperationRecord] = js.native
    def succeeds(): js.Promise[OperationRecord] = js.native
    def transaction(): js.Promise[TransactionRecord] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BumpSequenceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined bump_to */ @js.native
  trait BumpSequenceOperationRecord
    extends BaseOperationRecord[
          bumpSequence, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.bumpSequence
        ]
       with OperationRecord {
    var bump_to: String = js.native
  }
  
  @js.native
  abstract class CallBuilder[T /* <: BaseResponse[scala.Nothing] */] protected () extends js.Object {
    def this(serverUrl: String) = this()
    def call(): js.Promise[CollectionPage[T]] = js.native
    def cursor(cursor: String): this.type = js.native
    def limit(limit: String): this.type = js.native
    def limit(limit: Double): this.type = js.native
    @JSName("order")
    def order_asc(direction: asc): this.type = js.native
    @JSName("order")
    def order_desc(direction: desc): this.type = js.native
    def stream(): js.Function0[Unit] = js.native
    def stream(options: Anon_Error[T]): js.Function0[Unit] = js.native
  }
  
  trait CallFunctionTemplateOptions extends js.Object {
    var cursor: js.UndefOr[String | Double] = js.undefined
    var limit: js.UndefOr[Double] = js.undefined
    var order: js.UndefOr[asc | desc] = js.undefined
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.ChangeTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, trustee, trustor, limit */ @js.native
  trait ChangeTrustOperationRecord
    extends BaseOperationRecord[
          changeTrust, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.changeTrust
        ]
       with OperationRecord {
    var asset_code: String = js.native
    var asset_issuer: String = js.native
    var asset_type: credit4 | credit12 = js.native
    var limit: String = js.native
    var trustee: String = js.native
    var trustor: String = js.native
  }
  
  trait CollectionPage[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
    var records: js.Array[T]
    def next(): js.Promise[CollectionPage[T]]
    def prev(): js.Promise[CollectionPage[T]]
  }
  
  /* Due to a bug with the recursive function requests */
  trait CollectionRecord[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
    var _embedded: Anon_Records[T]
    var _links: Anon_Next
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.CreateAccountOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined account, funder, starting_balance */ @js.native
  trait CreateAccountOperationRecord
    extends BaseOperationRecord[
          createAccount, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createAccount
        ]
       with OperationRecord {
    var account: String = js.native
    var funder: String = js.native
    var starting_balance: String = js.native
  }
  
  @js.native
  abstract class EffectCallBuilder () extends CallBuilder[EffectRecord] {
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forOperation(operationId: Double): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
  trait EffectRecord
    extends BaseResponse[scala.Nothing] {
    var account: String
    var amount: js.UndefOr[js.Any] = js.undefined
    var operation: js.UndefOr[CallFunction[OperationRecord]] = js.undefined
    var paging_token: String
    var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
    var starting_balance: String
    var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
    var `type`: String
    var type_i: String
  }
  
  @js.native
  trait InflationOperationRecord
    extends BaseOperationRecord[
          inflation, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.inflation
        ]
       with OperationRecord
  
  @js.native
  abstract class LedgerCallBuilder () extends CallBuilder[LedgerRecord]
  
  @js.native
  trait LedgerRecord
    extends BaseResponse[scala.Nothing] {
    var base_fee: Double = js.native
    var base_fee_in_stroops: Double = js.native
    var base_reserve: String = js.native
    var base_reserve_in_stroops: Double = js.native
    var closed_at: String = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var fee_pool: String = js.native
    var hash: String = js.native
    var header_xdr: String = js.native
    var id: String = js.native
    var max_tx_set_size: Double = js.native
    var operation_count: Double = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    var paging_token: String = js.native
    var prev_hash: String = js.native
    var protocol_version: Double = js.native
    @JSName("self")
    var self_Original: CallFunction[LedgerRecord] = js.native
    var sequence: Double = js.native
    var total_coins: String = js.native
    var transaction_count: Double = js.native
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
  trait ManageDataOperationRecord
    extends BaseOperationRecord[
          manageData, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageData
        ]
       with OperationRecord {
    var name: String = js.native
    var value: Buffer = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.ManageOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
  trait ManageOfferOperationRecord
    extends BaseOperationRecord[
          manageOffer, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageOffer
        ]
       with OperationRecord {
    var amount: String = js.native
    var buying_asset_code: js.UndefOr[String] = js.native
    var buying_asset_issuer: js.UndefOr[String] = js.native
    var buying_asset_type: AssetType = js.native
    var offer_id: Double = js.native
    var price: String = js.native
    var price_r: PriceR = js.native
    var selling_asset_code: js.UndefOr[String] = js.native
    var selling_asset_issuer: js.UndefOr[String] = js.native
    var selling_asset_type: AssetType = js.native
  }
  
  @js.native
  abstract class OfferCallBuilder () extends CallBuilder[OfferRecord]
  
  trait OfferRecord
    extends BaseResponse[scala.Nothing] {
    var amount: String
    var buying: typings.stellarDashBase.stellarDashBaseMod.Asset
    var id: String
    var paging_token: String
    var price: String
    var price_r: PriceR
    var seller: js.UndefOr[CallFunction[AccountRecord]] = js.undefined
    var seller_attr: String
    var selling: typings.stellarDashBase.stellarDashBaseMod.Asset
  }
  
  @js.native
  abstract class OperationCallBuilder () extends CallBuilder[OperationRecord] {
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.CreateAccountOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PaymentOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PathPaymentOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.ManageOfferOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.PassiveOfferOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.SetOptionsOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.ChangeTrustOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AllowTrustOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.AccountMergeOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.InflationOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.ManageDataOperationRecord
    - typings.stellarDashSdk.stellarDashSdkMod.ServerNs.BumpSequenceOperationRecord
  */
  trait OperationRecord extends js.Object
  
  trait Options extends js.Object {
    var allowHttp: Boolean
  }
  
  @js.native
  abstract class OrderbookCallBuilder () extends CallBuilder[OrderbookRecord]
  
  trait OrderbookRecord
    extends BaseResponse[scala.Nothing] {
    var asks: js.Array[Anon_Amount]
    var bids: js.Array[Anon_Amount]
    var buying: typings.stellarDashBase.stellarDashBaseMod.Asset
    var selling: typings.stellarDashBase.stellarDashBaseMod.Asset
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.PassiveOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
  trait PassiveOfferOperationRecord
    extends BaseOperationRecord[
          createPassiveOffer, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createPassiveOffer
        ]
       with OperationRecord {
    var amount: String = js.native
    var buying_asset_code: js.UndefOr[String] = js.native
    var buying_asset_issuer: js.UndefOr[String] = js.native
    var buying_asset_type: AssetType = js.native
    var offer_id: Double = js.native
    var price: String = js.native
    var price_r: PriceR = js.native
    var selling_asset_code: js.UndefOr[String] = js.native
    var selling_asset_issuer: js.UndefOr[String] = js.native
    var selling_asset_type: AssetType = js.native
  }
  
  @js.native
  abstract class PathCallBuilder () extends CallBuilder[PaymentPathRecord]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount, source_asset_type, source_asset_code, source_asset_issuer, source_max, source_amount */ @js.native
  trait PathPaymentOperationRecord
    extends BaseOperationRecord[
          pathPayment, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.pathPayment
        ]
       with OperationRecord {
    var amount: String = js.native
    var asset_code: js.UndefOr[String] = js.native
    var asset_issuer: js.UndefOr[String] = js.native
    var asset_type: AssetType = js.native
    var from: String = js.native
    var source_amount: String = js.native
    var source_asset_code: js.UndefOr[String] = js.native
    var source_asset_issuer: js.UndefOr[String] = js.native
    var source_asset_type: AssetType = js.native
    var source_max: String = js.native
    var to: String = js.native
  }
  
  @js.native
  abstract class PaymentCallBuilder () extends CallBuilder[PaymentOperationRecord] {
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forTransaction(transactionId: String): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.PaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount */ @js.native
  trait PaymentOperationRecord
    extends BaseOperationRecord[
          payment, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.payment
        ]
       with OperationRecord {
    var amount: String = js.native
    var asset_code: js.UndefOr[String] = js.native
    var asset_issuer: js.UndefOr[String] = js.native
    var asset_type: AssetType = js.native
    var from: String = js.native
    @JSName("receiver")
    var receiver_Original: CallFunction[AccountRecord] = js.native
    @JSName("sender")
    var sender_Original: CallFunction[AccountRecord] = js.native
    var to: String = js.native
    def receiver(): js.Promise[AccountRecord] = js.native
    def sender(): js.Promise[AccountRecord] = js.native
  }
  
  trait PaymentPathRecord
    extends BaseResponse[scala.Nothing] {
    var destination_amount: String
    var destination_asset_code: String
    var destination_asset_issuer: String
    var destination_asset_type: String
    var path: js.Array[Anon_Assetcode]
    var source_amount: String
    var source_asset_code: String
    var source_asset_issuer: String
    var source_asset_type: String
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.SetOptionsOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined signer_key, signer_weight, master_key_weight, low_threshold, med_threshold, high_threshold, home_domain, set_flags, set_flags_s, clear_flags, clear_flags_s */ @js.native
  trait SetOptionsOperationRecord
    extends BaseOperationRecord[
          setOptions, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.setOptions
        ]
       with OperationRecord {
    var clear_flags: js.Array[`1` | `2`] = js.native
    var clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
    var high_threshold: js.UndefOr[Double] = js.native
    var home_domain: js.UndefOr[String] = js.native
    var low_threshold: js.UndefOr[Double] = js.native
    var master_key_weight: js.UndefOr[Double] = js.native
    var med_threshold: js.UndefOr[Double] = js.native
    var set_flags: js.Array[`1` | `2`] = js.native
    var set_flags_s: js.Array[auth_required_flag | auth_revocable_flag] = js.native
    var signer_key: js.UndefOr[String] = js.native
    var signer_weight: js.UndefOr[Double] = js.native
  }
  
  @js.native
  abstract class TradeAggregationCallBuilder () extends CallBuilder[TradeAggregationRecord]
  
  trait TradeAggregationRecord
    extends BaseResponse[scala.Nothing] {
    var avg: String
    var base_volume: String
    var close: String
    var counter_volume: String
    var high: String
    var low: String
    var open: String
    var timestamp: String
    var trade_count: Double
  }
  
  @js.native
  trait TradeRecord
    extends BaseResponse[scala.Nothing] {
    @JSName("base")
    var base_Original: CallFunction[AccountRecord] = js.native
    var base_account: String = js.native
    var base_amount: String = js.native
    var base_asset_code: String = js.native
    var base_asset_issuer: String = js.native
    var base_asset_type: String = js.native
    var base_is_seller: Boolean = js.native
    @JSName("counter")
    var counter_Original: CallFunction[AccountRecord] = js.native
    var counter_account: String = js.native
    var counter_amount: String = js.native
    var counter_asset_code: String = js.native
    var counter_asset_issuer: String = js.native
    var counter_asset_type: String = js.native
    var id: String = js.native
    var ledger_close_time: String = js.native
    @JSName("operation")
    var operation_Original: CallFunction[OperationRecord] = js.native
    var paging_token: String = js.native
    def base(): js.Promise[AccountRecord] = js.native
    def counter(): js.Promise[AccountRecord] = js.native
    def operation(): js.Promise[OperationRecord] = js.native
  }
  
  @js.native
  abstract class TradesCallBuilder () extends CallBuilder[TradeRecord] {
    def forAssetPair(
      base: typings.stellarDashBase.stellarDashBaseMod.Asset,
      counter: typings.stellarDashBase.stellarDashBaseMod.Asset
    ): this.type = js.native
    def forOffer(offerId: String): this.type = js.native
  }
  
  @js.native
  abstract class TransactionCallBuilder () extends CallBuilder[TransactionRecord] {
    def forAccount(accountId: String): this.type = js.native
    def forLedger(sequence: String): this.type = js.native
    def forLedger(sequence: Double): this.type = js.native
    def transaction(transactionId: String): this.type = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in any ]: stellar-sdk.stellar-sdk.Horizon.TransactionResponse[P]} */ @js.native
  trait TransactionRecord extends js.Object {
    @JSName("account")
    var account_Original: CallFunction[AccountRecord] = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    @JSName("ledger")
    var ledger_Original: CallFunction[LedgerRecord] = js.native
    var ledger_attr: Double = js.native
    @JSName("operations")
    var operations_Original: CallCollectionFunction[OperationRecord] = js.native
    @JSName("precedes")
    var precedes_Original: CallFunction[TransactionRecord] = js.native
    @JSName("self")
    var self_Original: CallFunction[TransactionRecord] = js.native
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
  
  type CallCollectionFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    js.Promise[CollectionRecord[T]]
  ]
  type CallFunction[T /* <: BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}

