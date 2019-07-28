package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EEconTradeResponse extends js.Object

@JSImport("steam-client", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends js.Object {
  @js.native
  sealed trait Accepted extends EEconTradeResponse
  
  @js.native
  sealed trait AlreadyHasTradeRequest extends EEconTradeResponse
  
  @js.native
  sealed trait AlreadyTrading extends EEconTradeResponse
  
  @js.native
  sealed trait Cancel extends EEconTradeResponse
  
  @js.native
  sealed trait ConnectionFailed extends EEconTradeResponse
  
  @js.native
  sealed trait CyberCafeInitiator extends EEconTradeResponse
  
  @js.native
  sealed trait CyberCafeTarget extends EEconTradeResponse
  
  @js.native
  sealed trait Declined extends EEconTradeResponse
  
  @js.native
  sealed trait Disabled extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorBlockedTarget extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorPasswordResetProbation extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorRecentEmailChange extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorSentInvalidCookie extends EEconTradeResponse
  
  @js.native
  sealed trait InitiatorSteamGuardDuration extends EEconTradeResponse
  
  @js.native
  sealed trait NeedsEmailConfirmation extends EEconTradeResponse
  
  @js.native
  sealed trait NeedsMobileConfirmation extends EEconTradeResponse
  
  @js.native
  sealed trait NoResponse extends EEconTradeResponse
  
  @js.native
  sealed trait NotLoggedIn extends EEconTradeResponse
  
  @js.native
  sealed trait OKToDeliver extends EEconTradeResponse
  
  @js.native
  sealed trait SchoolLabInitiator extends EEconTradeResponse
  
  @js.native
  sealed trait SchoolLabTarget extends EEconTradeResponse
  
  @js.native
  sealed trait TargetAccountCannotTrade extends EEconTradeResponse
  
  @js.native
  sealed trait TargetAlreadyTrading extends EEconTradeResponse
  
  @js.native
  sealed trait TooSoon extends EEconTradeResponse
  
  @js.native
  sealed trait TooSoonPenalty extends EEconTradeResponse
  
  @js.native
  sealed trait TradeBannedInitiator extends EEconTradeResponse
  
  @js.native
  sealed trait TradeBannedTarget extends EEconTradeResponse
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator extends EEconTradeResponse
  
  @js.native
  sealed trait WouldExceedMaxAssetCount extends EEconTradeResponse
  
  /* 0 */ val Accepted: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Accepted with Double = js.native
  /* 12 */ val AlreadyHasTradeRequest: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.AlreadyHasTradeRequest with Double = js.native
  /* 11 */ val AlreadyTrading: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.AlreadyTrading with Double = js.native
  /* 7 */ val Cancel: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Cancel with Double = js.native
  /* 10 */ val ConnectionFailed: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.ConnectionFailed with Double = js.native
  /* 14 */ val CyberCafeInitiator: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.CyberCafeInitiator with Double = js.native
  /* 15 */ val CyberCafeTarget: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.CyberCafeTarget with Double = js.native
  /* 1 */ val Declined: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Declined with Double = js.native
  /* 5 */ val Disabled: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Disabled with Double = js.native
  /* 18 */ val InitiatorBlockedTarget: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorBlockedTarget with Double = js.native
  /* 21 */ val InitiatorNeedsSteamGuard: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNeedsSteamGuard with Double = js.native
  /* 20 */ val InitiatorNeedsVerifiedEmail: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNeedsVerifiedEmail with Double = js.native
  /* 25 */ val InitiatorNewDeviceCooldown: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNewDeviceCooldown with Double = js.native
  /* 24 */ val InitiatorPasswordResetProbation: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorPasswordResetProbation with Double = js.native
  /* 28 */ val InitiatorRecentEmailChange: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorRecentEmailChange with Double = js.native
  /* 26 */ val InitiatorSentInvalidCookie: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorSentInvalidCookie with Double = js.native
  /* 23 */ val InitiatorSteamGuardDuration: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorSteamGuardDuration with Double = js.native
  /* 27 */ val NeedsEmailConfirmation: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NeedsEmailConfirmation with Double = js.native
  /* 29 */ val NeedsMobileConfirmation: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NeedsMobileConfirmation with Double = js.native
  /* 13 */ val NoResponse: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NoResponse with Double = js.native
  /* 6 */ val NotLoggedIn: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NotLoggedIn with Double = js.native
  /* 50 */ val OKToDeliver: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.OKToDeliver with Double = js.native
  /* 16 */ val SchoolLabInitiator: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.SchoolLabInitiator with Double = js.native
  /* 16 */ val SchoolLabTarget: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.SchoolLabTarget with Double = js.native
  /* 22 */ val TargetAccountCannotTrade: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TargetAccountCannotTrade with Double = js.native
  /* 4 */ val TargetAlreadyTrading: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TargetAlreadyTrading with Double = js.native
  /* 8 */ val TooSoon: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TooSoon with Double = js.native
  /* 9 */ val TooSoonPenalty: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TooSoonPenalty with Double = js.native
  /* 2 */ val TradeBannedInitiator: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradeBannedInitiator with Double = js.native
  /* 3 */ val TradeBannedTarget: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradeBannedTarget with Double = js.native
  /* 30 */ val TradingHoldForClearedTradeOffersInitiator: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradingHoldForClearedTradeOffersInitiator with Double = js.native
  /* 31 */ val WouldExceedMaxAssetCount: typings.steamDashClient.steamDashClientMod.EEconTradeResponse.WouldExceedMaxAssetCount with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse with Double] = js.native
}

