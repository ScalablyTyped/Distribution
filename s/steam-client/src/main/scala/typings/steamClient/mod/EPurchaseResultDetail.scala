package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPurchaseResultDetail extends StObject
@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail with Double] = js.native
  
  @js.native
  sealed trait AVSFailure extends EPurchaseResultDetail
  /* 1 */ val AVSFailure: typings.steamClient.mod.EPurchaseResultDetail.AVSFailure with Double = js.native
  
  @js.native
  sealed trait AccountLocked extends EPurchaseResultDetail
  /* 44 */ val AccountLocked: typings.steamClient.mod.EPurchaseResultDetail.AccountLocked with Double = js.native
  
  @js.native
  sealed trait AcctIsBlocked extends EPurchaseResultDetail
  /* 20 */ val AcctIsBlocked: typings.steamClient.mod.EPurchaseResultDetail.AcctIsBlocked with Double = js.native
  
  @js.native
  sealed trait AcctNotVerified extends EPurchaseResultDetail
  /* 21 */ val AcctNotVerified: typings.steamClient.mod.EPurchaseResultDetail.AcctNotVerified with Double = js.native
  
  @js.native
  sealed trait AlreadyPurchased extends EPurchaseResultDetail
  /* 9 */ val AlreadyPurchased: typings.steamClient.mod.EPurchaseResultDetail.AlreadyPurchased with Double = js.native
  
  @js.native
  sealed trait BadActivationCode extends EPurchaseResultDetail
  /* 14 */ val BadActivationCode: typings.steamClient.mod.EPurchaseResultDetail.BadActivationCode with Double = js.native
  
  @js.native
  sealed trait BillingAgreementAlreadyExists extends EPurchaseResultDetail
  /* 57 */ val BillingAgreementAlreadyExists: typings.steamClient.mod.EPurchaseResultDetail.BillingAgreementAlreadyExists with Double = js.native
  
  @js.native
  sealed trait BillingAgreementCancelled extends EPurchaseResultDetail
  /* 41 */ val BillingAgreementCancelled: typings.steamClient.mod.EPurchaseResultDetail.BillingAgreementCancelled with Double = js.native
  
  @js.native
  sealed trait BundleTypeCannotBeGifted extends EPurchaseResultDetail
  /* 67 */ val BundleTypeCannotBeGifted: typings.steamClient.mod.EPurchaseResultDetail.BundleTypeCannotBeGifted with Double = js.native
  
  @js.native
  sealed trait CanceledByNewTransaction extends EPurchaseResultDetail
  /* 25 */ val CanceledByNewTransaction: typings.steamClient.mod.EPurchaseResultDetail.CanceledByNewTransaction with Double = js.native
  
  @js.native
  sealed trait CancelledByUser extends EPurchaseResultDetail
  /* 12 */ val CancelledByUser: typings.steamClient.mod.EPurchaseResultDetail.CancelledByUser with Double = js.native
  
  @js.native
  sealed trait CannotGiftShippedGoods extends EPurchaseResultDetail
  /* 39 */ val CannotGiftShippedGoods: typings.steamClient.mod.EPurchaseResultDetail.CannotGiftShippedGoods with Double = js.native
  
  @js.native
  sealed trait CannotRedeemCodeFromClient extends EPurchaseResultDetail
  /* 50 */ val CannotRedeemCodeFromClient: typings.steamClient.mod.EPurchaseResultDetail.CannotRedeemCodeFromClient with Double = js.native
  
  @js.native
  sealed trait CannotShipInternationally extends EPurchaseResultDetail
  /* 40 */ val CannotShipInternationally: typings.steamClient.mod.EPurchaseResultDetail.CannotShipInternationally with Double = js.native
  
  @js.native
  sealed trait CannotShipToCountry extends EPurchaseResultDetail
  /* 59 */ val CannotShipToCountry: typings.steamClient.mod.EPurchaseResultDetail.CannotShipToCountry with Double = js.native
  
  @js.native
  sealed trait CannotShipToPOBox extends EPurchaseResultDetail
  /* 37 */ val CannotShipToPOBox: typings.steamClient.mod.EPurchaseResultDetail.CannotShipToPOBox with Double = js.native
  
  @js.native
  sealed trait CartValueTooHigh extends EPurchaseResultDetail
  /* 56 */ val CartValueTooHigh: typings.steamClient.mod.EPurchaseResultDetail.CartValueTooHigh with Double = js.native
  
  @js.native
  sealed trait ContactSupport extends EPurchaseResultDetail
  /* 3 */ val ContactSupport: typings.steamClient.mod.EPurchaseResultDetail.ContactSupport with Double = js.native
  
  @js.native
  sealed trait CreditCardBinMismatchesType extends EPurchaseResultDetail
  /* 55 */ val CreditCardBinMismatchesType: typings.steamClient.mod.EPurchaseResultDetail.CreditCardBinMismatchesType with Double = js.native
  
  @js.native
  sealed trait DelayedCompletion extends EPurchaseResultDetail
  /* 66 */ val DelayedCompletion: typings.steamClient.mod.EPurchaseResultDetail.DelayedCompletion with Double = js.native
  
  @js.native
  sealed trait DoesNotOwnRequiredApp extends EPurchaseResultDetail
  /* 24 */ val DoesNotOwnRequiredApp: typings.steamClient.mod.EPurchaseResultDetail.DoesNotOwnRequiredApp with Double = js.native
  
  @js.native
  sealed trait DuplicateActivationCode extends EPurchaseResultDetail
  /* 15 */ val DuplicateActivationCode: typings.steamClient.mod.EPurchaseResultDetail.DuplicateActivationCode with Double = js.native
  
  @js.native
  sealed trait EmailNotValidated extends EPurchaseResultDetail
  /* 32 */ val EmailNotValidated: typings.steamClient.mod.EPurchaseResultDetail.EmailNotValidated with Double = js.native
  
  @js.native
  sealed trait ExceededSteamLimit extends EPurchaseResultDetail
  /* 46 */ val ExceededSteamLimit: typings.steamClient.mod.EPurchaseResultDetail.ExceededSteamLimit with Double = js.native
  
  @js.native
  sealed trait ExpiredCard extends EPurchaseResultDetail
  /* 33 */ val ExpiredCard: typings.steamClient.mod.EPurchaseResultDetail.ExpiredCard with Double = js.native
  
  @js.native
  sealed trait ExpiredCoupon extends EPurchaseResultDetail
  /* 43 */ val ExpiredCoupon: typings.steamClient.mod.EPurchaseResultDetail.ExpiredCoupon with Double = js.native
  
  @js.native
  sealed trait FailCurrencyTransProvider extends EPurchaseResultDetail
  /* 27 */ val FailCurrencyTransProvider: typings.steamClient.mod.EPurchaseResultDetail.FailCurrencyTransProvider with Double = js.native
  
  @js.native
  sealed trait FailedCyberCafe extends EPurchaseResultDetail
  /* 28 */ val FailedCyberCafe: typings.steamClient.mod.EPurchaseResultDetail.FailedCyberCafe with Double = js.native
  
  @js.native
  sealed trait ForceCanceledPending extends EPurchaseResultDetail
  /* 26 */ val ForceCanceledPending: typings.steamClient.mod.EPurchaseResultDetail.ForceCanceledPending with Double = js.native
  
  @js.native
  sealed trait FraudCheckFailed extends EPurchaseResultDetail
  /* 11 */ val FraudCheckFailed: typings.steamClient.mod.EPurchaseResultDetail.FraudCheckFailed with Double = js.native
  
  @js.native
  sealed trait HungTransactionCancelled extends EPurchaseResultDetail
  /* 60 */ val HungTransactionCancelled: typings.steamClient.mod.EPurchaseResultDetail.HungTransactionCancelled with Double = js.native
  
  @js.native
  sealed trait InsufficientFunds extends EPurchaseResultDetail
  /* 2 */ val InsufficientFunds: typings.steamClient.mod.EPurchaseResultDetail.InsufficientFunds with Double = js.native
  
  @js.native
  sealed trait InsufficientInventory extends EPurchaseResultDetail
  /* 38 */ val InsufficientInventory: typings.steamClient.mod.EPurchaseResultDetail.InsufficientInventory with Double = js.native
  
  @js.native
  sealed trait InvalidAccount extends EPurchaseResultDetail
  /* 22 */ val InvalidAccount: typings.steamClient.mod.EPurchaseResultDetail.InvalidAccount with Double = js.native
  
  @js.native
  sealed trait InvalidCoupon extends EPurchaseResultDetail
  /* 42 */ val InvalidCoupon: typings.steamClient.mod.EPurchaseResultDetail.InvalidCoupon with Double = js.native
  
  @js.native
  sealed trait InvalidData extends EPurchaseResultDetail
  /* 7 */ val InvalidData: typings.steamClient.mod.EPurchaseResultDetail.InvalidData with Double = js.native
  
  @js.native
  sealed trait InvalidPackage extends EPurchaseResultDetail
  /* 5 */ val InvalidPackage: typings.steamClient.mod.EPurchaseResultDetail.InvalidPackage with Double = js.native
  
  @js.native
  sealed trait InvalidPaymentMethod extends EPurchaseResultDetail
  /* 6 */ val InvalidPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.InvalidPaymentMethod with Double = js.native
  
  @js.native
  sealed trait InvalidShippingAddress extends EPurchaseResultDetail
  /* 18 */ val InvalidShippingAddress: typings.steamClient.mod.EPurchaseResultDetail.InvalidShippingAddress with Double = js.native
  
  @js.native
  sealed trait InvalidTaxAddress extends EPurchaseResultDetail
  /* 63 */ val InvalidTaxAddress: typings.steamClient.mod.EPurchaseResultDetail.InvalidTaxAddress with Double = js.native
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase extends EPurchaseResultDetail
  /* 36 */ val MustLoginPS3AppForPurchase: typings.steamClient.mod.EPurchaseResultDetail.MustLoginPS3AppForPurchase with Double = js.native
  
  @js.native
  sealed trait NeedsPreApproval extends EPurchaseResultDetail
  /* 29 */ val NeedsPreApproval: typings.steamClient.mod.EPurchaseResultDetail.NeedsPreApproval with Double = js.native
  
  @js.native
  sealed trait NoCachedPaymentMethod extends EPurchaseResultDetail
  /* 49 */ val NoCachedPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.NoCachedPaymentMethod with Double = js.native
  
  @js.native
  sealed trait NoDetail extends EPurchaseResultDetail
  /* 0 */ val NoDetail: typings.steamClient.mod.EPurchaseResultDetail.NoDetail with Double = js.native
  
  @js.native
  sealed trait NoWallet extends EPurchaseResultDetail
  /* 48 */ val NoWallet: typings.steamClient.mod.EPurchaseResultDetail.NoWallet with Double = js.native
  
  @js.native
  sealed trait OtherAbortableInProgress extends EPurchaseResultDetail
  /* 45 */ val OtherAbortableInProgress: typings.steamClient.mod.EPurchaseResultDetail.OtherAbortableInProgress with Double = js.native
  
  @js.native
  sealed trait OthersInProgress extends EPurchaseResultDetail
  /* 8 */ val OthersInProgress: typings.steamClient.mod.EPurchaseResultDetail.OthersInProgress with Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInCart extends EPurchaseResultDetail
  /* 47 */ val OverlappingPackagesInCart: typings.steamClient.mod.EPurchaseResultDetail.OverlappingPackagesInCart with Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction extends EPurchaseResultDetail
  /* 52 */ val OverlappingPackagesInPendingTransaction: typings.steamClient.mod.EPurchaseResultDetail.OverlappingPackagesInPendingTransaction with Double = js.native
  
  @js.native
  sealed trait OwnsExcludedApp extends EPurchaseResultDetail
  /* 54 */ val OwnsExcludedApp: typings.steamClient.mod.EPurchaseResultDetail.OwnsExcludedApp with Double = js.native
  
  @js.native
  sealed trait POSACodeNotActivated extends EPurchaseResultDetail
  /* 58 */ val POSACodeNotActivated: typings.steamClient.mod.EPurchaseResultDetail.POSACodeNotActivated with Double = js.native
  
  @js.native
  sealed trait PaypalInternalError extends EPurchaseResultDetail
  /* 61 */ val PaypalInternalError: typings.steamClient.mod.EPurchaseResultDetail.PaypalInternalError with Double = js.native
  
  @js.native
  sealed trait PhysicalProductLimitExceeded extends EPurchaseResultDetail
  /* 64 */ val PhysicalProductLimitExceeded: typings.steamClient.mod.EPurchaseResultDetail.PhysicalProductLimitExceeded with Double = js.native
  
  @js.native
  sealed trait PreApprovalDenied extends EPurchaseResultDetail
  /* 30 */ val PreApprovalDenied: typings.steamClient.mod.EPurchaseResultDetail.PreApprovalDenied with Double = js.native
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider extends EPurchaseResultDetail
  /* 51 */ val PurchaseAmountNoSupportedByProvider: typings.steamClient.mod.EPurchaseResultDetail.PurchaseAmountNoSupportedByProvider with Double = js.native
  
  @js.native
  sealed trait PurchaseCannotBeReplayed extends EPurchaseResultDetail
  /* 65 */ val PurchaseCannotBeReplayed: typings.steamClient.mod.EPurchaseResultDetail.PurchaseCannotBeReplayed with Double = js.native
  
  @js.native
  sealed trait RateLimited extends EPurchaseResultDetail
  /* 53 */ val RateLimited: typings.steamClient.mod.EPurchaseResultDetail.RateLimited with Double = js.native
  
  @js.native
  sealed trait RegionNotSupported extends EPurchaseResultDetail
  /* 19 */ val RegionNotSupported: typings.steamClient.mod.EPurchaseResultDetail.RegionNotSupported with Double = js.native
  
  @js.native
  sealed trait RestrictedCountry extends EPurchaseResultDetail
  /* 13 */ val RestrictedCountry: typings.steamClient.mod.EPurchaseResultDetail.RestrictedCountry with Double = js.native
  
  @js.native
  sealed trait StoreBillingCountryMismatch extends EPurchaseResultDetail
  /* 23 */ val StoreBillingCountryMismatch: typings.steamClient.mod.EPurchaseResultDetail.StoreBillingCountryMismatch with Double = js.native
  
  @js.native
  sealed trait Timeout extends EPurchaseResultDetail
  /* 4 */ val Timeout: typings.steamClient.mod.EPurchaseResultDetail.Timeout with Double = js.native
  
  @js.native
  sealed trait TransactionExpired extends EPurchaseResultDetail
  /* 34 */ val TransactionExpired: typings.steamClient.mod.EPurchaseResultDetail.TransactionExpired with Double = js.native
  
  @js.native
  sealed trait UnknownGlobalCollectError extends EPurchaseResultDetail
  /* 62 */ val UnknownGlobalCollectError: typings.steamClient.mod.EPurchaseResultDetail.UnknownGlobalCollectError with Double = js.native
  
  @js.native
  sealed trait UseOtherFunctionSource extends EPurchaseResultDetail
  /* 17 */ val UseOtherFunctionSource: typings.steamClient.mod.EPurchaseResultDetail.UseOtherFunctionSource with Double = js.native
  
  @js.native
  sealed trait UseOtherPaymentMethod extends EPurchaseResultDetail
  /* 16 */ val UseOtherPaymentMethod: typings.steamClient.mod.EPurchaseResultDetail.UseOtherPaymentMethod with Double = js.native
  
  @js.native
  sealed trait WalletCurrencyMismatch extends EPurchaseResultDetail
  /* 31 */ val WalletCurrencyMismatch: typings.steamClient.mod.EPurchaseResultDetail.WalletCurrencyMismatch with Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxWallet extends EPurchaseResultDetail
  /* 35 */ val WouldExceedMaxWallet: typings.steamClient.mod.EPurchaseResultDetail.WouldExceedMaxWallet with Double = js.native
  
  @js.native
  sealed trait WrongPrice extends EPurchaseResultDetail
  /* 10 */ val WrongPrice: typings.steamClient.mod.EPurchaseResultDetail.WrongPrice with Double = js.native
}
