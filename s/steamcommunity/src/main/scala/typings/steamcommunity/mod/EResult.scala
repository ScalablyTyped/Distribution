package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EResult extends StObject
@JSImport("steamcommunity", "EResult")
@js.native
object EResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EResult & Double] = js.native
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with EResult
  /* 15 */ val AccessDenied: typings.steamcommunity.mod.EResult.AccessDenied & Double = js.native
  
  @js.native
  sealed trait AccountActivityLimitExceeded
    extends StObject
       with EResult
  /* 96 */ val AccountActivityLimitExceeded: typings.steamcommunity.mod.EResult.AccountActivityLimitExceeded & Double = js.native
  
  // removed "renamed to AccountAssociatedToMultiplePartners
  @js.native
  sealed trait AccountAssociatedToMultiplePartners
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePartners: typings.steamcommunity.mod.EResult.AccountAssociatedToMultiplePartners & Double = js.native
  
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers
    extends StObject
       with EResult
  /* 90 */ val AccountAssociatedToMultiplePlayers: typings.steamcommunity.mod.EResult.AccountAssociatedToMultiplePlayers & Double = js.native
  
  @js.native
  sealed trait AccountDisabled
    extends StObject
       with EResult
  /* 43 */ val AccountDisabled: typings.steamcommunity.mod.EResult.AccountDisabled & Double = js.native
  
  @js.native
  sealed trait AccountHasAnExistingUserCancelledLicense
    extends StObject
       with EResult
  /* 115 */ val AccountHasAnExistingUserCancelledLicense: typings.steamcommunity.mod.EResult.AccountHasAnExistingUserCancelledLicense & Double = js.native
  
  @js.native
  sealed trait AccountHasBeenDeleted
    extends StObject
       with EResult
  /* 114 */ val AccountHasBeenDeleted: typings.steamcommunity.mod.EResult.AccountHasBeenDeleted & Double = js.native
  
  // removed "renamed to AccountLimitExceeded
  @js.native
  sealed trait AccountLimitExceeded
    extends StObject
       with EResult
  /* 95 */ val AccountLimitExceeded: typings.steamcommunity.mod.EResult.AccountLimitExceeded & Double = js.native
  
  @js.native
  sealed trait AccountLocked
    extends StObject
       with EResult
  /* 73 */ val AccountLocked: typings.steamcommunity.mod.EResult.AccountLocked & Double = js.native
  
  // removed "renamed to AccountLockedDown
  @js.native
  sealed trait AccountLockedDown
    extends StObject
       with EResult
  /* 73 */ val AccountLockedDown: typings.steamcommunity.mod.EResult.AccountLockedDown & Double = js.native
  
  // removed "renamed to AccountLoginDeniedNeedTwoFactor
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor
    extends StObject
       with EResult
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: typings.steamcommunity.mod.EResult.AccountLoginDeniedNeedTwoFactor & Double = js.native
  
  @js.native
  sealed trait AccountLoginDeniedThrottle
    extends StObject
       with EResult
  /* 87 */ val AccountLoginDeniedThrottle: typings.steamcommunity.mod.EResult.AccountLoginDeniedThrottle & Double = js.native
  
  @js.native
  sealed trait AccountLogonDenied
    extends StObject
       with EResult
  /* 63 */ val AccountLogonDenied: typings.steamcommunity.mod.EResult.AccountLogonDenied & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode
    extends StObject
       with EResult
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: typings.steamcommunity.mod.EResult.AccountLogonDeniedNeedTwoFactorCode & Double = js.native
  
  // removed "renamed to AccountLogonDeniedNoMail
  @js.native
  sealed trait AccountLogonDeniedNoMail
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMail: typings.steamcommunity.mod.EResult.AccountLogonDeniedNoMail & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedNoMailSent
    extends StObject
       with EResult
  /* 66 */ val AccountLogonDeniedNoMailSent: typings.steamcommunity.mod.EResult.AccountLogonDeniedNoMailSent & Double = js.native
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired
    extends StObject
       with EResult
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: typings.steamcommunity.mod.EResult.AccountLogonDeniedVerifiedEmailRequired & Double = js.native
  
  @js.native
  sealed trait AccountNotFeatured
    extends StObject
       with EResult
  /* 45 */ val AccountNotFeatured: typings.steamcommunity.mod.EResult.AccountNotFeatured & Double = js.native
  
  @js.native
  sealed trait AccountNotFound
    extends StObject
       with EResult
  /* 18 */ val AccountNotFound: typings.steamcommunity.mod.EResult.AccountNotFound & Double = js.native
  
  @js.native
  sealed trait AccountNotFriends
    extends StObject
       with EResult
  /* 111 */ val AccountNotFriends: typings.steamcommunity.mod.EResult.AccountNotFriends & Double = js.native
  
  @js.native
  sealed trait AdministratorOK
    extends StObject
       with EResult
  /* 46 */ val AdministratorOK: typings.steamcommunity.mod.EResult.AdministratorOK & Double = js.native
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere
    extends StObject
       with EResult
  /* 50 */ val AlreadyLoggedInElsewhere: typings.steamcommunity.mod.EResult.AlreadyLoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait AlreadyOwned
    extends StObject
       with EResult
  /* 30 */ val AlreadyOwned: typings.steamcommunity.mod.EResult.AlreadyOwned & Double = js.native
  
  @js.native
  sealed trait AlreadyRedeemed
    extends StObject
       with EResult
  /* 28 */ val AlreadyRedeemed: typings.steamcommunity.mod.EResult.AlreadyRedeemed & Double = js.native
  
  @js.native
  sealed trait BadResponse
    extends StObject
       with EResult
  /* 76 */ val BadResponse: typings.steamcommunity.mod.EResult.BadResponse & Double = js.native
  
  @js.native
  sealed trait Banned
    extends StObject
       with EResult
  /* 17 */ val Banned: typings.steamcommunity.mod.EResult.Banned & Double = js.native
  
  @js.native
  sealed trait Blocked
    extends StObject
       with EResult
  /* 40 */ val Blocked: typings.steamcommunity.mod.EResult.Blocked & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with EResult
  /* 10 */ val Busy: typings.steamcommunity.mod.EResult.Busy & Double = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with EResult
  /* 52 */ val Cancelled: typings.steamcommunity.mod.EResult.Cancelled & Double = js.native
  
  @js.native
  sealed trait CannotUseOldPassword
    extends StObject
       with EResult
  /* 64 */ val CannotUseOldPassword: typings.steamcommunity.mod.EResult.CannotUseOldPassword & Double = js.native
  
  @js.native
  sealed trait CantRemoveItem
    extends StObject
       with EResult
  /* 113 */ val CantRemoveItem: typings.steamcommunity.mod.EResult.CantRemoveItem & Double = js.native
  
  @js.native
  sealed trait ClientNoLongerSupported
    extends StObject
       with EResult
  /* 119 */ val ClientNoLongerSupported: typings.steamcommunity.mod.EResult.ClientNoLongerSupported & Double = js.native
  
  @js.native
  sealed trait ConnectFailed
    extends StObject
       with EResult
  /* 35 */ val ConnectFailed: typings.steamcommunity.mod.EResult.ConnectFailed & Double = js.native
  
  @js.native
  sealed trait ContentVersion
    extends StObject
       with EResult
  /* 47 */ val ContentVersion: typings.steamcommunity.mod.EResult.ContentVersion & Double = js.native
  
  @js.native
  sealed trait DataCorruption
    extends StObject
       with EResult
  /* 53 */ val DataCorruption: typings.steamcommunity.mod.EResult.DataCorruption & Double = js.native
  
  @js.native
  sealed trait DeniedDueToCommunityCooldown
    extends StObject
       with EResult
  /* 116 */ val DeniedDueToCommunityCooldown: typings.steamcommunity.mod.EResult.DeniedDueToCommunityCooldown & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EResult
  /* 80 */ val Disabled: typings.steamcommunity.mod.EResult.Disabled & Double = js.native
  
  @js.native
  sealed trait DiskFull
    extends StObject
       with EResult
  /* 54 */ val DiskFull: typings.steamcommunity.mod.EResult.DiskFull & Double = js.native
  
  @js.native
  sealed trait DuplicateName
    extends StObject
       with EResult
  /* 14 */ val DuplicateName: typings.steamcommunity.mod.EResult.DuplicateName & Double = js.native
  
  @js.native
  sealed trait DuplicateRequest
    extends StObject
       with EResult
  /* 29 */ val DuplicateRequest: typings.steamcommunity.mod.EResult.DuplicateRequest & Double = js.native
  
  @js.native
  sealed trait EmailSendFailure
    extends StObject
       with EResult
  /* 99 */ val EmailSendFailure: typings.steamcommunity.mod.EResult.EmailSendFailure & Double = js.native
  
  @js.native
  sealed trait EncryptionFailure
    extends StObject
       with EResult
  /* 23 */ val EncryptionFailure: typings.steamcommunity.mod.EResult.EncryptionFailure & Double = js.native
  
  @js.native
  sealed trait Expired
    extends StObject
       with EResult
  /* 27 */ val Expired: typings.steamcommunity.mod.EResult.Expired & Double = js.native
  
  @js.native
  sealed trait ExpiredLoginAuthCode
    extends StObject
       with EResult
  /* 71 */ val ExpiredLoginAuthCode: typings.steamcommunity.mod.EResult.ExpiredLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked
    extends StObject
       with EResult
  /* 59 */ val ExternalAccountAlreadyLinked: typings.steamcommunity.mod.EResult.ExternalAccountAlreadyLinked & Double = js.native
  
  @js.native
  sealed trait ExternalAccountUnlinked
    extends StObject
       with EResult
  /* 57 */ val ExternalAccountUnlinked: typings.steamcommunity.mod.EResult.ExternalAccountUnlinked & Double = js.native
  
  @js.native
  sealed trait FacebookQueryError
    extends StObject
       with EResult
  /* 70 */ val FacebookQueryError: typings.steamcommunity.mod.EResult.FacebookQueryError & Double = js.native
  
  @js.native
  sealed trait Fail
    extends StObject
       with EResult
  /* 2 */ val Fail: typings.steamcommunity.mod.EResult.Fail & Double = js.native
  
  @js.native
  sealed trait FileNotFound
    extends StObject
       with EResult
  /* 9 */ val FileNotFound: typings.steamcommunity.mod.EResult.FileNotFound & Double = js.native
  
  @js.native
  sealed trait GSLTDenied
    extends StObject
       with EResult
  /* 102 */ val GSLTDenied: typings.steamcommunity.mod.EResult.GSLTDenied & Double = js.native
  
  @js.native
  sealed trait GSLTExpired
    extends StObject
       with EResult
  /* 106 */ val GSLTExpired: typings.steamcommunity.mod.EResult.GSLTExpired & Double = js.native
  
  @js.native
  sealed trait GSOwnerDenied
    extends StObject
       with EResult
  /* 103 */ val GSOwnerDenied: typings.steamcommunity.mod.EResult.GSOwnerDenied & Double = js.native
  
  @js.native
  sealed trait HandshakeFailed
    extends StObject
       with EResult
  /* 36 */ val HandshakeFailed: typings.steamcommunity.mod.EResult.HandshakeFailed & Double = js.native
  
  @js.native
  sealed trait HardwareNotCapableOfIPT
    extends StObject
       with EResult
  /* 67 */ val HardwareNotCapableOfIPT: typings.steamcommunity.mod.EResult.HardwareNotCapableOfIPT & Double = js.native
  
  @js.native
  sealed trait IOFailure
    extends StObject
       with EResult
  /* 37 */ val IOFailure: typings.steamcommunity.mod.EResult.IOFailure & Double = js.native
  
  @js.native
  sealed trait IPBanned
    extends StObject
       with EResult
  /* 105 */ val IPBanned: typings.steamcommunity.mod.EResult.IPBanned & Double = js.native
  
  @js.native
  sealed trait IPLoginRestrictionFailed
    extends StObject
       with EResult
  /* 72 */ val IPLoginRestrictionFailed: typings.steamcommunity.mod.EResult.IPLoginRestrictionFailed & Double = js.native
  
  @js.native
  sealed trait IPNotFound
    extends StObject
       with EResult
  /* 31 */ val IPNotFound: typings.steamcommunity.mod.EResult.IPNotFound & Double = js.native
  
  @js.native
  sealed trait IPTInitError
    extends StObject
       with EResult
  /* 68 */ val IPTInitError: typings.steamcommunity.mod.EResult.IPTInitError & Double = js.native
  
  @js.native
  sealed trait Ignored
    extends StObject
       with EResult
  /* 41 */ val Ignored: typings.steamcommunity.mod.EResult.Ignored & Double = js.native
  
  @js.native
  sealed trait IllegalPassword
    extends StObject
       with EResult
  /* 61 */ val IllegalPassword: typings.steamcommunity.mod.EResult.IllegalPassword & Double = js.native
  
  @js.native
  sealed trait InsufficientFunds
    extends StObject
       with EResult
  /* 107 */ val InsufficientFunds: typings.steamcommunity.mod.EResult.InsufficientFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientPrivilege
    extends StObject
       with EResult
  /* 24 */ val InsufficientPrivilege: typings.steamcommunity.mod.EResult.InsufficientPrivilege & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EResult
  /* 0 */ val Invalid: typings.steamcommunity.mod.EResult.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidCEGSubmission
    extends StObject
       with EResult
  /* 81 */ val InvalidCEGSubmission: typings.steamcommunity.mod.EResult.InvalidCEGSubmission & Double = js.native
  
  @js.native
  sealed trait InvalidEmail
    extends StObject
       with EResult
  /* 13 */ val InvalidEmail: typings.steamcommunity.mod.EResult.InvalidEmail & Double = js.native
  
  @js.native
  sealed trait InvalidItemType
    extends StObject
       with EResult
  /* 104 */ val InvalidItemType: typings.steamcommunity.mod.EResult.InvalidItemType & Double = js.native
  
  @js.native
  sealed trait InvalidLoginAuthCode
    extends StObject
       with EResult
  /* 65 */ val InvalidLoginAuthCode: typings.steamcommunity.mod.EResult.InvalidLoginAuthCode & Double = js.native
  
  @js.native
  sealed trait InvalidName
    extends StObject
       with EResult
  /* 12 */ val InvalidName: typings.steamcommunity.mod.EResult.InvalidName & Double = js.native
  
  @js.native
  sealed trait InvalidParam
    extends StObject
       with EResult
  /* 8 */ val InvalidParam: typings.steamcommunity.mod.EResult.InvalidParam & Double = js.native
  
  @js.native
  sealed trait InvalidPassword
    extends StObject
       with EResult
  /* 5 */ val InvalidPassword: typings.steamcommunity.mod.EResult.InvalidPassword & Double = js.native
  
  @js.native
  sealed trait InvalidProtocolVer
    extends StObject
       with EResult
  /* 7 */ val InvalidProtocolVer: typings.steamcommunity.mod.EResult.InvalidProtocolVer & Double = js.native
  
  @js.native
  sealed trait InvalidState
    extends StObject
       with EResult
  /* 11 */ val InvalidState: typings.steamcommunity.mod.EResult.InvalidState & Double = js.native
  
  @js.native
  sealed trait InvalidSteamID
    extends StObject
       with EResult
  /* 19 */ val InvalidSteamID: typings.steamcommunity.mod.EResult.InvalidSteamID & Double = js.native
  
  // removed "renamed to ItemDeleted
  @js.native
  sealed trait ItemDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemDeleted: typings.steamcommunity.mod.EResult.ItemDeleted & Double = js.native
  
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted
    extends StObject
       with EResult
  /* 86 */ val ItemOrEntryHasBeenDeleted: typings.steamcommunity.mod.EResult.ItemOrEntryHasBeenDeleted & Double = js.native
  
  @js.native
  sealed trait LimitExceeded
    extends StObject
       with EResult
  /* 25 */ val LimitExceeded: typings.steamcommunity.mod.EResult.LimitExceeded & Double = js.native
  
  @js.native
  sealed trait LimitedUserAccount
    extends StObject
       with EResult
  /* 112 */ val LimitedUserAccount: typings.steamcommunity.mod.EResult.LimitedUserAccount & Double = js.native
  
  @js.native
  sealed trait LockingFailed
    extends StObject
       with EResult
  /* 33 */ val LockingFailed: typings.steamcommunity.mod.EResult.LockingFailed & Double = js.native
  
  @js.native
  sealed trait LoggedInElsewhere
    extends StObject
       with EResult
  /* 6 */ val LoggedInElsewhere: typings.steamcommunity.mod.EResult.LoggedInElsewhere & Double = js.native
  
  @js.native
  sealed trait LogonSessionReplaced
    extends StObject
       with EResult
  /* 34 */ val LogonSessionReplaced: typings.steamcommunity.mod.EResult.LogonSessionReplaced & Double = js.native
  
  @js.native
  sealed trait MustAgreeToSSA
    extends StObject
       with EResult
  /* 118 */ val MustAgreeToSSA: typings.steamcommunity.mod.EResult.MustAgreeToSSA & Double = js.native
  
  @js.native
  sealed trait NeedCaptcha
    extends StObject
       with EResult
  /* 101 */ val NeedCaptcha: typings.steamcommunity.mod.EResult.NeedCaptcha & Double = js.native
  
  @js.native
  sealed trait NoConnection
    extends StObject
       with EResult
  /* 3 */ val NoConnection: typings.steamcommunity.mod.EResult.NoConnection & Double = js.native
  
  @js.native
  sealed trait NoLauncherSpecified
    extends StObject
       with EResult
  /* 117 */ val NoLauncherSpecified: typings.steamcommunity.mod.EResult.NoLauncherSpecified & Double = js.native
  
  @js.native
  sealed trait NoMatch
    extends StObject
       with EResult
  /* 42 */ val NoMatch: typings.steamcommunity.mod.EResult.NoMatch & Double = js.native
  
  @js.native
  sealed trait NoMatchingURL
    extends StObject
       with EResult
  /* 75 */ val NoMatchingURL: typings.steamcommunity.mod.EResult.NoMatchingURL & Double = js.native
  
  // removed "renamed to NoMobileDevice
  @js.native
  sealed trait NoMobileDevice
    extends StObject
       with EResult
  /* 92 */ val NoMobileDevice: typings.steamcommunity.mod.EResult.NoMobileDevice & Double = js.native
  
  @js.native
  sealed trait NoMobileDeviceAvailable
    extends StObject
       with EResult
  /* 92 */ val NoMobileDeviceAvailable: typings.steamcommunity.mod.EResult.NoMobileDeviceAvailable & Double = js.native
  
  @js.native
  sealed trait NoSiteLicensesFound
    extends StObject
       with EResult
  /* 109 */ val NoSiteLicensesFound: typings.steamcommunity.mod.EResult.NoSiteLicensesFound & Double = js.native
  
  @js.native
  sealed trait NotLoggedOn
    extends StObject
       with EResult
  /* 21 */ val NotLoggedOn: typings.steamcommunity.mod.EResult.NotLoggedOn & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with EResult
  /* 91 */ val NotModified: typings.steamcommunity.mod.EResult.NotModified & Double = js.native
  
  @js.native
  sealed trait NotSettled
    extends StObject
       with EResult
  /* 100 */ val NotSettled: typings.steamcommunity.mod.EResult.NotSettled & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EResult
  /* 1 */ val OK: typings.steamcommunity.mod.EResult.OK & Double = js.native
  
  @js.native
  sealed trait PSNTicketInvalid
    extends StObject
       with EResult
  /* 58 */ val PSNTicketInvalid: typings.steamcommunity.mod.EResult.PSNTicketInvalid & Double = js.native
  
  @js.native
  sealed trait ParentalControlRestricted
    extends StObject
       with EResult
  /* 69 */ val ParentalControlRestricted: typings.steamcommunity.mod.EResult.ParentalControlRestricted & Double = js.native
  
  @js.native
  sealed trait PasswordNotSet
    extends StObject
       with EResult
  /* 56 */ val PasswordNotSet: typings.steamcommunity.mod.EResult.PasswordNotSet & Double = js.native
  
  @js.native
  sealed trait PasswordRequiredToKickSession
    extends StObject
       with EResult
  /* 49 */ val PasswordRequiredToKickSession: typings.steamcommunity.mod.EResult.PasswordRequiredToKickSession & Double = js.native
  
  // removed "renamed to PasswordUnset
  @js.native
  sealed trait PasswordUnset
    extends StObject
       with EResult
  /* 56 */ val PasswordUnset: typings.steamcommunity.mod.EResult.PasswordUnset & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with EResult
  /* 22 */ val Pending: typings.steamcommunity.mod.EResult.Pending & Double = js.native
  
  @js.native
  sealed trait PersistFailed
    extends StObject
       with EResult
  /* 32 */ val PersistFailed: typings.steamcommunity.mod.EResult.PersistFailed & Double = js.native
  
  @js.native
  sealed trait PhoneActivityLimitExceeded
    extends StObject
       with EResult
  /* 97 */ val PhoneActivityLimitExceeded: typings.steamcommunity.mod.EResult.PhoneActivityLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RateLimitExceeded
    extends StObject
       with EResult
  /* 84 */ val RateLimitExceeded: typings.steamcommunity.mod.EResult.RateLimitExceeded & Double = js.native
  
  @js.native
  sealed trait RefundToWallet
    extends StObject
       with EResult
  /* 98 */ val RefundToWallet: typings.steamcommunity.mod.EResult.RefundToWallet & Double = js.native
  
  @js.native
  sealed trait RegionLocked
    extends StObject
       with EResult
  /* 83 */ val RegionLocked: typings.steamcommunity.mod.EResult.RegionLocked & Double = js.native
  
  @js.native
  sealed trait RemoteCallFailed
    extends StObject
       with EResult
  /* 55 */ val RemoteCallFailed: typings.steamcommunity.mod.EResult.RemoteCallFailed & Double = js.native
  
  @js.native
  sealed trait RemoteDisconnect
    extends StObject
       with EResult
  /* 38 */ val RemoteDisconnect: typings.steamcommunity.mod.EResult.RemoteDisconnect & Double = js.native
  
  @js.native
  sealed trait RemoteFileConflict
    extends StObject
       with EResult
  /* 60 */ val RemoteFileConflict: typings.steamcommunity.mod.EResult.RemoteFileConflict & Double = js.native
  
  @js.native
  sealed trait RequirePasswordReEntry
    extends StObject
       with EResult
  /* 77 */ val RequirePasswordReEntry: typings.steamcommunity.mod.EResult.RequirePasswordReEntry & Double = js.native
  
  @js.native
  sealed trait RestrictedDevice
    extends StObject
       with EResult
  /* 82 */ val RestrictedDevice: typings.steamcommunity.mod.EResult.RestrictedDevice & Double = js.native
  
  @js.native
  sealed trait Revoked
    extends StObject
       with EResult
  /* 26 */ val Revoked: typings.steamcommunity.mod.EResult.Revoked & Double = js.native
  
  @js.native
  sealed trait SMSCodeFailed
    extends StObject
       with EResult
  /* 94 */ val SMSCodeFailed: typings.steamcommunity.mod.EResult.SMSCodeFailed & Double = js.native
  
  @js.native
  sealed trait SameAsPreviousValue
    extends StObject
       with EResult
  /* 62 */ val SameAsPreviousValue: typings.steamcommunity.mod.EResult.SameAsPreviousValue & Double = js.native
  
  @js.native
  sealed trait ServiceReadOnly
    extends StObject
       with EResult
  /* 44 */ val ServiceReadOnly: typings.steamcommunity.mod.EResult.ServiceReadOnly & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with EResult
  /* 20 */ val ServiceUnavailable: typings.steamcommunity.mod.EResult.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait ShoppingCartNotFound
    extends StObject
       with EResult
  /* 39 */ val ShoppingCartNotFound: typings.steamcommunity.mod.EResult.ShoppingCartNotFound & Double = js.native
  
  @js.native
  sealed trait Suspended
    extends StObject
       with EResult
  /* 51 */ val Suspended: typings.steamcommunity.mod.EResult.Suspended & Double = js.native
  
  @js.native
  sealed trait TimeIsOutOfSync
    extends StObject
       with EResult
  /* 93 */ val TimeIsOutOfSync: typings.steamcommunity.mod.EResult.TimeIsOutOfSync & Double = js.native
  
  // removed "renamed to TimeNotSynced
  @js.native
  sealed trait TimeNotSynced
    extends StObject
       with EResult
  /* 93 */ val TimeNotSynced: typings.steamcommunity.mod.EResult.TimeNotSynced & Double = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with EResult
  /* 16 */ val Timeout: typings.steamcommunity.mod.EResult.Timeout & Double = js.native
  
  @js.native
  sealed trait TooManyAccountsAccessThisResource
    extends StObject
       with EResult
  /* 95 */ val TooManyAccountsAccessThisResource: typings.steamcommunity.mod.EResult.TooManyAccountsAccessThisResource & Double = js.native
  
  @js.native
  sealed trait TooManyPending
    extends StObject
       with EResult
  /* 108 */ val TooManyPending: typings.steamcommunity.mod.EResult.TooManyPending & Double = js.native
  
  @js.native
  sealed trait TryAnotherCM
    extends StObject
       with EResult
  /* 48 */ val TryAnotherCM: typings.steamcommunity.mod.EResult.TryAnotherCM & Double = js.native
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch
    extends StObject
       with EResult
  /* 89 */ val TwoFactorActivationCodeMismatch: typings.steamcommunity.mod.EResult.TwoFactorActivationCodeMismatch & Double = js.native
  
  @js.native
  sealed trait TwoFactorCodeMismatch
    extends StObject
       with EResult
  /* 88 */ val TwoFactorCodeMismatch: typings.steamcommunity.mod.EResult.TwoFactorCodeMismatch & Double = js.native
  
  @js.native
  sealed trait UnexpectedError
    extends StObject
       with EResult
  /* 79 */ val UnexpectedError: typings.steamcommunity.mod.EResult.UnexpectedError & Double = js.native
  
  @js.native
  sealed trait ValueOutOfRange
    extends StObject
       with EResult
  /* 78 */ val ValueOutOfRange: typings.steamcommunity.mod.EResult.ValueOutOfRange & Double = js.native
  
  @js.native
  sealed trait WGNetworkSendExceeded
    extends StObject
       with EResult
  /* 110 */ val WGNetworkSendExceeded: typings.steamcommunity.mod.EResult.WGNetworkSendExceeded & Double = js.native
}
