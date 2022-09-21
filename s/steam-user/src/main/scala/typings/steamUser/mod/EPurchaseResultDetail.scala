package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPurchaseResultDetail extends StObject
@JSImport("steam-user", "EPurchaseResultDetail")
@js.native
object EPurchaseResultDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResultDetail & Double] = js.native
  
  @js.native
  sealed trait AVSFailure
    extends StObject
       with EPurchaseResultDetail
  /* 1 */ val AVSFailure: typings.steamUser.mod.EPurchaseResultDetail.AVSFailure & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EPurchaseResultDetail
  /* 44 */ val AccountLocked: typings.steamUser.mod.EPurchaseResultDetail.AccountLocked & Double = js.native
  
  @js.native
  sealed trait AcctIsBlocked
    extends StObject
       with EPurchaseResultDetail
  /* 20 */ val AcctIsBlocked: typings.steamUser.mod.EPurchaseResultDetail.AcctIsBlocked & Double = js.native
  
  @js.native
  sealed trait AcctNotVerified
    extends StObject
       with EPurchaseResultDetail
  /* 21 */ val AcctNotVerified: typings.steamUser.mod.EPurchaseResultDetail.AcctNotVerified & Double = js.native
  
  @js.native
  sealed trait AddressInvalid
    extends StObject
       with EPurchaseResultDetail
  /* 78 */ val AddressInvalid: typings.steamUser.mod.EPurchaseResultDetail.AddressInvalid & Double = js.native
  
  @js.native
  sealed trait AlreadyPurchased
    extends StObject
       with EPurchaseResultDetail
  /* 9 */ val AlreadyPurchased: typings.steamUser.mod.EPurchaseResultDetail.AlreadyPurchased & Double = js.native
  
  @js.native
  sealed trait BadActivationCode
    extends StObject
       with EPurchaseResultDetail
  /* 14 */ val BadActivationCode: typings.steamUser.mod.EPurchaseResultDetail.BadActivationCode & Double = js.native
  
  @js.native
  sealed trait BillingAgreementAlreadyExists
    extends StObject
       with EPurchaseResultDetail
  /* 57 */ val BillingAgreementAlreadyExists: typings.steamUser.mod.EPurchaseResultDetail.BillingAgreementAlreadyExists & Double = js.native
  
  @js.native
  sealed trait BillingAgreementCancelled
    extends StObject
       with EPurchaseResultDetail
  /* 41 */ val BillingAgreementCancelled: typings.steamUser.mod.EPurchaseResultDetail.BillingAgreementCancelled & Double = js.native
  
  @js.native
  sealed trait BillingNameInvalidResemblesCreditCard
    extends StObject
       with EPurchaseResultDetail
  /* 81 */ val BillingNameInvalidResemblesCreditCard: typings.steamUser.mod.EPurchaseResultDetail.BillingNameInvalidResemblesCreditCard & Double = js.native
  
  @js.native
  sealed trait BlockedByUSGov
    extends StObject
       with EPurchaseResultDetail
  /* 68 */ val BlockedByUSGov: typings.steamUser.mod.EPurchaseResultDetail.BlockedByUSGov & Double = js.native
  
  @js.native
  sealed trait BundleTypeCannotBeGifted
    extends StObject
       with EPurchaseResultDetail
  /* 67 */ val BundleTypeCannotBeGifted: typings.steamUser.mod.EPurchaseResultDetail.BundleTypeCannotBeGifted & Double = js.native
  
  @js.native
  sealed trait BusinessStoreCountryCodeMismatch
    extends StObject
       with EPurchaseResultDetail
  /* 75 */ val BusinessStoreCountryCodeMismatch: typings.steamUser.mod.EPurchaseResultDetail.BusinessStoreCountryCodeMismatch & Double = js.native
  
  @js.native
  sealed trait CanceledByNewTransaction
    extends StObject
       with EPurchaseResultDetail
  /* 25 */ val CanceledByNewTransaction: typings.steamUser.mod.EPurchaseResultDetail.CanceledByNewTransaction & Double = js.native
  
  @js.native
  sealed trait CancelledByUser
    extends StObject
       with EPurchaseResultDetail
  /* 12 */ val CancelledByUser: typings.steamUser.mod.EPurchaseResultDetail.CancelledByUser & Double = js.native
  
  @js.native
  sealed trait CannotGiftShippedGoods
    extends StObject
       with EPurchaseResultDetail
  /* 39 */ val CannotGiftShippedGoods: typings.steamUser.mod.EPurchaseResultDetail.CannotGiftShippedGoods & Double = js.native
  
  @js.native
  sealed trait CannotRedeemCodeFromClient
    extends StObject
       with EPurchaseResultDetail
  /* 50 */ val CannotRedeemCodeFromClient: typings.steamUser.mod.EPurchaseResultDetail.CannotRedeemCodeFromClient & Double = js.native
  
  @js.native
  sealed trait CannotShipInternationally
    extends StObject
       with EPurchaseResultDetail
  /* 40 */ val CannotShipInternationally: typings.steamUser.mod.EPurchaseResultDetail.CannotShipInternationally & Double = js.native
  
  @js.native
  sealed trait CannotShipToCountry
    extends StObject
       with EPurchaseResultDetail
  /* 59 */ val CannotShipToCountry: typings.steamUser.mod.EPurchaseResultDetail.CannotShipToCountry & Double = js.native
  
  @js.native
  sealed trait CannotShipToMilitaryPostOffice
    extends StObject
       with EPurchaseResultDetail
  /* 80 */ val CannotShipToMilitaryPostOffice: typings.steamUser.mod.EPurchaseResultDetail.CannotShipToMilitaryPostOffice & Double = js.native
  
  @js.native
  sealed trait CannotShipToPOBox
    extends StObject
       with EPurchaseResultDetail
  /* 37 */ val CannotShipToPOBox: typings.steamUser.mod.EPurchaseResultDetail.CannotShipToPOBox & Double = js.native
  
  @js.native
  sealed trait CartValueTooHigh
    extends StObject
       with EPurchaseResultDetail
  /* 56 */ val CartValueTooHigh: typings.steamUser.mod.EPurchaseResultDetail.CartValueTooHigh & Double = js.native
  
  @js.native
  sealed trait ContactSupport
    extends StObject
       with EPurchaseResultDetail
  /* 3 */ val ContactSupport: typings.steamUser.mod.EPurchaseResultDetail.ContactSupport & Double = js.native
  
  @js.native
  sealed trait CreditCardBinMismatchesType
    extends StObject
       with EPurchaseResultDetail
  /* 55 */ val CreditCardBinMismatchesType: typings.steamUser.mod.EPurchaseResultDetail.CreditCardBinMismatchesType & Double = js.native
  
  @js.native
  sealed trait CreditCardNumberInvalid
    extends StObject
       with EPurchaseResultDetail
  /* 79 */ val CreditCardNumberInvalid: typings.steamUser.mod.EPurchaseResultDetail.CreditCardNumberInvalid & Double = js.native
  
  @js.native
  sealed trait DelayedCompletion
    extends StObject
       with EPurchaseResultDetail
  /* 66 */ val DelayedCompletion: typings.steamUser.mod.EPurchaseResultDetail.DelayedCompletion & Double = js.native
  
  @js.native
  sealed trait DoesNotOwnRequiredApp
    extends StObject
       with EPurchaseResultDetail
  /* 24 */ val DoesNotOwnRequiredApp: typings.steamUser.mod.EPurchaseResultDetail.DoesNotOwnRequiredApp & Double = js.native
  
  @js.native
  sealed trait DuplicateActivationCode
    extends StObject
       with EPurchaseResultDetail
  /* 15 */ val DuplicateActivationCode: typings.steamUser.mod.EPurchaseResultDetail.DuplicateActivationCode & Double = js.native
  
  @js.native
  sealed trait EmailNotValidated
    extends StObject
       with EPurchaseResultDetail
  /* 32 */ val EmailNotValidated: typings.steamUser.mod.EPurchaseResultDetail.EmailNotValidated & Double = js.native
  
  @js.native
  sealed trait ExceededSteamLimit
    extends StObject
       with EPurchaseResultDetail
  /* 46 */ val ExceededSteamLimit: typings.steamUser.mod.EPurchaseResultDetail.ExceededSteamLimit & Double = js.native
  
  @js.native
  sealed trait ExpiredCard
    extends StObject
       with EPurchaseResultDetail
  /* 33 */ val ExpiredCard: typings.steamUser.mod.EPurchaseResultDetail.ExpiredCard & Double = js.native
  
  @js.native
  sealed trait ExpiredCoupon
    extends StObject
       with EPurchaseResultDetail
  /* 43 */ val ExpiredCoupon: typings.steamUser.mod.EPurchaseResultDetail.ExpiredCoupon & Double = js.native
  
  @js.native
  sealed trait FailCurrencyTransProvider
    extends StObject
       with EPurchaseResultDetail
  /* 27 */ val FailCurrencyTransProvider: typings.steamUser.mod.EPurchaseResultDetail.FailCurrencyTransProvider & Double = js.native
  
  @js.native
  sealed trait FailedCyberCafe
    extends StObject
       with EPurchaseResultDetail
  /* 28 */ val FailedCyberCafe: typings.steamUser.mod.EPurchaseResultDetail.FailedCyberCafe & Double = js.native
  
  @js.native
  sealed trait ForceCanceledPending
    extends StObject
       with EPurchaseResultDetail
  /* 26 */ val ForceCanceledPending: typings.steamUser.mod.EPurchaseResultDetail.ForceCanceledPending & Double = js.native
  
  @js.native
  sealed trait FraudCheckFailed
    extends StObject
       with EPurchaseResultDetail
  /* 11 */ val FraudCheckFailed: typings.steamUser.mod.EPurchaseResultDetail.FraudCheckFailed & Double = js.native
  
  @js.native
  sealed trait GiftAlreadyOwned
    extends StObject
       with EPurchaseResultDetail
  /* 70 */ val GiftAlreadyOwned: typings.steamUser.mod.EPurchaseResultDetail.GiftAlreadyOwned & Double = js.native
  
  @js.native
  sealed trait GiftInvalidForRecipientRegion
    extends StObject
       with EPurchaseResultDetail
  /* 71 */ val GiftInvalidForRecipientRegion: typings.steamUser.mod.EPurchaseResultDetail.GiftInvalidForRecipientRegion & Double = js.native
  
  @js.native
  sealed trait GiftPricingImbalance
    extends StObject
       with EPurchaseResultDetail
  /* 72 */ val GiftPricingImbalance: typings.steamUser.mod.EPurchaseResultDetail.GiftPricingImbalance & Double = js.native
  
  @js.native
  sealed trait GiftRecipientNotSpecified
    extends StObject
       with EPurchaseResultDetail
  /* 73 */ val GiftRecipientNotSpecified: typings.steamUser.mod.EPurchaseResultDetail.GiftRecipientNotSpecified & Double = js.native
  
  @js.native
  sealed trait HungTransactionCancelled
    extends StObject
       with EPurchaseResultDetail
  /* 60 */ val HungTransactionCancelled: typings.steamUser.mod.EPurchaseResultDetail.HungTransactionCancelled & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EPurchaseResultDetail
  /* 2 */ val InsufficientFunds: typings.steamUser.mod.EPurchaseResultDetail.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientInventory
    extends StObject
       with EPurchaseResultDetail
  /* 38 */ val InsufficientInventory: typings.steamUser.mod.EPurchaseResultDetail.InsufficientInventory & Double = js.native
  
  @js.native
  sealed trait InvalidAccount
    extends StObject
       with EPurchaseResultDetail
  /* 22 */ val InvalidAccount: typings.steamUser.mod.EPurchaseResultDetail.InvalidAccount & Double = js.native
  
  @js.native
  sealed trait InvalidCoupon
    extends StObject
       with EPurchaseResultDetail
  /* 42 */ val InvalidCoupon: typings.steamUser.mod.EPurchaseResultDetail.InvalidCoupon & Double = js.native
  
  @js.native
  sealed trait InvalidData
    extends StObject
       with EPurchaseResultDetail
  /* 7 */ val InvalidData: typings.steamUser.mod.EPurchaseResultDetail.InvalidData & Double = js.native
  
  @js.native
  sealed trait InvalidPackage
    extends StObject
       with EPurchaseResultDetail
  /* 5 */ val InvalidPackage: typings.steamUser.mod.EPurchaseResultDetail.InvalidPackage & Double = js.native
  
  @js.native
  sealed trait InvalidPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 6 */ val InvalidPaymentMethod: typings.steamUser.mod.EPurchaseResultDetail.InvalidPaymentMethod & Double = js.native
  
  @js.native
  sealed trait InvalidShippingAddress
    extends StObject
       with EPurchaseResultDetail
  /* 18 */ val InvalidShippingAddress: typings.steamUser.mod.EPurchaseResultDetail.InvalidShippingAddress & Double = js.native
  
  @js.native
  sealed trait InvalidTaxAddress
    extends StObject
       with EPurchaseResultDetail
  /* 63 */ val InvalidTaxAddress: typings.steamUser.mod.EPurchaseResultDetail.InvalidTaxAddress & Double = js.native
  
  @js.native
  sealed trait ItemsNotAllowedForCommercialUse
    extends StObject
       with EPurchaseResultDetail
  /* 74 */ val ItemsNotAllowedForCommercialUse: typings.steamUser.mod.EPurchaseResultDetail.ItemsNotAllowedForCommercialUse & Double = js.native
  
  @js.native
  sealed trait ItemsReservedForCommercialUse
    extends StObject
       with EPurchaseResultDetail
  /* 69 */ val ItemsReservedForCommercialUse: typings.steamUser.mod.EPurchaseResultDetail.ItemsReservedForCommercialUse & Double = js.native
  
  @js.native
  sealed trait MustLoginPS3AppForPurchase
    extends StObject
       with EPurchaseResultDetail
  /* 36 */ val MustLoginPS3AppForPurchase: typings.steamUser.mod.EPurchaseResultDetail.MustLoginPS3AppForPurchase & Double = js.native
  
  @js.native
  sealed trait NeedsPreApproval
    extends StObject
       with EPurchaseResultDetail
  /* 29 */ val NeedsPreApproval: typings.steamUser.mod.EPurchaseResultDetail.NeedsPreApproval & Double = js.native
  
  @js.native
  sealed trait NoCachedPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 49 */ val NoCachedPaymentMethod: typings.steamUser.mod.EPurchaseResultDetail.NoCachedPaymentMethod & Double = js.native
  
  @js.native
  sealed trait NoDetail
    extends StObject
       with EPurchaseResultDetail
  /* 0 */ val NoDetail: typings.steamUser.mod.EPurchaseResultDetail.NoDetail & Double = js.native
  
  @js.native
  sealed trait NoWallet
    extends StObject
       with EPurchaseResultDetail
  /* 48 */ val NoWallet: typings.steamUser.mod.EPurchaseResultDetail.NoWallet & Double = js.native
  
  @js.native
  sealed trait OtherAbortableInProgress
    extends StObject
       with EPurchaseResultDetail
  /* 45 */ val OtherAbortableInProgress: typings.steamUser.mod.EPurchaseResultDetail.OtherAbortableInProgress & Double = js.native
  
  @js.native
  sealed trait OthersInProgress
    extends StObject
       with EPurchaseResultDetail
  /* 8 */ val OthersInProgress: typings.steamUser.mod.EPurchaseResultDetail.OthersInProgress & Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInCart
    extends StObject
       with EPurchaseResultDetail
  /* 47 */ val OverlappingPackagesInCart: typings.steamUser.mod.EPurchaseResultDetail.OverlappingPackagesInCart & Double = js.native
  
  @js.native
  sealed trait OverlappingPackagesInPendingTransaction
    extends StObject
       with EPurchaseResultDetail
  /* 52 */ val OverlappingPackagesInPendingTransaction: typings.steamUser.mod.EPurchaseResultDetail.OverlappingPackagesInPendingTransaction & Double = js.native
  
  @js.native
  sealed trait OwnsExcludedApp
    extends StObject
       with EPurchaseResultDetail
  /* 54 */ val OwnsExcludedApp: typings.steamUser.mod.EPurchaseResultDetail.OwnsExcludedApp & Double = js.native
  
  @js.native
  sealed trait POSACodeNotActivated
    extends StObject
       with EPurchaseResultDetail
  /* 58 */ val POSACodeNotActivated: typings.steamUser.mod.EPurchaseResultDetail.POSACodeNotActivated & Double = js.native
  
  @js.native
  sealed trait PaymentMethodNotSupportedForProduct
    extends StObject
       with EPurchaseResultDetail
  /* 83 */ val PaymentMethodNotSupportedForProduct: typings.steamUser.mod.EPurchaseResultDetail.PaymentMethodNotSupportedForProduct & Double = js.native
  
  @js.native
  sealed trait PaymentMethodTemporarilyUnavailable
    extends StObject
       with EPurchaseResultDetail
  /* 82 */ val PaymentMethodTemporarilyUnavailable: typings.steamUser.mod.EPurchaseResultDetail.PaymentMethodTemporarilyUnavailable & Double = js.native
  
  @js.native
  sealed trait PaypalInternalError
    extends StObject
       with EPurchaseResultDetail
  /* 61 */ val PaypalInternalError: typings.steamUser.mod.EPurchaseResultDetail.PaypalInternalError & Double = js.native
  
  @js.native
  sealed trait PhysicalProductLimitExceeded
    extends StObject
       with EPurchaseResultDetail
  /* 64 */ val PhysicalProductLimitExceeded: typings.steamUser.mod.EPurchaseResultDetail.PhysicalProductLimitExceeded & Double = js.native
  
  @js.native
  sealed trait PreApprovalDenied
    extends StObject
       with EPurchaseResultDetail
  /* 30 */ val PreApprovalDenied: typings.steamUser.mod.EPurchaseResultDetail.PreApprovalDenied & Double = js.native
  
  @js.native
  sealed trait PurchaseAmountNoSupportedByProvider
    extends StObject
       with EPurchaseResultDetail
  /* 51 */ val PurchaseAmountNoSupportedByProvider: typings.steamUser.mod.EPurchaseResultDetail.PurchaseAmountNoSupportedByProvider & Double = js.native
  
  @js.native
  sealed trait PurchaseCannotBeReplayed
    extends StObject
       with EPurchaseResultDetail
  /* 65 */ val PurchaseCannotBeReplayed: typings.steamUser.mod.EPurchaseResultDetail.PurchaseCannotBeReplayed & Double = js.native
  
  @js.native
  sealed trait RateLimited
    extends StObject
       with EPurchaseResultDetail
  /* 53 */ val RateLimited: typings.steamUser.mod.EPurchaseResultDetail.RateLimited & Double = js.native
  
  @js.native
  sealed trait RegionNotSupported
    extends StObject
       with EPurchaseResultDetail
  /* 19 */ val RegionNotSupported: typings.steamUser.mod.EPurchaseResultDetail.RegionNotSupported & Double = js.native
  
  @js.native
  sealed trait RestrictedCountry
    extends StObject
       with EPurchaseResultDetail
  /* 13 */ val RestrictedCountry: typings.steamUser.mod.EPurchaseResultDetail.RestrictedCountry & Double = js.native
  
  @js.native
  sealed trait StoreBillingCountryMismatch
    extends StObject
       with EPurchaseResultDetail
  /* 23 */ val StoreBillingCountryMismatch: typings.steamUser.mod.EPurchaseResultDetail.StoreBillingCountryMismatch & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EPurchaseResultDetail
  /* 4 */ val Timeout: typings.steamUser.mod.EPurchaseResultDetail.Timeout & Double = js.native
  
  @js.native
  sealed trait TransactionExpired
    extends StObject
       with EPurchaseResultDetail
  /* 34 */ val TransactionExpired: typings.steamUser.mod.EPurchaseResultDetail.TransactionExpired & Double = js.native
  
  @js.native
  sealed trait UnknownGlobalCollectError
    extends StObject
       with EPurchaseResultDetail
  /* 62 */ val UnknownGlobalCollectError: typings.steamUser.mod.EPurchaseResultDetail.UnknownGlobalCollectError & Double = js.native
  
  @js.native
  sealed trait UseOtherFunctionSource
    extends StObject
       with EPurchaseResultDetail
  /* 17 */ val UseOtherFunctionSource: typings.steamUser.mod.EPurchaseResultDetail.UseOtherFunctionSource & Double = js.native
  
  @js.native
  sealed trait UseOtherPaymentMethod
    extends StObject
       with EPurchaseResultDetail
  /* 16 */ val UseOtherPaymentMethod: typings.steamUser.mod.EPurchaseResultDetail.UseOtherPaymentMethod & Double = js.native
  
  @js.native
  sealed trait UserAssociatedWithManyCafes
    extends StObject
       with EPurchaseResultDetail
  /* 76 */ val UserAssociatedWithManyCafes: typings.steamUser.mod.EPurchaseResultDetail.UserAssociatedWithManyCafes & Double = js.native
  
  @js.native
  sealed trait UserNotAssociatedWithCafe
    extends StObject
       with EPurchaseResultDetail
  /* 77 */ val UserNotAssociatedWithCafe: typings.steamUser.mod.EPurchaseResultDetail.UserNotAssociatedWithCafe & Double = js.native
  
  @js.native
  sealed trait WalletCurrencyMismatch
    extends StObject
       with EPurchaseResultDetail
  /* 31 */ val WalletCurrencyMismatch: typings.steamUser.mod.EPurchaseResultDetail.WalletCurrencyMismatch & Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxWallet
    extends StObject
       with EPurchaseResultDetail
  /* 35 */ val WouldExceedMaxWallet: typings.steamUser.mod.EPurchaseResultDetail.WouldExceedMaxWallet & Double = js.native
  
  @js.native
  sealed trait WrongPrice
    extends StObject
       with EPurchaseResultDetail
  /* 10 */ val WrongPrice: typings.steamUser.mod.EPurchaseResultDetail.WrongPrice & Double = js.native
}
