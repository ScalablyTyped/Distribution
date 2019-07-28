package typings.steamDashClient.steamDashClientMod

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
  
  /* 15 */ val AccessDenied: typings.steamDashClient.steamDashClientMod.EResult.AccessDenied with Double = js.native
  /* 96 */ val AccountActivityLimitExceeded: typings.steamDashClient.steamDashClientMod.EResult.AccountActivityLimitExceeded with Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePartners: typings.steamDashClient.steamDashClientMod.EResult.AccountAssociatedToMultiplePartners with Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePlayers: typings.steamDashClient.steamDashClientMod.EResult.AccountAssociatedToMultiplePlayers with Double = js.native
  /* 43 */ val AccountDisabled: typings.steamDashClient.steamDashClientMod.EResult.AccountDisabled with Double = js.native
  /* 95 */ val AccountLimitExceeded: typings.steamDashClient.steamDashClientMod.EResult.AccountLimitExceeded with Double = js.native
  /* 73 */ val AccountLocked: typings.steamDashClient.steamDashClientMod.EResult.AccountLocked with Double = js.native
  /* 73 */ val AccountLockedDown: typings.steamDashClient.steamDashClientMod.EResult.AccountLockedDown with Double = js.native
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typings.steamDashClient.steamDashClientMod.EResult.AccountLoginDeniedNeedTwoFactor with Double = js.native
  /* 87 */ val AccountLoginDeniedThrottle: typings.steamDashClient.steamDashClientMod.EResult.AccountLoginDeniedThrottle with Double = js.native
  /* 63 */ val AccountLogonDenied: typings.steamDashClient.steamDashClientMod.EResult.AccountLogonDenied with Double = js.native
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typings.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNeedTwoFactorCode with Double = js.native
  /* 66 */ val AccountLogonDeniedNoMail: typings.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNoMail with Double = js.native
  /* 66 */ val AccountLogonDeniedNoMailSent: typings.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedNoMailSent with Double = js.native
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typings.steamDashClient.steamDashClientMod.EResult.AccountLogonDeniedVerifiedEmailRequired with Double = js.native
  /* 45 */ val AccountNotFeatured: typings.steamDashClient.steamDashClientMod.EResult.AccountNotFeatured with Double = js.native
  /* 18 */ val AccountNotFound: typings.steamDashClient.steamDashClientMod.EResult.AccountNotFound with Double = js.native
  /* 46 */ val AdministratorOK: typings.steamDashClient.steamDashClientMod.EResult.AdministratorOK with Double = js.native
  /* 50 */ val AlreadyLoggedInElsewhere: typings.steamDashClient.steamDashClientMod.EResult.AlreadyLoggedInElsewhere with Double = js.native
  /* 30 */ val AlreadyOwned: typings.steamDashClient.steamDashClientMod.EResult.AlreadyOwned with Double = js.native
  /* 28 */ val AlreadyRedeemed: typings.steamDashClient.steamDashClientMod.EResult.AlreadyRedeemed with Double = js.native
  /* 76 */ val BadResponse: typings.steamDashClient.steamDashClientMod.EResult.BadResponse with Double = js.native
  /* 17 */ val Banned: typings.steamDashClient.steamDashClientMod.EResult.Banned with Double = js.native
  /* 40 */ val Blocked: typings.steamDashClient.steamDashClientMod.EResult.Blocked with Double = js.native
  /* 10 */ val Busy: typings.steamDashClient.steamDashClientMod.EResult.Busy with Double = js.native
  /* 52 */ val Cancelled: typings.steamDashClient.steamDashClientMod.EResult.Cancelled with Double = js.native
  /* 64 */ val CannotUseOldPassword: typings.steamDashClient.steamDashClientMod.EResult.CannotUseOldPassword with Double = js.native
  /* 35 */ val ConnectFailed: typings.steamDashClient.steamDashClientMod.EResult.ConnectFailed with Double = js.native
  /* 47 */ val ContentVersion: typings.steamDashClient.steamDashClientMod.EResult.ContentVersion with Double = js.native
  /* 53 */ val DataCorruption: typings.steamDashClient.steamDashClientMod.EResult.DataCorruption with Double = js.native
  /* 80 */ val Disabled: typings.steamDashClient.steamDashClientMod.EResult.Disabled with Double = js.native
  /* 54 */ val DiskFull: typings.steamDashClient.steamDashClientMod.EResult.DiskFull with Double = js.native
  /* 14 */ val DuplicateName: typings.steamDashClient.steamDashClientMod.EResult.DuplicateName with Double = js.native
  /* 29 */ val DuplicateRequest: typings.steamDashClient.steamDashClientMod.EResult.DuplicateRequest with Double = js.native
  /* 99 */ val EmailSendFailure: typings.steamDashClient.steamDashClientMod.EResult.EmailSendFailure with Double = js.native
  /* 23 */ val EncryptionFailure: typings.steamDashClient.steamDashClientMod.EResult.EncryptionFailure with Double = js.native
  /* 27 */ val Expired: typings.steamDashClient.steamDashClientMod.EResult.Expired with Double = js.native
  /* 71 */ val ExpiredLoginAuthCode: typings.steamDashClient.steamDashClientMod.EResult.ExpiredLoginAuthCode with Double = js.native
  /* 59 */ val ExternalAccountAlreadyLinked: typings.steamDashClient.steamDashClientMod.EResult.ExternalAccountAlreadyLinked with Double = js.native
  /* 57 */ val ExternalAccountUnlinked: typings.steamDashClient.steamDashClientMod.EResult.ExternalAccountUnlinked with Double = js.native
  /* 70 */ val FacebookQueryError: typings.steamDashClient.steamDashClientMod.EResult.FacebookQueryError with Double = js.native
  /* 2 */ val Fail: typings.steamDashClient.steamDashClientMod.EResult.Fail with Double = js.native
  /* 9 */ val FileNotFound: typings.steamDashClient.steamDashClientMod.EResult.FileNotFound with Double = js.native
  /* 102 */ val GSLTDenied: typings.steamDashClient.steamDashClientMod.EResult.GSLTDenied with Double = js.native
  /* 106 */ val GSLTExpired: typings.steamDashClient.steamDashClientMod.EResult.GSLTExpired with Double = js.native
  /* 103 */ val GSOwnerDenied: typings.steamDashClient.steamDashClientMod.EResult.GSOwnerDenied with Double = js.native
  /* 36 */ val HandshakeFailed: typings.steamDashClient.steamDashClientMod.EResult.HandshakeFailed with Double = js.native
  /* 67 */ val HardwareNotCapableOfIPT: typings.steamDashClient.steamDashClientMod.EResult.HardwareNotCapableOfIPT with Double = js.native
  /* 37 */ val IOFailure: typings.steamDashClient.steamDashClientMod.EResult.IOFailure with Double = js.native
  /* 105 */ val IPBanned: typings.steamDashClient.steamDashClientMod.EResult.IPBanned with Double = js.native
  /* 72 */ val IPLoginRestrictionFailed: typings.steamDashClient.steamDashClientMod.EResult.IPLoginRestrictionFailed with Double = js.native
  /* 31 */ val IPNotFound: typings.steamDashClient.steamDashClientMod.EResult.IPNotFound with Double = js.native
  /* 68 */ val IPTInitError: typings.steamDashClient.steamDashClientMod.EResult.IPTInitError with Double = js.native
  /* 41 */ val Ignored: typings.steamDashClient.steamDashClientMod.EResult.Ignored with Double = js.native
  /* 61 */ val IllegalPassword: typings.steamDashClient.steamDashClientMod.EResult.IllegalPassword with Double = js.native
  /* 107 */ val InsufficientFunds: typings.steamDashClient.steamDashClientMod.EResult.InsufficientFunds with Double = js.native
  /* 24 */ val InsufficientPrivilege: typings.steamDashClient.steamDashClientMod.EResult.InsufficientPrivilege with Double = js.native
  /* 0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EResult.Invalid with Double = js.native
  /* 81 */ val InvalidCEGSubmission: typings.steamDashClient.steamDashClientMod.EResult.InvalidCEGSubmission with Double = js.native
  /* 13 */ val InvalidEmail: typings.steamDashClient.steamDashClientMod.EResult.InvalidEmail with Double = js.native
  /* 104 */ val InvalidItemType: typings.steamDashClient.steamDashClientMod.EResult.InvalidItemType with Double = js.native
  /* 65 */ val InvalidLoginAuthCode: typings.steamDashClient.steamDashClientMod.EResult.InvalidLoginAuthCode with Double = js.native
  /* 12 */ val InvalidName: typings.steamDashClient.steamDashClientMod.EResult.InvalidName with Double = js.native
  /* 8 */ val InvalidParam: typings.steamDashClient.steamDashClientMod.EResult.InvalidParam with Double = js.native
  /* 5 */ val InvalidPassword: typings.steamDashClient.steamDashClientMod.EResult.InvalidPassword with Double = js.native
  /* 7 */ val InvalidProtocolVer: typings.steamDashClient.steamDashClientMod.EResult.InvalidProtocolVer with Double = js.native
  /* 11 */ val InvalidState: typings.steamDashClient.steamDashClientMod.EResult.InvalidState with Double = js.native
  /* 19 */ val InvalidSteamID: typings.steamDashClient.steamDashClientMod.EResult.InvalidSteamID with Double = js.native
  /* 86 */ val ItemDeleted: typings.steamDashClient.steamDashClientMod.EResult.ItemDeleted with Double = js.native
  /* 86 */ val ItemOrEntryHasBeenDeleted: typings.steamDashClient.steamDashClientMod.EResult.ItemOrEntryHasBeenDeleted with Double = js.native
  /* 25 */ val LimitExceeded: typings.steamDashClient.steamDashClientMod.EResult.LimitExceeded with Double = js.native
  /* 33 */ val LockingFailed: typings.steamDashClient.steamDashClientMod.EResult.LockingFailed with Double = js.native
  /* 6 */ val LoggedInElsewhere: typings.steamDashClient.steamDashClientMod.EResult.LoggedInElsewhere with Double = js.native
  /* 34 */ val LogonSessionReplaced: typings.steamDashClient.steamDashClientMod.EResult.LogonSessionReplaced with Double = js.native
  /* 101 */ val NeedCaptcha: typings.steamDashClient.steamDashClientMod.EResult.NeedCaptcha with Double = js.native
  /* 3 */ val NoConnection: typings.steamDashClient.steamDashClientMod.EResult.NoConnection with Double = js.native
  /* 42 */ val NoMatch: typings.steamDashClient.steamDashClientMod.EResult.NoMatch with Double = js.native
  /* 75 */ val NoMatchingURL: typings.steamDashClient.steamDashClientMod.EResult.NoMatchingURL with Double = js.native
  /* 92 */ val NoMobileDevice: typings.steamDashClient.steamDashClientMod.EResult.NoMobileDevice with Double = js.native
  /* 92 */ val NoMobileDeviceAvailable: typings.steamDashClient.steamDashClientMod.EResult.NoMobileDeviceAvailable with Double = js.native
  /* 109 */ val NoSiteLicensesFound: typings.steamDashClient.steamDashClientMod.EResult.NoSiteLicensesFound with Double = js.native
  /* 21 */ val NotLoggedOn: typings.steamDashClient.steamDashClientMod.EResult.NotLoggedOn with Double = js.native
  /* 91 */ val NotModified: typings.steamDashClient.steamDashClientMod.EResult.NotModified with Double = js.native
  /* 100 */ val NotSettled: typings.steamDashClient.steamDashClientMod.EResult.NotSettled with Double = js.native
  /* 1 */ val OK: typings.steamDashClient.steamDashClientMod.EResult.OK with Double = js.native
  /* 58 */ val PSNTicketInvalid: typings.steamDashClient.steamDashClientMod.EResult.PSNTicketInvalid with Double = js.native
  /* 69 */ val ParentalControlRestricted: typings.steamDashClient.steamDashClientMod.EResult.ParentalControlRestricted with Double = js.native
  /* 56 */ val PasswordNotSet: typings.steamDashClient.steamDashClientMod.EResult.PasswordNotSet with Double = js.native
  /* 49 */ val PasswordRequiredToKickSession: typings.steamDashClient.steamDashClientMod.EResult.PasswordRequiredToKickSession with Double = js.native
  /* 56 */ val PasswordUnset: typings.steamDashClient.steamDashClientMod.EResult.PasswordUnset with Double = js.native
  /* 22 */ val Pending: typings.steamDashClient.steamDashClientMod.EResult.Pending with Double = js.native
  /* 32 */ val PersistFailed: typings.steamDashClient.steamDashClientMod.EResult.PersistFailed with Double = js.native
  /* 97 */ val PhoneActivityLimitExceeded: typings.steamDashClient.steamDashClientMod.EResult.PhoneActivityLimitExceeded with Double = js.native
  /* 84 */ val RateLimitExceeded: typings.steamDashClient.steamDashClientMod.EResult.RateLimitExceeded with Double = js.native
  /* 98 */ val RefundToWallet: typings.steamDashClient.steamDashClientMod.EResult.RefundToWallet with Double = js.native
  /* 83 */ val RegionLocked: typings.steamDashClient.steamDashClientMod.EResult.RegionLocked with Double = js.native
  /* 55 */ val RemoteCallFailed: typings.steamDashClient.steamDashClientMod.EResult.RemoteCallFailed with Double = js.native
  /* 38 */ val RemoteDisconnect: typings.steamDashClient.steamDashClientMod.EResult.RemoteDisconnect with Double = js.native
  /* 60 */ val RemoteFileConflict: typings.steamDashClient.steamDashClientMod.EResult.RemoteFileConflict with Double = js.native
  /* 77 */ val RequirePasswordReEntry: typings.steamDashClient.steamDashClientMod.EResult.RequirePasswordReEntry with Double = js.native
  /* 82 */ val RestrictedDevice: typings.steamDashClient.steamDashClientMod.EResult.RestrictedDevice with Double = js.native
  /* 26 */ val Revoked: typings.steamDashClient.steamDashClientMod.EResult.Revoked with Double = js.native
  /* 94 */ val SMSCodeFailed: typings.steamDashClient.steamDashClientMod.EResult.SMSCodeFailed with Double = js.native
  /* 62 */ val SameAsPreviousValue: typings.steamDashClient.steamDashClientMod.EResult.SameAsPreviousValue with Double = js.native
  /* 44 */ val ServiceReadOnly: typings.steamDashClient.steamDashClientMod.EResult.ServiceReadOnly with Double = js.native
  /* 20 */ val ServiceUnavailable: typings.steamDashClient.steamDashClientMod.EResult.ServiceUnavailable with Double = js.native
  /* 39 */ val ShoppingCartNotFound: typings.steamDashClient.steamDashClientMod.EResult.ShoppingCartNotFound with Double = js.native
  /* 51 */ val Suspended: typings.steamDashClient.steamDashClientMod.EResult.Suspended with Double = js.native
  /* 93 */ val TimeIsOutOfSync: typings.steamDashClient.steamDashClientMod.EResult.TimeIsOutOfSync with Double = js.native
  /* 93 */ val TimeNotSynced: typings.steamDashClient.steamDashClientMod.EResult.TimeNotSynced with Double = js.native
  /* 16 */ val Timeout: typings.steamDashClient.steamDashClientMod.EResult.Timeout with Double = js.native
  /* 95 */ val TooManyAccountsAccessThisResource: typings.steamDashClient.steamDashClientMod.EResult.TooManyAccountsAccessThisResource with Double = js.native
  /* 108 */ val TooManyPending: typings.steamDashClient.steamDashClientMod.EResult.TooManyPending with Double = js.native
  /* 48 */ val TryAnotherCM: typings.steamDashClient.steamDashClientMod.EResult.TryAnotherCM with Double = js.native
  /* 89 */ val TwoFactorActivationCodeMismatch: typings.steamDashClient.steamDashClientMod.EResult.TwoFactorActivationCodeMismatch with Double = js.native
  /* 88 */ val TwoFactorCodeMismatch: typings.steamDashClient.steamDashClientMod.EResult.TwoFactorCodeMismatch with Double = js.native
  /* 79 */ val UnexpectedError: typings.steamDashClient.steamDashClientMod.EResult.UnexpectedError with Double = js.native
  /* 78 */ val ValueOutOfRange: typings.steamDashClient.steamDashClientMod.EResult.ValueOutOfRange with Double = js.native
  /* 110 */ val WGNetworkSendExceeded: typings.steamDashClient.steamDashClientMod.EResult.WGNetworkSendExceeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
}

