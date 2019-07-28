package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPurchaseResultDetail extends js.Object

@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends js.Object {
  @js.native
  sealed trait AVSFailure extends EPurchaseResultDetail
  
  @js.native
  sealed trait AccountLocked extends EPurchaseResultDetail
  
  @js.native
  sealed trait AcctIsBlocked extends EPurchaseResultDetail
  
  @js.native
  sealed trait AcctNotVerified extends EPurchaseResultDetail
  
  @js.native
  sealed trait AlreadyPurchased extends EPurchaseResultDetail
  
  @js.native
  sealed trait BadActivationCode extends EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementAlreadyExists extends EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementCancelled extends EPurchaseResultDetail
  
  @js.native
  sealed trait BundleTypeCannotBeGifted extends EPurchaseResultDetail
  
  @js.native
  sealed trait CanceledByNewTransaction extends EPurchaseResultDetail
  
  @js.native
  sealed trait CancelledByUser extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotGiftShippedGoods extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotRedeemCodeFromClient extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipInternationally extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToCountry extends EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToPOBox extends EPurchaseResultDetail
  
  @js.native
  sealed trait CartValueTooHigh extends EPurchaseResultDetail
  
  @js.native
  sealed trait ContactSupport extends EPurchaseResultDetail
  
  @js.native
  sealed trait CreditCardBinMismatchesType extends EPurchaseResultDetail
  
  @js.native
  sealed trait DelayedCompletion extends EPurchaseResultDetail
  
  @js.native
  sealed trait DoesNotOwnRequiredApp extends EPurchaseResultDetail
  
  @js.native
  sealed trait DuplicateActivationCode extends EPurchaseResultDetail
  
  @js.native
  sealed trait EmailNotValidated extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExceededSteamLimit extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCard extends EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCoupon extends EPurchaseResultDetail
  
  @js.native
  sealed trait FailCurrencyTransProvider extends EPurchaseResultDetail
  
  @js.native
  sealed trait FailedCyberCafe extends EPurchaseResultDetail
  
  @js.native
  sealed trait ForceCanceledPending extends EPurchaseResultDetail
  
  @js.native
  sealed trait FraudCheckFailed extends EPurchaseResultDetail
  
  @js.native
  sealed trait HungTransactionCancelled extends EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientFunds extends EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientInventory extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidAccount extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidCoupon extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidData extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPackage extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidShippingAddress extends EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidTaxAddress extends EPurchaseResultDetail
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase extends EPurchaseResultDetail
  
  @js.native
  sealed trait NeedsPreApproval extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoCachedPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoDetail extends EPurchaseResultDetail
  
  @js.native
  sealed trait NoWallet extends EPurchaseResultDetail
  
  @js.native
  sealed trait OtherAbortableInProgress extends EPurchaseResultDetail
  
  @js.native
  sealed trait OthersInProgress extends EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInCart extends EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction extends EPurchaseResultDetail
  
  @js.native
  sealed trait OwnsExcludedApp extends EPurchaseResultDetail
  
  @js.native
  sealed trait POSACodeNotActivated extends EPurchaseResultDetail
  
  @js.native
  sealed trait PaypalInternalError extends EPurchaseResultDetail
  
  @js.native
  sealed trait PhysicalProductLimitExceeded extends EPurchaseResultDetail
  
  @js.native
  sealed trait PreApprovalDenied extends EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider extends EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseCannotBeReplayed extends EPurchaseResultDetail
  
  @js.native
  sealed trait RateLimited extends EPurchaseResultDetail
  
  @js.native
  sealed trait RegionNotSupported extends EPurchaseResultDetail
  
  @js.native
  sealed trait RestrictedCountry extends EPurchaseResultDetail
  
  @js.native
  sealed trait StoreBillingCountryMismatch extends EPurchaseResultDetail
  
  @js.native
  sealed trait Timeout extends EPurchaseResultDetail
  
  @js.native
  sealed trait TransactionExpired extends EPurchaseResultDetail
  
  @js.native
  sealed trait UnknownGlobalCollectError extends EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherFunctionSource extends EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherPaymentMethod extends EPurchaseResultDetail
  
  @js.native
  sealed trait WalletCurrencyMismatch extends EPurchaseResultDetail
  
  @js.native
  sealed trait WouldExceedMaxWallet extends EPurchaseResultDetail
  
  @js.native
  sealed trait WrongPrice extends EPurchaseResultDetail
  
  /* 1 */ val AVSFailure: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AVSFailure with Double = js.native
  /* 44 */ val AccountLocked: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AccountLocked with Double = js.native
  /* 20 */ val AcctIsBlocked: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AcctIsBlocked with Double = js.native
  /* 21 */ val AcctNotVerified: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AcctNotVerified with Double = js.native
  /* 9 */ val AlreadyPurchased: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.AlreadyPurchased with Double = js.native
  /* 14 */ val BadActivationCode: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BadActivationCode with Double = js.native
  /* 57 */ val BillingAgreementAlreadyExists: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BillingAgreementAlreadyExists with Double = js.native
  /* 41 */ val BillingAgreementCancelled: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BillingAgreementCancelled with Double = js.native
  /* 67 */ val BundleTypeCannotBeGifted: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.BundleTypeCannotBeGifted with Double = js.native
  /* 25 */ val CanceledByNewTransaction: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CanceledByNewTransaction with Double = js.native
  /* 12 */ val CancelledByUser: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CancelledByUser with Double = js.native
  /* 39 */ val CannotGiftShippedGoods: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotGiftShippedGoods with Double = js.native
  /* 50 */ val CannotRedeemCodeFromClient: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotRedeemCodeFromClient with Double = js.native
  /* 40 */ val CannotShipInternationally: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipInternationally with Double = js.native
  /* 59 */ val CannotShipToCountry: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipToCountry with Double = js.native
  /* 37 */ val CannotShipToPOBox: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CannotShipToPOBox with Double = js.native
  /* 56 */ val CartValueTooHigh: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CartValueTooHigh with Double = js.native
  /* 3 */ val ContactSupport: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ContactSupport with Double = js.native
  /* 55 */ val CreditCardBinMismatchesType: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.CreditCardBinMismatchesType with Double = js.native
  /* 66 */ val DelayedCompletion: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DelayedCompletion with Double = js.native
  /* 24 */ val DoesNotOwnRequiredApp: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DoesNotOwnRequiredApp with Double = js.native
  /* 15 */ val DuplicateActivationCode: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.DuplicateActivationCode with Double = js.native
  /* 32 */ val EmailNotValidated: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.EmailNotValidated with Double = js.native
  /* 46 */ val ExceededSteamLimit: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExceededSteamLimit with Double = js.native
  /* 33 */ val ExpiredCard: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExpiredCard with Double = js.native
  /* 43 */ val ExpiredCoupon: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ExpiredCoupon with Double = js.native
  /* 27 */ val FailCurrencyTransProvider: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FailCurrencyTransProvider with Double = js.native
  /* 28 */ val FailedCyberCafe: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FailedCyberCafe with Double = js.native
  /* 26 */ val ForceCanceledPending: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.ForceCanceledPending with Double = js.native
  /* 11 */ val FraudCheckFailed: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.FraudCheckFailed with Double = js.native
  /* 60 */ val HungTransactionCancelled: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.HungTransactionCancelled with Double = js.native
  /* 2 */ val InsufficientFunds: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InsufficientFunds with Double = js.native
  /* 38 */ val InsufficientInventory: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InsufficientInventory with Double = js.native
  /* 22 */ val InvalidAccount: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidAccount with Double = js.native
  /* 42 */ val InvalidCoupon: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidCoupon with Double = js.native
  /* 7 */ val InvalidData: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidData with Double = js.native
  /* 5 */ val InvalidPackage: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidPackage with Double = js.native
  /* 6 */ val InvalidPaymentMethod: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidPaymentMethod with Double = js.native
  /* 18 */ val InvalidShippingAddress: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidShippingAddress with Double = js.native
  /* 63 */ val InvalidTaxAddress: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.InvalidTaxAddress with Double = js.native
  /* 36 */ val MustLoginPS3AppForPurchase: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.MustLoginPS3AppForPurchase with Double = js.native
  /* 29 */ val NeedsPreApproval: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NeedsPreApproval with Double = js.native
  /* 49 */ val NoCachedPaymentMethod: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoCachedPaymentMethod with Double = js.native
  /* 0 */ val NoDetail: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoDetail with Double = js.native
  /* 48 */ val NoWallet: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.NoWallet with Double = js.native
  /* 45 */ val OtherAbortableInProgress: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OtherAbortableInProgress with Double = js.native
  /* 8 */ val OthersInProgress: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OthersInProgress with Double = js.native
  /* 47 */ val OverlappingPackagesInCart: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OverlappingPackagesInCart with Double = js.native
  /* 52 */ val OverlappingPackagesInPendingTransaction: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OverlappingPackagesInPendingTransaction with Double = js.native
  /* 54 */ val OwnsExcludedApp: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.OwnsExcludedApp with Double = js.native
  /* 58 */ val POSACodeNotActivated: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.POSACodeNotActivated with Double = js.native
  /* 61 */ val PaypalInternalError: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PaypalInternalError with Double = js.native
  /* 64 */ val PhysicalProductLimitExceeded: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PhysicalProductLimitExceeded with Double = js.native
  /* 30 */ val PreApprovalDenied: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PreApprovalDenied with Double = js.native
  /* 51 */ val PurchaseAmountNoSupportedByProvider: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PurchaseAmountNoSupportedByProvider with Double = js.native
  /* 65 */ val PurchaseCannotBeReplayed: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.PurchaseCannotBeReplayed with Double = js.native
  /* 53 */ val RateLimited: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RateLimited with Double = js.native
  /* 19 */ val RegionNotSupported: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RegionNotSupported with Double = js.native
  /* 13 */ val RestrictedCountry: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.RestrictedCountry with Double = js.native
  /* 23 */ val StoreBillingCountryMismatch: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.StoreBillingCountryMismatch with Double = js.native
  /* 4 */ val Timeout: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.Timeout with Double = js.native
  /* 34 */ val TransactionExpired: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.TransactionExpired with Double = js.native
  /* 62 */ val UnknownGlobalCollectError: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UnknownGlobalCollectError with Double = js.native
  /* 17 */ val UseOtherFunctionSource: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UseOtherFunctionSource with Double = js.native
  /* 16 */ val UseOtherPaymentMethod: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.UseOtherPaymentMethod with Double = js.native
  /* 31 */ val WalletCurrencyMismatch: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WalletCurrencyMismatch with Double = js.native
  /* 35 */ val WouldExceedMaxWallet: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WouldExceedMaxWallet with Double = js.native
  /* 10 */ val WrongPrice: typings.steamDashClient.steamDashClientMod.EPurchaseResultDetail.WrongPrice with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail with Double] = js.native
}

