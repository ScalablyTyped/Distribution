package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends js.Object
@JSImport("steam-client", "EResult")
@js.native
object EResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  
  @js.native
  sealed trait AccessDenied extends EResult
  /* 15 */ @js.native
  object AccessDenied extends TopLevel[AccessDenied with Double]
  
  @js.native
  sealed trait AccountActivityLimitExceeded extends EResult
  /* 96 */ @js.native
  object AccountActivityLimitExceeded extends TopLevel[AccountActivityLimitExceeded with Double]
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners extends EResult
  /* 90 */ @js.native
  object AccountAssociatedToMultiplePartners extends TopLevel[AccountAssociatedToMultiplePartners with Double]
  
   // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers extends EResult
  /* 90 */ @js.native
  object AccountAssociatedToMultiplePlayers extends TopLevel[AccountAssociatedToMultiplePlayers with Double]
  
  @js.native
  sealed trait AccountDisabled extends EResult
  /* 43 */ @js.native
  object AccountDisabled extends TopLevel[AccountDisabled with Double]
  
  @js.native
  sealed trait AccountLimitExceeded extends EResult
  /* 95 */ @js.native
  object AccountLimitExceeded extends TopLevel[AccountLimitExceeded with Double]
  
   // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLocked extends EResult
  /* 73 */ @js.native
  object AccountLocked extends TopLevel[AccountLocked with Double]
  
  @js.native
  sealed trait AccountLockedDown extends EResult
  /* 73 */ @js.native
  object AccountLockedDown extends TopLevel[AccountLockedDown with Double]
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor extends EResult
  /* 85 */ @js.native
  object AccountLoginDeniedNeedTwoFactor extends TopLevel[AccountLoginDeniedNeedTwoFactor with Double]
  
  @js.native
  sealed trait AccountLoginDeniedThrottle extends EResult
  /* 87 */ @js.native
  object AccountLoginDeniedThrottle extends TopLevel[AccountLoginDeniedThrottle with Double]
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  /* 63 */ @js.native
  object AccountLogonDenied extends TopLevel[AccountLogonDenied with Double]
  
   // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode extends EResult
  /* 85 */ @js.native
  object AccountLogonDeniedNeedTwoFactorCode extends TopLevel[AccountLogonDeniedNeedTwoFactorCode with Double]
  
  @js.native
  sealed trait AccountLogonDeniedNoMail extends EResult
  /* 66 */ @js.native
  object AccountLogonDeniedNoMail extends TopLevel[AccountLogonDeniedNoMail with Double]
  
   // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMailSent extends EResult
  /* 66 */ @js.native
  object AccountLogonDeniedNoMailSent extends TopLevel[AccountLogonDeniedNoMailSent with Double]
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired extends EResult
  /* 74 */ @js.native
  object AccountLogonDeniedVerifiedEmailRequired extends TopLevel[AccountLogonDeniedVerifiedEmailRequired with Double]
  
  @js.native
  sealed trait AccountNotFeatured extends EResult
  /* 45 */ @js.native
  object AccountNotFeatured extends TopLevel[AccountNotFeatured with Double]
  
  @js.native
  sealed trait AccountNotFound extends EResult
  /* 18 */ @js.native
  object AccountNotFound extends TopLevel[AccountNotFound with Double]
  
  @js.native
  sealed trait AdministratorOK extends EResult
  /* 46 */ @js.native
  object AdministratorOK extends TopLevel[AdministratorOK with Double]
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere extends EResult
  /* 50 */ @js.native
  object AlreadyLoggedInElsewhere extends TopLevel[AlreadyLoggedInElsewhere with Double]
  
  @js.native
  sealed trait AlreadyOwned extends EResult
  /* 30 */ @js.native
  object AlreadyOwned extends TopLevel[AlreadyOwned with Double]
  
  @js.native
  sealed trait AlreadyRedeemed extends EResult
  /* 28 */ @js.native
  object AlreadyRedeemed extends TopLevel[AlreadyRedeemed with Double]
  
  @js.native
  sealed trait BadResponse extends EResult
  /* 76 */ @js.native
  object BadResponse extends TopLevel[BadResponse with Double]
  
  @js.native
  sealed trait Banned extends EResult
  /* 17 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  @js.native
  sealed trait Blocked extends EResult
  /* 40 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  @js.native
  sealed trait Busy extends EResult
  /* 10 */ @js.native
  object Busy extends TopLevel[Busy with Double]
  
  @js.native
  sealed trait Cancelled extends EResult
  /* 52 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  @js.native
  sealed trait CannotUseOldPassword extends EResult
  /* 64 */ @js.native
  object CannotUseOldPassword extends TopLevel[CannotUseOldPassword with Double]
  
  @js.native
  sealed trait ConnectFailed extends EResult
  /* 35 */ @js.native
  object ConnectFailed extends TopLevel[ConnectFailed with Double]
  
  @js.native
  sealed trait ContentVersion extends EResult
  /* 47 */ @js.native
  object ContentVersion extends TopLevel[ContentVersion with Double]
  
  @js.native
  sealed trait DataCorruption extends EResult
  /* 53 */ @js.native
  object DataCorruption extends TopLevel[DataCorruption with Double]
  
  @js.native
  sealed trait Disabled extends EResult
  /* 80 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  @js.native
  sealed trait DiskFull extends EResult
  /* 54 */ @js.native
  object DiskFull extends TopLevel[DiskFull with Double]
  
  @js.native
  sealed trait DuplicateName extends EResult
  /* 14 */ @js.native
  object DuplicateName extends TopLevel[DuplicateName with Double]
  
  @js.native
  sealed trait DuplicateRequest extends EResult
  /* 29 */ @js.native
  object DuplicateRequest extends TopLevel[DuplicateRequest with Double]
  
  @js.native
  sealed trait EmailSendFailure extends EResult
  /* 99 */ @js.native
  object EmailSendFailure extends TopLevel[EmailSendFailure with Double]
  
  @js.native
  sealed trait EncryptionFailure extends EResult
  /* 23 */ @js.native
  object EncryptionFailure extends TopLevel[EncryptionFailure with Double]
  
  @js.native
  sealed trait Expired extends EResult
  /* 27 */ @js.native
  object Expired extends TopLevel[Expired with Double]
  
  @js.native
  sealed trait ExpiredLoginAuthCode extends EResult
  /* 71 */ @js.native
  object ExpiredLoginAuthCode extends TopLevel[ExpiredLoginAuthCode with Double]
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked extends EResult
  /* 59 */ @js.native
  object ExternalAccountAlreadyLinked extends TopLevel[ExternalAccountAlreadyLinked with Double]
  
  @js.native
  sealed trait ExternalAccountUnlinked extends EResult
  /* 57 */ @js.native
  object ExternalAccountUnlinked extends TopLevel[ExternalAccountUnlinked with Double]
  
  @js.native
  sealed trait FacebookQueryError extends EResult
  /* 70 */ @js.native
  object FacebookQueryError extends TopLevel[FacebookQueryError with Double]
  
  @js.native
  sealed trait Fail extends EResult
  /* 2 */ @js.native
  object Fail extends TopLevel[Fail with Double]
  
  @js.native
  sealed trait FileNotFound extends EResult
  /* 9 */ @js.native
  object FileNotFound extends TopLevel[FileNotFound with Double]
  
  @js.native
  sealed trait GSLTDenied extends EResult
  /* 102 */ @js.native
  object GSLTDenied extends TopLevel[GSLTDenied with Double]
  
  @js.native
  sealed trait GSLTExpired extends EResult
  /* 106 */ @js.native
  object GSLTExpired extends TopLevel[GSLTExpired with Double]
  
  @js.native
  sealed trait GSOwnerDenied extends EResult
  /* 103 */ @js.native
  object GSOwnerDenied extends TopLevel[GSOwnerDenied with Double]
  
  @js.native
  sealed trait HandshakeFailed extends EResult
  /* 36 */ @js.native
  object HandshakeFailed extends TopLevel[HandshakeFailed with Double]
  
  @js.native
  sealed trait HardwareNotCapableOfIPT extends EResult
  /* 67 */ @js.native
  object HardwareNotCapableOfIPT extends TopLevel[HardwareNotCapableOfIPT with Double]
  
  @js.native
  sealed trait IOFailure extends EResult
  /* 37 */ @js.native
  object IOFailure extends TopLevel[IOFailure with Double]
  
  @js.native
  sealed trait IPBanned extends EResult
  /* 105 */ @js.native
  object IPBanned extends TopLevel[IPBanned with Double]
  
  @js.native
  sealed trait IPLoginRestrictionFailed extends EResult
  /* 72 */ @js.native
  object IPLoginRestrictionFailed extends TopLevel[IPLoginRestrictionFailed with Double]
  
  @js.native
  sealed trait IPNotFound extends EResult
  /* 31 */ @js.native
  object IPNotFound extends TopLevel[IPNotFound with Double]
  
  @js.native
  sealed trait IPTInitError extends EResult
  /* 68 */ @js.native
  object IPTInitError extends TopLevel[IPTInitError with Double]
  
  @js.native
  sealed trait Ignored extends EResult
  /* 41 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  @js.native
  sealed trait IllegalPassword extends EResult
  /* 61 */ @js.native
  object IllegalPassword extends TopLevel[IllegalPassword with Double]
  
  @js.native
  sealed trait InsufficientFunds extends EResult
  /* 107 */ @js.native
  object InsufficientFunds extends TopLevel[InsufficientFunds with Double]
  
  @js.native
  sealed trait InsufficientPrivilege extends EResult
  /* 24 */ @js.native
  object InsufficientPrivilege extends TopLevel[InsufficientPrivilege with Double]
  
  @js.native
  sealed trait Invalid extends EResult
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait InvalidCEGSubmission extends EResult
  /* 81 */ @js.native
  object InvalidCEGSubmission extends TopLevel[InvalidCEGSubmission with Double]
  
  @js.native
  sealed trait InvalidEmail extends EResult
  /* 13 */ @js.native
  object InvalidEmail extends TopLevel[InvalidEmail with Double]
  
  @js.native
  sealed trait InvalidItemType extends EResult
  /* 104 */ @js.native
  object InvalidItemType extends TopLevel[InvalidItemType with Double]
  
  @js.native
  sealed trait InvalidLoginAuthCode extends EResult
  /* 65 */ @js.native
  object InvalidLoginAuthCode extends TopLevel[InvalidLoginAuthCode with Double]
  
  @js.native
  sealed trait InvalidName extends EResult
  /* 12 */ @js.native
  object InvalidName extends TopLevel[InvalidName with Double]
  
  @js.native
  sealed trait InvalidParam extends EResult
  /* 8 */ @js.native
  object InvalidParam extends TopLevel[InvalidParam with Double]
  
  @js.native
  sealed trait InvalidPassword extends EResult
  /* 5 */ @js.native
  object InvalidPassword extends TopLevel[InvalidPassword with Double]
  
  @js.native
  sealed trait InvalidProtocolVer extends EResult
  /* 7 */ @js.native
  object InvalidProtocolVer extends TopLevel[InvalidProtocolVer with Double]
  
  @js.native
  sealed trait InvalidState extends EResult
  /* 11 */ @js.native
  object InvalidState extends TopLevel[InvalidState with Double]
  
  @js.native
  sealed trait InvalidSteamID extends EResult
  /* 19 */ @js.native
  object InvalidSteamID extends TopLevel[InvalidSteamID with Double]
  
  @js.native
  sealed trait ItemDeleted extends EResult
  /* 86 */ @js.native
  object ItemDeleted extends TopLevel[ItemDeleted with Double]
  
   // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted extends EResult
  /* 86 */ @js.native
  object ItemOrEntryHasBeenDeleted extends TopLevel[ItemOrEntryHasBeenDeleted with Double]
  
  @js.native
  sealed trait LimitExceeded extends EResult
  /* 25 */ @js.native
  object LimitExceeded extends TopLevel[LimitExceeded with Double]
  
  @js.native
  sealed trait LockingFailed extends EResult
  /* 33 */ @js.native
  object LockingFailed extends TopLevel[LockingFailed with Double]
  
  @js.native
  sealed trait LoggedInElsewhere extends EResult
  /* 6 */ @js.native
  object LoggedInElsewhere extends TopLevel[LoggedInElsewhere with Double]
  
  @js.native
  sealed trait LogonSessionReplaced extends EResult
  /* 34 */ @js.native
  object LogonSessionReplaced extends TopLevel[LogonSessionReplaced with Double]
  
  @js.native
  sealed trait NeedCaptcha extends EResult
  /* 101 */ @js.native
  object NeedCaptcha extends TopLevel[NeedCaptcha with Double]
  
  @js.native
  sealed trait NoConnection extends EResult
  /* 3 */ @js.native
  object NoConnection extends TopLevel[NoConnection with Double]
  
  @js.native
  sealed trait NoMatch extends EResult
  /* 42 */ @js.native
  object NoMatch extends TopLevel[NoMatch with Double]
  
  @js.native
  sealed trait NoMatchingURL extends EResult
  /* 75 */ @js.native
  object NoMatchingURL extends TopLevel[NoMatchingURL with Double]
  
  @js.native
  sealed trait NoMobileDevice extends EResult
  /* 92 */ @js.native
  object NoMobileDevice extends TopLevel[NoMobileDevice with Double]
  
   // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDeviceAvailable extends EResult
  /* 92 */ @js.native
  object NoMobileDeviceAvailable extends TopLevel[NoMobileDeviceAvailable with Double]
  
  @js.native
  sealed trait NoSiteLicensesFound extends EResult
  /* 109 */ @js.native
  object NoSiteLicensesFound extends TopLevel[NoSiteLicensesFound with Double]
  
  @js.native
  sealed trait NotLoggedOn extends EResult
  /* 21 */ @js.native
  object NotLoggedOn extends TopLevel[NotLoggedOn with Double]
  
  @js.native
  sealed trait NotModified extends EResult
  /* 91 */ @js.native
  object NotModified extends TopLevel[NotModified with Double]
  
  @js.native
  sealed trait NotSettled extends EResult
  /* 100 */ @js.native
  object NotSettled extends TopLevel[NotSettled with Double]
  
  @js.native
  sealed trait OK extends EResult
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait PSNTicketInvalid extends EResult
  /* 58 */ @js.native
  object PSNTicketInvalid extends TopLevel[PSNTicketInvalid with Double]
  
  @js.native
  sealed trait ParentalControlRestricted extends EResult
  /* 69 */ @js.native
  object ParentalControlRestricted extends TopLevel[ParentalControlRestricted with Double]
  
   // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordNotSet extends EResult
  /* 56 */ @js.native
  object PasswordNotSet extends TopLevel[PasswordNotSet with Double]
  
  @js.native
  sealed trait PasswordRequiredToKickSession extends EResult
  /* 49 */ @js.native
  object PasswordRequiredToKickSession extends TopLevel[PasswordRequiredToKickSession with Double]
  
  @js.native
  sealed trait PasswordUnset extends EResult
  /* 56 */ @js.native
  object PasswordUnset extends TopLevel[PasswordUnset with Double]
  
  @js.native
  sealed trait Pending extends EResult
  /* 22 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  @js.native
  sealed trait PersistFailed extends EResult
  /* 32 */ @js.native
  object PersistFailed extends TopLevel[PersistFailed with Double]
  
  @js.native
  sealed trait PhoneActivityLimitExceeded extends EResult
  /* 97 */ @js.native
  object PhoneActivityLimitExceeded extends TopLevel[PhoneActivityLimitExceeded with Double]
  
  @js.native
  sealed trait RateLimitExceeded extends EResult
  /* 84 */ @js.native
  object RateLimitExceeded extends TopLevel[RateLimitExceeded with Double]
  
  @js.native
  sealed trait RefundToWallet extends EResult
  /* 98 */ @js.native
  object RefundToWallet extends TopLevel[RefundToWallet with Double]
  
  @js.native
  sealed trait RegionLocked extends EResult
  /* 83 */ @js.native
  object RegionLocked extends TopLevel[RegionLocked with Double]
  
  @js.native
  sealed trait RemoteCallFailed extends EResult
  /* 55 */ @js.native
  object RemoteCallFailed extends TopLevel[RemoteCallFailed with Double]
  
  @js.native
  sealed trait RemoteDisconnect extends EResult
  /* 38 */ @js.native
  object RemoteDisconnect extends TopLevel[RemoteDisconnect with Double]
  
  @js.native
  sealed trait RemoteFileConflict extends EResult
  /* 60 */ @js.native
  object RemoteFileConflict extends TopLevel[RemoteFileConflict with Double]
  
  @js.native
  sealed trait RequirePasswordReEntry extends EResult
  /* 77 */ @js.native
  object RequirePasswordReEntry extends TopLevel[RequirePasswordReEntry with Double]
  
  @js.native
  sealed trait RestrictedDevice extends EResult
  /* 82 */ @js.native
  object RestrictedDevice extends TopLevel[RestrictedDevice with Double]
  
  @js.native
  sealed trait Revoked extends EResult
  /* 26 */ @js.native
  object Revoked extends TopLevel[Revoked with Double]
  
  @js.native
  sealed trait SMSCodeFailed extends EResult
  /* 94 */ @js.native
  object SMSCodeFailed extends TopLevel[SMSCodeFailed with Double]
  
  @js.native
  sealed trait SameAsPreviousValue extends EResult
  /* 62 */ @js.native
  object SameAsPreviousValue extends TopLevel[SameAsPreviousValue with Double]
  
  @js.native
  sealed trait ServiceReadOnly extends EResult
  /* 44 */ @js.native
  object ServiceReadOnly extends TopLevel[ServiceReadOnly with Double]
  
  @js.native
  sealed trait ServiceUnavailable extends EResult
  /* 20 */ @js.native
  object ServiceUnavailable extends TopLevel[ServiceUnavailable with Double]
  
  @js.native
  sealed trait ShoppingCartNotFound extends EResult
  /* 39 */ @js.native
  object ShoppingCartNotFound extends TopLevel[ShoppingCartNotFound with Double]
  
  @js.native
  sealed trait Suspended extends EResult
  /* 51 */ @js.native
  object Suspended extends TopLevel[Suspended with Double]
  
   // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeIsOutOfSync extends EResult
  /* 93 */ @js.native
  object TimeIsOutOfSync extends TopLevel[TimeIsOutOfSync with Double]
  
  @js.native
  sealed trait TimeNotSynced extends EResult
  /* 93 */ @js.native
  object TimeNotSynced extends TopLevel[TimeNotSynced with Double]
  
  @js.native
  sealed trait Timeout extends EResult
  /* 16 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
   // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait TooManyAccountsAccessThisResource extends EResult
  /* 95 */ @js.native
  object TooManyAccountsAccessThisResource extends TopLevel[TooManyAccountsAccessThisResource with Double]
  
  @js.native
  sealed trait TooManyPending extends EResult
  /* 108 */ @js.native
  object TooManyPending extends TopLevel[TooManyPending with Double]
  
  @js.native
  sealed trait TryAnotherCM extends EResult
  /* 48 */ @js.native
  object TryAnotherCM extends TopLevel[TryAnotherCM with Double]
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch extends EResult
  /* 89 */ @js.native
  object TwoFactorActivationCodeMismatch extends TopLevel[TwoFactorActivationCodeMismatch with Double]
  
  @js.native
  sealed trait TwoFactorCodeMismatch extends EResult
  /* 88 */ @js.native
  object TwoFactorCodeMismatch extends TopLevel[TwoFactorCodeMismatch with Double]
  
  @js.native
  sealed trait UnexpectedError extends EResult
  /* 79 */ @js.native
  object UnexpectedError extends TopLevel[UnexpectedError with Double]
  
  @js.native
  sealed trait ValueOutOfRange extends EResult
  /* 78 */ @js.native
  object ValueOutOfRange extends TopLevel[ValueOutOfRange with Double]
  
  @js.native
  sealed trait WGNetworkSendExceeded extends EResult
  /* 110 */ @js.native
  object WGNetworkSendExceeded extends TopLevel[WGNetworkSendExceeded with Double]
}
