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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
  trait AccountMergeOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var into: java.lang.String = js.native
  }
  
  @js.native
  trait AccountRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
    var account_id: java.lang.String = js.native
    var balances: js.Array[
        stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BalanceLine[stellarDashBaseLib.stellarDashBaseMod.AssetType]
      ] = js.native
    var data_attr: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    var flags: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.Flags = js.native
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
    var thresholds: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.AccountThresholds = js.native
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
    override var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ stellarDashSdkLib.stellarDashSdkLibStrings.BaseResponse with js.Any = js.native
    @JSName("_links")
    var _links_AccountResponse: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ stellarDashSdkLib.stellarDashSdkLibStrings.AccountResponse with js.Any = js.native
    var inflation_destination: js.UndefOr[js.Any] = js.native
    @JSName("signers")
    var signers_AccountResponse: js.Array[stellarDashSdkLib.stellarDashSdkMod.HorizonNs.AccountSigner] = js.native
    def accountId(): java.lang.String = js.native
    def incrementSequenceNumber(): scala.Unit = js.native
    def sequenceNumber(): java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.AllowTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, authorize, trustee, trustor */ @js.native
  trait AllowTrustOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var asset_code: java.lang.String = js.native
    var asset_issuer: java.lang.String = js.native
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var authorize: scala.Boolean = js.native
    var trustee: java.lang.String = js.native
    var trustor: java.lang.String = js.native
  }
  
  trait AssetRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
    var amount: java.lang.String
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12
    var flags: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.Flags
    var num_accounts: scala.Double
    var paging_token: java.lang.String
  }
  
  @js.native
  abstract class AssetsCallBuilder () extends CallBuilder[AssetRecord] {
    def forCode(value: java.lang.String): this.type = js.native
    def forIssuer(value: java.lang.String): this.type = js.native
  }
  
  @js.native
  trait BaseOperationRecord[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType */, TI /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI */]
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseOperationResponse[T, TI] {
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
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BumpSequenceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined bump_to */ @js.native
  trait BumpSequenceOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var bump_to: java.lang.String = js.native
  }
  
  @js.native
  abstract class CallBuilder[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] protected () extends js.Object {
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ChangeTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, trustee, trustor, limit */ @js.native
  trait ChangeTrustOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var asset_code: java.lang.String = js.native
    var asset_issuer: java.lang.String = js.native
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12 = js.native
    var limit: java.lang.String = js.native
    var trustee: java.lang.String = js.native
    var trustor: java.lang.String = js.native
  }
  
  trait CollectionPage[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] extends js.Object {
    var records: js.Array[T]
    def next(): js.Promise[CollectionPage[T]]
    def prev(): js.Promise[CollectionPage[T]]
  }
  
  /* Due to a bug with the recursive function requests */
  trait CollectionRecord[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] extends js.Object {
    var _embedded: stellarDashSdkLib.Anon_Records[T]
    var _links: stellarDashSdkLib.Anon_Next
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.CreateAccountOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined account, funder, starting_balance */ @js.native
  trait CreateAccountOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var account: java.lang.String = js.native
    var funder: java.lang.String = js.native
    var starting_balance: java.lang.String = js.native
  }
  
  @js.native
  abstract class EffectCallBuilder () extends CallBuilder[EffectRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forOperation(operationId: scala.Double): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  trait EffectRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
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
  trait InflationOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord
  
  @js.native
  abstract class LedgerCallBuilder () extends CallBuilder[LedgerRecord]
  
  @js.native
  trait LedgerRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
  trait ManageDataOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var name: java.lang.String = js.native
    var value: nodeLib.Buffer = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.ManageOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
  trait ManageOfferOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var amount: java.lang.String = js.native
    var buying_asset_code: js.UndefOr[java.lang.String] = js.native
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var buying_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var offer_id: scala.Double = js.native
    var price: java.lang.String = js.native
    var price_r: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PriceR = js.native
    var selling_asset_code: js.UndefOr[java.lang.String] = js.native
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var selling_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
  }
  
  @js.native
  abstract class OfferCallBuilder () extends CallBuilder[OfferRecord]
  
  trait OfferRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
    var amount: java.lang.String
    var buying: stellarDashBaseLib.stellarDashBaseMod.Asset
    var id: java.lang.String
    var paging_token: java.lang.String
    var price: java.lang.String
    var price_r: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PriceR
    var seller: js.UndefOr[CallFunction[AccountRecord]] = js.undefined
    var seller_attr: java.lang.String
    var selling: stellarDashBaseLib.stellarDashBaseMod.Asset
  }
  
  @js.native
  abstract class OperationCallBuilder () extends CallBuilder[OperationRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - CreateAccountOperationRecord
    - PaymentOperationRecord
    - PathPaymentOperationRecord
    - ManageOfferOperationRecord
    - PassiveOfferOperationRecord
    - SetOptionsOperationRecord
    - ChangeTrustOperationRecord
    - AllowTrustOperationRecord
    - AccountMergeOperationRecord
    - InflationOperationRecord
    - ManageDataOperationRecord
    - BumpSequenceOperationRecord
  */
  trait OperationRecord extends js.Object
  
  trait Options extends js.Object {
    var allowHttp: scala.Boolean
  }
  
  @js.native
  abstract class OrderbookCallBuilder () extends CallBuilder[OrderbookRecord]
  
  trait OrderbookRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
    var asks: js.Array[stellarDashSdkLib.Anon_Amount]
    var bids: js.Array[stellarDashSdkLib.Anon_Amount]
    var buying: stellarDashBaseLib.stellarDashBaseMod.Asset
    var selling: stellarDashBaseLib.stellarDashBaseMod.Asset
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PassiveOfferOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined offer_id, amount, buying_asset_type, buying_asset_code, buying_asset_issuer, price, price_r, selling_asset_type, selling_asset_code, selling_asset_issuer */ @js.native
  trait PassiveOfferOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var amount: java.lang.String = js.native
    var buying_asset_code: js.UndefOr[java.lang.String] = js.native
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var buying_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var offer_id: scala.Double = js.native
    var price: java.lang.String = js.native
    var price_r: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PriceR = js.native
    var selling_asset_code: js.UndefOr[java.lang.String] = js.native
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var selling_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
  }
  
  @js.native
  abstract class PathCallBuilder () extends CallBuilder[PaymentPathRecord]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount, source_asset_type, source_asset_code, source_asset_issuer, source_max, source_amount */ @js.native
  trait PathPaymentOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var amount: java.lang.String = js.native
    var asset_code: js.UndefOr[java.lang.String] = js.native
    var asset_issuer: js.UndefOr[java.lang.String] = js.native
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var from: java.lang.String = js.native
    var source_amount: java.lang.String = js.native
    var source_asset_code: js.UndefOr[java.lang.String] = js.native
    var source_asset_issuer: js.UndefOr[java.lang.String] = js.native
    var source_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var source_max: java.lang.String = js.native
    var to: java.lang.String = js.native
  }
  
  @js.native
  abstract class PaymentCallBuilder () extends CallBuilder[PaymentOperationRecord] {
    def forAccount(accountId: java.lang.String): this.type = js.native
    def forLedger(sequence: java.lang.String): this.type = js.native
    def forTransaction(transactionId: java.lang.String): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.PaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount */ @js.native
  trait PaymentOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
    var amount: java.lang.String = js.native
    var asset_code: js.UndefOr[java.lang.String] = js.native
    var asset_issuer: js.UndefOr[java.lang.String] = js.native
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType = js.native
    var from: java.lang.String = js.native
    @JSName("receiver")
    var receiver_Original: CallFunction[AccountRecord] = js.native
    @JSName("sender")
    var sender_Original: CallFunction[AccountRecord] = js.native
    var to: java.lang.String = js.native
    def receiver(): js.Promise[AccountRecord] = js.native
    def sender(): js.Promise[AccountRecord] = js.native
  }
  
  trait PaymentPathRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - stellarDashSdkLib.stellarDashSdkMod.HorizonNs.SetOptionsOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined signer_key, signer_weight, master_key_weight, low_threshold, med_threshold, high_threshold, home_domain, set_flags, set_flags_s, clear_flags, clear_flags_s */ @js.native
  trait SetOptionsOperationRecord
    extends BaseOperationRecord[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
        ]
       with OperationRecord {
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
  }
  
  @js.native
  abstract class TradeAggregationCallBuilder () extends CallBuilder[TradeAggregationRecord]
  
  trait TradeAggregationRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
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
  trait TradeRecord
    extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] {
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
      base: stellarDashBaseLib.stellarDashBaseMod.Asset,
      counter: stellarDashBaseLib.stellarDashBaseMod.Asset
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in any ]: stellar-sdk.stellar-sdk.Horizon.TransactionResponse[P]} */ @js.native
  trait TransactionRecord extends js.Object {
    @JSName("account")
    var account_Original: CallFunction[AccountRecord] = js.native
    @JSName("effects")
    var effects_Original: CallCollectionFunction[EffectRecord] = js.native
    @JSName("ledger")
    var ledger_Original: CallFunction[LedgerRecord] = js.native
    var ledger_attr: scala.Double = js.native
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
  
  type CallCollectionFunction[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] = js.Function1[
    /* options */ js.UndefOr[CallFunctionTemplateOptions], 
    js.Promise[CollectionRecord[T]]
  ]
  type CallFunction[T /* <: stellarDashSdkLib.stellarDashSdkMod.HorizonNs.BaseResponse[scala.Nothing] */] = js.Function0[js.Promise[T]]
}

