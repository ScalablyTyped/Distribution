package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steam-user", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult & Double] = js.native
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with EResult
  /* 15 */ val AccessDenied: typings.steamUser.mod.EResult.AccessDenied & Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded
    extends StObject
       with EResult
  /* 96 */ val AccountActivityLimitExceeded: typings.steamUser.mod.EResult.AccountActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typings.steamUser.mod.EResult.AccountAssociatedToMultiplePartners & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typings.steamUser.mod.EResult.AccountAssociatedToMultiplePlayers & Double = js.native
  
  @js.native
  sealed trait AccountDisabled
    extends StObject
       with EResult
  /* 43 */ val AccountDisabled: typings.steamUser.mod.EResult.AccountDisabled & Double = js.native
  
  @js.native
  sealed trait AccountHasAnExistingUserCancelledLicense
    extends StObject
       with EResult
  /* 115 */ val AccountHasAnExistingUserCancelledLicense: typings.steamUser.mod.EResult.AccountHasAnExistingUserCancelledLicense & Double = js.native
  
  @js.native
  sealed trait AccountHasBeenDeleted
    extends StObject
       with EResult
  /* 114 */ val AccountHasBeenDeleted: typings.steamUser.mod.EResult.AccountHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait AccountLimitExceeded
    extends StObject
       with EResult
  /* 95 */ val AccountLimitExceeded: typings.steamUser.mod.EResult.AccountLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EResult
  /* 73 */ val AccountLocked: typings.steamUser.mod.EResult.AccountLocked & Double = js.native
  
  @js.native
  sealed trait AccountLockedDown
    extends StObject
       with EResult
  /* 73 */ val AccountLockedDown: typings.steamUser.mod.EResult.AccountLockedDown & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor
    extends StObject
       with EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typings.steamUser.mod.EResult.AccountLoginDeniedNeedTwoFactor & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle
    extends StObject
       with EResult
  /* 87 */ val AccountLoginDeniedThrottle: typings.steamUser.mod.EResult.AccountLoginDeniedThrottle & Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied
    extends StObject
       with EResult
  /* 63 */ val AccountLogonDenied: typings.steamUser.mod.EResult.AccountLogonDenied & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode
    extends StObject
       with EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typings.steamUser.mod.EResult.AccountLogonDeniedNeedTwoFactorCode & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMail
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMail: typings.steamUser.mod.EResult.AccountLogonDeniedNoMail & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typings.steamUser.mod.EResult.AccountLogonDeniedNoMailSent & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired
    extends StObject
       with EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typings.steamUser.mod.EResult.AccountLogonDeniedVerifiedEmailRequired & Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured
    extends StObject
       with EResult
  /* 45 */ val AccountNotFeatured: typings.steamUser.mod.EResult.AccountNotFeatured & Double = js.native
  
  @js.native
  sealed trait AccountNotFound
    extends StObject
       with EResult
  /* 18 */ val AccountNotFound: typings.steamUser.mod.EResult.AccountNotFound & Double = js.native
  
  @js.native
  sealed trait AccountNotFriends
    extends StObject
       with EResult
  /* 111 */ val AccountNotFriends: typings.steamUser.mod.EResult.AccountNotFriends & Double = js.native
  
  @js.native
  sealed trait AdministratorOK
    extends StObject
       with EResult
  /* 46 */ val AdministratorOK: typings.steamUser.mod.EResult.AdministratorOK & Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere
    extends StObject
       with EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typings.steamUser.mod.EResult.AlreadyLoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait AlreadyOwned
    extends StObject
       with EResult
  /* 30 */ val AlreadyOwned: typings.steamUser.mod.EResult.AlreadyOwned & Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed
    extends StObject
       with EResult
  /* 28 */ val AlreadyRedeemed: typings.steamUser.mod.EResult.AlreadyRedeemed & Double = js.native
  
  @js.native
  sealed trait BadResponse
    extends StObject
       with EResult
  /* 76 */ val BadResponse: typings.steamUser.mod.EResult.BadResponse & Double = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EResult
  /* 17 */ val Banned: typings.steamUser.mod.EResult.Banned & Double = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EResult
  /* 40 */ val Blocked: typings.steamUser.mod.EResult.Blocked & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with EResult
  /* 10 */ val Busy: typings.steamUser.mod.EResult.Busy & Double = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with EResult
  /* 52 */ val Cancelled: typings.steamUser.mod.EResult.Cancelled & Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword
    extends StObject
       with EResult
  /* 64 */ val CannotUseOldPassword: typings.steamUser.mod.EResult.CannotUseOldPassword & Double = js.native
  
  @js.native
  sealed trait CantRemoveItem
    extends StObject
       with EResult
  /* 113 */ val CantRemoveItem: typings.steamUser.mod.EResult.CantRemoveItem & Double = js.native
  
  @js.native
  sealed trait ClientNoLongerSupported
    extends StObject
       with EResult
  /* 119 */ val ClientNoLongerSupported: typings.steamUser.mod.EResult.ClientNoLongerSupported & Double = js.native
  
  @js.native
  sealed trait ConnectFailed
    extends StObject
       with EResult
  /* 35 */ val ConnectFailed: typings.steamUser.mod.EResult.ConnectFailed & Double = js.native
  
  @js.native
  sealed trait ContentVersion
    extends StObject
       with EResult
  /* 47 */ val ContentVersion: typings.steamUser.mod.EResult.ContentVersion & Double = js.native
  
  @js.native
  sealed trait DataCorruption
    extends StObject
       with EResult
  /* 53 */ val DataCorruption: typings.steamUser.mod.EResult.DataCorruption & Double = js.native
  
  @js.native
  sealed trait DeniedDueToCommunityCooldown
    extends StObject
       with EResult
  /* 116 */ val DeniedDueToCommunityCooldown: typings.steamUser.mod.EResult.DeniedDueToCommunityCooldown & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EResult
  /* 80 */ val Disabled: typings.steamUser.mod.EResult.Disabled & Double = js.native
  
  @js.native
  sealed trait DiskFull
    extends StObject
       with EResult
  /* 54 */ val DiskFull: typings.steamUser.mod.EResult.DiskFull & Double = js.native
  
  @js.native
  sealed trait DuplicateName
    extends StObject
       with EResult
  /* 14 */ val DuplicateName: typings.steamUser.mod.EResult.DuplicateName & Double = js.native
  
  @js.native
  sealed trait DuplicateRequest
    extends StObject
       with EResult
  /* 29 */ val DuplicateRequest: typings.steamUser.mod.EResult.DuplicateRequest & Double = js.native
  
  @js.native
  sealed trait EmailSendFailure
    extends StObject
       with EResult
  /* 99 */ val EmailSendFailure: typings.steamUser.mod.EResult.EmailSendFailure & Double = js.native
  
  @js.native
  sealed trait EncryptionFailure
    extends StObject
       with EResult
  /* 23 */ val EncryptionFailure: typings.steamUser.mod.EResult.EncryptionFailure & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with EResult
  /* 27 */ val Expired: typings.steamUser.mod.EResult.Expired & Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode
    extends StObject
       with EResult
  /* 71 */ val ExpiredLoginAuthCode: typings.steamUser.mod.EResult.ExpiredLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked
    extends StObject
       with EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typings.steamUser.mod.EResult.ExternalAccountAlreadyLinked & Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked
    extends StObject
       with EResult
  /* 57 */ val ExternalAccountUnlinked: typings.steamUser.mod.EResult.ExternalAccountUnlinked & Double = js.native
  
  @js.native
  sealed trait FacebookQueryError
    extends StObject
       with EResult
  /* 70 */ val FacebookQueryError: typings.steamUser.mod.EResult.FacebookQueryError & Double = js.native
  
  @js.native
  sealed trait Fail
    extends StObject
       with EResult
  /* 2 */ val Fail: typings.steamUser.mod.EResult.Fail & Double = js.native
  
  @js.native
  sealed trait FileNotFound
    extends StObject
       with EResult
  /* 9 */ val FileNotFound: typings.steamUser.mod.EResult.FileNotFound & Double = js.native
  
  @js.native
  sealed trait GSLTDenied
    extends StObject
       with EResult
  /* 102 */ val GSLTDenied: typings.steamUser.mod.EResult.GSLTDenied & Double = js.native
  
  @js.native
  sealed trait GSLTExpired
    extends StObject
       with EResult
  /* 106 */ val GSLTExpired: typings.steamUser.mod.EResult.GSLTExpired & Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied
    extends StObject
       with EResult
  /* 103 */ val GSOwnerDenied: typings.steamUser.mod.EResult.GSOwnerDenied & Double = js.native
  
  @js.native
  sealed trait HandshakeFailed
    extends StObject
       with EResult
  /* 36 */ val HandshakeFailed: typings.steamUser.mod.EResult.HandshakeFailed & Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT
    extends StObject
       with EResult
  /* 67 */ val HardwareNotCapableOfIPT: typings.steamUser.mod.EResult.HardwareNotCapableOfIPT & Double = js.native
  
  @js.native
  sealed trait IOFailure
    extends StObject
       with EResult
  /* 37 */ val IOFailure: typings.steamUser.mod.EResult.IOFailure & Double = js.native
  
  @js.native
  sealed trait IPBanned
    extends StObject
       with EResult
  /* 105 */ val IPBanned: typings.steamUser.mod.EResult.IPBanned & Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed
    extends StObject
       with EResult
  /* 72 */ val IPLoginRestrictionFailed: typings.steamUser.mod.EResult.IPLoginRestrictionFailed & Double = js.native
  
  @js.native
  sealed trait IPNotFound
    extends StObject
       with EResult
  /* 31 */ val IPNotFound: typings.steamUser.mod.EResult.IPNotFound & Double = js.native
  
  @js.native
  sealed trait IPTInitError
    extends StObject
       with EResult
  /* 68 */ val IPTInitError: typings.steamUser.mod.EResult.IPTInitError & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EResult
  /* 41 */ val Ignored: typings.steamUser.mod.EResult.Ignored & Double = js.native
  
  @js.native
  sealed trait IllegalPassword
    extends StObject
       with EResult
  /* 61 */ val IllegalPassword: typings.steamUser.mod.EResult.IllegalPassword & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EResult
  /* 107 */ val InsufficientFunds: typings.steamUser.mod.EResult.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege
    extends StObject
       with EResult
  /* 24 */ val InsufficientPrivilege: typings.steamUser.mod.EResult.InsufficientPrivilege & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EResult
  /* 0 */ val Invalid: typings.steamUser.mod.EResult.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission
    extends StObject
       with EResult
  /* 81 */ val InvalidCEGSubmission: typings.steamUser.mod.EResult.InvalidCEGSubmission & Double = js.native
  
  @js.native
  sealed trait InvalidEmail
    extends StObject
       with EResult
  /* 13 */ val InvalidEmail: typings.steamUser.mod.EResult.InvalidEmail & Double = js.native
  
  @js.native
  sealed trait InvalidItemType
    extends StObject
       with EResult
  /* 104 */ val InvalidItemType: typings.steamUser.mod.EResult.InvalidItemType & Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode
    extends StObject
       with EResult
  /* 65 */ val InvalidLoginAuthCode: typings.steamUser.mod.EResult.InvalidLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait InvalidName
    extends StObject
       with EResult
  /* 12 */ val InvalidName: typings.steamUser.mod.EResult.InvalidName & Double = js.native
  
  @js.native
  sealed trait InvalidParam
    extends StObject
       with EResult
  /* 8 */ val InvalidParam: typings.steamUser.mod.EResult.InvalidParam & Double = js.native
  
  @js.native
  sealed trait InvalidPassword
    extends StObject
       with EResult
  /* 5 */ val InvalidPassword: typings.steamUser.mod.EResult.InvalidPassword & Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer
    extends StObject
       with EResult
  /* 7 */ val InvalidProtocolVer: typings.steamUser.mod.EResult.InvalidProtocolVer & Double = js.native
  
  @js.native
  sealed trait InvalidState
    extends StObject
       with EResult
  /* 11 */ val InvalidState: typings.steamUser.mod.EResult.InvalidState & Double = js.native
  
  @js.native
  sealed trait InvalidSteamID
    extends StObject
       with EResult
  /* 19 */ val InvalidSteamID: typings.steamUser.mod.EResult.InvalidSteamID & Double = js.native
  
  @js.native
  sealed trait ItemDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemDeleted: typings.steamUser.mod.EResult.ItemDeleted & Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typings.steamUser.mod.EResult.ItemOrEntryHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait LauncherMigrated
    extends StObject
       with EResult
  /* 119 */ val LauncherMigrated: typings.steamUser.mod.EResult.LauncherMigrated & Double = js.native
  
  @js.native
  sealed trait LimitExceeded
    extends StObject
       with EResult
  /* 25 */ val LimitExceeded: typings.steamUser.mod.EResult.LimitExceeded & Double = js.native
  
  @js.native
  sealed trait LimitedUserAccount
    extends StObject
       with EResult
  /* 112 */ val LimitedUserAccount: typings.steamUser.mod.EResult.LimitedUserAccount & Double = js.native
  
  @js.native
  sealed trait LockingFailed
    extends StObject
       with EResult
  /* 33 */ val LockingFailed: typings.steamUser.mod.EResult.LockingFailed & Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere
    extends StObject
       with EResult
  /* 6 */ val LoggedInElsewhere: typings.steamUser.mod.EResult.LoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced
    extends StObject
       with EResult
  /* 34 */ val LogonSessionReplaced: typings.steamUser.mod.EResult.LogonSessionReplaced & Double = js.native
  
  @js.native
  sealed trait MustAgreeToSSA
    extends StObject
       with EResult
  /* 118 */ val MustAgreeToSSA: typings.steamUser.mod.EResult.MustAgreeToSSA & Double = js.native
  
  @js.native
  sealed trait NeedCaptcha
    extends StObject
       with EResult
  /* 101 */ val NeedCaptcha: typings.steamUser.mod.EResult.NeedCaptcha & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with EResult
  /* 3 */ val NoConnection: typings.steamUser.mod.EResult.NoConnection & Double = js.native
  
  @js.native
  sealed trait NoLauncherSpecified
    extends StObject
       with EResult
  /* 117 */ val NoLauncherSpecified: typings.steamUser.mod.EResult.NoLauncherSpecified & Double = js.native
  
  @js.native
  sealed trait NoMatch
    extends StObject
       with EResult
  /* 42 */ val NoMatch: typings.steamUser.mod.EResult.NoMatch & Double = js.native
  
  @js.native
  sealed trait NoMatchingURL
    extends StObject
       with EResult
  /* 75 */ val NoMatchingURL: typings.steamUser.mod.EResult.NoMatchingURL & Double = js.native
  
  @js.native
  sealed trait NoMobileDevice
    extends StObject
       with EResult
  /* 92 */ val NoMobileDevice: typings.steamUser.mod.EResult.NoMobileDevice & Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable
    extends StObject
       with EResult
  /* 92 */ val NoMobileDeviceAvailable: typings.steamUser.mod.EResult.NoMobileDeviceAvailable & Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound
    extends StObject
       with EResult
  /* 109 */ val NoSiteLicensesFound: typings.steamUser.mod.EResult.NoSiteLicensesFound & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EResult
  /* 21 */ val NotLoggedOn: typings.steamUser.mod.EResult.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with EResult
  /* 91 */ val NotModified: typings.steamUser.mod.EResult.NotModified & Double = js.native
  
  @js.native
  sealed trait NotSettled
    extends StObject
       with EResult
  /* 100 */ val NotSettled: typings.steamUser.mod.EResult.NotSettled & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EResult
  /* 1 */ val OK: typings.steamUser.mod.EResult.OK & Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid
    extends StObject
       with EResult
  /* 58 */ val PSNTicketInvalid: typings.steamUser.mod.EResult.PSNTicketInvalid & Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted
    extends StObject
       with EResult
  /* 69 */ val ParentalControlRestricted: typings.steamUser.mod.EResult.ParentalControlRestricted & Double = js.native
  
  @js.native
  sealed trait PasswordNotSet
    extends StObject
       with EResult
  /* 56 */ val PasswordNotSet: typings.steamUser.mod.EResult.PasswordNotSet & Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession
    extends StObject
       with EResult
  /* 49 */ val PasswordRequiredToKickSession: typings.steamUser.mod.EResult.PasswordRequiredToKickSession & Double = js.native
  
  @js.native
  sealed trait PasswordUnset
    extends StObject
       with EResult
  /* 56 */ val PasswordUnset: typings.steamUser.mod.EResult.PasswordUnset & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EResult
  /* 22 */ val Pending: typings.steamUser.mod.EResult.Pending & Double = js.native
  
  @js.native
  sealed trait PersistFailed
    extends StObject
       with EResult
  /* 32 */ val PersistFailed: typings.steamUser.mod.EResult.PersistFailed & Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded
    extends StObject
       with EResult
  /* 97 */ val PhoneActivityLimitExceeded: typings.steamUser.mod.EResult.PhoneActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded
    extends StObject
       with EResult
  /* 84 */ val RateLimitExceeded: typings.steamUser.mod.EResult.RateLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RefundToWallet
    extends StObject
       with EResult
  /* 98 */ val RefundToWallet: typings.steamUser.mod.EResult.RefundToWallet & Double = js.native
  
  @js.native
  sealed trait RegionLocked
    extends StObject
       with EResult
  /* 83 */ val RegionLocked: typings.steamUser.mod.EResult.RegionLocked & Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed
    extends StObject
       with EResult
  /* 55 */ val RemoteCallFailed: typings.steamUser.mod.EResult.RemoteCallFailed & Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect
    extends StObject
       with EResult
  /* 38 */ val RemoteDisconnect: typings.steamUser.mod.EResult.RemoteDisconnect & Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict
    extends StObject
       with EResult
  /* 60 */ val RemoteFileConflict: typings.steamUser.mod.EResult.RemoteFileConflict & Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry
    extends StObject
       with EResult
  /* 77 */ val RequirePasswordReEntry: typings.steamUser.mod.EResult.RequirePasswordReEntry & Double = js.native
  
  @js.native
  sealed trait RestrictedDevice
    extends StObject
       with EResult
  /* 82 */ val RestrictedDevice: typings.steamUser.mod.EResult.RestrictedDevice & Double = js.native
  
  @js.native
  sealed trait Revoked
    extends StObject
       with EResult
  /* 26 */ val Revoked: typings.steamUser.mod.EResult.Revoked & Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed
    extends StObject
       with EResult
  /* 94 */ val SMSCodeFailed: typings.steamUser.mod.EResult.SMSCodeFailed & Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue
    extends StObject
       with EResult
  /* 62 */ val SameAsPreviousValue: typings.steamUser.mod.EResult.SameAsPreviousValue & Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly
    extends StObject
       with EResult
  /* 44 */ val ServiceReadOnly: typings.steamUser.mod.EResult.ServiceReadOnly & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with EResult
  /* 20 */ val ServiceUnavailable: typings.steamUser.mod.EResult.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound
    extends StObject
       with EResult
  /* 39 */ val ShoppingCartNotFound: typings.steamUser.mod.EResult.ShoppingCartNotFound & Double = js.native
  
  @js.native
  sealed trait Suspended
    extends StObject
       with EResult
  /* 51 */ val Suspended: typings.steamUser.mod.EResult.Suspended & Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync
    extends StObject
       with EResult
  /* 93 */ val TimeIsOutOfSync: typings.steamUser.mod.EResult.TimeIsOutOfSync & Double = js.native
  
  @js.native
  sealed trait TimeNotSynced
    extends StObject
       with EResult
  /* 93 */ val TimeNotSynced: typings.steamUser.mod.EResult.TimeNotSynced & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EResult
  /* 16 */ val Timeout: typings.steamUser.mod.EResult.Timeout & Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource
    extends StObject
       with EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typings.steamUser.mod.EResult.TooManyAccountsAccessThisResource & Double = js.native
  
  @js.native
  sealed trait TooManyPending
    extends StObject
       with EResult
  /* 108 */ val TooManyPending: typings.steamUser.mod.EResult.TooManyPending & Double = js.native
  
  @js.native
  sealed trait TryAnotherCM
    extends StObject
       with EResult
  /* 48 */ val TryAnotherCM: typings.steamUser.mod.EResult.TryAnotherCM & Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch
    extends StObject
       with EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typings.steamUser.mod.EResult.TwoFactorActivationCodeMismatch & Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch
    extends StObject
       with EResult
  /* 88 */ val TwoFactorCodeMismatch: typings.steamUser.mod.EResult.TwoFactorCodeMismatch & Double = js.native
  
  @js.native
  sealed trait UnexpectedError
    extends StObject
       with EResult
  /* 79 */ val UnexpectedError: typings.steamUser.mod.EResult.UnexpectedError & Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange
    extends StObject
       with EResult
  /* 78 */ val ValueOutOfRange: typings.steamUser.mod.EResult.ValueOutOfRange & Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded
    extends StObject
       with EResult
  /* 110 */ val WGNetworkSendExceeded: typings.steamUser.mod.EResult.WGNetworkSendExceeded & Double = js.native
}
