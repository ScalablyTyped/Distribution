package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail with Double] = js.native
  /* 1 */ @js.native
  object AVSFailure extends TopLevel[AVSFailure with Double]
  
  /* 44 */ @js.native
  object AccountLocked extends TopLevel[AccountLocked with Double]
  
  /* 20 */ @js.native
  object AcctIsBlocked extends TopLevel[AcctIsBlocked with Double]
  
  /* 21 */ @js.native
  object AcctNotVerified extends TopLevel[AcctNotVerified with Double]
  
  /* 9 */ @js.native
  object AlreadyPurchased extends TopLevel[AlreadyPurchased with Double]
  
  /* 14 */ @js.native
  object BadActivationCode extends TopLevel[BadActivationCode with Double]
  
  /* 57 */ @js.native
  object BillingAgreementAlreadyExists extends TopLevel[BillingAgreementAlreadyExists with Double]
  
  /* 41 */ @js.native
  object BillingAgreementCancelled extends TopLevel[BillingAgreementCancelled with Double]
  
  /* 67 */ @js.native
  object BundleTypeCannotBeGifted extends TopLevel[BundleTypeCannotBeGifted with Double]
  
  /* 25 */ @js.native
  object CanceledByNewTransaction extends TopLevel[CanceledByNewTransaction with Double]
  
  /* 12 */ @js.native
  object CancelledByUser extends TopLevel[CancelledByUser with Double]
  
  /* 39 */ @js.native
  object CannotGiftShippedGoods extends TopLevel[CannotGiftShippedGoods with Double]
  
  /* 50 */ @js.native
  object CannotRedeemCodeFromClient extends TopLevel[CannotRedeemCodeFromClient with Double]
  
  /* 40 */ @js.native
  object CannotShipInternationally extends TopLevel[CannotShipInternationally with Double]
  
  /* 59 */ @js.native
  object CannotShipToCountry extends TopLevel[CannotShipToCountry with Double]
  
  /* 37 */ @js.native
  object CannotShipToPOBox extends TopLevel[CannotShipToPOBox with Double]
  
  /* 56 */ @js.native
  object CartValueTooHigh extends TopLevel[CartValueTooHigh with Double]
  
  /* 3 */ @js.native
  object ContactSupport extends TopLevel[ContactSupport with Double]
  
  /* 55 */ @js.native
  object CreditCardBinMismatchesType extends TopLevel[CreditCardBinMismatchesType with Double]
  
  /* 66 */ @js.native
  object DelayedCompletion extends TopLevel[DelayedCompletion with Double]
  
  /* 24 */ @js.native
  object DoesNotOwnRequiredApp extends TopLevel[DoesNotOwnRequiredApp with Double]
  
  /* 15 */ @js.native
  object DuplicateActivationCode extends TopLevel[DuplicateActivationCode with Double]
  
  /* 32 */ @js.native
  object EmailNotValidated extends TopLevel[EmailNotValidated with Double]
  
  /* 46 */ @js.native
  object ExceededSteamLimit extends TopLevel[ExceededSteamLimit with Double]
  
  /* 33 */ @js.native
  object ExpiredCard extends TopLevel[ExpiredCard with Double]
  
  /* 43 */ @js.native
  object ExpiredCoupon extends TopLevel[ExpiredCoupon with Double]
  
  /* 27 */ @js.native
  object FailCurrencyTransProvider extends TopLevel[FailCurrencyTransProvider with Double]
  
  /* 28 */ @js.native
  object FailedCyberCafe extends TopLevel[FailedCyberCafe with Double]
  
  /* 26 */ @js.native
  object ForceCanceledPending extends TopLevel[ForceCanceledPending with Double]
  
  /* 11 */ @js.native
  object FraudCheckFailed extends TopLevel[FraudCheckFailed with Double]
  
  /* 60 */ @js.native
  object HungTransactionCancelled extends TopLevel[HungTransactionCancelled with Double]
  
  /* 2 */ @js.native
  object InsufficientFunds extends TopLevel[InsufficientFunds with Double]
  
  /* 38 */ @js.native
  object InsufficientInventory extends TopLevel[InsufficientInventory with Double]
  
  /* 22 */ @js.native
  object InvalidAccount extends TopLevel[InvalidAccount with Double]
  
  /* 42 */ @js.native
  object InvalidCoupon extends TopLevel[InvalidCoupon with Double]
  
  /* 7 */ @js.native
  object InvalidData extends TopLevel[InvalidData with Double]
  
  /* 5 */ @js.native
  object InvalidPackage extends TopLevel[InvalidPackage with Double]
  
  /* 6 */ @js.native
  object InvalidPaymentMethod extends TopLevel[InvalidPaymentMethod with Double]
  
  /* 18 */ @js.native
  object InvalidShippingAddress extends TopLevel[InvalidShippingAddress with Double]
  
  /* 63 */ @js.native
  object InvalidTaxAddress extends TopLevel[InvalidTaxAddress with Double]
  
  /* 36 */ @js.native
  object MustLoginPS3AppForPurchase extends TopLevel[MustLoginPS3AppForPurchase with Double]
  
  /* 29 */ @js.native
  object NeedsPreApproval extends TopLevel[NeedsPreApproval with Double]
  
  /* 49 */ @js.native
  object NoCachedPaymentMethod extends TopLevel[NoCachedPaymentMethod with Double]
  
  /* 0 */ @js.native
  object NoDetail extends TopLevel[NoDetail with Double]
  
  /* 48 */ @js.native
  object NoWallet extends TopLevel[NoWallet with Double]
  
  /* 45 */ @js.native
  object OtherAbortableInProgress extends TopLevel[OtherAbortableInProgress with Double]
  
  /* 8 */ @js.native
  object OthersInProgress extends TopLevel[OthersInProgress with Double]
  
  /* 47 */ @js.native
  object OverlappingPackagesInCart extends TopLevel[OverlappingPackagesInCart with Double]
  
  /* 52 */ @js.native
  object OverlappingPackagesInPendingTransaction extends TopLevel[OverlappingPackagesInPendingTransaction with Double]
  
  /* 54 */ @js.native
  object OwnsExcludedApp extends TopLevel[OwnsExcludedApp with Double]
  
  /* 58 */ @js.native
  object POSACodeNotActivated extends TopLevel[POSACodeNotActivated with Double]
  
  /* 61 */ @js.native
  object PaypalInternalError extends TopLevel[PaypalInternalError with Double]
  
  /* 64 */ @js.native
  object PhysicalProductLimitExceeded extends TopLevel[PhysicalProductLimitExceeded with Double]
  
  /* 30 */ @js.native
  object PreApprovalDenied extends TopLevel[PreApprovalDenied with Double]
  
  /* 51 */ @js.native
  object PurchaseAmountNoSupportedByProvider extends TopLevel[PurchaseAmountNoSupportedByProvider with Double]
  
  /* 65 */ @js.native
  object PurchaseCannotBeReplayed extends TopLevel[PurchaseCannotBeReplayed with Double]
  
  /* 53 */ @js.native
  object RateLimited extends TopLevel[RateLimited with Double]
  
  /* 19 */ @js.native
  object RegionNotSupported extends TopLevel[RegionNotSupported with Double]
  
  /* 13 */ @js.native
  object RestrictedCountry extends TopLevel[RestrictedCountry with Double]
  
  /* 23 */ @js.native
  object StoreBillingCountryMismatch extends TopLevel[StoreBillingCountryMismatch with Double]
  
  /* 4 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
  /* 34 */ @js.native
  object TransactionExpired extends TopLevel[TransactionExpired with Double]
  
  /* 62 */ @js.native
  object UnknownGlobalCollectError extends TopLevel[UnknownGlobalCollectError with Double]
  
  /* 17 */ @js.native
  object UseOtherFunctionSource extends TopLevel[UseOtherFunctionSource with Double]
  
  /* 16 */ @js.native
  object UseOtherPaymentMethod extends TopLevel[UseOtherPaymentMethod with Double]
  
  /* 31 */ @js.native
  object WalletCurrencyMismatch extends TopLevel[WalletCurrencyMismatch with Double]
  
  /* 35 */ @js.native
  object WouldExceedMaxWallet extends TopLevel[WouldExceedMaxWallet with Double]
  
  /* 10 */ @js.native
  object WrongPrice extends TopLevel[WrongPrice with Double]
  
}

