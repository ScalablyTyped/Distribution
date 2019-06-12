package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Horizon")
@js.native
object HorizonNs extends js.Object {
  trait AccountMergeOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.accountMerge, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.accountMerge
        ] {
    var into: java.lang.String
  }
  
  trait AccountResponse
    extends BaseResponse[
          stellarDashSdkLib.stellarDashSdkLibStrings.transactions | stellarDashSdkLib.stellarDashSdkLibStrings.operations | stellarDashSdkLib.stellarDashSdkLibStrings.payments | stellarDashSdkLib.stellarDashSdkLibStrings.effects | stellarDashSdkLib.stellarDashSdkLibStrings.offers | stellarDashSdkLib.stellarDashSdkLibStrings.trades | stellarDashSdkLib.stellarDashSdkLibStrings.data
        ] {
    var account_id: java.lang.String
    var balances: js.Array[BalanceLine[stellarDashBaseLib.stellarDashBaseMod.AssetType]]
    var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
    var flags: Flags
    var id: java.lang.String
    var paging_token: java.lang.String
    var sequence: java.lang.String
    var signers: js.Array[AccountSigner]
    var subentry_count: scala.Double
    var thresholds: AccountThresholds
  }
  
  trait AccountSigner extends js.Object {
    var public_key: java.lang.String
    var weight: scala.Double
  }
  
  trait AccountThresholds extends js.Object {
    var high_threshold: scala.Double
    var low_threshold: scala.Double
    var med_threshold: scala.Double
  }
  
  trait AllowTrustOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.allowTrust, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.allowTrust
        ] {
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var authorize: scala.Boolean
    var trustee: java.lang.String
    var trustor: java.lang.String
  }
  
  trait BalanceLineAsset[T /* <: stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12 */] extends js.Object {
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: T
    var balance: java.lang.String
    var limit: java.lang.String
  }
  
  trait BalanceLineNative extends js.Object {
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.native
    var balance: java.lang.String
  }
  
  trait BaseOperationResponse[T /* <: OperationResponseType */, TI /* <: OperationResponseTypeI */]
    extends BaseResponse[
          stellarDashSdkLib.stellarDashSdkLibStrings.succeeds | stellarDashSdkLib.stellarDashSdkLibStrings.precedes | stellarDashSdkLib.stellarDashSdkLibStrings.effects | stellarDashSdkLib.stellarDashSdkLibStrings.transaction
        ] {
    var created_at: java.lang.String
    var id: java.lang.String
    var paging_token: java.lang.String
    var source_account: java.lang.String
    var transaction_hash: java.lang.String
    var `type`: T
    var type_i: TI
  }
  
  trait BaseResponse[T /* <: java.lang.String */] extends js.Object {
    var _links: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in T | 'self' ]: stellar-sdk.stellar-sdk.Horizon.ResponseLink}
      */ stellarDashSdkLib.stellarDashSdkLibStrings.BaseResponse with js.Any
  }
  
  trait BumpSequenceOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.bumpSequence, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.bumpSequence
        ] {
    var bump_to: java.lang.String
  }
  
  trait ChangeTrustOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.changeTrust, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.changeTrust
        ] {
    var asset_code: java.lang.String
    var asset_issuer: java.lang.String
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12
    var limit: java.lang.String
    var trustee: java.lang.String
    var trustor: java.lang.String
  }
  
  trait CreateAccountOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.createAccount, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createAccount
        ] {
    var account: java.lang.String
    var funder: java.lang.String
    var starting_balance: java.lang.String
  }
  
  trait Flags extends js.Object {
    var auth_required: scala.Boolean
    var auth_revocable: scala.Boolean
  }
  
  trait ManageDataOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.manageData, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageData
        ] {
    var name: java.lang.String
    var value: nodeLib.Buffer
  }
  
  trait ManageOfferOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.manageOffer, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.manageOffer
        ] {
    var amount: java.lang.String
    var buying_asset_code: js.UndefOr[java.lang.String] = js.undefined
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var buying_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var offer_id: scala.Double
    var price: java.lang.String
    var price_r: PriceR
    var selling_asset_code: js.UndefOr[java.lang.String] = js.undefined
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var selling_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
  }
  
  @js.native
  sealed trait OperationResponseType extends js.Object
  
  @js.native
  sealed trait OperationResponseTypeI extends js.Object
  
  trait PassiveOfferOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.createPassiveOffer, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.createPassiveOffer
        ] {
    var amount: java.lang.String
    var buying_asset_code: js.UndefOr[java.lang.String] = js.undefined
    var buying_asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var buying_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var offer_id: scala.Double
    var price: java.lang.String
    var price_r: PriceR
    var selling_asset_code: js.UndefOr[java.lang.String] = js.undefined
    var selling_asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var selling_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
  }
  
  trait PathPaymentOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.pathPayment, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.pathPayment
        ] {
    var amount: java.lang.String
    var asset_code: js.UndefOr[java.lang.String] = js.undefined
    var asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var from: java.lang.String
    var source_amount: java.lang.String
    var source_asset_code: js.UndefOr[java.lang.String] = js.undefined
    var source_asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var source_asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var source_max: java.lang.String
    var to: java.lang.String
  }
  
  trait PaymentOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.payment, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.payment
        ] {
    var amount: java.lang.String
    var asset_code: js.UndefOr[java.lang.String] = js.undefined
    var asset_issuer: js.UndefOr[java.lang.String] = js.undefined
    var asset_type: stellarDashBaseLib.stellarDashBaseMod.AssetType
    var from: java.lang.String
    var to: java.lang.String
  }
  
  trait PriceR extends js.Object {
    var denominator: scala.Double
    var numerator: scala.Double
  }
  
  trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
    var _embedded: stellarDashSdkLib.Anon_Records[T]
    var _links: stellarDashSdkLib.Anon_NextPrev
  }
  
  trait ResponseLink extends js.Object {
    var href: java.lang.String
    var templated: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait SetOptionsOperationResponse
    extends BaseOperationResponse[
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.setOptions, 
          stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.setOptions
        ] {
    var clear_flags: js.Array[
        stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
      ]
    var clear_flags_s: js.Array[
        stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
      ]
    var high_threshold: js.UndefOr[scala.Double] = js.undefined
    var home_domain: js.UndefOr[java.lang.String] = js.undefined
    var low_threshold: js.UndefOr[scala.Double] = js.undefined
    var master_key_weight: js.UndefOr[scala.Double] = js.undefined
    var med_threshold: js.UndefOr[scala.Double] = js.undefined
    var set_flags: js.Array[
        stellarDashSdkLib.stellarDashSdkLibNumbers.`1` | stellarDashSdkLib.stellarDashSdkLibNumbers.`2`
      ]
    var set_flags_s: js.Array[
        stellarDashSdkLib.stellarDashSdkLibStrings.auth_required_flag | stellarDashSdkLib.stellarDashSdkLibStrings.auth_revocable_flag
      ]
    var signer_key: js.UndefOr[java.lang.String] = js.undefined
    var signer_weight: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait TransactionResponse
    extends BaseResponse[
          stellarDashSdkLib.stellarDashSdkLibStrings.account | stellarDashSdkLib.stellarDashSdkLibStrings.ledger | stellarDashSdkLib.stellarDashSdkLibStrings.operations | stellarDashSdkLib.stellarDashSdkLibStrings.effects | stellarDashSdkLib.stellarDashSdkLibStrings.succeeds | stellarDashSdkLib.stellarDashSdkLibStrings.precedes
        ] {
    var created_at: java.lang.String
    var envelope_xdr: java.lang.String
    var fee_meta_xdr: java.lang.String
    var fee_paid: scala.Double
    var hash: java.lang.String
    var id: java.lang.String
    var ledger: scala.Double
    var memo: js.UndefOr[java.lang.String] = js.undefined
    var memo_type: stellarDashBaseLib.stellarDashBaseMod.MemoType
    var operation_count: scala.Double
    var paging_token: java.lang.String
    var result_meta_xdr: java.lang.String
    var result_xdr: java.lang.String
    var signatures: js.Array[java.lang.String]
    var source_account: java.lang.String
    var source_account_sequence: java.lang.String
  }
  
  @js.native
  object OperationResponseType extends js.Object {
    @js.native
    sealed trait accountMerge
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait allowTrust
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait bumpSequence
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait changeTrust
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait createAccount
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait createPassiveOffer
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait inflation
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait manageData
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait manageOffer
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait pathPayment
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait payment
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    @js.native
    sealed trait setOptions
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType
    
    /* "account_merge" */ val accountMerge: accountMerge with java.lang.String = js.native
    /* "allow_trust" */ val allowTrust: allowTrust with java.lang.String = js.native
    /* "bump_sequence" */ val bumpSequence: bumpSequence with java.lang.String = js.native
    /* "change_trust" */ val changeTrust: changeTrust with java.lang.String = js.native
    /* "create_account" */ val createAccount: createAccount with java.lang.String = js.native
    /* "create_passive_offer" */ val createPassiveOffer: createPassiveOffer with java.lang.String = js.native
    /* "inflation" */ val inflation: inflation with java.lang.String = js.native
    /* "manage_data" */ val manageData: manageData with java.lang.String = js.native
    /* "manage_offer" */ val manageOffer: manageOffer with java.lang.String = js.native
    /* "path_payment" */ val pathPayment: pathPayment with java.lang.String = js.native
    /* "payment" */ val payment: payment with java.lang.String = js.native
    /* "set_options" */ val setOptions: setOptions with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType with java.lang.String
      ] = js.native
  }
  
  @js.native
  object OperationResponseTypeI extends js.Object {
    @js.native
    sealed trait accountMerge
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait allowTrust
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait bumpSequence
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait changeTrust
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait createAccount
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait createPassiveOffer
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait inflation
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait manageData
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait manageOffer
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait pathPayment
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait payment
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    @js.native
    sealed trait setOptions
      extends stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI
    
    /* 8 */ val accountMerge: accountMerge with scala.Double = js.native
    /* 7 */ val allowTrust: allowTrust with scala.Double = js.native
    /* 11 */ val bumpSequence: bumpSequence with scala.Double = js.native
    /* 6 */ val changeTrust: changeTrust with scala.Double = js.native
    /* 0 */ val createAccount: createAccount with scala.Double = js.native
    /* 3 */ val createPassiveOffer: createPassiveOffer with scala.Double = js.native
    /* 9 */ val inflation: inflation with scala.Double = js.native
    /* 10 */ val manageData: manageData with scala.Double = js.native
    /* 4 */ val manageOffer: manageOffer with scala.Double = js.native
    /* 2 */ val pathPayment: pathPayment with scala.Double = js.native
    /* 1 */ val payment: payment with scala.Double = js.native
    /* 5 */ val setOptions: setOptions with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI with scala.Double
      ] = js.native
  }
  
  type BalanceLine[T /* <: stellarDashBaseLib.stellarDashBaseMod.AssetType */] = BalanceLineNative | (BalanceLineAsset[
    T | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit12 | stellarDashBaseLib.stellarDashBaseMod.AssetTypeNs.credit4
  ])
  type InflationOperationResponse = BaseOperationResponse[
    stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseType.inflation, 
    stellarDashSdkLib.stellarDashSdkMod.HorizonNs.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = ResponseCollection[TransactionResponse]
}

