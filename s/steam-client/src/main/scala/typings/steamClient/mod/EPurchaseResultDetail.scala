package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPurchaseResultDetail extends js.Object
@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail with Double] = js.native
  
  @js.native
  sealed trait AVSFailure extends EPurchaseResultDetail
  /* 1 */ @js.native
  object AVSFailure extends TopLevel[AVSFailure with Double]
  
  @js.native
  sealed trait AccountLocked extends EPurchaseResultDetail
  /* 44 */ @js.native
  object AccountLocked extends TopLevel[AccountLocked with Double]
  
  @js.native
  sealed trait AcctIsBlocked extends EPurchaseResultDetail
  /* 20 */ @js.native
  object AcctIsBlocked extends TopLevel[AcctIsBlocked with Double]
  
  @js.native
  sealed trait AcctNotVerified extends EPurchaseResultDetail
  /* 21 */ @js.native
  object AcctNotVerified extends TopLevel[AcctNotVerified with Double]
  
  @js.native
  sealed trait AlreadyPurchased extends EPurchaseResultDetail
  /* 9 */ @js.native
  object AlreadyPurchased extends TopLevel[AlreadyPurchased with Double]
  
  @js.native
  sealed trait BadActivationCode extends EPurchaseResultDetail
  /* 14 */ @js.native
  object BadActivationCode extends TopLevel[BadActivationCode with Double]
  
  @js.native
  sealed trait BillingAgreementAlreadyExists extends EPurchaseResultDetail
  /* 57 */ @js.native
  object BillingAgreementAlreadyExists extends TopLevel[BillingAgreementAlreadyExists with Double]
  
  @js.native
  sealed trait BillingAgreementCancelled extends EPurchaseResultDetail
  /* 41 */ @js.native
  object BillingAgreementCancelled extends TopLevel[BillingAgreementCancelled with Double]
  
  @js.native
  sealed trait BundleTypeCannotBeGifted extends EPurchaseResultDetail
  /* 67 */ @js.native
  object BundleTypeCannotBeGifted extends TopLevel[BundleTypeCannotBeGifted with Double]
  
  @js.native
  sealed trait CanceledByNewTransaction extends EPurchaseResultDetail
  /* 25 */ @js.native
  object CanceledByNewTransaction extends TopLevel[CanceledByNewTransaction with Double]
  
  @js.native
  sealed trait CancelledByUser extends EPurchaseResultDetail
  /* 12 */ @js.native
  object CancelledByUser extends TopLevel[CancelledByUser with Double]
  
  @js.native
  sealed trait CannotGiftShippedGoods extends EPurchaseResultDetail
  /* 39 */ @js.native
  object CannotGiftShippedGoods extends TopLevel[CannotGiftShippedGoods with Double]
  
  @js.native
  sealed trait CannotRedeemCodeFromClient extends EPurchaseResultDetail
  /* 50 */ @js.native
  object CannotRedeemCodeFromClient extends TopLevel[CannotRedeemCodeFromClient with Double]
  
  @js.native
  sealed trait CannotShipInternationally extends EPurchaseResultDetail
  /* 40 */ @js.native
  object CannotShipInternationally extends TopLevel[CannotShipInternationally with Double]
  
  @js.native
  sealed trait CannotShipToCountry extends EPurchaseResultDetail
  /* 59 */ @js.native
  object CannotShipToCountry extends TopLevel[CannotShipToCountry with Double]
  
  @js.native
  sealed trait CannotShipToPOBox extends EPurchaseResultDetail
  /* 37 */ @js.native
  object CannotShipToPOBox extends TopLevel[CannotShipToPOBox with Double]
  
  @js.native
  sealed trait CartValueTooHigh extends EPurchaseResultDetail
  /* 56 */ @js.native
  object CartValueTooHigh extends TopLevel[CartValueTooHigh with Double]
  
  @js.native
  sealed trait ContactSupport extends EPurchaseResultDetail
  /* 3 */ @js.native
  object ContactSupport extends TopLevel[ContactSupport with Double]
  
  @js.native
  sealed trait CreditCardBinMismatchesType extends EPurchaseResultDetail
  /* 55 */ @js.native
  object CreditCardBinMismatchesType extends TopLevel[CreditCardBinMismatchesType with Double]
  
  @js.native
  sealed trait DelayedCompletion extends EPurchaseResultDetail
  /* 66 */ @js.native
  object DelayedCompletion extends TopLevel[DelayedCompletion with Double]
  
  @js.native
  sealed trait DoesNotOwnRequiredApp extends EPurchaseResultDetail
  /* 24 */ @js.native
  object DoesNotOwnRequiredApp extends TopLevel[DoesNotOwnRequiredApp with Double]
  
  @js.native
  sealed trait DuplicateActivationCode extends EPurchaseResultDetail
  /* 15 */ @js.native
  object DuplicateActivationCode extends TopLevel[DuplicateActivationCode with Double]
  
  @js.native
  sealed trait EmailNotValidated extends EPurchaseResultDetail
  /* 32 */ @js.native
  object EmailNotValidated extends TopLevel[EmailNotValidated with Double]
  
  @js.native
  sealed trait ExceededSteamLimit extends EPurchaseResultDetail
  /* 46 */ @js.native
  object ExceededSteamLimit extends TopLevel[ExceededSteamLimit with Double]
  
  @js.native
  sealed trait ExpiredCard extends EPurchaseResultDetail
  /* 33 */ @js.native
  object ExpiredCard extends TopLevel[ExpiredCard with Double]
  
  @js.native
  sealed trait ExpiredCoupon extends EPurchaseResultDetail
  /* 43 */ @js.native
  object ExpiredCoupon extends TopLevel[ExpiredCoupon with Double]
  
  @js.native
  sealed trait FailCurrencyTransProvider extends EPurchaseResultDetail
  /* 27 */ @js.native
  object FailCurrencyTransProvider extends TopLevel[FailCurrencyTransProvider with Double]
  
  @js.native
  sealed trait FailedCyberCafe extends EPurchaseResultDetail
  /* 28 */ @js.native
  object FailedCyberCafe extends TopLevel[FailedCyberCafe with Double]
  
  @js.native
  sealed trait ForceCanceledPending extends EPurchaseResultDetail
  /* 26 */ @js.native
  object ForceCanceledPending extends TopLevel[ForceCanceledPending with Double]
  
  @js.native
  sealed trait FraudCheckFailed extends EPurchaseResultDetail
  /* 11 */ @js.native
  object FraudCheckFailed extends TopLevel[FraudCheckFailed with Double]
  
  @js.native
  sealed trait HungTransactionCancelled extends EPurchaseResultDetail
  /* 60 */ @js.native
  object HungTransactionCancelled extends TopLevel[HungTransactionCancelled with Double]
  
  @js.native
  sealed trait InsufficientFunds extends EPurchaseResultDetail
  /* 2 */ @js.native
  object InsufficientFunds extends TopLevel[InsufficientFunds with Double]
  
  @js.native
  sealed trait InsufficientInventory extends EPurchaseResultDetail
  /* 38 */ @js.native
  object InsufficientInventory extends TopLevel[InsufficientInventory with Double]
  
  @js.native
  sealed trait InvalidAccount extends EPurchaseResultDetail
  /* 22 */ @js.native
  object InvalidAccount extends TopLevel[InvalidAccount with Double]
  
  @js.native
  sealed trait InvalidCoupon extends EPurchaseResultDetail
  /* 42 */ @js.native
  object InvalidCoupon extends TopLevel[InvalidCoupon with Double]
  
  @js.native
  sealed trait InvalidData extends EPurchaseResultDetail
  /* 7 */ @js.native
  object InvalidData extends TopLevel[InvalidData with Double]
  
  @js.native
  sealed trait InvalidPackage extends EPurchaseResultDetail
  /* 5 */ @js.native
  object InvalidPackage extends TopLevel[InvalidPackage with Double]
  
  @js.native
  sealed trait InvalidPaymentMethod extends EPurchaseResultDetail
  /* 6 */ @js.native
  object InvalidPaymentMethod extends TopLevel[InvalidPaymentMethod with Double]
  
  @js.native
  sealed trait InvalidShippingAddress extends EPurchaseResultDetail
  /* 18 */ @js.native
  object InvalidShippingAddress extends TopLevel[InvalidShippingAddress with Double]
  
  @js.native
  sealed trait InvalidTaxAddress extends EPurchaseResultDetail
  /* 63 */ @js.native
  object InvalidTaxAddress extends TopLevel[InvalidTaxAddress with Double]
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase extends EPurchaseResultDetail
  /* 36 */ @js.native
  object MustLoginPS3AppForPurchase extends TopLevel[MustLoginPS3AppForPurchase with Double]
  
  @js.native
  sealed trait NeedsPreApproval extends EPurchaseResultDetail
  /* 29 */ @js.native
  object NeedsPreApproval extends TopLevel[NeedsPreApproval with Double]
  
  @js.native
  sealed trait NoCachedPaymentMethod extends EPurchaseResultDetail
  /* 49 */ @js.native
  object NoCachedPaymentMethod extends TopLevel[NoCachedPaymentMethod with Double]
  
  @js.native
  sealed trait NoDetail extends EPurchaseResultDetail
  /* 0 */ @js.native
  object NoDetail extends TopLevel[NoDetail with Double]
  
  @js.native
  sealed trait NoWallet extends EPurchaseResultDetail
  /* 48 */ @js.native
  object NoWallet extends TopLevel[NoWallet with Double]
  
  @js.native
  sealed trait OtherAbortableInProgress extends EPurchaseResultDetail
  /* 45 */ @js.native
  object OtherAbortableInProgress extends TopLevel[OtherAbortableInProgress with Double]
  
  @js.native
  sealed trait OthersInProgress extends EPurchaseResultDetail
  /* 8 */ @js.native
  object OthersInProgress extends TopLevel[OthersInProgress with Double]
  
  @js.native
  sealed trait OverlappingPackagesInCart extends EPurchaseResultDetail
  /* 47 */ @js.native
  object OverlappingPackagesInCart extends TopLevel[OverlappingPackagesInCart with Double]
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction extends EPurchaseResultDetail
  /* 52 */ @js.native
  object OverlappingPackagesInPendingTransaction extends TopLevel[OverlappingPackagesInPendingTransaction with Double]
  
  @js.native
  sealed trait OwnsExcludedApp extends EPurchaseResultDetail
  /* 54 */ @js.native
  object OwnsExcludedApp extends TopLevel[OwnsExcludedApp with Double]
  
  @js.native
  sealed trait POSACodeNotActivated extends EPurchaseResultDetail
  /* 58 */ @js.native
  object POSACodeNotActivated extends TopLevel[POSACodeNotActivated with Double]
  
  @js.native
  sealed trait PaypalInternalError extends EPurchaseResultDetail
  /* 61 */ @js.native
  object PaypalInternalError extends TopLevel[PaypalInternalError with Double]
  
  @js.native
  sealed trait PhysicalProductLimitExceeded extends EPurchaseResultDetail
  /* 64 */ @js.native
  object PhysicalProductLimitExceeded extends TopLevel[PhysicalProductLimitExceeded with Double]
  
  @js.native
  sealed trait PreApprovalDenied extends EPurchaseResultDetail
  /* 30 */ @js.native
  object PreApprovalDenied extends TopLevel[PreApprovalDenied with Double]
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider extends EPurchaseResultDetail
  /* 51 */ @js.native
  object PurchaseAmountNoSupportedByProvider extends TopLevel[PurchaseAmountNoSupportedByProvider with Double]
  
  @js.native
  sealed trait PurchaseCannotBeReplayed extends EPurchaseResultDetail
  /* 65 */ @js.native
  object PurchaseCannotBeReplayed extends TopLevel[PurchaseCannotBeReplayed with Double]
  
  @js.native
  sealed trait RateLimited extends EPurchaseResultDetail
  /* 53 */ @js.native
  object RateLimited extends TopLevel[RateLimited with Double]
  
  @js.native
  sealed trait RegionNotSupported extends EPurchaseResultDetail
  /* 19 */ @js.native
  object RegionNotSupported extends TopLevel[RegionNotSupported with Double]
  
  @js.native
  sealed trait RestrictedCountry extends EPurchaseResultDetail
  /* 13 */ @js.native
  object RestrictedCountry extends TopLevel[RestrictedCountry with Double]
  
  @js.native
  sealed trait StoreBillingCountryMismatch extends EPurchaseResultDetail
  /* 23 */ @js.native
  object StoreBillingCountryMismatch extends TopLevel[StoreBillingCountryMismatch with Double]
  
  @js.native
  sealed trait Timeout extends EPurchaseResultDetail
  /* 4 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
  @js.native
  sealed trait TransactionExpired extends EPurchaseResultDetail
  /* 34 */ @js.native
  object TransactionExpired extends TopLevel[TransactionExpired with Double]
  
  @js.native
  sealed trait UnknownGlobalCollectError extends EPurchaseResultDetail
  /* 62 */ @js.native
  object UnknownGlobalCollectError extends TopLevel[UnknownGlobalCollectError with Double]
  
  @js.native
  sealed trait UseOtherFunctionSource extends EPurchaseResultDetail
  /* 17 */ @js.native
  object UseOtherFunctionSource extends TopLevel[UseOtherFunctionSource with Double]
  
  @js.native
  sealed trait UseOtherPaymentMethod extends EPurchaseResultDetail
  /* 16 */ @js.native
  object UseOtherPaymentMethod extends TopLevel[UseOtherPaymentMethod with Double]
  
  @js.native
  sealed trait WalletCurrencyMismatch extends EPurchaseResultDetail
  /* 31 */ @js.native
  object WalletCurrencyMismatch extends TopLevel[WalletCurrencyMismatch with Double]
  
  @js.native
  sealed trait WouldExceedMaxWallet extends EPurchaseResultDetail
  /* 35 */ @js.native
  object WouldExceedMaxWallet extends TopLevel[WouldExceedMaxWallet with Double]
  
  @js.native
  sealed trait WrongPrice extends EPurchaseResultDetail
  /* 10 */ @js.native
  object WrongPrice extends TopLevel[WrongPrice with Double]
}
