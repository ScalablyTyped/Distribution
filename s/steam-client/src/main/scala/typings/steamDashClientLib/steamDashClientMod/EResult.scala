package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EResult extends js.Object

@JSImport("steam-client", "EResult")
@js.native
object EResult extends js.Object {
  @js.native
  sealed trait AccessDenied
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountActivityLimitExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountAssociatedToMultiplePartners
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to AccountAssociatedToMultiplePartners"
  @js.native
  sealed trait AccountAssociatedToMultiplePlayers
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountDisabled
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLimitExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to AccountLockedDown"
  @js.native
  sealed trait AccountLocked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLockedDown
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLoginDeniedNeedTwoFactor
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLoginDeniedThrottle
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLogonDenied
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to AccountLoginDeniedNeedTwoFactor"
  @js.native
  sealed trait AccountLogonDeniedNeedTwoFactorCode
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLogonDeniedNoMail
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to AccountLogonDeniedNoMail"
  @js.native
  sealed trait AccountLogonDeniedNoMailSent
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountLogonDeniedVerifiedEmailRequired
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountNotFeatured
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AccountNotFound
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AdministratorOK
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AlreadyLoggedInElsewhere
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AlreadyOwned
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait AlreadyRedeemed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait BadResponse
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Banned
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Blocked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Busy
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Cancelled
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait CannotUseOldPassword
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ConnectFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ContentVersion
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait DataCorruption
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Disabled
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait DiskFull
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait DuplicateName
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait DuplicateRequest
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait EmailSendFailure
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait EncryptionFailure
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Expired
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ExpiredLoginAuthCode
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ExternalAccountAlreadyLinked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ExternalAccountUnlinked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait FacebookQueryError
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Fail
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait FileNotFound
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait GSLTDenied
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait GSLTExpired
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait GSOwnerDenied
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait HandshakeFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait HardwareNotCapableOfIPT
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IOFailure
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IPBanned
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IPLoginRestrictionFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IPNotFound
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IPTInitError
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Ignored
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait IllegalPassword
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InsufficientFunds
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InsufficientPrivilege
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidCEGSubmission
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidEmail
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidItemType
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidLoginAuthCode
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidName
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidParam
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidPassword
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidProtocolVer
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidState
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait InvalidSteamID
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ItemDeleted
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to ItemDeleted"
  @js.native
  sealed trait ItemOrEntryHasBeenDeleted
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait LimitExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait LockingFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait LoggedInElsewhere
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait LogonSessionReplaced
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NeedCaptcha
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NoConnection
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NoMatch
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NoMatchingURL
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NoMobileDevice
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to NoMobileDevice"
  @js.native
  sealed trait NoMobileDeviceAvailable
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NoSiteLicensesFound
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NotLoggedOn
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NotModified
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait NotSettled
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait OK
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait PSNTicketInvalid
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ParentalControlRestricted
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to PasswordUnset"
  @js.native
  sealed trait PasswordNotSet
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait PasswordRequiredToKickSession
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait PasswordUnset
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Pending
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait PersistFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait PhoneActivityLimitExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RateLimitExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RefundToWallet
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RegionLocked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RemoteCallFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RemoteDisconnect
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RemoteFileConflict
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RequirePasswordReEntry
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait RestrictedDevice
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Revoked
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait SMSCodeFailed
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait SameAsPreviousValue
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ServiceReadOnly
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ServiceUnavailable
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ShoppingCartNotFound
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Suspended
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to TimeNotSynced"
  @js.native
  sealed trait TimeIsOutOfSync
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait TimeNotSynced
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait Timeout
    extends steamDashClientLib.steamDashClientMod.EResult
  
   // removed "renamed to AccountLimitExceeded"
  @js.native
  sealed trait TooManyAccountsAccessThisResource
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait TooManyPending
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait TryAnotherCM
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait TwoFactorActivationCodeMismatch
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait TwoFactorCodeMismatch
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait UnexpectedError
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait ValueOutOfRange
    extends steamDashClientLib.steamDashClientMod.EResult
  
  @js.native
  sealed trait WGNetworkSendExceeded
    extends steamDashClientLib.steamDashClientMod.EResult
  
  /* 15 */ val AccessDenied: AccessDenied with scala.Double = js.native
  /* 96 */ val AccountActivityLimitExceeded: AccountActivityLimitExceeded with scala.Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePartners: AccountAssociatedToMultiplePartners with scala.Double = js.native
  /* 90 */ val AccountAssociatedToMultiplePlayers: AccountAssociatedToMultiplePlayers with scala.Double = js.native
  /* 43 */ val AccountDisabled: AccountDisabled with scala.Double = js.native
  /* 95 */ val AccountLimitExceeded: AccountLimitExceeded with scala.Double = js.native
  /* 73 */ val AccountLocked: AccountLocked with scala.Double = js.native
  /* 73 */ val AccountLockedDown: AccountLockedDown with scala.Double = js.native
  /* 85 */ val AccountLoginDeniedNeedTwoFactor: AccountLoginDeniedNeedTwoFactor with scala.Double = js.native
  /* 87 */ val AccountLoginDeniedThrottle: AccountLoginDeniedThrottle with scala.Double = js.native
  /* 63 */ val AccountLogonDenied: AccountLogonDenied with scala.Double = js.native
  /* 85 */ val AccountLogonDeniedNeedTwoFactorCode: AccountLogonDeniedNeedTwoFactorCode with scala.Double = js.native
  /* 66 */ val AccountLogonDeniedNoMail: AccountLogonDeniedNoMail with scala.Double = js.native
  /* 66 */ val AccountLogonDeniedNoMailSent: AccountLogonDeniedNoMailSent with scala.Double = js.native
  /* 74 */ val AccountLogonDeniedVerifiedEmailRequired: AccountLogonDeniedVerifiedEmailRequired with scala.Double = js.native
  /* 45 */ val AccountNotFeatured: AccountNotFeatured with scala.Double = js.native
  /* 18 */ val AccountNotFound: AccountNotFound with scala.Double = js.native
  /* 46 */ val AdministratorOK: AdministratorOK with scala.Double = js.native
  /* 50 */ val AlreadyLoggedInElsewhere: AlreadyLoggedInElsewhere with scala.Double = js.native
  /* 30 */ val AlreadyOwned: AlreadyOwned with scala.Double = js.native
  /* 28 */ val AlreadyRedeemed: AlreadyRedeemed with scala.Double = js.native
  /* 76 */ val BadResponse: BadResponse with scala.Double = js.native
  /* 17 */ val Banned: Banned with scala.Double = js.native
  /* 40 */ val Blocked: Blocked with scala.Double = js.native
  /* 10 */ val Busy: Busy with scala.Double = js.native
  /* 52 */ val Cancelled: Cancelled with scala.Double = js.native
  /* 64 */ val CannotUseOldPassword: CannotUseOldPassword with scala.Double = js.native
  /* 35 */ val ConnectFailed: ConnectFailed with scala.Double = js.native
  /* 47 */ val ContentVersion: ContentVersion with scala.Double = js.native
  /* 53 */ val DataCorruption: DataCorruption with scala.Double = js.native
  /* 80 */ val Disabled: Disabled with scala.Double = js.native
  /* 54 */ val DiskFull: DiskFull with scala.Double = js.native
  /* 14 */ val DuplicateName: DuplicateName with scala.Double = js.native
  /* 29 */ val DuplicateRequest: DuplicateRequest with scala.Double = js.native
  /* 99 */ val EmailSendFailure: EmailSendFailure with scala.Double = js.native
  /* 23 */ val EncryptionFailure: EncryptionFailure with scala.Double = js.native
  /* 27 */ val Expired: Expired with scala.Double = js.native
  /* 71 */ val ExpiredLoginAuthCode: ExpiredLoginAuthCode with scala.Double = js.native
  /* 59 */ val ExternalAccountAlreadyLinked: ExternalAccountAlreadyLinked with scala.Double = js.native
  /* 57 */ val ExternalAccountUnlinked: ExternalAccountUnlinked with scala.Double = js.native
  /* 70 */ val FacebookQueryError: FacebookQueryError with scala.Double = js.native
  /* 2 */ val Fail: Fail with scala.Double = js.native
  /* 9 */ val FileNotFound: FileNotFound with scala.Double = js.native
  /* 102 */ val GSLTDenied: GSLTDenied with scala.Double = js.native
  /* 106 */ val GSLTExpired: GSLTExpired with scala.Double = js.native
  /* 103 */ val GSOwnerDenied: GSOwnerDenied with scala.Double = js.native
  /* 36 */ val HandshakeFailed: HandshakeFailed with scala.Double = js.native
  /* 67 */ val HardwareNotCapableOfIPT: HardwareNotCapableOfIPT with scala.Double = js.native
  /* 37 */ val IOFailure: IOFailure with scala.Double = js.native
  /* 105 */ val IPBanned: IPBanned with scala.Double = js.native
  /* 72 */ val IPLoginRestrictionFailed: IPLoginRestrictionFailed with scala.Double = js.native
  /* 31 */ val IPNotFound: IPNotFound with scala.Double = js.native
  /* 68 */ val IPTInitError: IPTInitError with scala.Double = js.native
  /* 41 */ val Ignored: Ignored with scala.Double = js.native
  /* 61 */ val IllegalPassword: IllegalPassword with scala.Double = js.native
  /* 107 */ val InsufficientFunds: InsufficientFunds with scala.Double = js.native
  /* 24 */ val InsufficientPrivilege: InsufficientPrivilege with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 81 */ val InvalidCEGSubmission: InvalidCEGSubmission with scala.Double = js.native
  /* 13 */ val InvalidEmail: InvalidEmail with scala.Double = js.native
  /* 104 */ val InvalidItemType: InvalidItemType with scala.Double = js.native
  /* 65 */ val InvalidLoginAuthCode: InvalidLoginAuthCode with scala.Double = js.native
  /* 12 */ val InvalidName: InvalidName with scala.Double = js.native
  /* 8 */ val InvalidParam: InvalidParam with scala.Double = js.native
  /* 5 */ val InvalidPassword: InvalidPassword with scala.Double = js.native
  /* 7 */ val InvalidProtocolVer: InvalidProtocolVer with scala.Double = js.native
  /* 11 */ val InvalidState: InvalidState with scala.Double = js.native
  /* 19 */ val InvalidSteamID: InvalidSteamID with scala.Double = js.native
  /* 86 */ val ItemDeleted: ItemDeleted with scala.Double = js.native
  /* 86 */ val ItemOrEntryHasBeenDeleted: ItemOrEntryHasBeenDeleted with scala.Double = js.native
  /* 25 */ val LimitExceeded: LimitExceeded with scala.Double = js.native
  /* 33 */ val LockingFailed: LockingFailed with scala.Double = js.native
  /* 6 */ val LoggedInElsewhere: LoggedInElsewhere with scala.Double = js.native
  /* 34 */ val LogonSessionReplaced: LogonSessionReplaced with scala.Double = js.native
  /* 101 */ val NeedCaptcha: NeedCaptcha with scala.Double = js.native
  /* 3 */ val NoConnection: NoConnection with scala.Double = js.native
  /* 42 */ val NoMatch: NoMatch with scala.Double = js.native
  /* 75 */ val NoMatchingURL: NoMatchingURL with scala.Double = js.native
  /* 92 */ val NoMobileDevice: NoMobileDevice with scala.Double = js.native
  /* 92 */ val NoMobileDeviceAvailable: NoMobileDeviceAvailable with scala.Double = js.native
  /* 109 */ val NoSiteLicensesFound: NoSiteLicensesFound with scala.Double = js.native
  /* 21 */ val NotLoggedOn: NotLoggedOn with scala.Double = js.native
  /* 91 */ val NotModified: NotModified with scala.Double = js.native
  /* 100 */ val NotSettled: NotSettled with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 58 */ val PSNTicketInvalid: PSNTicketInvalid with scala.Double = js.native
  /* 69 */ val ParentalControlRestricted: ParentalControlRestricted with scala.Double = js.native
  /* 56 */ val PasswordNotSet: PasswordNotSet with scala.Double = js.native
  /* 49 */ val PasswordRequiredToKickSession: PasswordRequiredToKickSession with scala.Double = js.native
  /* 56 */ val PasswordUnset: PasswordUnset with scala.Double = js.native
  /* 22 */ val Pending: Pending with scala.Double = js.native
  /* 32 */ val PersistFailed: PersistFailed with scala.Double = js.native
  /* 97 */ val PhoneActivityLimitExceeded: PhoneActivityLimitExceeded with scala.Double = js.native
  /* 84 */ val RateLimitExceeded: RateLimitExceeded with scala.Double = js.native
  /* 98 */ val RefundToWallet: RefundToWallet with scala.Double = js.native
  /* 83 */ val RegionLocked: RegionLocked with scala.Double = js.native
  /* 55 */ val RemoteCallFailed: RemoteCallFailed with scala.Double = js.native
  /* 38 */ val RemoteDisconnect: RemoteDisconnect with scala.Double = js.native
  /* 60 */ val RemoteFileConflict: RemoteFileConflict with scala.Double = js.native
  /* 77 */ val RequirePasswordReEntry: RequirePasswordReEntry with scala.Double = js.native
  /* 82 */ val RestrictedDevice: RestrictedDevice with scala.Double = js.native
  /* 26 */ val Revoked: Revoked with scala.Double = js.native
  /* 94 */ val SMSCodeFailed: SMSCodeFailed with scala.Double = js.native
  /* 62 */ val SameAsPreviousValue: SameAsPreviousValue with scala.Double = js.native
  /* 44 */ val ServiceReadOnly: ServiceReadOnly with scala.Double = js.native
  /* 20 */ val ServiceUnavailable: ServiceUnavailable with scala.Double = js.native
  /* 39 */ val ShoppingCartNotFound: ShoppingCartNotFound with scala.Double = js.native
  /* 51 */ val Suspended: Suspended with scala.Double = js.native
  /* 93 */ val TimeIsOutOfSync: TimeIsOutOfSync with scala.Double = js.native
  /* 93 */ val TimeNotSynced: TimeNotSynced with scala.Double = js.native
  /* 16 */ val Timeout: Timeout with scala.Double = js.native
  /* 95 */ val TooManyAccountsAccessThisResource: TooManyAccountsAccessThisResource with scala.Double = js.native
  /* 108 */ val TooManyPending: TooManyPending with scala.Double = js.native
  /* 48 */ val TryAnotherCM: TryAnotherCM with scala.Double = js.native
  /* 89 */ val TwoFactorActivationCodeMismatch: TwoFactorActivationCodeMismatch with scala.Double = js.native
  /* 88 */ val TwoFactorCodeMismatch: TwoFactorCodeMismatch with scala.Double = js.native
  /* 79 */ val UnexpectedError: UnexpectedError with scala.Double = js.native
  /* 78 */ val ValueOutOfRange: ValueOutOfRange with scala.Double = js.native
  /* 110 */ val WGNetworkSendExceeded: WGNetworkSendExceeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EResult with scala.Double] = js.native
}

