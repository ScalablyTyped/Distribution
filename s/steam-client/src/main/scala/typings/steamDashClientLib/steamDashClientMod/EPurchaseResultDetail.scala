package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPurchaseResultDetail extends js.Object

@JSImport("steam-client", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends js.Object {
  @js.native
  sealed trait AVSFailure
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait AccountLocked
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait AcctIsBlocked
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait AcctNotVerified
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait AlreadyPurchased
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait BadActivationCode
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementAlreadyExists
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait BillingAgreementCancelled
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait BundleTypeCannotBeGifted
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CanceledByNewTransaction
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CancelledByUser
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CannotGiftShippedGoods
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CannotRedeemCodeFromClient
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipInternationally
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToCountry
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CannotShipToPOBox
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CartValueTooHigh
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait ContactSupport
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait CreditCardBinMismatchesType
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait DelayedCompletion
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait DoesNotOwnRequiredApp
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait DuplicateActivationCode
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait EmailNotValidated
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait ExceededSteamLimit
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCard
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait ExpiredCoupon
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait FailCurrencyTransProvider
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait FailedCyberCafe
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait ForceCanceledPending
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait FraudCheckFailed
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait HungTransactionCancelled
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientFunds
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InsufficientInventory
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidAccount
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidCoupon
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidData
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPackage
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidPaymentMethod
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidShippingAddress
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait InvalidTaxAddress
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait NeedsPreApproval
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait NoCachedPaymentMethod
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait NoDetail
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait NoWallet
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait OtherAbortableInProgress
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait OthersInProgress
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInCart
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait OwnsExcludedApp
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait POSACodeNotActivated
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait PaypalInternalError
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait PhysicalProductLimitExceeded
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait PreApprovalDenied
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait PurchaseCannotBeReplayed
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait RateLimited
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait RegionNotSupported
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait RestrictedCountry
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait StoreBillingCountryMismatch
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait Timeout
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait TransactionExpired
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait UnknownGlobalCollectError
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherFunctionSource
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait UseOtherPaymentMethod
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait WalletCurrencyMismatch
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait WouldExceedMaxWallet
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  @js.native
  sealed trait WrongPrice
    extends steamDashClientLib.steamDashClientMod.EPurchaseResultDetail
  
  /* 1 */ val AVSFailure: AVSFailure with scala.Double = js.native
  /* 44 */ val AccountLocked: AccountLocked with scala.Double = js.native
  /* 20 */ val AcctIsBlocked: AcctIsBlocked with scala.Double = js.native
  /* 21 */ val AcctNotVerified: AcctNotVerified with scala.Double = js.native
  /* 9 */ val AlreadyPurchased: AlreadyPurchased with scala.Double = js.native
  /* 14 */ val BadActivationCode: BadActivationCode with scala.Double = js.native
  /* 57 */ val BillingAgreementAlreadyExists: BillingAgreementAlreadyExists with scala.Double = js.native
  /* 41 */ val BillingAgreementCancelled: BillingAgreementCancelled with scala.Double = js.native
  /* 67 */ val BundleTypeCannotBeGifted: BundleTypeCannotBeGifted with scala.Double = js.native
  /* 25 */ val CanceledByNewTransaction: CanceledByNewTransaction with scala.Double = js.native
  /* 12 */ val CancelledByUser: CancelledByUser with scala.Double = js.native
  /* 39 */ val CannotGiftShippedGoods: CannotGiftShippedGoods with scala.Double = js.native
  /* 50 */ val CannotRedeemCodeFromClient: CannotRedeemCodeFromClient with scala.Double = js.native
  /* 40 */ val CannotShipInternationally: CannotShipInternationally with scala.Double = js.native
  /* 59 */ val CannotShipToCountry: CannotShipToCountry with scala.Double = js.native
  /* 37 */ val CannotShipToPOBox: CannotShipToPOBox with scala.Double = js.native
  /* 56 */ val CartValueTooHigh: CartValueTooHigh with scala.Double = js.native
  /* 3 */ val ContactSupport: ContactSupport with scala.Double = js.native
  /* 55 */ val CreditCardBinMismatchesType: CreditCardBinMismatchesType with scala.Double = js.native
  /* 66 */ val DelayedCompletion: DelayedCompletion with scala.Double = js.native
  /* 24 */ val DoesNotOwnRequiredApp: DoesNotOwnRequiredApp with scala.Double = js.native
  /* 15 */ val DuplicateActivationCode: DuplicateActivationCode with scala.Double = js.native
  /* 32 */ val EmailNotValidated: EmailNotValidated with scala.Double = js.native
  /* 46 */ val ExceededSteamLimit: ExceededSteamLimit with scala.Double = js.native
  /* 33 */ val ExpiredCard: ExpiredCard with scala.Double = js.native
  /* 43 */ val ExpiredCoupon: ExpiredCoupon with scala.Double = js.native
  /* 27 */ val FailCurrencyTransProvider: FailCurrencyTransProvider with scala.Double = js.native
  /* 28 */ val FailedCyberCafe: FailedCyberCafe with scala.Double = js.native
  /* 26 */ val ForceCanceledPending: ForceCanceledPending with scala.Double = js.native
  /* 11 */ val FraudCheckFailed: FraudCheckFailed with scala.Double = js.native
  /* 60 */ val HungTransactionCancelled: HungTransactionCancelled with scala.Double = js.native
  /* 2 */ val InsufficientFunds: InsufficientFunds with scala.Double = js.native
  /* 38 */ val InsufficientInventory: InsufficientInventory with scala.Double = js.native
  /* 22 */ val InvalidAccount: InvalidAccount with scala.Double = js.native
  /* 42 */ val InvalidCoupon: InvalidCoupon with scala.Double = js.native
  /* 7 */ val InvalidData: InvalidData with scala.Double = js.native
  /* 5 */ val InvalidPackage: InvalidPackage with scala.Double = js.native
  /* 6 */ val InvalidPaymentMethod: InvalidPaymentMethod with scala.Double = js.native
  /* 18 */ val InvalidShippingAddress: InvalidShippingAddress with scala.Double = js.native
  /* 63 */ val InvalidTaxAddress: InvalidTaxAddress with scala.Double = js.native
  /* 36 */ val MustLoginPS3AppForPurchase: MustLoginPS3AppForPurchase with scala.Double = js.native
  /* 29 */ val NeedsPreApproval: NeedsPreApproval with scala.Double = js.native
  /* 49 */ val NoCachedPaymentMethod: NoCachedPaymentMethod with scala.Double = js.native
  /* 0 */ val NoDetail: NoDetail with scala.Double = js.native
  /* 48 */ val NoWallet: NoWallet with scala.Double = js.native
  /* 45 */ val OtherAbortableInProgress: OtherAbortableInProgress with scala.Double = js.native
  /* 8 */ val OthersInProgress: OthersInProgress with scala.Double = js.native
  /* 47 */ val OverlappingPackagesInCart: OverlappingPackagesInCart with scala.Double = js.native
  /* 52 */ val OverlappingPackagesInPendingTransaction: OverlappingPackagesInPendingTransaction with scala.Double = js.native
  /* 54 */ val OwnsExcludedApp: OwnsExcludedApp with scala.Double = js.native
  /* 58 */ val POSACodeNotActivated: POSACodeNotActivated with scala.Double = js.native
  /* 61 */ val PaypalInternalError: PaypalInternalError with scala.Double = js.native
  /* 64 */ val PhysicalProductLimitExceeded: PhysicalProductLimitExceeded with scala.Double = js.native
  /* 30 */ val PreApprovalDenied: PreApprovalDenied with scala.Double = js.native
  /* 51 */ val PurchaseAmountNoSupportedByProvider: PurchaseAmountNoSupportedByProvider with scala.Double = js.native
  /* 65 */ val PurchaseCannotBeReplayed: PurchaseCannotBeReplayed with scala.Double = js.native
  /* 53 */ val RateLimited: RateLimited with scala.Double = js.native
  /* 19 */ val RegionNotSupported: RegionNotSupported with scala.Double = js.native
  /* 13 */ val RestrictedCountry: RestrictedCountry with scala.Double = js.native
  /* 23 */ val StoreBillingCountryMismatch: StoreBillingCountryMismatch with scala.Double = js.native
  /* 4 */ val Timeout: Timeout with scala.Double = js.native
  /* 34 */ val TransactionExpired: TransactionExpired with scala.Double = js.native
  /* 62 */ val UnknownGlobalCollectError: UnknownGlobalCollectError with scala.Double = js.native
  /* 17 */ val UseOtherFunctionSource: UseOtherFunctionSource with scala.Double = js.native
  /* 16 */ val UseOtherPaymentMethod: UseOtherPaymentMethod with scala.Double = js.native
  /* 31 */ val WalletCurrencyMismatch: WalletCurrencyMismatch with scala.Double = js.native
  /* 35 */ val WouldExceedMaxWallet: WouldExceedMaxWallet with scala.Double = js.native
  /* 10 */ val WrongPrice: WrongPrice with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EPurchaseResultDetail with scala.Double] = js.native
}

