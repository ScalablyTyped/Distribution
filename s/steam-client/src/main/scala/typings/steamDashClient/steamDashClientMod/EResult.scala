package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam-client", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccessDenied extends EResult
  
  @js.native
  sealed trait AccountActivityLimitExceeded extends EResult
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners extends EResult
  
   // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers extends EResult
  
  @js.native
  sealed trait AccountDisabled extends EResult
  
  @js.native
  sealed trait AccountLimitExceeded extends EResult
  
   // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLocked extends EResult
  
  @js.native
  sealed trait AccountLockedDown extends EResult
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor extends EResult
  
  @js.native
  sealed trait AccountLoginDeniedThrottle extends EResult
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  
   // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode extends EResult
  
  @js.native
  sealed trait AccountLogonDeniedNoMail extends EResult
  
   // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMailSent extends EResult
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired extends EResult
  
  @js.native
  sealed trait AccountNotFeatured extends EResult
  
  @js.native
  sealed trait AccountNotFound extends EResult
  
  @js.native
  sealed trait AdministratorOK extends EResult
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere extends EResult
  
  @js.native
  sealed trait AlreadyOwned extends EResult
  
  @js.native
  sealed trait AlreadyRedeemed extends EResult
  
  @js.native
  sealed trait BadResponse extends EResult
  
  @js.native
  sealed trait Banned extends EResult
  
  @js.native
  sealed trait Blocked extends EResult
  
  @js.native
  sealed trait Busy extends EResult
  
  @js.native
  sealed trait Cancelled extends EResult
  
  @js.native
  sealed trait CannotUseOldPassword extends EResult
  
  @js.native
  sealed trait ConnectFailed extends EResult
  
  @js.native
  sealed trait ContentVersion extends EResult
  
  @js.native
  sealed trait DataCorruption extends EResult
  
  @js.native
  sealed trait Disabled extends EResult
  
  @js.native
  sealed trait DiskFull extends EResult
  
  @js.native
  sealed trait DuplicateName extends EResult
  
  @js.native
  sealed trait DuplicateRequest extends EResult
  
  @js.native
  sealed trait EmailSendFailure extends EResult
  
  @js.native
  sealed trait EncryptionFailure extends EResult
  
  @js.native
  sealed trait Expired extends EResult
  
  @js.native
  sealed trait ExpiredLoginAuthCode extends EResult
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked extends EResult
  
  @js.native
  sealed trait ExternalAccountUnlinked extends EResult
  
  @js.native
  sealed trait FacebookQueryError extends EResult
  
  @js.native
  sealed trait Fail extends EResult
  
  @js.native
  sealed trait FileNotFound extends EResult
  
  @js.native
  sealed trait GSLTDenied extends EResult
  
  @js.native
  sealed trait GSLTExpired extends EResult
  
  @js.native
  sealed trait GSOwnerDenied extends EResult
  
  @js.native
  sealed trait HandshakeFailed extends EResult
  
  @js.native
  sealed trait HardwareNotCapableOfIPT extends EResult
  
  @js.native
  sealed trait IOFailure extends EResult
  
  @js.native
  sealed trait IPBanned extends EResult
  
  @js.native
  sealed trait IPLoginRestrictionFailed extends EResult
  
  @js.native
  sealed trait IPNotFound extends EResult
  
  @js.native
  sealed trait IPTInitError extends EResult
  
  @js.native
  sealed trait Ignored extends EResult
  
  @js.native
  sealed trait IllegalPassword extends EResult
  
  @js.native
  sealed trait InsufficientFunds extends EResult
  
  @js.native
  sealed trait InsufficientPrivilege extends EResult
  
  @js.native
  sealed trait Invalid extends EResult
  
  @js.native
  sealed trait InvalidCEGSubmission extends EResult
  
  @js.native
  sealed trait InvalidEmail extends EResult
  
  @js.native
  sealed trait InvalidItemType extends EResult
  
  @js.native
  sealed trait InvalidLoginAuthCode extends EResult
  
  @js.native
  sealed trait InvalidName extends EResult
  
  @js.native
  sealed trait InvalidParam extends EResult
  
  @js.native
  sealed trait InvalidPassword extends EResult
  
  @js.native
  sealed trait InvalidProtocolVer extends EResult
  
  @js.native
  sealed trait InvalidState extends EResult
  
  @js.native
  sealed trait InvalidSteamID extends EResult
  
  @js.native
  sealed trait ItemDeleted extends EResult
  
   // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted extends EResult
  
  @js.native
  sealed trait LimitExceeded extends EResult
  
  @js.native
  sealed trait LockingFailed extends EResult
  
  @js.native
  sealed trait LoggedInElsewhere extends EResult
  
  @js.native
  sealed trait LogonSessionReplaced extends EResult
  
  @js.native
  sealed trait NeedCaptcha extends EResult
  
  @js.native
  sealed trait NoConnection extends EResult
  
  @js.native
  sealed trait NoMatch extends EResult
  
  @js.native
  sealed trait NoMatchingURL extends EResult
  
  @js.native
  sealed trait NoMobileDevice extends EResult
  
   // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDeviceAvailable extends EResult
  
  @js.native
  sealed trait NoSiteLicensesFound extends EResult
  
  @js.native
  sealed trait NotLoggedOn extends EResult
  
  @js.native
  sealed trait NotModified extends EResult
  
  @js.native
  sealed trait NotSettled extends EResult
  
  @js.native
  sealed trait OK extends EResult
  
  @js.native
  sealed trait PSNTicketInvalid extends EResult
  
  @js.native
  sealed trait ParentalControlRestricted extends EResult
  
   // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordNotSet extends EResult
  
  @js.native
  sealed trait PasswordRequiredToKickSession extends EResult
  
  @js.native
  sealed trait PasswordUnset extends EResult
  
  @js.native
  sealed trait Pending extends EResult
  
  @js.native
  sealed trait PersistFailed extends EResult
  
  @js.native
  sealed trait PhoneActivityLimitExceeded extends EResult
  
  @js.native
  sealed trait RateLimitExceeded extends EResult
  
  @js.native
  sealed trait RefundToWallet extends EResult
  
  @js.native
  sealed trait RegionLocked extends EResult
  
  @js.native
  sealed trait RemoteCallFailed extends EResult
  
  @js.native
  sealed trait RemoteDisconnect extends EResult
  
  @js.native
  sealed trait RemoteFileConflict extends EResult
  
  @js.native
  sealed trait RequirePasswordReEntry extends EResult
  
  @js.native
  sealed trait RestrictedDevice extends EResult
  
  @js.native
  sealed trait Revoked extends EResult
  
  @js.native
  sealed trait SMSCodeFailed extends EResult
  
  @js.native
  sealed trait SameAsPreviousValue extends EResult
  
  @js.native
  sealed trait ServiceReadOnly extends EResult
  
  @js.native
  sealed trait ServiceUnavailable extends EResult
  
  @js.native
  sealed trait ShoppingCartNotFound extends EResult
  
  @js.native
  sealed trait Suspended extends EResult
  
   // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeIsOutOfSync extends EResult
  
  @js.native
  sealed trait TimeNotSynced extends EResult
  
  @js.native
  sealed trait Timeout extends EResult
  
   // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait TooManyAccountsAccessThisResource extends EResult
  
  @js.native
  sealed trait TooManyPending extends EResult
  
  @js.native
  sealed trait TryAnotherCM extends EResult
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch extends EResult
  
  @js.native
  sealed trait TwoFactorCodeMismatch extends EResult
  
  @js.native
  sealed trait UnexpectedError extends EResult
  
  @js.native
  sealed trait ValueOutOfRange extends EResult
  
  @js.native
  sealed trait WGNetworkSendExceeded extends EResult
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  /* 15 */ @js.native
  object AccessDenied extends TopLevel[AccessDenied with Double]
  
  /* 96 */ @js.native
  object AccountActivityLimitExceeded extends TopLevel[AccountActivityLimitExceeded with Double]
  
  /* 90 */ @js.native
  object AccountAssociatedToMultiplePartners extends TopLevel[AccountAssociatedToMultiplePartners with Double]
  
  /* 90 */ @js.native
  object AccountAssociatedToMultiplePlayers extends TopLevel[AccountAssociatedToMultiplePlayers with Double]
  
  /* 43 */ @js.native
  object AccountDisabled extends TopLevel[AccountDisabled with Double]
  
  /* 95 */ @js.native
  object AccountLimitExceeded extends TopLevel[AccountLimitExceeded with Double]
  
  /* 73 */ @js.native
  object AccountLocked extends TopLevel[AccountLocked with Double]
  
  /* 73 */ @js.native
  object AccountLockedDown extends TopLevel[AccountLockedDown with Double]
  
  /* 85 */ @js.native
  object AccountLoginDeniedNeedTwoFactor extends TopLevel[AccountLoginDeniedNeedTwoFactor with Double]
  
  /* 87 */ @js.native
  object AccountLoginDeniedThrottle extends TopLevel[AccountLoginDeniedThrottle with Double]
  
  /* 63 */ @js.native
  object AccountLogonDenied extends TopLevel[AccountLogonDenied with Double]
  
  /* 85 */ @js.native
  object AccountLogonDeniedNeedTwoFactorCode extends TopLevel[AccountLogonDeniedNeedTwoFactorCode with Double]
  
  /* 66 */ @js.native
  object AccountLogonDeniedNoMail extends TopLevel[AccountLogonDeniedNoMail with Double]
  
  /* 66 */ @js.native
  object AccountLogonDeniedNoMailSent extends TopLevel[AccountLogonDeniedNoMailSent with Double]
  
  /* 74 */ @js.native
  object AccountLogonDeniedVerifiedEmailRequired extends TopLevel[AccountLogonDeniedVerifiedEmailRequired with Double]
  
  /* 45 */ @js.native
  object AccountNotFeatured extends TopLevel[AccountNotFeatured with Double]
  
  /* 18 */ @js.native
  object AccountNotFound extends TopLevel[AccountNotFound with Double]
  
  /* 46 */ @js.native
  object AdministratorOK extends TopLevel[AdministratorOK with Double]
  
  /* 50 */ @js.native
  object AlreadyLoggedInElsewhere extends TopLevel[AlreadyLoggedInElsewhere with Double]
  
  /* 30 */ @js.native
  object AlreadyOwned extends TopLevel[AlreadyOwned with Double]
  
  /* 28 */ @js.native
  object AlreadyRedeemed extends TopLevel[AlreadyRedeemed with Double]
  
  /* 76 */ @js.native
  object BadResponse extends TopLevel[BadResponse with Double]
  
  /* 17 */ @js.native
  object Banned extends TopLevel[Banned with Double]
  
  /* 40 */ @js.native
  object Blocked extends TopLevel[Blocked with Double]
  
  /* 10 */ @js.native
  object Busy extends TopLevel[Busy with Double]
  
  /* 52 */ @js.native
  object Cancelled extends TopLevel[Cancelled with Double]
  
  /* 64 */ @js.native
  object CannotUseOldPassword extends TopLevel[CannotUseOldPassword with Double]
  
  /* 35 */ @js.native
  object ConnectFailed extends TopLevel[ConnectFailed with Double]
  
  /* 47 */ @js.native
  object ContentVersion extends TopLevel[ContentVersion with Double]
  
  /* 53 */ @js.native
  object DataCorruption extends TopLevel[DataCorruption with Double]
  
  /* 80 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 54 */ @js.native
  object DiskFull extends TopLevel[DiskFull with Double]
  
  /* 14 */ @js.native
  object DuplicateName extends TopLevel[DuplicateName with Double]
  
  /* 29 */ @js.native
  object DuplicateRequest extends TopLevel[DuplicateRequest with Double]
  
  /* 99 */ @js.native
  object EmailSendFailure extends TopLevel[EmailSendFailure with Double]
  
  /* 23 */ @js.native
  object EncryptionFailure extends TopLevel[EncryptionFailure with Double]
  
  /* 27 */ @js.native
  object Expired extends TopLevel[Expired with Double]
  
  /* 71 */ @js.native
  object ExpiredLoginAuthCode extends TopLevel[ExpiredLoginAuthCode with Double]
  
  /* 59 */ @js.native
  object ExternalAccountAlreadyLinked extends TopLevel[ExternalAccountAlreadyLinked with Double]
  
  /* 57 */ @js.native
  object ExternalAccountUnlinked extends TopLevel[ExternalAccountUnlinked with Double]
  
  /* 70 */ @js.native
  object FacebookQueryError extends TopLevel[FacebookQueryError with Double]
  
  /* 2 */ @js.native
  object Fail extends TopLevel[Fail with Double]
  
  /* 9 */ @js.native
  object FileNotFound extends TopLevel[FileNotFound with Double]
  
  /* 102 */ @js.native
  object GSLTDenied extends TopLevel[GSLTDenied with Double]
  
  /* 106 */ @js.native
  object GSLTExpired extends TopLevel[GSLTExpired with Double]
  
  /* 103 */ @js.native
  object GSOwnerDenied extends TopLevel[GSOwnerDenied with Double]
  
  /* 36 */ @js.native
  object HandshakeFailed extends TopLevel[HandshakeFailed with Double]
  
  /* 67 */ @js.native
  object HardwareNotCapableOfIPT extends TopLevel[HardwareNotCapableOfIPT with Double]
  
  /* 37 */ @js.native
  object IOFailure extends TopLevel[IOFailure with Double]
  
  /* 105 */ @js.native
  object IPBanned extends TopLevel[IPBanned with Double]
  
  /* 72 */ @js.native
  object IPLoginRestrictionFailed extends TopLevel[IPLoginRestrictionFailed with Double]
  
  /* 31 */ @js.native
  object IPNotFound extends TopLevel[IPNotFound with Double]
  
  /* 68 */ @js.native
  object IPTInitError extends TopLevel[IPTInitError with Double]
  
  /* 41 */ @js.native
  object Ignored extends TopLevel[Ignored with Double]
  
  /* 61 */ @js.native
  object IllegalPassword extends TopLevel[IllegalPassword with Double]
  
  /* 107 */ @js.native
  object InsufficientFunds extends TopLevel[InsufficientFunds with Double]
  
  /* 24 */ @js.native
  object InsufficientPrivilege extends TopLevel[InsufficientPrivilege with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 81 */ @js.native
  object InvalidCEGSubmission extends TopLevel[InvalidCEGSubmission with Double]
  
  /* 13 */ @js.native
  object InvalidEmail extends TopLevel[InvalidEmail with Double]
  
  /* 104 */ @js.native
  object InvalidItemType extends TopLevel[InvalidItemType with Double]
  
  /* 65 */ @js.native
  object InvalidLoginAuthCode extends TopLevel[InvalidLoginAuthCode with Double]
  
  /* 12 */ @js.native
  object InvalidName extends TopLevel[InvalidName with Double]
  
  /* 8 */ @js.native
  object InvalidParam extends TopLevel[InvalidParam with Double]
  
  /* 5 */ @js.native
  object InvalidPassword extends TopLevel[InvalidPassword with Double]
  
  /* 7 */ @js.native
  object InvalidProtocolVer extends TopLevel[InvalidProtocolVer with Double]
  
  /* 11 */ @js.native
  object InvalidState extends TopLevel[InvalidState with Double]
  
  /* 19 */ @js.native
  object InvalidSteamID extends TopLevel[InvalidSteamID with Double]
  
  /* 86 */ @js.native
  object ItemDeleted extends TopLevel[ItemDeleted with Double]
  
  /* 86 */ @js.native
  object ItemOrEntryHasBeenDeleted extends TopLevel[ItemOrEntryHasBeenDeleted with Double]
  
  /* 25 */ @js.native
  object LimitExceeded extends TopLevel[LimitExceeded with Double]
  
  /* 33 */ @js.native
  object LockingFailed extends TopLevel[LockingFailed with Double]
  
  /* 6 */ @js.native
  object LoggedInElsewhere extends TopLevel[LoggedInElsewhere with Double]
  
  /* 34 */ @js.native
  object LogonSessionReplaced extends TopLevel[LogonSessionReplaced with Double]
  
  /* 101 */ @js.native
  object NeedCaptcha extends TopLevel[NeedCaptcha with Double]
  
  /* 3 */ @js.native
  object NoConnection extends TopLevel[NoConnection with Double]
  
  /* 42 */ @js.native
  object NoMatch extends TopLevel[NoMatch with Double]
  
  /* 75 */ @js.native
  object NoMatchingURL extends TopLevel[NoMatchingURL with Double]
  
  /* 92 */ @js.native
  object NoMobileDevice extends TopLevel[NoMobileDevice with Double]
  
  /* 92 */ @js.native
  object NoMobileDeviceAvailable extends TopLevel[NoMobileDeviceAvailable with Double]
  
  /* 109 */ @js.native
  object NoSiteLicensesFound extends TopLevel[NoSiteLicensesFound with Double]
  
  /* 21 */ @js.native
  object NotLoggedOn extends TopLevel[NotLoggedOn with Double]
  
  /* 91 */ @js.native
  object NotModified extends TopLevel[NotModified with Double]
  
  /* 100 */ @js.native
  object NotSettled extends TopLevel[NotSettled with Double]
  
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 58 */ @js.native
  object PSNTicketInvalid extends TopLevel[PSNTicketInvalid with Double]
  
  /* 69 */ @js.native
  object ParentalControlRestricted extends TopLevel[ParentalControlRestricted with Double]
  
  /* 56 */ @js.native
  object PasswordNotSet extends TopLevel[PasswordNotSet with Double]
  
  /* 49 */ @js.native
  object PasswordRequiredToKickSession extends TopLevel[PasswordRequiredToKickSession with Double]
  
  /* 56 */ @js.native
  object PasswordUnset extends TopLevel[PasswordUnset with Double]
  
  /* 22 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 32 */ @js.native
  object PersistFailed extends TopLevel[PersistFailed with Double]
  
  /* 97 */ @js.native
  object PhoneActivityLimitExceeded extends TopLevel[PhoneActivityLimitExceeded with Double]
  
  /* 84 */ @js.native
  object RateLimitExceeded extends TopLevel[RateLimitExceeded with Double]
  
  /* 98 */ @js.native
  object RefundToWallet extends TopLevel[RefundToWallet with Double]
  
  /* 83 */ @js.native
  object RegionLocked extends TopLevel[RegionLocked with Double]
  
  /* 55 */ @js.native
  object RemoteCallFailed extends TopLevel[RemoteCallFailed with Double]
  
  /* 38 */ @js.native
  object RemoteDisconnect extends TopLevel[RemoteDisconnect with Double]
  
  /* 60 */ @js.native
  object RemoteFileConflict extends TopLevel[RemoteFileConflict with Double]
  
  /* 77 */ @js.native
  object RequirePasswordReEntry extends TopLevel[RequirePasswordReEntry with Double]
  
  /* 82 */ @js.native
  object RestrictedDevice extends TopLevel[RestrictedDevice with Double]
  
  /* 26 */ @js.native
  object Revoked extends TopLevel[Revoked with Double]
  
  /* 94 */ @js.native
  object SMSCodeFailed extends TopLevel[SMSCodeFailed with Double]
  
  /* 62 */ @js.native
  object SameAsPreviousValue extends TopLevel[SameAsPreviousValue with Double]
  
  /* 44 */ @js.native
  object ServiceReadOnly extends TopLevel[ServiceReadOnly with Double]
  
  /* 20 */ @js.native
  object ServiceUnavailable extends TopLevel[ServiceUnavailable with Double]
  
  /* 39 */ @js.native
  object ShoppingCartNotFound extends TopLevel[ShoppingCartNotFound with Double]
  
  /* 51 */ @js.native
  object Suspended extends TopLevel[Suspended with Double]
  
  /* 93 */ @js.native
  object TimeIsOutOfSync extends TopLevel[TimeIsOutOfSync with Double]
  
  /* 93 */ @js.native
  object TimeNotSynced extends TopLevel[TimeNotSynced with Double]
  
  /* 16 */ @js.native
  object Timeout extends TopLevel[Timeout with Double]
  
  /* 95 */ @js.native
  object TooManyAccountsAccessThisResource extends TopLevel[TooManyAccountsAccessThisResource with Double]
  
  /* 108 */ @js.native
  object TooManyPending extends TopLevel[TooManyPending with Double]
  
  /* 48 */ @js.native
  object TryAnotherCM extends TopLevel[TryAnotherCM with Double]
  
  /* 89 */ @js.native
  object TwoFactorActivationCodeMismatch extends TopLevel[TwoFactorActivationCodeMismatch with Double]
  
  /* 88 */ @js.native
  object TwoFactorCodeMismatch extends TopLevel[TwoFactorCodeMismatch with Double]
  
  /* 79 */ @js.native
  object UnexpectedError extends TopLevel[UnexpectedError with Double]
  
  /* 78 */ @js.native
  object ValueOutOfRange extends TopLevel[ValueOutOfRange with Double]
  
  /* 110 */ @js.native
  object WGNetworkSendExceeded extends TopLevel[WGNetworkSendExceeded with Double]
  
}

