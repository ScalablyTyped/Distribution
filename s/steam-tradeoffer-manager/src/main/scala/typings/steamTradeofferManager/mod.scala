package typings.steamTradeofferManager

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.steam.mod.SteamClient
import typings.steamTradeofferManager.anon.EResultErrorcauseTradeBan
import typings.steamTradeofferManager.anon.ErrorcauseTradeBanNewDevi
import typings.steamTradeofferManager.anon.TypeofSteamID
import typings.steamTradeofferManager.steamTradeofferManagerStrings.accepted
import typings.steamTradeofferManager.steamTradeofferManagerStrings.cancelOfferCount
import typings.steamTradeofferManager.steamTradeofferManagerStrings.cancelTime
import typings.steamTradeofferManager.steamTradeofferManagerStrings.escrow
import typings.steamTradeofferManager.steamTradeofferManagerStrings.newOffer
import typings.steamTradeofferManager.steamTradeofferManagerStrings.offerList
import typings.steamTradeofferManager.steamTradeofferManagerStrings.pending
import typings.steamTradeofferManager.steamTradeofferManagerStrings.pollData
import typings.steamTradeofferManager.steamTradeofferManagerStrings.pollFailure
import typings.steamTradeofferManager.steamTradeofferManagerStrings.pollSuccess
import typings.steamTradeofferManager.steamTradeofferManagerStrings.realTimeTradeCompleted
import typings.steamTradeofferManager.steamTradeofferManagerStrings.realTimeTradeConfirmationRequired
import typings.steamTradeofferManager.steamTradeofferManagerStrings.receivedOfferChanged
import typings.steamTradeofferManager.steamTradeofferManagerStrings.sent
import typings.steamTradeofferManager.steamTradeofferManagerStrings.sentOfferCanceled
import typings.steamTradeofferManager.steamTradeofferManagerStrings.sentOfferChanged
import typings.steamTradeofferManager.steamTradeofferManagerStrings.sentPendingOfferCanceled
import typings.steamTradeofferManager.steamTradeofferManagerStrings.unknownOfferSent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steam-tradeoffer-manager", JSImport.Namespace)
  @js.native
  open class ^ protected () extends TradeOfferManager {
    def this(options: TradeOfferManagerOptions) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string | number ]: string | number} */ trait EConfirmationMethod extends StObject {
    
    var `0`: String
    
    var `1`: String
    
    var `2`: String
    
    var Email: Double
    
    var MobileApp: Double
    
    var None: Double
  }
  object EConfirmationMethod {
    
    /* static member */
    @JSImport("steam-tradeoffer-manager", "EConfirmationMethod")
    @js.native
    val ^ : EConfirmationMethod = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EConfirmationMethod] (val x: Self) extends AnyVal {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: Double): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setMobileApp(value: Double): Self = StObject.set(x, "MobileApp", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Double): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
    }
  }
  
  trait EOfferFilter extends StObject {
    
    var ActiveOnly: Double
    
    var All: Double
    
    var HistoricalOnly: Double
  }
  object EOfferFilter {
    
    /* static member */
    @JSImport("steam-tradeoffer-manager", "EOfferFilter")
    @js.native
    val ^ : EOfferFilter = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EOfferFilter] (val x: Self) extends AnyVal {
      
      inline def setActiveOnly(value: Double): Self = StObject.set(x, "ActiveOnly", value.asInstanceOf[js.Any])
      
      inline def setAll(value: Double): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
      
      inline def setHistoricalOnly(value: Double): Self = StObject.set(x, "HistoricalOnly", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string | number ]: string | number} */ trait EResult extends StObject {
    
    var `0`: String
    
    var `1`: String
    
    var `10`: String
    
    var `100`: String
    
    var `101`: String
    
    var `102`: String
    
    var `103`: String
    
    var `104`: String
    
    var `105`: String
    
    var `106`: String
    
    var `107`: String
    
    var `108`: String
    
    var `109`: String
    
    var `11`: String
    
    var `110`: String
    
    var `111`: String
    
    var `112`: String
    
    var `12`: String
    
    var `13`: String
    
    var `14`: String
    
    var `15`: String
    
    var `16`: String
    
    var `17`: String
    
    var `18`: String
    
    var `19`: String
    
    var `2`: String
    
    var `20`: String
    
    var `21`: String
    
    var `22`: String
    
    var `23`: String
    
    var `24`: String
    
    var `25`: String
    
    var `26`: String
    
    var `27`: String
    
    var `28`: String
    
    var `29`: String
    
    var `3`: String
    
    var `30`: String
    
    var `31`: String
    
    var `32`: String
    
    var `33`: String
    
    var `34`: String
    
    var `35`: String
    
    var `36`: String
    
    var `37`: String
    
    var `38`: String
    
    var `39`: String
    
    var `40`: String
    
    var `41`: String
    
    var `42`: String
    
    var `43`: String
    
    var `44`: String
    
    var `45`: String
    
    var `46`: String
    
    var `47`: String
    
    var `48`: String
    
    var `49`: String
    
    var `5`: String
    
    var `50`: String
    
    var `51`: String
    
    var `52`: String
    
    var `53`: String
    
    var `54`: String
    
    var `55`: String
    
    var `56`: String
    
    var `57`: String
    
    var `58`: String
    
    var `59`: String
    
    var `6`: String
    
    var `60`: String
    
    var `61`: String
    
    var `62`: String
    
    var `63`: String
    
    var `64`: String
    
    var `65`: String
    
    var `66`: String
    
    var `67`: String
    
    var `68`: String
    
    var `69`: String
    
    var `7`: String
    
    var `70`: String
    
    var `71`: String
    
    var `72`: String
    
    var `73`: String
    
    var `74`: String
    
    var `75`: String
    
    var `76`: String
    
    var `77`: String
    
    var `78`: String
    
    var `79`: String
    
    var `8`: String
    
    var `80`: String
    
    var `81`: String
    
    var `82`: String
    
    var `83`: String
    
    var `84`: String
    
    var `85`: String
    
    var `86`: String
    
    var `87`: String
    
    var `88`: String
    
    var `89`: String
    
    var `9`: String
    
    var `90`: String
    
    var `91`: String
    
    var `92`: String
    
    var `93`: String
    
    var `94`: String
    
    var `95`: String
    
    var `96`: String
    
    var `97`: String
    
    var `98`: String
    
    var `99`: String
    
    var AccessDenied: Double
    
    var AccountActivityLimitExceeded: Double
    
    var AccountAssociatedToMultiplePartners: Double
    
    var AccountAssociatedToMultiplePlayers: Double
    
    var AccountDisabled: Double
    
    var AccountLimitExceeded: Double
    
    var AccountLocked: Double
    
    var AccountLockedDown: Double
    
    var AccountLoginDeniedNeedTwoFactor: Double
    
    var AccountLoginDeniedThrottle: Double
    
    var AccountLogonDenied: Double
    
    var AccountLogonDeniedNeedTwoFactorCode: Double
    
    var AccountLogonDeniedNoMail: Double
    
    var AccountLogonDeniedNoMailSent: Double
    
    var AccountLogonDeniedVerifiedEmailRequired: Double
    
    var AccountNotFeatured: Double
    
    var AccountNotFound: Double
    
    var AccountNotFriends: Double
    
    var AdministratorOK: Double
    
    var AlreadyLoggedInElsewhere: Double
    
    var AlreadyOwned: Double
    
    var AlreadyRedeemed: Double
    
    var BadResponse: Double
    
    var Banned: Double
    
    var Blocked: Double
    
    var Busy: Double
    
    var Cancelled: Double
    
    var CannotUseOldPassword: Double
    
    var ConnectFailed: Double
    
    var ContentVersion: Double
    
    var DataCorruption: Double
    
    var Disabled: Double
    
    var DiskFull: Double
    
    var DuplicateName: Double
    
    var DuplicateRequest: Double
    
    var EmailSendFailure: Double
    
    var EncryptionFailure: Double
    
    var Expired: Double
    
    var ExpiredLoginAuthCode: Double
    
    var ExternalAccountAlreadyLinked: Double
    
    var ExternalAccountUnlinked: Double
    
    var FacebookQueryError: Double
    
    var Fail: Double
    
    var FileNotFound: Double
    
    var GSLTDenied: Double
    
    var GSLTExpired: Double
    
    var GSOwnerDenied: Double
    
    var HandshakeFailed: Double
    
    var HardwareNotCapableOfIPT: Double
    
    var IOFailure: Double
    
    var IPBanned: Double
    
    var IPLoginRestrictionFailed: Double
    
    var IPNotFound: Double
    
    var IPTInitError: Double
    
    var Ignored: Double
    
    var IllegalPassword: Double
    
    var InsufficientFunds: Double
    
    var InsufficientPrivilege: Double
    
    var Invalid: Double
    
    var InvalidCEGSubmission: Double
    
    var InvalidEmail: Double
    
    var InvalidItemType: Double
    
    var InvalidLoginAuthCode: Double
    
    var InvalidName: Double
    
    var InvalidParam: Double
    
    var InvalidPassword: Double
    
    var InvalidProtocolVer: Double
    
    var InvalidState: Double
    
    var InvalidSteamID: Double
    
    var ItemDeleted: Double
    
    var ItemOrEntryHasBeenDeleted: Double
    
    var LimitExceeded: Double
    
    var LimitedUserAccount: Double
    
    var LockingFailed: Double
    
    var LoggedInElsewhere: Double
    
    var LogonSessionReplaced: Double
    
    var NeedCaptcha: Double
    
    var NoConnection: Double
    
    var NoMatch: Double
    
    var NoMatchingURL: Double
    
    var NoMobileDevice: Double
    
    var NoMobileDeviceAvailable: Double
    
    var NoSiteLicensesFound: Double
    
    var NotLoggedOn: Double
    
    var NotModified: Double
    
    var NotSettled: Double
    
    var OK: Double
    
    var PSNTicketInvalid: Double
    
    var ParentalControlRestricted: Double
    
    var PasswordNotSet: Double
    
    var PasswordRequiredToKickSession: Double
    
    var PasswordUnset: Double
    
    var Pending: Double
    
    var PersistFailed: Double
    
    var PhoneActivityLimitExceeded: Double
    
    var RateLimitExceeded: Double
    
    var RefundToWallet: Double
    
    var RegionLocked: Double
    
    var RemoteCallFailed: Double
    
    var RemoteDisconnect: Double
    
    var RemoteFileConflict: Double
    
    var RequirePasswordReEntry: Double
    
    var RestrictedDevice: Double
    
    var Revoked: Double
    
    var SMSCodeFailed: Double
    
    var SameAsPreviousValue: Double
    
    var ServiceReadOnly: Double
    
    var ServiceUnavailable: Double
    
    var ShoppingCartNotFound: Double
    
    var Suspended: Double
    
    var TimeIsOutOfSync: Double
    
    var TimeNotSynced: Double
    
    var Timeout: Double
    
    var TooManyAccountsAccessThisResource: Double
    
    var TooManyPending: Double
    
    var TryAnotherCM: Double
    
    var TwoFactorActivationCodeMismatch: Double
    
    var TwoFactorCodeMismatch: Double
    
    var UnexpectedError: Double
    
    var ValueOutOfRange: Double
    
    var WGNetworkSendExceeded: Double
  }
  object EResult {
    
    /* static member */
    @JSImport("steam-tradeoffer-manager", "EResult")
    @js.native
    val ^ : EResult = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EResult] (val x: Self) extends AnyVal {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set101(value: String): Self = StObject.set(x, "101", value.asInstanceOf[js.Any])
      
      inline def set102(value: String): Self = StObject.set(x, "102", value.asInstanceOf[js.Any])
      
      inline def set103(value: String): Self = StObject.set(x, "103", value.asInstanceOf[js.Any])
      
      inline def set104(value: String): Self = StObject.set(x, "104", value.asInstanceOf[js.Any])
      
      inline def set105(value: String): Self = StObject.set(x, "105", value.asInstanceOf[js.Any])
      
      inline def set106(value: String): Self = StObject.set(x, "106", value.asInstanceOf[js.Any])
      
      inline def set107(value: String): Self = StObject.set(x, "107", value.asInstanceOf[js.Any])
      
      inline def set108(value: String): Self = StObject.set(x, "108", value.asInstanceOf[js.Any])
      
      inline def set109(value: String): Self = StObject.set(x, "109", value.asInstanceOf[js.Any])
      
      inline def set11(value: String): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      inline def set110(value: String): Self = StObject.set(x, "110", value.asInstanceOf[js.Any])
      
      inline def set111(value: String): Self = StObject.set(x, "111", value.asInstanceOf[js.Any])
      
      inline def set112(value: String): Self = StObject.set(x, "112", value.asInstanceOf[js.Any])
      
      inline def set12(value: String): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
      
      inline def set13(value: String): Self = StObject.set(x, "13", value.asInstanceOf[js.Any])
      
      inline def set14(value: String): Self = StObject.set(x, "14", value.asInstanceOf[js.Any])
      
      inline def set15(value: String): Self = StObject.set(x, "15", value.asInstanceOf[js.Any])
      
      inline def set16(value: String): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      inline def set17(value: String): Self = StObject.set(x, "17", value.asInstanceOf[js.Any])
      
      inline def set18(value: String): Self = StObject.set(x, "18", value.asInstanceOf[js.Any])
      
      inline def set19(value: String): Self = StObject.set(x, "19", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set20(value: String): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
      
      inline def set21(value: String): Self = StObject.set(x, "21", value.asInstanceOf[js.Any])
      
      inline def set22(value: String): Self = StObject.set(x, "22", value.asInstanceOf[js.Any])
      
      inline def set23(value: String): Self = StObject.set(x, "23", value.asInstanceOf[js.Any])
      
      inline def set24(value: String): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
      
      inline def set25(value: String): Self = StObject.set(x, "25", value.asInstanceOf[js.Any])
      
      inline def set26(value: String): Self = StObject.set(x, "26", value.asInstanceOf[js.Any])
      
      inline def set27(value: String): Self = StObject.set(x, "27", value.asInstanceOf[js.Any])
      
      inline def set28(value: String): Self = StObject.set(x, "28", value.asInstanceOf[js.Any])
      
      inline def set29(value: String): Self = StObject.set(x, "29", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set30(value: String): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
      
      inline def set31(value: String): Self = StObject.set(x, "31", value.asInstanceOf[js.Any])
      
      inline def set32(value: String): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
      
      inline def set33(value: String): Self = StObject.set(x, "33", value.asInstanceOf[js.Any])
      
      inline def set34(value: String): Self = StObject.set(x, "34", value.asInstanceOf[js.Any])
      
      inline def set35(value: String): Self = StObject.set(x, "35", value.asInstanceOf[js.Any])
      
      inline def set36(value: String): Self = StObject.set(x, "36", value.asInstanceOf[js.Any])
      
      inline def set37(value: String): Self = StObject.set(x, "37", value.asInstanceOf[js.Any])
      
      inline def set38(value: String): Self = StObject.set(x, "38", value.asInstanceOf[js.Any])
      
      inline def set39(value: String): Self = StObject.set(x, "39", value.asInstanceOf[js.Any])
      
      inline def set40(value: String): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
      
      inline def set41(value: String): Self = StObject.set(x, "41", value.asInstanceOf[js.Any])
      
      inline def set42(value: String): Self = StObject.set(x, "42", value.asInstanceOf[js.Any])
      
      inline def set43(value: String): Self = StObject.set(x, "43", value.asInstanceOf[js.Any])
      
      inline def set44(value: String): Self = StObject.set(x, "44", value.asInstanceOf[js.Any])
      
      inline def set45(value: String): Self = StObject.set(x, "45", value.asInstanceOf[js.Any])
      
      inline def set46(value: String): Self = StObject.set(x, "46", value.asInstanceOf[js.Any])
      
      inline def set47(value: String): Self = StObject.set(x, "47", value.asInstanceOf[js.Any])
      
      inline def set48(value: String): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
      
      inline def set49(value: String): Self = StObject.set(x, "49", value.asInstanceOf[js.Any])
      
      inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set51(value: String): Self = StObject.set(x, "51", value.asInstanceOf[js.Any])
      
      inline def set52(value: String): Self = StObject.set(x, "52", value.asInstanceOf[js.Any])
      
      inline def set53(value: String): Self = StObject.set(x, "53", value.asInstanceOf[js.Any])
      
      inline def set54(value: String): Self = StObject.set(x, "54", value.asInstanceOf[js.Any])
      
      inline def set55(value: String): Self = StObject.set(x, "55", value.asInstanceOf[js.Any])
      
      inline def set56(value: String): Self = StObject.set(x, "56", value.asInstanceOf[js.Any])
      
      inline def set57(value: String): Self = StObject.set(x, "57", value.asInstanceOf[js.Any])
      
      inline def set58(value: String): Self = StObject.set(x, "58", value.asInstanceOf[js.Any])
      
      inline def set59(value: String): Self = StObject.set(x, "59", value.asInstanceOf[js.Any])
      
      inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set60(value: String): Self = StObject.set(x, "60", value.asInstanceOf[js.Any])
      
      inline def set61(value: String): Self = StObject.set(x, "61", value.asInstanceOf[js.Any])
      
      inline def set62(value: String): Self = StObject.set(x, "62", value.asInstanceOf[js.Any])
      
      inline def set63(value: String): Self = StObject.set(x, "63", value.asInstanceOf[js.Any])
      
      inline def set64(value: String): Self = StObject.set(x, "64", value.asInstanceOf[js.Any])
      
      inline def set65(value: String): Self = StObject.set(x, "65", value.asInstanceOf[js.Any])
      
      inline def set66(value: String): Self = StObject.set(x, "66", value.asInstanceOf[js.Any])
      
      inline def set67(value: String): Self = StObject.set(x, "67", value.asInstanceOf[js.Any])
      
      inline def set68(value: String): Self = StObject.set(x, "68", value.asInstanceOf[js.Any])
      
      inline def set69(value: String): Self = StObject.set(x, "69", value.asInstanceOf[js.Any])
      
      inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set70(value: String): Self = StObject.set(x, "70", value.asInstanceOf[js.Any])
      
      inline def set71(value: String): Self = StObject.set(x, "71", value.asInstanceOf[js.Any])
      
      inline def set72(value: String): Self = StObject.set(x, "72", value.asInstanceOf[js.Any])
      
      inline def set73(value: String): Self = StObject.set(x, "73", value.asInstanceOf[js.Any])
      
      inline def set74(value: String): Self = StObject.set(x, "74", value.asInstanceOf[js.Any])
      
      inline def set75(value: String): Self = StObject.set(x, "75", value.asInstanceOf[js.Any])
      
      inline def set76(value: String): Self = StObject.set(x, "76", value.asInstanceOf[js.Any])
      
      inline def set77(value: String): Self = StObject.set(x, "77", value.asInstanceOf[js.Any])
      
      inline def set78(value: String): Self = StObject.set(x, "78", value.asInstanceOf[js.Any])
      
      inline def set79(value: String): Self = StObject.set(x, "79", value.asInstanceOf[js.Any])
      
      inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set80(value: String): Self = StObject.set(x, "80", value.asInstanceOf[js.Any])
      
      inline def set81(value: String): Self = StObject.set(x, "81", value.asInstanceOf[js.Any])
      
      inline def set82(value: String): Self = StObject.set(x, "82", value.asInstanceOf[js.Any])
      
      inline def set83(value: String): Self = StObject.set(x, "83", value.asInstanceOf[js.Any])
      
      inline def set84(value: String): Self = StObject.set(x, "84", value.asInstanceOf[js.Any])
      
      inline def set85(value: String): Self = StObject.set(x, "85", value.asInstanceOf[js.Any])
      
      inline def set86(value: String): Self = StObject.set(x, "86", value.asInstanceOf[js.Any])
      
      inline def set87(value: String): Self = StObject.set(x, "87", value.asInstanceOf[js.Any])
      
      inline def set88(value: String): Self = StObject.set(x, "88", value.asInstanceOf[js.Any])
      
      inline def set89(value: String): Self = StObject.set(x, "89", value.asInstanceOf[js.Any])
      
      inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      inline def set90(value: String): Self = StObject.set(x, "90", value.asInstanceOf[js.Any])
      
      inline def set91(value: String): Self = StObject.set(x, "91", value.asInstanceOf[js.Any])
      
      inline def set92(value: String): Self = StObject.set(x, "92", value.asInstanceOf[js.Any])
      
      inline def set93(value: String): Self = StObject.set(x, "93", value.asInstanceOf[js.Any])
      
      inline def set94(value: String): Self = StObject.set(x, "94", value.asInstanceOf[js.Any])
      
      inline def set95(value: String): Self = StObject.set(x, "95", value.asInstanceOf[js.Any])
      
      inline def set96(value: String): Self = StObject.set(x, "96", value.asInstanceOf[js.Any])
      
      inline def set97(value: String): Self = StObject.set(x, "97", value.asInstanceOf[js.Any])
      
      inline def set98(value: String): Self = StObject.set(x, "98", value.asInstanceOf[js.Any])
      
      inline def set99(value: String): Self = StObject.set(x, "99", value.asInstanceOf[js.Any])
      
      inline def setAccessDenied(value: Double): Self = StObject.set(x, "AccessDenied", value.asInstanceOf[js.Any])
      
      inline def setAccountActivityLimitExceeded(value: Double): Self = StObject.set(x, "AccountActivityLimitExceeded", value.asInstanceOf[js.Any])
      
      inline def setAccountAssociatedToMultiplePartners(value: Double): Self = StObject.set(x, "AccountAssociatedToMultiplePartners", value.asInstanceOf[js.Any])
      
      inline def setAccountAssociatedToMultiplePlayers(value: Double): Self = StObject.set(x, "AccountAssociatedToMultiplePlayers", value.asInstanceOf[js.Any])
      
      inline def setAccountDisabled(value: Double): Self = StObject.set(x, "AccountDisabled", value.asInstanceOf[js.Any])
      
      inline def setAccountLimitExceeded(value: Double): Self = StObject.set(x, "AccountLimitExceeded", value.asInstanceOf[js.Any])
      
      inline def setAccountLocked(value: Double): Self = StObject.set(x, "AccountLocked", value.asInstanceOf[js.Any])
      
      inline def setAccountLockedDown(value: Double): Self = StObject.set(x, "AccountLockedDown", value.asInstanceOf[js.Any])
      
      inline def setAccountLoginDeniedNeedTwoFactor(value: Double): Self = StObject.set(x, "AccountLoginDeniedNeedTwoFactor", value.asInstanceOf[js.Any])
      
      inline def setAccountLoginDeniedThrottle(value: Double): Self = StObject.set(x, "AccountLoginDeniedThrottle", value.asInstanceOf[js.Any])
      
      inline def setAccountLogonDenied(value: Double): Self = StObject.set(x, "AccountLogonDenied", value.asInstanceOf[js.Any])
      
      inline def setAccountLogonDeniedNeedTwoFactorCode(value: Double): Self = StObject.set(x, "AccountLogonDeniedNeedTwoFactorCode", value.asInstanceOf[js.Any])
      
      inline def setAccountLogonDeniedNoMail(value: Double): Self = StObject.set(x, "AccountLogonDeniedNoMail", value.asInstanceOf[js.Any])
      
      inline def setAccountLogonDeniedNoMailSent(value: Double): Self = StObject.set(x, "AccountLogonDeniedNoMailSent", value.asInstanceOf[js.Any])
      
      inline def setAccountLogonDeniedVerifiedEmailRequired(value: Double): Self = StObject.set(x, "AccountLogonDeniedVerifiedEmailRequired", value.asInstanceOf[js.Any])
      
      inline def setAccountNotFeatured(value: Double): Self = StObject.set(x, "AccountNotFeatured", value.asInstanceOf[js.Any])
      
      inline def setAccountNotFound(value: Double): Self = StObject.set(x, "AccountNotFound", value.asInstanceOf[js.Any])
      
      inline def setAccountNotFriends(value: Double): Self = StObject.set(x, "AccountNotFriends", value.asInstanceOf[js.Any])
      
      inline def setAdministratorOK(value: Double): Self = StObject.set(x, "AdministratorOK", value.asInstanceOf[js.Any])
      
      inline def setAlreadyLoggedInElsewhere(value: Double): Self = StObject.set(x, "AlreadyLoggedInElsewhere", value.asInstanceOf[js.Any])
      
      inline def setAlreadyOwned(value: Double): Self = StObject.set(x, "AlreadyOwned", value.asInstanceOf[js.Any])
      
      inline def setAlreadyRedeemed(value: Double): Self = StObject.set(x, "AlreadyRedeemed", value.asInstanceOf[js.Any])
      
      inline def setBadResponse(value: Double): Self = StObject.set(x, "BadResponse", value.asInstanceOf[js.Any])
      
      inline def setBanned(value: Double): Self = StObject.set(x, "Banned", value.asInstanceOf[js.Any])
      
      inline def setBlocked(value: Double): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
      
      inline def setBusy(value: Double): Self = StObject.set(x, "Busy", value.asInstanceOf[js.Any])
      
      inline def setCancelled(value: Double): Self = StObject.set(x, "Cancelled", value.asInstanceOf[js.Any])
      
      inline def setCannotUseOldPassword(value: Double): Self = StObject.set(x, "CannotUseOldPassword", value.asInstanceOf[js.Any])
      
      inline def setConnectFailed(value: Double): Self = StObject.set(x, "ConnectFailed", value.asInstanceOf[js.Any])
      
      inline def setContentVersion(value: Double): Self = StObject.set(x, "ContentVersion", value.asInstanceOf[js.Any])
      
      inline def setDataCorruption(value: Double): Self = StObject.set(x, "DataCorruption", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Double): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
      
      inline def setDiskFull(value: Double): Self = StObject.set(x, "DiskFull", value.asInstanceOf[js.Any])
      
      inline def setDuplicateName(value: Double): Self = StObject.set(x, "DuplicateName", value.asInstanceOf[js.Any])
      
      inline def setDuplicateRequest(value: Double): Self = StObject.set(x, "DuplicateRequest", value.asInstanceOf[js.Any])
      
      inline def setEmailSendFailure(value: Double): Self = StObject.set(x, "EmailSendFailure", value.asInstanceOf[js.Any])
      
      inline def setEncryptionFailure(value: Double): Self = StObject.set(x, "EncryptionFailure", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Double): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredLoginAuthCode(value: Double): Self = StObject.set(x, "ExpiredLoginAuthCode", value.asInstanceOf[js.Any])
      
      inline def setExternalAccountAlreadyLinked(value: Double): Self = StObject.set(x, "ExternalAccountAlreadyLinked", value.asInstanceOf[js.Any])
      
      inline def setExternalAccountUnlinked(value: Double): Self = StObject.set(x, "ExternalAccountUnlinked", value.asInstanceOf[js.Any])
      
      inline def setFacebookQueryError(value: Double): Self = StObject.set(x, "FacebookQueryError", value.asInstanceOf[js.Any])
      
      inline def setFail(value: Double): Self = StObject.set(x, "Fail", value.asInstanceOf[js.Any])
      
      inline def setFileNotFound(value: Double): Self = StObject.set(x, "FileNotFound", value.asInstanceOf[js.Any])
      
      inline def setGSLTDenied(value: Double): Self = StObject.set(x, "GSLTDenied", value.asInstanceOf[js.Any])
      
      inline def setGSLTExpired(value: Double): Self = StObject.set(x, "GSLTExpired", value.asInstanceOf[js.Any])
      
      inline def setGSOwnerDenied(value: Double): Self = StObject.set(x, "GSOwnerDenied", value.asInstanceOf[js.Any])
      
      inline def setHandshakeFailed(value: Double): Self = StObject.set(x, "HandshakeFailed", value.asInstanceOf[js.Any])
      
      inline def setHardwareNotCapableOfIPT(value: Double): Self = StObject.set(x, "HardwareNotCapableOfIPT", value.asInstanceOf[js.Any])
      
      inline def setIOFailure(value: Double): Self = StObject.set(x, "IOFailure", value.asInstanceOf[js.Any])
      
      inline def setIPBanned(value: Double): Self = StObject.set(x, "IPBanned", value.asInstanceOf[js.Any])
      
      inline def setIPLoginRestrictionFailed(value: Double): Self = StObject.set(x, "IPLoginRestrictionFailed", value.asInstanceOf[js.Any])
      
      inline def setIPNotFound(value: Double): Self = StObject.set(x, "IPNotFound", value.asInstanceOf[js.Any])
      
      inline def setIPTInitError(value: Double): Self = StObject.set(x, "IPTInitError", value.asInstanceOf[js.Any])
      
      inline def setIgnored(value: Double): Self = StObject.set(x, "Ignored", value.asInstanceOf[js.Any])
      
      inline def setIllegalPassword(value: Double): Self = StObject.set(x, "IllegalPassword", value.asInstanceOf[js.Any])
      
      inline def setInsufficientFunds(value: Double): Self = StObject.set(x, "InsufficientFunds", value.asInstanceOf[js.Any])
      
      inline def setInsufficientPrivilege(value: Double): Self = StObject.set(x, "InsufficientPrivilege", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Double): Self = StObject.set(x, "Invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidCEGSubmission(value: Double): Self = StObject.set(x, "InvalidCEGSubmission", value.asInstanceOf[js.Any])
      
      inline def setInvalidEmail(value: Double): Self = StObject.set(x, "InvalidEmail", value.asInstanceOf[js.Any])
      
      inline def setInvalidItemType(value: Double): Self = StObject.set(x, "InvalidItemType", value.asInstanceOf[js.Any])
      
      inline def setInvalidLoginAuthCode(value: Double): Self = StObject.set(x, "InvalidLoginAuthCode", value.asInstanceOf[js.Any])
      
      inline def setInvalidName(value: Double): Self = StObject.set(x, "InvalidName", value.asInstanceOf[js.Any])
      
      inline def setInvalidParam(value: Double): Self = StObject.set(x, "InvalidParam", value.asInstanceOf[js.Any])
      
      inline def setInvalidPassword(value: Double): Self = StObject.set(x, "InvalidPassword", value.asInstanceOf[js.Any])
      
      inline def setInvalidProtocolVer(value: Double): Self = StObject.set(x, "InvalidProtocolVer", value.asInstanceOf[js.Any])
      
      inline def setInvalidState(value: Double): Self = StObject.set(x, "InvalidState", value.asInstanceOf[js.Any])
      
      inline def setInvalidSteamID(value: Double): Self = StObject.set(x, "InvalidSteamID", value.asInstanceOf[js.Any])
      
      inline def setItemDeleted(value: Double): Self = StObject.set(x, "ItemDeleted", value.asInstanceOf[js.Any])
      
      inline def setItemOrEntryHasBeenDeleted(value: Double): Self = StObject.set(x, "ItemOrEntryHasBeenDeleted", value.asInstanceOf[js.Any])
      
      inline def setLimitExceeded(value: Double): Self = StObject.set(x, "LimitExceeded", value.asInstanceOf[js.Any])
      
      inline def setLimitedUserAccount(value: Double): Self = StObject.set(x, "LimitedUserAccount", value.asInstanceOf[js.Any])
      
      inline def setLockingFailed(value: Double): Self = StObject.set(x, "LockingFailed", value.asInstanceOf[js.Any])
      
      inline def setLoggedInElsewhere(value: Double): Self = StObject.set(x, "LoggedInElsewhere", value.asInstanceOf[js.Any])
      
      inline def setLogonSessionReplaced(value: Double): Self = StObject.set(x, "LogonSessionReplaced", value.asInstanceOf[js.Any])
      
      inline def setNeedCaptcha(value: Double): Self = StObject.set(x, "NeedCaptcha", value.asInstanceOf[js.Any])
      
      inline def setNoConnection(value: Double): Self = StObject.set(x, "NoConnection", value.asInstanceOf[js.Any])
      
      inline def setNoMatch(value: Double): Self = StObject.set(x, "NoMatch", value.asInstanceOf[js.Any])
      
      inline def setNoMatchingURL(value: Double): Self = StObject.set(x, "NoMatchingURL", value.asInstanceOf[js.Any])
      
      inline def setNoMobileDevice(value: Double): Self = StObject.set(x, "NoMobileDevice", value.asInstanceOf[js.Any])
      
      inline def setNoMobileDeviceAvailable(value: Double): Self = StObject.set(x, "NoMobileDeviceAvailable", value.asInstanceOf[js.Any])
      
      inline def setNoSiteLicensesFound(value: Double): Self = StObject.set(x, "NoSiteLicensesFound", value.asInstanceOf[js.Any])
      
      inline def setNotLoggedOn(value: Double): Self = StObject.set(x, "NotLoggedOn", value.asInstanceOf[js.Any])
      
      inline def setNotModified(value: Double): Self = StObject.set(x, "NotModified", value.asInstanceOf[js.Any])
      
      inline def setNotSettled(value: Double): Self = StObject.set(x, "NotSettled", value.asInstanceOf[js.Any])
      
      inline def setOK(value: Double): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
      
      inline def setPSNTicketInvalid(value: Double): Self = StObject.set(x, "PSNTicketInvalid", value.asInstanceOf[js.Any])
      
      inline def setParentalControlRestricted(value: Double): Self = StObject.set(x, "ParentalControlRestricted", value.asInstanceOf[js.Any])
      
      inline def setPasswordNotSet(value: Double): Self = StObject.set(x, "PasswordNotSet", value.asInstanceOf[js.Any])
      
      inline def setPasswordRequiredToKickSession(value: Double): Self = StObject.set(x, "PasswordRequiredToKickSession", value.asInstanceOf[js.Any])
      
      inline def setPasswordUnset(value: Double): Self = StObject.set(x, "PasswordUnset", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Double): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
      
      inline def setPersistFailed(value: Double): Self = StObject.set(x, "PersistFailed", value.asInstanceOf[js.Any])
      
      inline def setPhoneActivityLimitExceeded(value: Double): Self = StObject.set(x, "PhoneActivityLimitExceeded", value.asInstanceOf[js.Any])
      
      inline def setRateLimitExceeded(value: Double): Self = StObject.set(x, "RateLimitExceeded", value.asInstanceOf[js.Any])
      
      inline def setRefundToWallet(value: Double): Self = StObject.set(x, "RefundToWallet", value.asInstanceOf[js.Any])
      
      inline def setRegionLocked(value: Double): Self = StObject.set(x, "RegionLocked", value.asInstanceOf[js.Any])
      
      inline def setRemoteCallFailed(value: Double): Self = StObject.set(x, "RemoteCallFailed", value.asInstanceOf[js.Any])
      
      inline def setRemoteDisconnect(value: Double): Self = StObject.set(x, "RemoteDisconnect", value.asInstanceOf[js.Any])
      
      inline def setRemoteFileConflict(value: Double): Self = StObject.set(x, "RemoteFileConflict", value.asInstanceOf[js.Any])
      
      inline def setRequirePasswordReEntry(value: Double): Self = StObject.set(x, "RequirePasswordReEntry", value.asInstanceOf[js.Any])
      
      inline def setRestrictedDevice(value: Double): Self = StObject.set(x, "RestrictedDevice", value.asInstanceOf[js.Any])
      
      inline def setRevoked(value: Double): Self = StObject.set(x, "Revoked", value.asInstanceOf[js.Any])
      
      inline def setSMSCodeFailed(value: Double): Self = StObject.set(x, "SMSCodeFailed", value.asInstanceOf[js.Any])
      
      inline def setSameAsPreviousValue(value: Double): Self = StObject.set(x, "SameAsPreviousValue", value.asInstanceOf[js.Any])
      
      inline def setServiceReadOnly(value: Double): Self = StObject.set(x, "ServiceReadOnly", value.asInstanceOf[js.Any])
      
      inline def setServiceUnavailable(value: Double): Self = StObject.set(x, "ServiceUnavailable", value.asInstanceOf[js.Any])
      
      inline def setShoppingCartNotFound(value: Double): Self = StObject.set(x, "ShoppingCartNotFound", value.asInstanceOf[js.Any])
      
      inline def setSuspended(value: Double): Self = StObject.set(x, "Suspended", value.asInstanceOf[js.Any])
      
      inline def setTimeIsOutOfSync(value: Double): Self = StObject.set(x, "TimeIsOutOfSync", value.asInstanceOf[js.Any])
      
      inline def setTimeNotSynced(value: Double): Self = StObject.set(x, "TimeNotSynced", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
      
      inline def setTooManyAccountsAccessThisResource(value: Double): Self = StObject.set(x, "TooManyAccountsAccessThisResource", value.asInstanceOf[js.Any])
      
      inline def setTooManyPending(value: Double): Self = StObject.set(x, "TooManyPending", value.asInstanceOf[js.Any])
      
      inline def setTryAnotherCM(value: Double): Self = StObject.set(x, "TryAnotherCM", value.asInstanceOf[js.Any])
      
      inline def setTwoFactorActivationCodeMismatch(value: Double): Self = StObject.set(x, "TwoFactorActivationCodeMismatch", value.asInstanceOf[js.Any])
      
      inline def setTwoFactorCodeMismatch(value: Double): Self = StObject.set(x, "TwoFactorCodeMismatch", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedError(value: Double): Self = StObject.set(x, "UnexpectedError", value.asInstanceOf[js.Any])
      
      inline def setValueOutOfRange(value: Double): Self = StObject.set(x, "ValueOutOfRange", value.asInstanceOf[js.Any])
      
      inline def setWGNetworkSendExceeded(value: Double): Self = StObject.set(x, "WGNetworkSendExceeded", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string | number ]: string | number} */ trait ETradeOfferState extends StObject {
    
    var `1`: String
    
    var `10`: String
    
    var `11`: String
    
    var `2`: String
    
    var `3`: String
    
    var `4`: String
    
    var `5`: String
    
    var `6`: String
    
    var `7`: String
    
    var `8`: String
    
    var `9`: String
    
    /** 3 - The trade offer was accepted by the recipient and items were exchanged. */
    var Accepted: Double
    
    /** 2 - This trade offer has been sent, neither party has acted on it yet. */
    var Active: Double
    
    /** 6 - The sender cancelled the offer. */
    var Canceled: Double
    
    /** 10 - Either party canceled the offer via email/mobile. The offer is visible to both parties, even if the sender canceled it before it was sent. */
    var CanceledBySecondFactor: Double
    
    /** 4 - The recipient made a counter offer. */
    var Countered: Double
    
    /** 9 - The offer hasn't been sent yet and is awaiting email/mobile confirmation. The offer is only visible to the sender. */
    var CreatedNeedsConfirmation: Double
    
    /** 7 - The recipient declined the offer. */
    var Declined: Double
    
    /** 5 - The trade offer was not accepted before the expiration date. */
    var Expired: Double
    
    /** 11 - The trade has been placed on hold. The items involved in the trade have all been removed from both parties' inventories and will be automatically delivered in the future. */
    var InEscrow: Double
    
    /** 1 - Invalid. */
    var Invalid: Double
    
    /** 8 - Some of the items in the offer are no longer available (indicated by the missing flag in the output). */
    var InvalidItems: Double
  }
  object ETradeOfferState {
    
    // Static constants
    /* static member */
    @JSImport("steam-tradeoffer-manager", "ETradeOfferState")
    @js.native
    val ^ : ETradeOfferState = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ETradeOfferState] (val x: Self) extends AnyVal {
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      inline def set11(value: String): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      inline def setAccepted(value: Double): Self = StObject.set(x, "Accepted", value.asInstanceOf[js.Any])
      
      inline def setActive(value: Double): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      inline def setCanceled(value: Double): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
      
      inline def setCanceledBySecondFactor(value: Double): Self = StObject.set(x, "CanceledBySecondFactor", value.asInstanceOf[js.Any])
      
      inline def setCountered(value: Double): Self = StObject.set(x, "Countered", value.asInstanceOf[js.Any])
      
      inline def setCreatedNeedsConfirmation(value: Double): Self = StObject.set(x, "CreatedNeedsConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDeclined(value: Double): Self = StObject.set(x, "Declined", value.asInstanceOf[js.Any])
      
      inline def setExpired(value: Double): Self = StObject.set(x, "Expired", value.asInstanceOf[js.Any])
      
      inline def setInEscrow(value: Double): Self = StObject.set(x, "InEscrow", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Double): Self = StObject.set(x, "Invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidItems(value: Double): Self = StObject.set(x, "InvalidItems", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string | number ]: string | number} */ trait ETradeStatus extends StObject {
    
    var `0`: String
    
    var `1`: String
    
    var `10`: String
    
    var `11`: String
    
    var `2`: String
    
    var `3`: String
    
    var `4`: String
    
    var `5`: String
    
    var `6`: String
    
    var `7`: String
    
    var `8`: String
    
    var `9`: String
    
    /** 2 - The items have been exchanged. */
    var Committed: Double
    
    /** 3 - All work is finished. */
    var Complete: Double
    
    /** 11 - A trade in escrow was rolled back  */
    var EscrowRollback: Double
    
    /** 4 - Something went wrong after Init, but before Committed, and the trade has been rolled back. */
    var Failed: Double
    
    /** 6 - A support person rolled back the trade for both sides. */
    var FullSupportRollback: Double
    
    /** 10 - Trade is in escrow. */
    var InEscrow: Double
    
    /** 0 - Trade has just been accepted/confirmed, but no work has been done yet. */
    var Init: Double
    
    /** 5 - A support person rolled back the trade for one side. */
    var PartialSupportRollback: Double
    
    /** 1 - Steam is about to start committing the trade. */
    var PreCommitted: Double
    
    /** 9 - We tried to roll back the trade, but some failure didn't go away and we gave up. */
    var RollbackAbandoned: Double
    
    /** 8 - We tried to roll back the trade when it failed, but haven't managed to do that for all items yet. */
    var RollbackFailed: Double
    
    /** 7 - A support person rolled back the trade for some set of items. */
    var SupportRollback_Selective: Double
  }
  object ETradeStatus {
    
    /* static member */
    @JSImport("steam-tradeoffer-manager", "ETradeStatus")
    @js.native
    val ^ : ETradeStatus = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ETradeStatus] (val x: Self) extends AnyVal {
      
      inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      inline def set11(value: String): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      inline def set2(value: String): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: String): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set4(value: String): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      inline def setCommitted(value: Double): Self = StObject.set(x, "Committed", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Double): Self = StObject.set(x, "Complete", value.asInstanceOf[js.Any])
      
      inline def setEscrowRollback(value: Double): Self = StObject.set(x, "EscrowRollback", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: Double): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
      
      inline def setFullSupportRollback(value: Double): Self = StObject.set(x, "FullSupportRollback", value.asInstanceOf[js.Any])
      
      inline def setInEscrow(value: Double): Self = StObject.set(x, "InEscrow", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Double): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
      
      inline def setPartialSupportRollback(value: Double): Self = StObject.set(x, "PartialSupportRollback", value.asInstanceOf[js.Any])
      
      inline def setPreCommitted(value: Double): Self = StObject.set(x, "PreCommitted", value.asInstanceOf[js.Any])
      
      inline def setRollbackAbandoned(value: Double): Self = StObject.set(x, "RollbackAbandoned", value.asInstanceOf[js.Any])
      
      inline def setRollbackFailed(value: Double): Self = StObject.set(x, "RollbackFailed", value.asInstanceOf[js.Any])
      
      inline def setSupportRollback_Selective(value: Double): Self = StObject.set(x, "SupportRollback_Selective", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("steam-tradeoffer-manager", "SteamID")
  @js.native
  open class SteamID protected ()
    extends typings.steamid.mod.^ {
    /**
      * You can create a SteamID object from a Steam2 rendered ID, a Steam3 rendered ID, a SteamID64, or from the four parts that make up a SteamID.
      * @param input SteamID string BigInt
      */
    def this(input: String) = this()
  }
  /* static member */
  @JSImport("steam-tradeoffer-manager", "SteamID")
  @js.native
  val SteamID: TypeofSteamID & (Instantiable1[/* input */ String, typings.steamid.mod.^]) = js.native
  
  trait EResultError
    extends StObject
       with Error {
    
    var eresult: js.UndefOr[EResult] = js.undefined
  }
  object EResultError {
    
    inline def apply(message: String, name: String): EResultError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EResultError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EResultError] (val x: Self) extends AnyVal {
      
      inline def setEresult(value: EResult): Self = StObject.set(x, "eresult", value.asInstanceOf[js.Any])
      
      inline def setEresultUndefined: Self = StObject.set(x, "eresult", js.undefined)
    }
  }
  
  type ExchangeDetailsCallback = js.Function5[
    /* err */ js.Error | Null, 
    /* status */ ETradeStatus, 
    /* tradeInitTime */ js.Date, 
    /* receivedItems */ js.Array[MEconItemExchange], 
    /* sentItems */ js.Array[MEconItemExchange], 
    Unit
  ]
  
  type InventoryCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* inventory */ js.Array[typings.steamcommunity.classesCeconitemMod.^], 
    /* currencies */ js.Array[typings.steamcommunity.classesCeconitemMod.^], 
    Unit
  ]
  
  @js.native
  trait MEconItemExchange
    extends typings.steamcommunity.classesCeconitemMod.^ {
    
    @JSName("appid")
    var appid_MEconItemExchange: Double = js.native
    
    @JSName("assetid")
    var assetid_MEconItemExchange: Double = js.native
    
    @JSName("classid")
    var classid_MEconItemExchange: Double = js.native
    
    @JSName("contextid")
    var contextid_MEconItemExchange: Double = js.native
    
    var new_assetid: js.UndefOr[Double] = js.native
    
    var new_contextid: js.UndefOr[Double] = js.native
    
    var rollback_new_assetid: js.UndefOr[Double] = js.native
    
    var rollback_new_contextid: js.UndefOr[Double] = js.native
  }
  
  type OfferCallback = js.Function3[
    /* err */ EResultError | Null, 
    /* sent */ js.Array[TradeOffer], 
    /* received */ js.Array[TradeOffer], 
    Unit
  ]
  
  /**
    * TradeOffer is a class which represents an individual trade offer sent or received by your account. It cannot be instantiated directly, it must be created using
    * TradeOfferManager#createOffer, TradeOfferManager#getOffer, or TradeOfferManager#getOffers.
    */
  @js.native
  trait TradeOffer extends StObject {
    
    /**
      * Accepts an offer that was sent to us. Once the callback fires, you can call getReceivedItems to get details about the items you received,
      * including their new assetids. As of v1.1.0, on failure, the err object may contain an eresult property. As of v1.3.0, on failure,
      * the err object may contain a cause property which will be one of TradeBan (if the partner is trade banned),
      * NewDevice (if you've logged in from a new device and must wait), or TargetCannotTrade (if the partner cannot trade due to Steam Guard, password reset, etc.).
      *
      * With the default value of false for skipStateUpdate, TradeOfferManager will query the trade offer's new status from the WebAPI
      * before calling your callback. This allows it to check whether the trade went into escrow or not, and the exact time when escrow will end for this offer.
      *
      * If this is not a concern for you, you may provide true for skipStateUpdate. This will bypass the extra request
      * (which may error out in some cases when acceptance succeeded), but status will be accepted instead of escrow if
      * the trade is placed on hold. The state property of the TradeOffer will also not be updated in this case.
      */
    def accept(): Unit = js.native
    def accept(skipStateUpdate: Boolean): Unit = js.native
    def accept(
      skipStateUpdate: Boolean,
      callback: js.Function2[
          /* err */ EResultErrorcauseTradeBan | Null, 
          /* status */ pending | accepted | escrow, 
          Unit
        ]
    ): Unit = js.native
    def accept(
      skipStateUpdate: Unit,
      callback: js.Function2[
          /* err */ EResultErrorcauseTradeBan | Null, 
          /* status */ pending | accepted | escrow, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Adds a given item to a new trade offer. The item object should be in the same format as is returned by the Steam inventory.
      *
      * Returns true if the item wasn't already in the offer and so was added successfully, or false if it was already in the offer.
      *
      * As trade offers are created locally, this method does not involve any networking and returns immediately with no callback.
      */
    def addMyItem(item: typings.steamcommunity.classesCeconitemMod.^): Boolean = js.native
    
    /**
      * Convenience method which simply calls addMyItem for each item in the array. Returns the number of items that were successfully added.
      */
    def addMyItems(items: js.Array[typings.steamcommunity.classesCeconitemMod.^]): Double = js.native
    
    /**
      * Same as addMyItem, but for the partner's side of the trade.
      */
    def addTheirItem(item: typings.steamcommunity.classesCeconitemMod.^): Boolean = js.native
    
    /**
      * Convenience method which simply calls addTheirItem for each item in the array. Returns the number of items that were successfully added.
      */
    def addTheirItems(items: js.Array[typings.steamcommunity.classesCeconitemMod.^]): Double = js.native
    
    /**
      * If this trade offer was sent by us, cancels it. If it was sent to us, declines it. As of v1.1.0, on failure, the err object may contain an eresult property.
      */
    def cancel(callback: js.Function1[/* err */ EResultError | Null, Unit]): Unit = js.native
    
    val confirmationMethod: Double = js.native
    
    /**
      * Returns true if the given item is in this offer, or false if not.
      */
    def containsItem(item: typings.steamcommunity.classesCeconitemMod.^): Boolean = js.native
    
    /**
      * Returns a new unsent TradeOffer object that contains the same items as this one. Sending the new trade offer will
      * send a counter offer, and this offer will be marked as Countered.
      */
    def counter(): TradeOffer = js.native
    
    val created: js.Date = js.native
    
    /**
      * Gets or sets any arbitrary data you wish to associate with a trade offer. This can be useful to give offers context.
      * This data is stored in poll data, so you will need to save and restore that if you want your offer data to persist
      * across app sessions.
      */
    def data(key: String): Any = js.native
    def data(key: String, value: Any): Any = js.native
    
    /**
      * Alias of cancel
      */
    def decline(callback: js.Function1[/* err */ EResultError | Null, Unit]): Unit = js.native
    
    /**
      * Returns a new unsent TradeOffer object that contains the same items as this one. Same as TradeOffer#counter,
      * except sending this offer won't mark the original as Countered.
      */
    def duplicate(): TradeOffer = js.native
    
    val escrowEnds: js.Date = js.native
    
    val expires: js.Date = js.native
    
    val fromRealTimeTrade: Boolean = js.native
    
    /**
      * Gets detailed information for the items exchanged in this trade, including old and new asset IDs. This can be called for any
      * trade offer that has a tradeID property defined that isn't null, including those that are in escrow or have failed.
      *
      * If you pass true to getDetailsIfFailed, it is vitally important that you check the status to be sure that the
      * trade hasn't failed or been rolled back before processing the trade as having completed.
      */
    def getExchangeDetails(callback: ExchangeDetailsCallback): Unit = js.native
    def getExchangeDetails(getDetailsIfFailed: Boolean, callback: ExchangeDetailsCallback): Unit = js.native
    
    /**
      * Gets the contents of your trading partner's inventory for a particular app and context. Same difference from
      * loadPartnerInventory as there is between TradeOfferManager#getInventoryContents and TradeOfferManager#loadInventory.
      * See that documentation for more information.
      */
    def getPartnerInventoryContents(appid: Double, contextid: Double, callback: InventoryCallback): Unit = js.native
    
    /**
      * Can be called on an accepted offer to retrieve item data about the items you received, including names, descriptions,
      * and new assetids. Will not include any actions (e.g. the CS:GO inspect link) unless getActions is true.
      */
    def getReceivedItems(
      callback: js.Function2[
          /* err */ js.Error | Null, 
          /* items */ js.Array[typings.steamcommunity.classesCeconitemMod.^], 
          Unit
        ]
    ): Unit = js.native
    def getReceivedItems(
      getActions: Boolean,
      callback: js.Function2[
          /* err */ js.Error | Null, 
          /* items */ js.Array[typings.steamcommunity.classesCeconitemMod.^], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Gets data about both users in this trade. May be called for offers that meet one of these criteria:
      *
      * * Created by you, unsent, and you're friends with the other user
      * * Created by you, unsent, and you supplied the other user's correct trade token (either in the constructor or with setToken)
      * * Created by them, sent, and Active
      *
      * If there was an error and the offer was created by you and is unsent, then the error might describe a reason why you can't trade with the other user at all
      * (e.g. they're trade banned, wrong trade token, they're on a trade cooldown, etc). The error might also be something else, like an HTTP error.
      *
      * @param callback Contains an Error on failure (null on success), an object containing your user data, and an object containing the user oither's data
      */
    def getUserDetails(
      callback: js.Function3[/* err */ js.Error | Null, /* me */ UserDetails, /* them */ UserDetails, Unit]
    ): Unit = js.native
    
    val id: js.UndefOr[String] = js.native
    
    /**
      * Checks if the offer is "glitched". Returns true (glitched) or false (not glitched).
      * An offer is considered "glitched" if it has been sent and either contains no items
      * (itemsToGive and itemsToReceive are both empty) or any item has an empty or undefined name.
      * Neither of these conditions can be met under normal, non-buggy Steam conditions.
      */
    def isGlitched(): Boolean = js.native
    
    val isOurOffer: Boolean = js.native
    
    val itemsToGive: js.Array[typings.steamcommunity.classesCeconitemMod.^] = js.native
    
    val itemsToReceive: js.Array[typings.steamcommunity.classesCeconitemMod.^] = js.native
    
    /**
      * Gets the contents of your trading partner's inventory for a particular app and context.
      * @deprecated Use getPartnerInventoryContents instead.
      */
    def loadPartnerInventory(appid: Double, contextid: Double, callback: InventoryCallback): Unit = js.native
    
    val manager: TradeOfferManager = js.native
    
    val message: String = js.native
    
    val partner: typings.steamid.mod.^ = js.native
    
    val rawJson: String = js.native
    
    /**
      * Removes an item from your side of the trade offer. Returns true if the item was found and removed successfully, or false if the item wasn't found in the offer.
      *
      * As trade offers are created locally, this method does not involve any networking and returns immediately with no callback.
      */
    def removeMyItem(item: typings.steamcommunity.classesCeconitemMod.^): Boolean = js.native
    
    /**
      * Convenience method which simply calls removeMyItem for each item in the array. Returns the number of items that were successfully removed.
      */
    def removeMyItems(items: js.Array[typings.steamcommunity.classesCeconitemMod.^]): Double = js.native
    
    /**
      * Removes an item from the other side of the trade offer. Returns true if the item was found and removed successfully, or false if the item wasn't found in the offer.
      *
      * As trade offers are created locally, this method does not involve any networking and returns immediately with no callback.
      */
    def removeTheirItem(item: typings.steamcommunity.classesCeconitemMod.^): Boolean = js.native
    
    /**
      * Convenience method which simply calls removeTheirItem for each item in the array. Returns the number of items that were successfully removed.
      */
    def removeTheirItems(items: js.Array[typings.steamcommunity.classesCeconitemMod.^]): Double = js.native
    
    /**
      * Sends a newly-created offer. Only works if this is an offer created with TradeOfferManager#createOffer which hasn't been
      * sent yet. When the callback fires, if successful, the offer's id parameter will be defined. All other parameters will be
      * defined with the module's best guess for their values. As of v1.1.0, on failure, the err object may contain an eresult
      * property. As of v1.3.0, on failure, the err object may contain a cause property which will be one of the following strings:
      *
      * - TradeBan - The trade partner is trade banned
      * - NewDevice - You've logged in from a new device and must wait to be able to trade
      * - TargetCannotTrade - The trade partner cannot trade due to Steam Guard, password reset, etc.
      * - OfferLimitExceeded - You have sent too many trade offers (5 per trade partner, 30 total)
      * - ItemServerUnavailable - Steam couldn't contact the item server for a game you're trying to trade items in
      */
    def send(
      callback: js.Function2[/* err */ ErrorcauseTradeBanNewDevi | Null, /* status */ pending | sent, Unit]
    ): Unit = js.native
    
    /**
      * Sets this unsent offer's message. Messages are limited by Steam to 128 characters.
      */
    def setMessage(message: String): Unit = js.native
    
    /**
      * Sets this unsent offer's access token, which is needed to send trade offers to non-friends. This token will be used to send the offer, and then will be discarded.
      */
    def setToken(token: String): Unit = js.native
    
    val state: Double = js.native
    
    val tradeID: js.UndefOr[String] = js.native
    
    /**
      * Fetch the latest data for this offer from the WebAPI. When the callback is fired, if an error didn't occur then all
      * of this offer's properties will be updated with the newest values.
      */
    def update(callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    val updated: js.Date = js.native
  }
  
  @js.native
  trait TradeOfferManager extends EventEmitter {
    
    val apiKey: String | Null = js.native
    
    var cancelOfferCount: Double | Null = js.native
    
    var cancelOfferCountMinAge: Double = js.native
    
    var cancelTime: Double | Null = js.native
    
    def createOffer(partner: String): TradeOffer = js.native
    def createOffer(partner: String, token: String): TradeOffer = js.native
    /**
      * Creates a new empty TradeOffer and returns it to you. You can pass either a SteamID (as an object or a string) or a trade URL to partner. If you pass a trade URL,
      * then your trade partner's SteamID (and access token, if present) will be extracted from the URL.
      *
      * Important: If you use a trade URL, make sure you verify the user's SteamID if the URL was user-provided. Users can give you trade URLs that don't belong to them, causing you to
      * send unsolicited trade offers to random users!
      *
      * @param partner A trade URL, a SteamID object, or a string which can parse into a SteamID (STEAM_0:0:23071901, [U:1:46143802], 76561198006409530).
      * @param token Your trade partner's access token, if needed
      */
    def createOffer(partner: typings.steamid.mod.^): TradeOffer = js.native
    def createOffer(partner: typings.steamid.mod.^, token: String): TradeOffer = js.native
    
    /**
      * Immediately performs a poll. Can be used even if timed polling is disabled to poll on your own schedule. Don't worry about spamming this method,
      * node-steam-tradeoffer-manager will automatically limit polls to at most one per second.
      */
    def doPoll(): Unit = js.native
    
    /**
      * Gets the contents of your own inventory. This method uses the newer /inventory/SteamID endpoint, which is less rate-limited than the older, deprecated /profiles/SteamID/inventory/json
      * endpoint. However, the output data is slightly different. The only known difference right now is that app_data is not available. You will need to use other means to obtain that data
      * if you need it. Don't rely on the older endpoint and the deprecated loadInventory method as it will likely be removed in the future.
      *
      * @param appid The Steam App ID of the game for which you want to load your own inventory
      * @param contextid The ID of the context within the app that you're loading the inventory for
      * @param tradableOnly true to only include tradable items, false to include all
      * @param callback Invoked when data is ready, includes an Error on failure (null on success), an array of the user's inventory items as CEconItem objects,
      * and an array of the user's currency items as CEconItem objects
      */
    def getInventoryContents(appid: Double, contextid: Double, tradableOnly: Boolean, callback: InventoryCallback): Unit = js.native
    
    def getOffer(id: String, callback: js.Function2[/* err */ EResultError | Null, /* offer */ TradeOffer, Unit]): Unit = js.native
    /**
      * Gets a TradeOffer object for a specific offer ID. As of v1.1.0, on failure, the err object may contain an eresult property.
      *
      * @param id The ID of the trade offer, as a string or number
      * @param callback Called on completion with an Error on failure (null on success) and the TradeOffer object for the requested offer.
      */
    def getOffer(id: Double, callback: js.Function2[/* err */ EResultError | Null, /* offer */ TradeOffer, Unit]): Unit = js.native
    
    /**
      * Retrieves the token part of your account's trade URL.
      *
      * @param callback Called when requested data is available, with an Error on failure (null on success) and your account's trade offer token
      */
    def getOfferToken(callback: js.Function2[/* err */ js.Error | Null, /* token */ String, Unit]): Unit = js.native
    
    /**
      * Retrieves a list of trade offers matching specific criteria. As of v1.1.0, on failure, the err object may contain an eresult property.
      *
      * @param filter A value from EOfferFilter
      * @param callback Called on completion with an Error on failure (null on success), an array of TradeOffer objects for offers sent by you matching the filter, and an array of
      * TradeOffer objects for offers received by you matching the filter.
      */
    def getOffers(
      filter: Double,
      callback: js.Function3[
          /* err */ EResultError | Null, 
          /* sent */ js.Array[TradeOffer], 
          /* received */ js.Array[TradeOffer], 
          Unit
        ]
    ): Unit = js.native
    /**
      * Retrieves a list of trade offers matching specific criteria. As of v1.1.0, on failure, the err object may contain an eresult property.
      *
      * @param filter A value from EOfferFilter
      * @param historicalCutoff If filter is ActiveOnly and this is a Date object in the past, then offers which are either active or have a modification date after this date will be returned.
      * Omit or pass null if filter is not ActiveOnly or if you only wish to get offers in Active state.
      * @param callback Called on completion with an Error on failure (null on success), an array of TradeOffer objects for offers sent by you matching the filter, and an array of TradeOffer
      * objects for offers received by you matching the filter.
      */
    def getOffers(
      filter: Double,
      historicalCutoff: js.Date,
      callback: js.Function3[
          /* err */ EResultError | Null, 
          /* sent */ js.Array[TradeOffer], 
          /* received */ js.Array[TradeOffer], 
          Unit
        ]
    ): Unit = js.native
    def getOffers(
      filter: Double,
      historicalCutoff: Null,
      callback: js.Function3[
          /* err */ EResultError | Null, 
          /* sent */ js.Array[TradeOffer], 
          /* received */ js.Array[TradeOffer], 
          Unit
        ]
    ): Unit = js.native
    
    def getOffersContainingItem(items: js.Array[typings.steamcommunity.classesCeconitemMod.^], callback: OfferCallback): Unit = js.native
    def getOffersContainingItem(
      items: js.Array[typings.steamcommunity.classesCeconitemMod.^],
      includeInactive: Boolean,
      callback: OfferCallback
    ): Unit = js.native
    /**
      * Finds offers which contain the given item(s). Any offer which contains at least one item you passed in will be returned. Might be useful to avoid sending duplicate offers,
      * or to cancel previous ones.
      *
      * @param items Either a single item object (with appid, contextid, and assetid/id properties) or an array of item objects
      * @param callback Called on completion with an Error on failure (null on success), an array of TradeOffer objects for offers you sent which contain the item(s),
      * and an array of TradeOffer objects for offers you received which contain the item(s)
      */
    def getOffersContainingItem(items: typings.steamcommunity.classesCeconitemMod.^, callback: OfferCallback): Unit = js.native
    /**
      * Finds offers which contain the given item(s). Any offer which contains at least one item you passed in will be returned.
      * Might be useful to avoid sending duplicate offers, or to cancel previous ones.
      *
      * @param items Either a single item object (with appid, contextid, and assetid/id properties) or an array of item objects
      * @param includeInactive If true, then offers which aren't Active or InEscrow will be checked. Default false.
      * @param callback Called on completion with an Error on failure (null on success), an array of TradeOffer objects for offers you sent which contain the item(s),
      * and an array of TradeOffer objects for offers you received which contain the item(s)
      */
    def getOffersContainingItem(
      items: typings.steamcommunity.classesCeconitemMod.^,
      includeInactive: Boolean,
      callback: OfferCallback
    ): Unit = js.native
    
    def getUserInventoryContents(
      steamID: String,
      appid: Double,
      contextid: Double,
      tradableOnly: Boolean,
      callback: InventoryCallback
    ): Unit = js.native
    /**
      * Same as getInventoryContents, but can retrieve another user's inventory.
      *
      * @param steamID Either a SteamID object or a string which can parse into one
      * @param appid The Steam App ID of the game for which you want to load the user's inventory
      * @param contextid The ID of the context within the app that you're loading the inventory for
      * @param tradableOnly true to only include tradable items, false to include all
      * @param callback Invoked when data is ready, includes an Error on failure (null on success), an array of the user's inventory items as CEconItem objects,
      * and an array of the user's currency items as CEconItem objects
      */
    def getUserInventoryContents(
      steamID: typings.steamid.mod.^,
      appid: Double,
      contextid: Double,
      tradableOnly: Boolean,
      callback: InventoryCallback
    ): Unit = js.native
    
    /**
      * THIS METHOD IS DEPRECATED AS OF v2.5.0; USE getInventoryContents INSTEAD.
      *
      * Retrieves the contents of your own inventory for a specific game and context.
      *
      * @param appid The Steam App ID of the game for which you want to load your inventory
      * @param contextid The ID of the context within the app that you're loading the inventory for
      * @param tradableOnly true to only include tradable items, false to include all
      * @param callback Invoked when data is ready, includes an Error on failure (null on success), an array of the user's inventory items as CEconItem objects,
      * and an array of the user's currency items as CEconItem objects
      */
    def loadInventory(appid: Double, contextid: Double, tradableOnly: Boolean, callback: InventoryCallback): Unit = js.native
    
    def loadUserInventory(
      steamID: String,
      appid: Double,
      contextid: Double,
      tradableOnly: Boolean,
      callback: InventoryCallback
    ): Unit = js.native
    /**
      * HIS METHOD IS DEPRECATED AS OF v2.5.0; USE getUserInventoryContents INSTEAD.
      *
      * Retrieves the contents of some other user's inventory for a specific game and context.
      *
      * @param steamID Either a SteamID object or a string which can parse into one
      * @param appid The Steam App ID of the game for which you want to load the user's inventory
      * @param contextid The ID of the context within the app that you're loading the inventory for
      * @param tradableOnly true to only include tradable items, false to include all
      * @param callback Invoked when data is ready, includes an Error on failure (null on success), an array of the user's inventory items as CEconItem objects,
      * and an array of the user's currency items as CEconItem objects
      */
    def loadUserInventory(
      steamID: typings.steamid.mod.^,
      appid: Double,
      contextid: Double,
      tradableOnly: Boolean,
      callback: InventoryCallback
    ): Unit = js.native
    
    def on[T /* <: /* keyof steam-tradeoffer-manager.steam-tradeoffer-manager.TradeOfferManagerEvents */ newOffer | sentOfferChanged | sentOfferCanceled | sentPendingOfferCanceled | unknownOfferSent | receivedOfferChanged | realTimeTradeConfirmationRequired | realTimeTradeCompleted | pollFailure | pollSuccess | pollData | offerList */](
      eventType: T,
      callback: /* import warning: importer.ImportType#apply Failed type conversion: steam-tradeoffer-manager.steam-tradeoffer-manager.TradeOfferManagerEvents[T] */ js.Any
    ): this.type = js.native
    
    /**
      * If your account has Family View enabled, you'll need to call this right after each setCookies call to unlock the session for trading.
      * You don't need to wait for the setCookies callback to call this.
      *
      * You need to supply your PIN directly to setCookies the first time you call it. On subsequent calls, you have a choice of providing it to either setCookies or calling parentalUnlock.
      *
      * @param pin Your 4-digit PIN code
      * @param callback Called on completion with a single argument which is null on success or an Error object on failure. Error is Incorrect PIN if your PIN was wrong.
      */
    def parentalUnlock(pin: String): Unit = js.native
    def parentalUnlock(pin: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    var pendingCancelTime: Double | Null = js.native
    
    var pollData: Any = js.native
    
    var pollInterval: Double = js.native
    
    /**
      * Sets node-steam-tradeoffer-manager's internal cookie buffer and retrieves your API key, registering one if needed.
      * Therefore, usage of this module constitutes agreement to the Steam Web API terms.
      *
      * @param cookies An array of cookies in name=value form. This is the format used by node-steam, node-steam-user, and node-steamcommunity, so any of those modules can be used to get cookies.
      * @param familyViewPin If your account has Family View enabled, you need to supply your PIN here.
      * Once you've set cookies initially, you can use parentalUnlock if you need to re-authenticate for any reason.
      * @param callback Will be called once the API key is retrieved and the module is ready for use. The first argument will be null on success or an Error object on failure.
      * You'll get an Access Denied error if your account is limited.
      */
    def setCookies(cookies: js.Array[String]): Unit = js.native
    def setCookies(cookies: js.Array[String], callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def setCookies(cookies: js.Array[String], familyViewPin: String): Unit = js.native
    def setCookies(
      cookies: js.Array[String],
      familyViewPin: String,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def setCookies(
      cookies: js.Array[String],
      familyViewPin: Unit,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    
    /**
      * Stops polling, removes the Steam client reference, and clears cookies. Suitable for use if you want to log out of your bot's account but not terminate the process.
      */
    def shutdown(): Unit = js.native
    
    var steamID: typings.steamid.mod.^ | Null = js.native
    
    var storage: typings.fileManager.mod.^ = js.native
  }
  
  trait TradeOfferManagerEvents extends StObject {
    
    /**
      * Emitted when polling detects a new trade offer sent to us. Only emitted if polling is enabled.
      *
      * @param offer A TradeOffer object for the newly-received offer
      */
    def newOffer(offer: TradeOffer): Unit
    
    /**
      * Emitted whenever a getOffers call succeeds, regardless of the source of the call. Note that if filter is EOfferFilter.ActiveOnly then there may have been a historical
      * cutoff provided so there may also be some historical offers present in the output.
      *
      * @param filter The EOfferFilter value that was used to get this list
      * @param sent An array of TradeOffer objects for offers we sent
      * @param received An array of TradeOffer objects for offers we received
      */
    def offerList(filter: Double, sent: js.Array[TradeOffer], received: js.Array[TradeOffer]): Unit
    
    /**
      * Emitted when new poll data is available.
      *
      * @param data The new poll data
      */
    def pollData(data: Any): Unit
    
    /**
      * Emitted when there's a problem polling the API. You can use this to alert users that Steam is currently down or acting up, if you wish.
      *
      * @param err An Error object
      */
    def pollFailure(err: js.Error): Unit
    
    /**
      * Emitted when a poll succeeds.
      */
    def pollSuccess(): Unit
    
    /**
      * Emitted when polling reveals that a trade offer that was created from a real-time trade is now Accepted, meaning that the trade has completed. See real-time trades for more information.
      *
      * @param offer A TradeOffer object for the offer that has completed
      */
    def realTimeTradeCompleted(offer: TradeOffer): Unit
    
    /**
      * Emitted when polling reveals that we have a new trade offer that was created from a real-time trade session that requires confirmation. See real-time trades for more information.
      *
      * @param offer A TradeOffer object for the offer that needs to be confirmed
      */
    def realTimeTradeConfirmationRequired(offer: TradeOffer): Unit
    
    /**
      * Emitted when an offer we received changes state. This might mean that it was cancelled by the other party, or that we accepted/declined it. Only emitted if polling is enabled.
      *
      * @param offer A TradeOffer object for the changed offer
      * @param oldState The previous known ETradeOfferState of the offer
      */
    def receivedOfferChanged(offer: TradeOffer, oldState: Double): Unit
    
    /**
      * Emitted when the manager automatically cancels an offer due to either your cancelTime constructor option or your cancelOfferCount constructor option. sentOfferChanged will also be
      * emitted on next poll.
      *
      * @param offer TradeOffer object for the canceled offer
      * @param reason A string containing the reason why it was canceled ("cancelTime" - The cancelTime timeout was reached, "cancelOfferCount" - The cancelOfferCount limit was reached)
      */
    def sentOfferCanceled(offer: TradeOffer, reason: cancelTime | cancelOfferCount): Unit
    
    /**
      * Emitted when an offer we sent changes state. This might mean that it was accepted/declined by the other party, that we cancelled it, or that we confirmed a pending offer via email.
      * Only emitted if polling is enabled.
      *
      * @param offer A TradeOffer object for the changed offer
      * @param oldState The previous known ETradeOfferState of the offer
      */
    def sentOfferChanged(offer: TradeOffer, oldState: Double): Unit
    
    /**
      * Emitted when the manager automatically cancels an offer due to your pendingCancelTime constructor option. sentOfferChanged will also be emitted on next poll.
      *
      * @param offer A TradeOffer object for the canceled offer
      */
    def sentPendingOfferCanceled(offer: TradeOffer): Unit
    
    /**
      * Emitted when the manager finds a trade offer that was sent by us, but that wasn't sent via node-steam-tradeoffer-manager (i.e. it's not in the poll data, so this will emit for
      * all sent offers on every startup if you don't restore poll data).
      *
      * You could use this to cancel offers that error when you call send() but actually go through later, because of how awful Steam is.
      *
      * @param offer A TradeOffer object for the offer that was sent
      */
    def unknownOfferSent(offer: TradeOffer): Unit
  }
  object TradeOfferManagerEvents {
    
    inline def apply(
      newOffer: TradeOffer => Unit,
      offerList: (Double, js.Array[TradeOffer], js.Array[TradeOffer]) => Unit,
      pollData: Any => Unit,
      pollFailure: js.Error => Unit,
      pollSuccess: () => Unit,
      realTimeTradeCompleted: TradeOffer => Unit,
      realTimeTradeConfirmationRequired: TradeOffer => Unit,
      receivedOfferChanged: (TradeOffer, Double) => Unit,
      sentOfferCanceled: (TradeOffer, cancelTime | cancelOfferCount) => Unit,
      sentOfferChanged: (TradeOffer, Double) => Unit,
      sentPendingOfferCanceled: TradeOffer => Unit,
      unknownOfferSent: TradeOffer => Unit
    ): TradeOfferManagerEvents = {
      val __obj = js.Dynamic.literal(newOffer = js.Any.fromFunction1(newOffer), offerList = js.Any.fromFunction3(offerList), pollData = js.Any.fromFunction1(pollData), pollFailure = js.Any.fromFunction1(pollFailure), pollSuccess = js.Any.fromFunction0(pollSuccess), realTimeTradeCompleted = js.Any.fromFunction1(realTimeTradeCompleted), realTimeTradeConfirmationRequired = js.Any.fromFunction1(realTimeTradeConfirmationRequired), receivedOfferChanged = js.Any.fromFunction2(receivedOfferChanged), sentOfferCanceled = js.Any.fromFunction2(sentOfferCanceled), sentOfferChanged = js.Any.fromFunction2(sentOfferChanged), sentPendingOfferCanceled = js.Any.fromFunction1(sentPendingOfferCanceled), unknownOfferSent = js.Any.fromFunction1(unknownOfferSent))
      __obj.asInstanceOf[TradeOfferManagerEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TradeOfferManagerEvents] (val x: Self) extends AnyVal {
      
      inline def setNewOffer(value: TradeOffer => Unit): Self = StObject.set(x, "newOffer", js.Any.fromFunction1(value))
      
      inline def setOfferList(value: (Double, js.Array[TradeOffer], js.Array[TradeOffer]) => Unit): Self = StObject.set(x, "offerList", js.Any.fromFunction3(value))
      
      inline def setPollData(value: Any => Unit): Self = StObject.set(x, "pollData", js.Any.fromFunction1(value))
      
      inline def setPollFailure(value: js.Error => Unit): Self = StObject.set(x, "pollFailure", js.Any.fromFunction1(value))
      
      inline def setPollSuccess(value: () => Unit): Self = StObject.set(x, "pollSuccess", js.Any.fromFunction0(value))
      
      inline def setRealTimeTradeCompleted(value: TradeOffer => Unit): Self = StObject.set(x, "realTimeTradeCompleted", js.Any.fromFunction1(value))
      
      inline def setRealTimeTradeConfirmationRequired(value: TradeOffer => Unit): Self = StObject.set(x, "realTimeTradeConfirmationRequired", js.Any.fromFunction1(value))
      
      inline def setReceivedOfferChanged(value: (TradeOffer, Double) => Unit): Self = StObject.set(x, "receivedOfferChanged", js.Any.fromFunction2(value))
      
      inline def setSentOfferCanceled(value: (TradeOffer, cancelTime | cancelOfferCount) => Unit): Self = StObject.set(x, "sentOfferCanceled", js.Any.fromFunction2(value))
      
      inline def setSentOfferChanged(value: (TradeOffer, Double) => Unit): Self = StObject.set(x, "sentOfferChanged", js.Any.fromFunction2(value))
      
      inline def setSentPendingOfferCanceled(value: TradeOffer => Unit): Self = StObject.set(x, "sentPendingOfferCanceled", js.Any.fromFunction1(value))
      
      inline def setUnknownOfferSent(value: TradeOffer => Unit): Self = StObject.set(x, "unknownOfferSent", js.Any.fromFunction1(value))
    }
  }
  
  trait TradeOfferManagerOptions extends StObject {
    
    var assetCacheGcInterval: js.UndefOr[Double] = js.undefined
    
    var assetCacheMaxItems: js.UndefOr[Double] = js.undefined
    
    var cancelOfferCount: js.UndefOr[Double] = js.undefined
    
    var cancelOfferCountMinAge: js.UndefOr[Double] = js.undefined
    
    var cancelTime: js.UndefOr[Double] = js.undefined
    
    var community: js.UndefOr[typings.steamcommunity.mod.^] = js.undefined
    
    var dataDirectory: js.UndefOr[String | Null] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var globalAssetCache: js.UndefOr[Boolean] = js.undefined
    
    var gzipData: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var pendingCancelTime: js.UndefOr[Double] = js.undefined
    
    var pollData: js.UndefOr[Any] = js.undefined
    
    var pollInterval: js.UndefOr[Double] = js.undefined
    
    var savePollData: js.UndefOr[Boolean] = js.undefined
    
    var steam: js.UndefOr[SteamClient | typings.steamUser.mod.^] = js.undefined
  }
  object TradeOfferManagerOptions {
    
    inline def apply(): TradeOfferManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TradeOfferManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TradeOfferManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setAssetCacheGcInterval(value: Double): Self = StObject.set(x, "assetCacheGcInterval", value.asInstanceOf[js.Any])
      
      inline def setAssetCacheGcIntervalUndefined: Self = StObject.set(x, "assetCacheGcInterval", js.undefined)
      
      inline def setAssetCacheMaxItems(value: Double): Self = StObject.set(x, "assetCacheMaxItems", value.asInstanceOf[js.Any])
      
      inline def setAssetCacheMaxItemsUndefined: Self = StObject.set(x, "assetCacheMaxItems", js.undefined)
      
      inline def setCancelOfferCount(value: Double): Self = StObject.set(x, "cancelOfferCount", value.asInstanceOf[js.Any])
      
      inline def setCancelOfferCountMinAge(value: Double): Self = StObject.set(x, "cancelOfferCountMinAge", value.asInstanceOf[js.Any])
      
      inline def setCancelOfferCountMinAgeUndefined: Self = StObject.set(x, "cancelOfferCountMinAge", js.undefined)
      
      inline def setCancelOfferCountUndefined: Self = StObject.set(x, "cancelOfferCount", js.undefined)
      
      inline def setCancelTime(value: Double): Self = StObject.set(x, "cancelTime", value.asInstanceOf[js.Any])
      
      inline def setCancelTimeUndefined: Self = StObject.set(x, "cancelTime", js.undefined)
      
      inline def setCommunity(value: typings.steamcommunity.mod.^): Self = StObject.set(x, "community", value.asInstanceOf[js.Any])
      
      inline def setCommunityUndefined: Self = StObject.set(x, "community", js.undefined)
      
      inline def setDataDirectory(value: String): Self = StObject.set(x, "dataDirectory", value.asInstanceOf[js.Any])
      
      inline def setDataDirectoryNull: Self = StObject.set(x, "dataDirectory", null)
      
      inline def setDataDirectoryUndefined: Self = StObject.set(x, "dataDirectory", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setGlobalAssetCache(value: Boolean): Self = StObject.set(x, "globalAssetCache", value.asInstanceOf[js.Any])
      
      inline def setGlobalAssetCacheUndefined: Self = StObject.set(x, "globalAssetCache", js.undefined)
      
      inline def setGzipData(value: Boolean): Self = StObject.set(x, "gzipData", value.asInstanceOf[js.Any])
      
      inline def setGzipDataUndefined: Self = StObject.set(x, "gzipData", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPendingCancelTime(value: Double): Self = StObject.set(x, "pendingCancelTime", value.asInstanceOf[js.Any])
      
      inline def setPendingCancelTimeUndefined: Self = StObject.set(x, "pendingCancelTime", js.undefined)
      
      inline def setPollData(value: Any): Self = StObject.set(x, "pollData", value.asInstanceOf[js.Any])
      
      inline def setPollDataUndefined: Self = StObject.set(x, "pollData", js.undefined)
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      inline def setSavePollData(value: Boolean): Self = StObject.set(x, "savePollData", value.asInstanceOf[js.Any])
      
      inline def setSavePollDataUndefined: Self = StObject.set(x, "savePollData", js.undefined)
      
      inline def setSteam(value: SteamClient | typings.steamUser.mod.^): Self = StObject.set(x, "steam", value.asInstanceOf[js.Any])
      
      inline def setSteamUndefined: Self = StObject.set(x, "steam", js.undefined)
    }
  }
  
  trait UserDetails extends StObject {
    
    var avatarFull: String
    
    var avatarIcon: String
    
    var avatarMedium: String
    
    var contexts: Any
    
    var escrowDays: Double
    
    var personaName: String
    
    var probation: js.UndefOr[Boolean] = js.undefined
  }
  object UserDetails {
    
    inline def apply(
      avatarFull: String,
      avatarIcon: String,
      avatarMedium: String,
      contexts: Any,
      escrowDays: Double,
      personaName: String
    ): UserDetails = {
      val __obj = js.Dynamic.literal(avatarFull = avatarFull.asInstanceOf[js.Any], avatarIcon = avatarIcon.asInstanceOf[js.Any], avatarMedium = avatarMedium.asInstanceOf[js.Any], contexts = contexts.asInstanceOf[js.Any], escrowDays = escrowDays.asInstanceOf[js.Any], personaName = personaName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserDetails] (val x: Self) extends AnyVal {
      
      inline def setAvatarFull(value: String): Self = StObject.set(x, "avatarFull", value.asInstanceOf[js.Any])
      
      inline def setAvatarIcon(value: String): Self = StObject.set(x, "avatarIcon", value.asInstanceOf[js.Any])
      
      inline def setAvatarMedium(value: String): Self = StObject.set(x, "avatarMedium", value.asInstanceOf[js.Any])
      
      inline def setContexts(value: Any): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setEscrowDays(value: Double): Self = StObject.set(x, "escrowDays", value.asInstanceOf[js.Any])
      
      inline def setPersonaName(value: String): Self = StObject.set(x, "personaName", value.asInstanceOf[js.Any])
      
      inline def setProbation(value: Boolean): Self = StObject.set(x, "probation", value.asInstanceOf[js.Any])
      
      inline def setProbationUndefined: Self = StObject.set(x, "probation", js.undefined)
    }
  }
}
