package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steam-client", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult with Double] = js.native
  
  @js.native
  sealed trait AccessDenied extends EResult
  /* 15 */ val AccessDenied: typings.steamClient.mod.EResult.AccessDenied with Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded extends EResult
  /* 96 */ val AccountActivityLimitExceeded: typings.steamClient.mod.EResult.AccountActivityLimitExceeded with Double = js.native
  
  // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePartners extends EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typings.steamClient.mod.EResult.AccountAssociatedToMultiplePartners with Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers extends EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typings.steamClient.mod.EResult.AccountAssociatedToMultiplePlayers with Double = js.native
  
  @js.native
  sealed trait AccountDisabled extends EResult
  /* 43 */ val AccountDisabled: typings.steamClient.mod.EResult.AccountDisabled with Double = js.native
  
  // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait AccountLimitExceeded extends EResult
  /* 95 */ val AccountLimitExceeded: typings.steamClient.mod.EResult.AccountLimitExceeded with Double = js.native
  
  @js.native
  sealed trait AccountLocked extends EResult
  /* 73 */ val AccountLocked: typings.steamClient.mod.EResult.AccountLocked with Double = js.native
  
  // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLockedDown extends EResult
  /* 73 */ val AccountLockedDown: typings.steamClient.mod.EResult.AccountLockedDown with Double = js.native
  
  // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor extends EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typings.steamClient.mod.EResult.AccountLoginDeniedNeedTwoFactor with Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle extends EResult
  /* 87 */ val AccountLoginDeniedThrottle: typings.steamClient.mod.EResult.AccountLoginDeniedThrottle with Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied extends EResult
  /* 63 */ val AccountLogonDenied: typings.steamClient.mod.EResult.AccountLogonDenied with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode extends EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typings.steamClient.mod.EResult.AccountLogonDeniedNeedTwoFactorCode with Double = js.native
  
  // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMail extends EResult
  /* 66 */ val AccountLogonDeniedNoMail: typings.steamClient.mod.EResult.AccountLogonDeniedNoMail with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent extends EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typings.steamClient.mod.EResult.AccountLogonDeniedNoMailSent with Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired extends EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typings.steamClient.mod.EResult.AccountLogonDeniedVerifiedEmailRequired with Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured extends EResult
  /* 45 */ val AccountNotFeatured: typings.steamClient.mod.EResult.AccountNotFeatured with Double = js.native
  
  @js.native
  sealed trait AccountNotFound extends EResult
  /* 18 */ val AccountNotFound: typings.steamClient.mod.EResult.AccountNotFound with Double = js.native
  
  @js.native
  sealed trait AdministratorOK extends EResult
  /* 46 */ val AdministratorOK: typings.steamClient.mod.EResult.AdministratorOK with Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere extends EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typings.steamClient.mod.EResult.AlreadyLoggedInElsewhere with Double = js.native
  
  @js.native
  sealed trait AlreadyOwned extends EResult
  /* 30 */ val AlreadyOwned: typings.steamClient.mod.EResult.AlreadyOwned with Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed extends EResult
  /* 28 */ val AlreadyRedeemed: typings.steamClient.mod.EResult.AlreadyRedeemed with Double = js.native
  
  @js.native
  sealed trait BadResponse extends EResult
  /* 76 */ val BadResponse: typings.steamClient.mod.EResult.BadResponse with Double = js.native
  
  @js.native
  sealed trait Banned extends EResult
  /* 17 */ val Banned: typings.steamClient.mod.EResult.Banned with Double = js.native
  
  @js.native
  sealed trait Blocked extends EResult
  /* 40 */ val Blocked: typings.steamClient.mod.EResult.Blocked with Double = js.native
  
  @js.native
  sealed trait Busy extends EResult
  /* 10 */ val Busy: typings.steamClient.mod.EResult.Busy with Double = js.native
  
  @js.native
  sealed trait Cancelled extends EResult
  /* 52 */ val Cancelled: typings.steamClient.mod.EResult.Cancelled with Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword extends EResult
  /* 64 */ val CannotUseOldPassword: typings.steamClient.mod.EResult.CannotUseOldPassword with Double = js.native
  
  @js.native
  sealed trait ConnectFailed extends EResult
  /* 35 */ val ConnectFailed: typings.steamClient.mod.EResult.ConnectFailed with Double = js.native
  
  @js.native
  sealed trait ContentVersion extends EResult
  /* 47 */ val ContentVersion: typings.steamClient.mod.EResult.ContentVersion with Double = js.native
  
  @js.native
  sealed trait DataCorruption extends EResult
  /* 53 */ val DataCorruption: typings.steamClient.mod.EResult.DataCorruption with Double = js.native
  
  @js.native
  sealed trait Disabled extends EResult
  /* 80 */ val Disabled: typings.steamClient.mod.EResult.Disabled with Double = js.native
  
  @js.native
  sealed trait DiskFull extends EResult
  /* 54 */ val DiskFull: typings.steamClient.mod.EResult.DiskFull with Double = js.native
  
  @js.native
  sealed trait DuplicateName extends EResult
  /* 14 */ val DuplicateName: typings.steamClient.mod.EResult.DuplicateName with Double = js.native
  
  @js.native
  sealed trait DuplicateRequest extends EResult
  /* 29 */ val DuplicateRequest: typings.steamClient.mod.EResult.DuplicateRequest with Double = js.native
  
  @js.native
  sealed trait EmailSendFailure extends EResult
  /* 99 */ val EmailSendFailure: typings.steamClient.mod.EResult.EmailSendFailure with Double = js.native
  
  @js.native
  sealed trait EncryptionFailure extends EResult
  /* 23 */ val EncryptionFailure: typings.steamClient.mod.EResult.EncryptionFailure with Double = js.native
  
  @js.native
  sealed trait Expired extends EResult
  /* 27 */ val Expired: typings.steamClient.mod.EResult.Expired with Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode extends EResult
  /* 71 */ val ExpiredLoginAuthCode: typings.steamClient.mod.EResult.ExpiredLoginAuthCode with Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked extends EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typings.steamClient.mod.EResult.ExternalAccountAlreadyLinked with Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked extends EResult
  /* 57 */ val ExternalAccountUnlinked: typings.steamClient.mod.EResult.ExternalAccountUnlinked with Double = js.native
  
  @js.native
  sealed trait FacebookQueryError extends EResult
  /* 70 */ val FacebookQueryError: typings.steamClient.mod.EResult.FacebookQueryError with Double = js.native
  
  @js.native
  sealed trait Fail extends EResult
  /* 2 */ val Fail: typings.steamClient.mod.EResult.Fail with Double = js.native
  
  @js.native
  sealed trait FileNotFound extends EResult
  /* 9 */ val FileNotFound: typings.steamClient.mod.EResult.FileNotFound with Double = js.native
  
  @js.native
  sealed trait GSLTDenied extends EResult
  /* 102 */ val GSLTDenied: typings.steamClient.mod.EResult.GSLTDenied with Double = js.native
  
  @js.native
  sealed trait GSLTExpired extends EResult
  /* 106 */ val GSLTExpired: typings.steamClient.mod.EResult.GSLTExpired with Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied extends EResult
  /* 103 */ val GSOwnerDenied: typings.steamClient.mod.EResult.GSOwnerDenied with Double = js.native
  
  @js.native
  sealed trait HandshakeFailed extends EResult
  /* 36 */ val HandshakeFailed: typings.steamClient.mod.EResult.HandshakeFailed with Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT extends EResult
  /* 67 */ val HardwareNotCapableOfIPT: typings.steamClient.mod.EResult.HardwareNotCapableOfIPT with Double = js.native
  
  @js.native
  sealed trait IOFailure extends EResult
  /* 37 */ val IOFailure: typings.steamClient.mod.EResult.IOFailure with Double = js.native
  
  @js.native
  sealed trait IPBanned extends EResult
  /* 105 */ val IPBanned: typings.steamClient.mod.EResult.IPBanned with Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed extends EResult
  /* 72 */ val IPLoginRestrictionFailed: typings.steamClient.mod.EResult.IPLoginRestrictionFailed with Double = js.native
  
  @js.native
  sealed trait IPNotFound extends EResult
  /* 31 */ val IPNotFound: typings.steamClient.mod.EResult.IPNotFound with Double = js.native
  
  @js.native
  sealed trait IPTInitError extends EResult
  /* 68 */ val IPTInitError: typings.steamClient.mod.EResult.IPTInitError with Double = js.native
  
  @js.native
  sealed trait Ignored extends EResult
  /* 41 */ val Ignored: typings.steamClient.mod.EResult.Ignored with Double = js.native
  
  @js.native
  sealed trait IllegalPassword extends EResult
  /* 61 */ val IllegalPassword: typings.steamClient.mod.EResult.IllegalPassword with Double = js.native
  
  @js.native
  sealed trait InsufficientFunds extends EResult
  /* 107 */ val InsufficientFunds: typings.steamClient.mod.EResult.InsufficientFunds with Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege extends EResult
  /* 24 */ val InsufficientPrivilege: typings.steamClient.mod.EResult.InsufficientPrivilege with Double = js.native
  
  @js.native
  sealed trait Invalid extends EResult
  /* 0 */ val Invalid: typings.steamClient.mod.EResult.Invalid with Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission extends EResult
  /* 81 */ val InvalidCEGSubmission: typings.steamClient.mod.EResult.InvalidCEGSubmission with Double = js.native
  
  @js.native
  sealed trait InvalidEmail extends EResult
  /* 13 */ val InvalidEmail: typings.steamClient.mod.EResult.InvalidEmail with Double = js.native
  
  @js.native
  sealed trait InvalidItemType extends EResult
  /* 104 */ val InvalidItemType: typings.steamClient.mod.EResult.InvalidItemType with Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode extends EResult
  /* 65 */ val InvalidLoginAuthCode: typings.steamClient.mod.EResult.InvalidLoginAuthCode with Double = js.native
  
  @js.native
  sealed trait InvalidName extends EResult
  /* 12 */ val InvalidName: typings.steamClient.mod.EResult.InvalidName with Double = js.native
  
  @js.native
  sealed trait InvalidParam extends EResult
  /* 8 */ val InvalidParam: typings.steamClient.mod.EResult.InvalidParam with Double = js.native
  
  @js.native
  sealed trait InvalidPassword extends EResult
  /* 5 */ val InvalidPassword: typings.steamClient.mod.EResult.InvalidPassword with Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer extends EResult
  /* 7 */ val InvalidProtocolVer: typings.steamClient.mod.EResult.InvalidProtocolVer with Double = js.native
  
  @js.native
  sealed trait InvalidState extends EResult
  /* 11 */ val InvalidState: typings.steamClient.mod.EResult.InvalidState with Double = js.native
  
  @js.native
  sealed trait InvalidSteamID extends EResult
  /* 19 */ val InvalidSteamID: typings.steamClient.mod.EResult.InvalidSteamID with Double = js.native
  
  // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemDeleted extends EResult
  /* 86 */ val ItemDeleted: typings.steamClient.mod.EResult.ItemDeleted with Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted extends EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typings.steamClient.mod.EResult.ItemOrEntryHasBeenDeleted with Double = js.native
  
  @js.native
  sealed trait LimitExceeded extends EResult
  /* 25 */ val LimitExceeded: typings.steamClient.mod.EResult.LimitExceeded with Double = js.native
  
  @js.native
  sealed trait LockingFailed extends EResult
  /* 33 */ val LockingFailed: typings.steamClient.mod.EResult.LockingFailed with Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere extends EResult
  /* 6 */ val LoggedInElsewhere: typings.steamClient.mod.EResult.LoggedInElsewhere with Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced extends EResult
  /* 34 */ val LogonSessionReplaced: typings.steamClient.mod.EResult.LogonSessionReplaced with Double = js.native
  
  @js.native
  sealed trait NeedCaptcha extends EResult
  /* 101 */ val NeedCaptcha: typings.steamClient.mod.EResult.NeedCaptcha with Double = js.native
  
  @js.native
  sealed trait NoConnection extends EResult
  /* 3 */ val NoConnection: typings.steamClient.mod.EResult.NoConnection with Double = js.native
  
  @js.native
  sealed trait NoMatch extends EResult
  /* 42 */ val NoMatch: typings.steamClient.mod.EResult.NoMatch with Double = js.native
  
  @js.native
  sealed trait NoMatchingURL extends EResult
  /* 75 */ val NoMatchingURL: typings.steamClient.mod.EResult.NoMatchingURL with Double = js.native
  
  // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDevice extends EResult
  /* 92 */ val NoMobileDevice: typings.steamClient.mod.EResult.NoMobileDevice with Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable extends EResult
  /* 92 */ val NoMobileDeviceAvailable: typings.steamClient.mod.EResult.NoMobileDeviceAvailable with Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound extends EResult
  /* 109 */ val NoSiteLicensesFound: typings.steamClient.mod.EResult.NoSiteLicensesFound with Double = js.native
  
  @js.native
  sealed trait NotLoggedOn extends EResult
  /* 21 */ val NotLoggedOn: typings.steamClient.mod.EResult.NotLoggedOn with Double = js.native
  
  @js.native
  sealed trait NotModified extends EResult
  /* 91 */ val NotModified: typings.steamClient.mod.EResult.NotModified with Double = js.native
  
  @js.native
  sealed trait NotSettled extends EResult
  /* 100 */ val NotSettled: typings.steamClient.mod.EResult.NotSettled with Double = js.native
  
  @js.native
  sealed trait OK extends EResult
  /* 1 */ val OK: typings.steamClient.mod.EResult.OK with Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid extends EResult
  /* 58 */ val PSNTicketInvalid: typings.steamClient.mod.EResult.PSNTicketInvalid with Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted extends EResult
  /* 69 */ val ParentalControlRestricted: typings.steamClient.mod.EResult.ParentalControlRestricted with Double = js.native
  
  @js.native
  sealed trait PasswordNotSet extends EResult
  /* 56 */ val PasswordNotSet: typings.steamClient.mod.EResult.PasswordNotSet with Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession extends EResult
  /* 49 */ val PasswordRequiredToKickSession: typings.steamClient.mod.EResult.PasswordRequiredToKickSession with Double = js.native
  
  // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordUnset extends EResult
  /* 56 */ val PasswordUnset: typings.steamClient.mod.EResult.PasswordUnset with Double = js.native
  
  @js.native
  sealed trait Pending extends EResult
  /* 22 */ val Pending: typings.steamClient.mod.EResult.Pending with Double = js.native
  
  @js.native
  sealed trait PersistFailed extends EResult
  /* 32 */ val PersistFailed: typings.steamClient.mod.EResult.PersistFailed with Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded extends EResult
  /* 97 */ val PhoneActivityLimitExceeded: typings.steamClient.mod.EResult.PhoneActivityLimitExceeded with Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded extends EResult
  /* 84 */ val RateLimitExceeded: typings.steamClient.mod.EResult.RateLimitExceeded with Double = js.native
  
  @js.native
  sealed trait RefundToWallet extends EResult
  /* 98 */ val RefundToWallet: typings.steamClient.mod.EResult.RefundToWallet with Double = js.native
  
  @js.native
  sealed trait RegionLocked extends EResult
  /* 83 */ val RegionLocked: typings.steamClient.mod.EResult.RegionLocked with Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed extends EResult
  /* 55 */ val RemoteCallFailed: typings.steamClient.mod.EResult.RemoteCallFailed with Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect extends EResult
  /* 38 */ val RemoteDisconnect: typings.steamClient.mod.EResult.RemoteDisconnect with Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict extends EResult
  /* 60 */ val RemoteFileConflict: typings.steamClient.mod.EResult.RemoteFileConflict with Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry extends EResult
  /* 77 */ val RequirePasswordReEntry: typings.steamClient.mod.EResult.RequirePasswordReEntry with Double = js.native
  
  @js.native
  sealed trait RestrictedDevice extends EResult
  /* 82 */ val RestrictedDevice: typings.steamClient.mod.EResult.RestrictedDevice with Double = js.native
  
  @js.native
  sealed trait Revoked extends EResult
  /* 26 */ val Revoked: typings.steamClient.mod.EResult.Revoked with Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed extends EResult
  /* 94 */ val SMSCodeFailed: typings.steamClient.mod.EResult.SMSCodeFailed with Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue extends EResult
  /* 62 */ val SameAsPreviousValue: typings.steamClient.mod.EResult.SameAsPreviousValue with Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly extends EResult
  /* 44 */ val ServiceReadOnly: typings.steamClient.mod.EResult.ServiceReadOnly with Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable extends EResult
  /* 20 */ val ServiceUnavailable: typings.steamClient.mod.EResult.ServiceUnavailable with Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound extends EResult
  /* 39 */ val ShoppingCartNotFound: typings.steamClient.mod.EResult.ShoppingCartNotFound with Double = js.native
  
  @js.native
  sealed trait Suspended extends EResult
  /* 51 */ val Suspended: typings.steamClient.mod.EResult.Suspended with Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync extends EResult
  /* 93 */ val TimeIsOutOfSync: typings.steamClient.mod.EResult.TimeIsOutOfSync with Double = js.native
  
  // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeNotSynced extends EResult
  /* 93 */ val TimeNotSynced: typings.steamClient.mod.EResult.TimeNotSynced with Double = js.native
  
  @js.native
  sealed trait Timeout extends EResult
  /* 16 */ val Timeout: typings.steamClient.mod.EResult.Timeout with Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource extends EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typings.steamClient.mod.EResult.TooManyAccountsAccessThisResource with Double = js.native
  
  @js.native
  sealed trait TooManyPending extends EResult
  /* 108 */ val TooManyPending: typings.steamClient.mod.EResult.TooManyPending with Double = js.native
  
  @js.native
  sealed trait TryAnotherCM extends EResult
  /* 48 */ val TryAnotherCM: typings.steamClient.mod.EResult.TryAnotherCM with Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch extends EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typings.steamClient.mod.EResult.TwoFactorActivationCodeMismatch with Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch extends EResult
  /* 88 */ val TwoFactorCodeMismatch: typings.steamClient.mod.EResult.TwoFactorCodeMismatch with Double = js.native
  
  @js.native
  sealed trait UnexpectedError extends EResult
  /* 79 */ val UnexpectedError: typings.steamClient.mod.EResult.UnexpectedError with Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange extends EResult
  /* 78 */ val ValueOutOfRange: typings.steamClient.mod.EResult.ValueOutOfRange with Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded extends EResult
  /* 110 */ val WGNetworkSendExceeded: typings.steamClient.mod.EResult.WGNetworkSendExceeded with Double = js.native
}
