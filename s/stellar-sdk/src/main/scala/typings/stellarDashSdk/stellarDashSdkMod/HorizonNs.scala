package typings.stellarDashSdk.stellarDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.AssetType
import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit12
import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.credit4
import typings.stellarDashBase.stellarDashBaseMod.AssetTypeNs.native
import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashSdk.Anon_NextPrev
import typings.stellarDashSdk.Anon_Records
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AccountSigner
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.AccountThresholds
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BalanceLine
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BalanceLineAsset
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.BalanceLineNative
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
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.ResponseCollection
import typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.TransactionResponse
import typings.stellarDashSdk.stellarDashSdkNumbers.`1`
import typings.stellarDashSdk.stellarDashSdkNumbers.`2`
import typings.stellarDashSdk.stellarDashSdkStrings.account
import typings.stellarDashSdk.stellarDashSdkStrings.auth_required_flag
import typings.stellarDashSdk.stellarDashSdkStrings.auth_revocable_flag
import typings.stellarDashSdk.stellarDashSdkStrings.data
import typings.stellarDashSdk.stellarDashSdkStrings.effects
import typings.stellarDashSdk.stellarDashSdkStrings.ledger
import typings.stellarDashSdk.stellarDashSdkStrings.offers
import typings.stellarDashSdk.stellarDashSdkStrings.operations
import typings.stellarDashSdk.stellarDashSdkStrings.payments
import typings.stellarDashSdk.stellarDashSdkStrings.precedes
import typings.stellarDashSdk.stellarDashSdkStrings.succeeds
import typings.stellarDashSdk.stellarDashSdkStrings.trades
import typings.stellarDashSdk.stellarDashSdkStrings.transaction
import typings.stellarDashSdk.stellarDashSdkStrings.transactions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Horizon")
@js.native
object HorizonNs extends js.Object {
  trait AccountMergeOperationResponse
    extends BaseOperationResponse[
          accountMerge, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.accountMerge
        ] {
    var into: String
  }
  
  trait AccountResponse extends BaseResponse[transactions | operations | payments | effects | offers | trades | data] {
    var account_id: String
    var balances: js.Array[BalanceLine[AssetType]]
    var data: StringDictionary[String]
    var flags: Flags
    var id: String
    var paging_token: String
    var sequence: String
    var signers: js.Array[AccountSigner]
    var subentry_count: Double
    var thresholds: AccountThresholds
  }
  
  trait AccountSigner extends js.Object {
    var public_key: String
    var weight: Double
  }
  
  trait AccountThresholds extends js.Object {
    var high_threshold: Double
    var low_threshold: Double
    var med_threshold: Double
  }
  
  trait AllowTrustOperationResponse
    extends BaseOperationResponse[
          allowTrust, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.allowTrust
        ] {
    var asset_code: String
    var asset_issuer: String
    var asset_type: AssetType
    var authorize: Boolean
    var trustee: String
    var trustor: String
  }
  
  trait BalanceLineAsset[T /* <: credit4 | credit12 */] extends js.Object {
    var asset_code: String
    var asset_issuer: String
    var asset_type: T
    var balance: String
    var limit: String
  }
  
  trait BalanceLineNative extends js.Object {
    var asset_type: native
    var balance: String
  }
  
  trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */] extends BaseResponse[succeeds | precedes | effects | transaction] {
    var created_at: String
    var id: String
    var paging_token: String
    var source_account: String
    var transaction_hash: String
    var `type`: T
    var type_i: TI
  }
  
  trait BaseResponse[T /* <: String */] extends js.Object {
    var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ typings.stellarDashSdk.stellarDashSdkStrings.BaseResponse with js.Any
  }
  
  trait BumpSequenceOperationResponse
    extends BaseOperationResponse[
          bumpSequence, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.bumpSequence
        ] {
    var bump_to: String
  }
  
  trait ChangeTrustOperationResponse
    extends BaseOperationResponse[
          changeTrust, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.changeTrust
        ] {
    var asset_code: String
    var asset_issuer: String
    var asset_type: credit4 | credit12
    var limit: String
    var trustee: String
    var trustor: String
  }
  
  trait CreateAccountOperationResponse
    extends BaseOperationResponse[
          createAccount, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createAccount
        ] {
    var account: String
    var funder: String
    var starting_balance: String
  }
  
  trait Flags extends js.Object {
    var auth_required: Boolean
    var auth_revocable: Boolean
  }
  
  trait ManageDataOperationResponse
    extends BaseOperationResponse[
          manageData, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageData
        ] {
    var name: String
    var value: Buffer
  }
  
  trait ManageOfferOperationResponse
    extends BaseOperationResponse[
          manageOffer, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageOffer
        ] {
    var amount: String
    var buying_asset_code: js.UndefOr[String] = js.undefined
    var buying_asset_issuer: js.UndefOr[String] = js.undefined
    var buying_asset_type: AssetType
    var offer_id: Double
    var price: String
    var price_r: PriceR
    var selling_asset_code: js.UndefOr[String] = js.undefined
    var selling_asset_issuer: js.UndefOr[String] = js.undefined
    var selling_asset_type: AssetType
  }
  
  @js.native
  sealed trait OperationResponseType extends js.Object
  
  @js.native
  sealed trait OperationResponseTypeI extends js.Object
  
  trait PassiveOfferOperationResponse
    extends BaseOperationResponse[
          createPassiveOffer, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createPassiveOffer
        ] {
    var amount: String
    var buying_asset_code: js.UndefOr[String] = js.undefined
    var buying_asset_issuer: js.UndefOr[String] = js.undefined
    var buying_asset_type: AssetType
    var offer_id: Double
    var price: String
    var price_r: PriceR
    var selling_asset_code: js.UndefOr[String] = js.undefined
    var selling_asset_issuer: js.UndefOr[String] = js.undefined
    var selling_asset_type: AssetType
  }
  
  trait PathPaymentOperationResponse
    extends BaseOperationResponse[
          pathPayment, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.pathPayment
        ] {
    var amount: String
    var asset_code: js.UndefOr[String] = js.undefined
    var asset_issuer: js.UndefOr[String] = js.undefined
    var asset_type: AssetType
    var from: String
    var source_amount: String
    var source_asset_code: js.UndefOr[String] = js.undefined
    var source_asset_issuer: js.UndefOr[String] = js.undefined
    var source_asset_type: AssetType
    var source_max: String
    var to: String
  }
  
  trait PaymentOperationResponse
    extends BaseOperationResponse[
          payment, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.payment
        ] {
    var amount: String
    var asset_code: js.UndefOr[String] = js.undefined
    var asset_issuer: js.UndefOr[String] = js.undefined
    var asset_type: AssetType
    var from: String
    var to: String
  }
  
  trait PriceR extends js.Object {
    var denominator: Double
    var numerator: Double
  }
  
  trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
    var _embedded: Anon_Records[T]
    var _links: Anon_NextPrev
  }
  
  trait ResponseLink extends js.Object {
    var href: String
    var templated: js.UndefOr[Boolean] = js.undefined
  }
  
  trait SetOptionsOperationResponse
    extends BaseOperationResponse[
          setOptions, 
          typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.setOptions
        ] {
    var clear_flags: js.Array[`1` | `2`]
    var clear_flags_s: js.Array[auth_required_flag | auth_revocable_flag]
    var high_threshold: js.UndefOr[Double] = js.undefined
    var home_domain: js.UndefOr[String] = js.undefined
    var low_threshold: js.UndefOr[Double] = js.undefined
    var master_key_weight: js.UndefOr[Double] = js.undefined
    var med_threshold: js.UndefOr[Double] = js.undefined
    var set_flags: js.Array[`1` | `2`]
    var set_flags_s: js.Array[auth_required_flag | auth_revocable_flag]
    var signer_key: js.UndefOr[String] = js.undefined
    var signer_weight: js.UndefOr[Double] = js.undefined
  }
  
  trait TransactionResponse extends BaseResponse[account | ledger | operations | effects | succeeds | precedes] {
    var created_at: String
    var envelope_xdr: String
    var fee_meta_xdr: String
    var fee_paid: Double
    var hash: String
    var id: String
    var ledger: Double
    var memo: js.UndefOr[String] = js.undefined
    var memo_type: MemoType
    var operation_count: Double
    var paging_token: String
    var result_meta_xdr: String
    var result_xdr: String
    var signatures: js.Array[String]
    var source_account: String
    var source_account_sequence: String
  }
  
  @js.native
  object OperationResponseType extends js.Object {
    @js.native
    sealed trait accountMerge extends OperationResponseType
    
    @js.native
    sealed trait allowTrust extends OperationResponseType
    
    @js.native
    sealed trait bumpSequence extends OperationResponseType
    
    @js.native
    sealed trait changeTrust extends OperationResponseType
    
    @js.native
    sealed trait createAccount extends OperationResponseType
    
    @js.native
    sealed trait createPassiveOffer extends OperationResponseType
    
    @js.native
    sealed trait inflation extends OperationResponseType
    
    @js.native
    sealed trait manageData extends OperationResponseType
    
    @js.native
    sealed trait manageOffer extends OperationResponseType
    
    @js.native
    sealed trait pathPayment extends OperationResponseType
    
    @js.native
    sealed trait payment extends OperationResponseType
    
    @js.native
    sealed trait setOptions extends OperationResponseType
    
    /* "account_merge" */ val accountMerge: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.accountMerge with String = js.native
    /* "allow_trust" */ val allowTrust: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.allowTrust with String = js.native
    /* "bump_sequence" */ val bumpSequence: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.bumpSequence with String = js.native
    /* "change_trust" */ val changeTrust: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.changeTrust with String = js.native
    /* "create_account" */ val createAccount: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.createAccount with String = js.native
    /* "create_passive_offer" */ val createPassiveOffer: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.createPassiveOffer with String = js.native
    /* "inflation" */ val inflation: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.inflation with String = js.native
    /* "manage_data" */ val manageData: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.manageData with String = js.native
    /* "manage_offer" */ val manageOffer: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.manageOffer with String = js.native
    /* "path_payment" */ val pathPayment: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.pathPayment with String = js.native
    /* "payment" */ val payment: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.payment with String = js.native
    /* "set_options" */ val setOptions: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseType.setOptions with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OperationResponseType with String] = js.native
  }
  
  @js.native
  object OperationResponseTypeI extends js.Object {
    @js.native
    sealed trait accountMerge extends OperationResponseTypeI
    
    @js.native
    sealed trait allowTrust extends OperationResponseTypeI
    
    @js.native
    sealed trait bumpSequence extends OperationResponseTypeI
    
    @js.native
    sealed trait changeTrust extends OperationResponseTypeI
    
    @js.native
    sealed trait createAccount extends OperationResponseTypeI
    
    @js.native
    sealed trait createPassiveOffer extends OperationResponseTypeI
    
    @js.native
    sealed trait inflation extends OperationResponseTypeI
    
    @js.native
    sealed trait manageData extends OperationResponseTypeI
    
    @js.native
    sealed trait manageOffer extends OperationResponseTypeI
    
    @js.native
    sealed trait pathPayment extends OperationResponseTypeI
    
    @js.native
    sealed trait payment extends OperationResponseTypeI
    
    @js.native
    sealed trait setOptions extends OperationResponseTypeI
    
    /* 8 */ val accountMerge: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.accountMerge with Double = js.native
    /* 7 */ val allowTrust: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.allowTrust with Double = js.native
    /* 11 */ val bumpSequence: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.bumpSequence with Double = js.native
    /* 6 */ val changeTrust: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.changeTrust with Double = js.native
    /* 0 */ val createAccount: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createAccount with Double = js.native
    /* 3 */ val createPassiveOffer: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createPassiveOffer with Double = js.native
    /* 9 */ val inflation: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.inflation with Double = js.native
    /* 10 */ val manageData: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageData with Double = js.native
    /* 4 */ val manageOffer: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageOffer with Double = js.native
    /* 2 */ val pathPayment: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.pathPayment with Double = js.native
    /* 1 */ val payment: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.payment with Double = js.native
    /* 5 */ val setOptions: typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.setOptions with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OperationResponseTypeI with Double] = js.native
  }
  
  type BalanceLine[T /* <: AssetType */] = BalanceLineNative | (BalanceLineAsset[T | credit12 | credit4])
  type InflationOperationResponse = BaseOperationResponse[
    inflation, 
    typings.stellarDashSdk.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = ResponseCollection[TransactionResponse]
}

