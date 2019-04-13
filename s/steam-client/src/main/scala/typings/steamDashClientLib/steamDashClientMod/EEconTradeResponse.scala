package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EEconTradeResponse extends js.Object

@JSImport("steam-client", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends js.Object {
  @js.native
  sealed trait Accepted
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait AlreadyHasTradeRequest
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait AlreadyTrading
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait Cancel
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait ConnectionFailed
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait CyberCafeInitiator
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait CyberCafeTarget
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait Declined
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait Disabled
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorBlockedTarget
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorPasswordResetProbation
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorRecentEmailChange
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorSentInvalidCookie
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait InitiatorSteamGuardDuration
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait NeedsEmailConfirmation
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait NeedsMobileConfirmation
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait NoResponse
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait NotLoggedIn
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait OKToDeliver
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait SchoolLabInitiator
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait SchoolLabTarget
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TargetAccountCannotTrade
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TargetAlreadyTrading
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TooSoon
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TooSoonPenalty
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TradeBannedInitiator
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TradeBannedTarget
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  @js.native
  sealed trait WouldExceedMaxAssetCount
    extends steamDashClientLib.steamDashClientMod.EEconTradeResponse
  
  /* 0 */ val Accepted: Accepted with scala.Double = js.native
  /* 12 */ val AlreadyHasTradeRequest: AlreadyHasTradeRequest with scala.Double = js.native
  /* 11 */ val AlreadyTrading: AlreadyTrading with scala.Double = js.native
  /* 7 */ val Cancel: Cancel with scala.Double = js.native
  /* 10 */ val ConnectionFailed: ConnectionFailed with scala.Double = js.native
  /* 14 */ val CyberCafeInitiator: CyberCafeInitiator with scala.Double = js.native
  /* 15 */ val CyberCafeTarget: CyberCafeTarget with scala.Double = js.native
  /* 1 */ val Declined: Declined with scala.Double = js.native
  /* 5 */ val Disabled: Disabled with scala.Double = js.native
  /* 18 */ val InitiatorBlockedTarget: InitiatorBlockedTarget with scala.Double = js.native
  /* 21 */ val InitiatorNeedsSteamGuard: InitiatorNeedsSteamGuard with scala.Double = js.native
  /* 20 */ val InitiatorNeedsVerifiedEmail: InitiatorNeedsVerifiedEmail with scala.Double = js.native
  /* 25 */ val InitiatorNewDeviceCooldown: InitiatorNewDeviceCooldown with scala.Double = js.native
  /* 24 */ val InitiatorPasswordResetProbation: InitiatorPasswordResetProbation with scala.Double = js.native
  /* 28 */ val InitiatorRecentEmailChange: InitiatorRecentEmailChange with scala.Double = js.native
  /* 26 */ val InitiatorSentInvalidCookie: InitiatorSentInvalidCookie with scala.Double = js.native
  /* 23 */ val InitiatorSteamGuardDuration: InitiatorSteamGuardDuration with scala.Double = js.native
  /* 27 */ val NeedsEmailConfirmation: NeedsEmailConfirmation with scala.Double = js.native
  /* 29 */ val NeedsMobileConfirmation: NeedsMobileConfirmation with scala.Double = js.native
  /* 13 */ val NoResponse: NoResponse with scala.Double = js.native
  /* 6 */ val NotLoggedIn: NotLoggedIn with scala.Double = js.native
  /* 50 */ val OKToDeliver: OKToDeliver with scala.Double = js.native
  /* 16 */ val SchoolLabInitiator: SchoolLabInitiator with scala.Double = js.native
  /* 16 */ val SchoolLabTarget: SchoolLabTarget with scala.Double = js.native
  /* 22 */ val TargetAccountCannotTrade: TargetAccountCannotTrade with scala.Double = js.native
  /* 4 */ val TargetAlreadyTrading: TargetAlreadyTrading with scala.Double = js.native
  /* 8 */ val TooSoon: TooSoon with scala.Double = js.native
  /* 9 */ val TooSoonPenalty: TooSoonPenalty with scala.Double = js.native
  /* 2 */ val TradeBannedInitiator: TradeBannedInitiator with scala.Double = js.native
  /* 3 */ val TradeBannedTarget: TradeBannedTarget with scala.Double = js.native
  /* 30 */ val TradingHoldForClearedTradeOffersInitiator: TradingHoldForClearedTradeOffersInitiator with scala.Double = js.native
  /* 31 */ val WouldExceedMaxAssetCount: WouldExceedMaxAssetCount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EEconTradeResponse with scala.Double] = js.native
}

