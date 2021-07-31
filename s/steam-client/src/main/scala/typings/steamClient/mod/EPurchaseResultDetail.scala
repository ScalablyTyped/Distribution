package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPurchaseResultDetail extends StObject
@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail & Double] = js.native
  
  @js.native
  sealed trait AVSFailure
    extends StObject
       with EPurchaseResultDetail
  /* 1 */ val AVSFailure: typings.steamClient.mod.EPurchaseResultDetail.AVSFailure & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EPurchaseResultDetail
  /* 44 */ val AccountLocked: typings.steamClient.mod.EPurchaseResultDetail.AccountLocked & Double = js.native
  
  @js.native
  sealed trait AcctIsBlocked
    extends StObject
       with EPurchaseResultDetail
  /* 20 */ val AcctIsBlocked: typings.steamClient.mod.EPurchaseResultDetail.AcctIsBlocked & Double = js.native
  
  @js.native
  sealed trait AcctNotVerified
    extends StObject
       with EPurchaseResultDetail
  /* 21 */ val AcctNotVerified: typings.steamClient.mod.EPurchaseResultDetail.AcctNotVerified & Double = js.native
  
  @js.native
  sealed trait AlreadyPurchased
    extends StObject
       with EPurchaseResultDetail
  /* 9 */ val AlreadyPurchased: typings.steamClient.mod.EPurchaseResultDetail.AlreadyPurchased & Double = js.native
  
  @js.native
  sealed trait BadActivationCode
    extends StObject
       with EPurchaseResultDetail
  /* 14 */ val BadActivationCode: typings.steamClient.mod.EPurchaseResultDetail.BadActivationCode & Double = js.native
  
  @js.native
  sealed trait BillingAgreementAlreadyExists
    extends StObject
       with EPurchaseResultDetail
  /* 57 */ val BillingAgreementAlreadyExists: typings.steamClient.mod.EPurchaseResultDetail.BillingAgreementAlreadyExists & Double = js.native
  
  @js.native
  sealed trait BillingAgreementCancelled
    extends StObject
       with EPurchaseResultDetail
  /* 41 */ val BillingAgreementCancelled: typings.steamClient.mod.EPurchaseResultDetail.BillingAgreementCancelled & Double = js.native
  
  @js.native
  sealed trait BundleTypeCannotBeGifted
    extends StObject
       with EPurchaseResultDetail
  /* 67 */ val BundleTypeCannotBeGifted: typings.steamClient.mod.EPurchaseResultDetail.BundleTypeCannotBeGifted & Double = js.native
  
  @js.native
  sealed trait CanceledByNewTransaction
    extends StObject
       with EPurchaseResultDetail
  /* 25 */ val CanceledByNewTransaction: typings.steamClient.mod.EPurchaseResultDetail.CanceledByNewTransaction & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with EPurchaseResultDetail
  /* 12 */ val CancelledByUser: typings.steamClient.mod.EPurchaseResultDetail.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait CannotGiftShippedGoods
    extends StObject
       with EPurchaseResultDetail
  /* 39 */ val CannotGiftShippedGoods: typings.steamClient.mod.EPurchaseResultDetail.CannotGiftShippedGoods & Double = js.native
  
  @js.native
  sealed trait CannotRedeemCodeFromClient
    extends StObject
       with EPurchaseResultDetail
  /* 50 */ val CannotRedeemCodeFromClient: typings.steamClient.mod.EPurchaseResultDetail.CannotRedeemCodeFromClient & Double = js.native
  
  @js.native
  sealed trait CannotShipInternationally
    extends StObject
       with EPurchaseResultDetail
  /* 40 */ val CannotShipInternationally: typings.steamClient.mod.EPurchaseResultDetail.CannotShipInternationally & Double = js.native
  
  @js.native
  sealed trait CannotShipToCountry
    extends StObject
       with EPurchaseResultDetail
  /* 59 */ val CannotShipToCountry: typings.steamClient.mod.EPurchaseResultDetail.CannotShipToCountry & Double = js.native
  
  @js.native
  sealed trait CannotShipToPOBox
    extends StObject
       with EPurchaseResultDetail
  /* 37 */ val CannotShipToPOBox: typings.steamClient.mod.EPurchaseResultDetail.CannotShipToPOBox & Double = js.native
  
  @js.native
  sealed trait CartValueTooHigh
    extends StObject
       with EPurchaseResultDetail
  /* 56 */ val CartValueTooHigh: typings.steamClient.mod.EPurchaseResultDetail.CartValueTooHigh & Double = js.native
  
  @js.native
  sealed trait ContactSupport
    extends StObject
       with EPurchaseResultDetail
  /* 3 */ val ContactSupport: typings.steamClient.mod.EPurchaseResultDetail.ContactSupport & Double = js.native
  
  @js.native
  sealed trait CreditCardBinMismatchesType
    extends StObject
       with EPurchaseResultDetail
  /* 55 */ val CreditCardBinMismatchesType: typings.steamClient.mod.EPurchaseResultDetail.CreditCardBinMismatchesType & Double = js.native
  
  @js.native
  sealed trait DelayedCompletion
    extends StObject
       with EPurchaseResultDetail
  /* 66 */ val DelayedCompletion: typings.steamClient.mod.EPurchaseResultDetail.DelayedCompletion & Double = js.native
  
  @js.native
  sealed trait DoesNotOwnRequiredApp
    extends StObject
       with EPurchaseResultDetail
  /* 24 */ val DoesNotOwnRequiredApp: typings.steamClient.mod.EPurchaseResultDetail.DoesNotOwnRequiredApp & Double = js.native
  
  @js.native
  sealed trait DuplicateActivationCode
    extends StObject
       with EPurchaseResultDetail
  /* 15 */ val DuplicateActivationCode: typings.steamClient.mod.EPurchaseResultDetail.DuplicateActivationCode & Double = js.native
  
  @js.native
  sealed trait EmailNotValidated
    extends StObject
       with EPurchaseResultDetail
  /* 32 */ val EmailNotValidated: typings.steamClient.mod.EPurchaseResultDetail.EmailNotValidated & Double = js.native
  
  @js.native
  sealed trait ExceededSteamLimit
    extends StObject
       with EPurchaseResultDetail
  /* 46 */ val ExceededSteamLimit: typings.steamClient.mod.EPurchaseResultDetail.ExceededSteamLimit & Double = js.native
  
  @js.native
  sealed trait ExpiredCard
    extends StObject
       with EPurchaseResultDetail
  /* 33 */ val ExpiredCard: typings.steamClient.mod.EPurchaseResultDetail.ExpiredCard & Double = js.native
  
  @js.native
  sealed trait ExpiredCoupon
    extends StObject
       with EPurchaseResultDetail
  /* 43 */ val ExpiredCoupon: typings.steamClient.mod.EPurchaseResultDetail.ExpiredCoupon & Double = js.native
  
  @js.native
  sealed trait FailCurrencyTransProvider
    extends StObject
       with EPurchaseResultDetail
  /* 27 */ val FailCurrencyTransProvider: typings.steamClient.mod.EPurchaseResultDetail.FailCurrencyTransProvider & Double = js.native
  
  @js.native
  sealed trait FailedCyberCafe
    extends StObject
       with EPurchaseResultDetail
  /* 28 */ val FailedCyberCafe: typings.steamClient.mod.EPurchaseResultDetail.FailedCyberCafe & Double = js.native
  
  @js.native
  sealed trait ForceCanceledPending
    extends StObject
       with EPurchaseResultDetail
  /* 26 */ val ForceCanceledPending: typings.steamClient.mod.EPurchaseResultDetail.ForceCanceledPending & Double = js.native
  
  @js.native
  sealed trait FraudCheckFailed
    extends StObject
       with EPurchaseResultDetail
  /* 11 */ val FraudCheckFailed: typings.steamClient.mod.EPurchaseResultDetail.FraudCheckFailed & Double = js.native
  
  @js.native
  sealed trait HungTransactionCancelled
    extends StObject
       with EPurchaseResultDetail
  /* 60 */ val HungTransactionCancelled: typings.steamClient.mod.EPurchaseResultDetail.HungTransactionCancelled & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EPurchaseResultDetail
  /* 2 */ val InsufficientFunds: typings.steamClient.mod.EPurchaseResultDetail.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientInventory
    extends StObject
       with EPurchaseResultDetail
  /* 38 */ val InsufficientInventory: typings.steamClient.mod.EPurchaseResultDetail.InsufficientInventory & Double = js.native
  
  @js.native
  sealed trait InvalidAccount
    extends StObject
       with EPurchaseResultDetail
  /* 22 */ val InvalidAccount: typings.steamClient.mod.EPurchaseResultDetail.InvalidAccount & Double = js.native
  
  @js.native
  sealed trait InvalidCoupon
    extends StObject
       with EPurchaseResultDetail
  /* 42 */ val InvalidCoupon: typings.steamClient.mod.EPurchaseResultDetail.InvalidCoupon & Double = js.native
  
  @js.native
  sealed trait InvalidData
    extends StObject
       with EPurchaseResultDetail
  /* 7 */ val InvalidData: typings.steamClient.mod.EPurchaseResultDetail.InvalidData & Double = js.native
  
  @js.native
  sealed trait InvalidPackage
    extends StObject
       with EPurchaseResultDetail
  /* 5 */ val InvalidPackage: typings.steamClient.mod.EPurchaseResultDetail.InvalidPackage & Double = js.native
  
  @js.native
  sealed trait InvalidPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 6 */ val InvalidPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.InvalidPaymentMethod & Double = js.native
  
  @js.native
  sealed trait InvalidShippingAddress
    extends StObject
       with EPurchaseResultDetail
  /* 18 */ val InvalidShippingAddress: typings.steamClient.mod.EPurchaseResultDetail.InvalidShippingAddress & Double = js.native
  
  @js.native
  sealed trait InvalidTaxAddress
    extends StObject
       with EPurchaseResultDetail
  /* 63 */ val InvalidTaxAddress: typings.steamClient.mod.EPurchaseResultDetail.InvalidTaxAddress & Double = js.native
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase
    extends StObject
       with EPurchaseResultDetail
  /* 36 */ val MustLoginPS3AppForPurchase: typings.steamClient.mod.EPurchaseResultDetail.MustLoginPS3AppForPurchase & Double = js.native
  
  @js.native
  sealed trait NeedsPreApproval
    extends StObject
       with EPurchaseResultDetail
  /* 29 */ val NeedsPreApproval: typings.steamClient.mod.EPurchaseResultDetail.NeedsPreApproval & Double = js.native
  
  @js.native
  sealed trait NoCachedPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 49 */ val NoCachedPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.NoCachedPaymentMethod & Double = js.native
  
  @js.native
  sealed trait NoDetail
    extends StObject
       with EPurchaseResultDetail
  /* 0 */ val NoDetail: typings.steamClient.mod.EPurchaseResultDetail.NoDetail & Double = js.native
  
  @js.native
  sealed trait NoWallet
    extends StObject
       with EPurchaseResultDetail
  /* 48 */ val NoWallet: typings.steamClient.mod.EPurchaseResultDetail.NoWallet & Double = js.native
  
  @js.native
  sealed trait OtherAbortableInProgress
    extends StObject
       with EPurchaseResultDetail
  /* 45 */ val OtherAbortableInProgress: typings.steamClient.mod.EPurchaseResultDetail.OtherAbortableInProgress & Double = js.native
  
  @js.native
  sealed trait OthersInProgress
    extends StObject
       with EPurchaseResultDetail
  /* 8 */ val OthersInProgress: typings.steamClient.mod.EPurchaseResultDetail.OthersInProgress & Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInCart
    extends StObject
       with EPurchaseResultDetail
  /* 47 */ val OverlappingPackagesInCart: typings.steamClient.mod.EPurchaseResultDetail.OverlappingPackagesInCart & Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction
    extends StObject
       with EPurchaseResultDetail
  /* 52 */ val OverlappingPackagesInPendingTransaction: typings.steamClient.mod.EPurchaseResultDetail.OverlappingPackagesInPendingTransaction & Double = js.native
  
  @js.native
  sealed trait OwnsExcludedApp
    extends StObject
       with EPurchaseResultDetail
  /* 54 */ val OwnsExcludedApp: typings.steamClient.mod.EPurchaseResultDetail.OwnsExcludedApp & Double = js.native
  
  @js.native
  sealed trait POSACodeNotActivated
    extends StObject
       with EPurchaseResultDetail
  /* 58 */ val POSACodeNotActivated: typings.steamClient.mod.EPurchaseResultDetail.POSACodeNotActivated & Double = js.native
  
  @js.native
  sealed trait PaypalInternalError
    extends StObject
       with EPurchaseResultDetail
  /* 61 */ val PaypalInternalError: typings.steamClient.mod.EPurchaseResultDetail.PaypalInternalError & Double = js.native
  
  @js.native
  sealed trait PhysicalProductLimitExceeded
    extends StObject
       with EPurchaseResultDetail
  /* 64 */ val PhysicalProductLimitExceeded: typings.steamClient.mod.EPurchaseResultDetail.PhysicalProductLimitExceeded & Double = js.native
  
  @js.native
  sealed trait PreApprovalDenied
    extends StObject
       with EPurchaseResultDetail
  /* 30 */ val PreApprovalDenied: typings.steamClient.mod.EPurchaseResultDetail.PreApprovalDenied & Double = js.native
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider
    extends StObject
       with EPurchaseResultDetail
  /* 51 */ val PurchaseAmountNoSupportedByProvider: typings.steamClient.mod.EPurchaseResultDetail.PurchaseAmountNoSupportedByProvider & Double = js.native
  
  @js.native
  sealed trait PurchaseCannotBeReplayed
    extends StObject
       with EPurchaseResultDetail
  /* 65 */ val PurchaseCannotBeReplayed: typings.steamClient.mod.EPurchaseResultDetail.PurchaseCannotBeReplayed & Double = js.native
  
  @js.native
  sealed trait RateLimited
    extends StObject
       with EPurchaseResultDetail
  /* 53 */ val RateLimited: typings.steamClient.mod.EPurchaseResultDetail.RateLimited & Double = js.native
  
  @js.native
  sealed trait RegionNotSupported
    extends StObject
       with EPurchaseResultDetail
  /* 19 */ val RegionNotSupported: typings.steamClient.mod.EPurchaseResultDetail.RegionNotSupported & Double = js.native
  
  @js.native
  sealed trait RestrictedCountry
    extends StObject
       with EPurchaseResultDetail
  /* 13 */ val RestrictedCountry: typings.steamClient.mod.EPurchaseResultDetail.RestrictedCountry & Double = js.native
  
  @js.native
  sealed trait StoreBillingCountryMismatch
    extends StObject
       with EPurchaseResultDetail
  /* 23 */ val StoreBillingCountryMismatch: typings.steamClient.mod.EPurchaseResultDetail.StoreBillingCountryMismatch & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EPurchaseResultDetail
  /* 4 */ val Timeout: typings.steamClient.mod.EPurchaseResultDetail.Timeout & Double = js.native
  
  @js.native
  sealed trait TransactionExpired
    extends StObject
       with EPurchaseResultDetail
  /* 34 */ val TransactionExpired: typings.steamClient.mod.EPurchaseResultDetail.TransactionExpired & Double = js.native
  
  @js.native
  sealed trait UnknownGlobalCollectError
    extends StObject
       with EPurchaseResultDetail
  /* 62 */ val UnknownGlobalCollectError: typings.steamClient.mod.EPurchaseResultDetail.UnknownGlobalCollectError & Double = js.native
  
  @js.native
  sealed trait UseOtherFunctionSource
    extends StObject
       with EPurchaseResultDetail
  /* 17 */ val UseOtherFunctionSource: typings.steamClient.mod.EPurchaseResultDetail.UseOtherFunctionSource & Double = js.native
  
  @js.native
  sealed trait UseOtherPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 16 */ val UseOtherPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.UseOtherPaymentMethod & Double = js.native
  
  @js.native
  sealed trait WalletCurrencyMismatch
    extends StObject
       with EPurchaseResultDetail
  /* 31 */ val WalletCurrencyMismatch: typings.steamClient.mod.EPurchaseResultDetail.WalletCurrencyMismatch & Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxWallet
    extends StObject
       with EPurchaseResultDetail
  /* 35 */ val WouldExceedMaxWallet: typings.steamClient.mod.EPurchaseResultDetail.WouldExceedMaxWallet & Double = js.native
  
  @js.native
  sealed trait WrongPrice
    extends StObject
       with EPurchaseResultDetail
  /* 10 */ val WrongPrice: typings.steamClient.mod.EPurchaseResultDetail.WrongPrice & Double = js.native
}
