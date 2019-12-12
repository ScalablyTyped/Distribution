package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Accepted
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.AlreadyHasTradeRequest
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.AlreadyTrading
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Cancel
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.ConnectionFailed
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.CyberCafeInitiator
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.CyberCafeTarget
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Declined
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.Disabled
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorBlockedTarget
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNeedsSteamGuard
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNeedsVerifiedEmail
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorNewDeviceCooldown
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorPasswordResetProbation
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorRecentEmailChange
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorSentInvalidCookie
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.InitiatorSteamGuardDuration
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NeedsEmailConfirmation
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NeedsMobileConfirmation
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NoResponse
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.NotLoggedIn
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.OKToDeliver
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.SchoolLabInitiator
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.SchoolLabTarget
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TargetAccountCannotTrade
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TargetAlreadyTrading
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TooSoon
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TooSoonPenalty
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradeBannedInitiator
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradeBannedTarget
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.TradingHoldForClearedTradeOffersInitiator
import typings.steamDashClient.steamDashClientMod.EEconTradeResponse.WouldExceedMaxAssetCount
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse with Double] = js.native
  /* 0 */ @js.native
  object Accepted extends TopLevel[Accepted with Double]
  
  /* 12 */ @js.native
  object AlreadyHasTradeRequest extends TopLevel[AlreadyHasTradeRequest with Double]
  
  /* 11 */ @js.native
  object AlreadyTrading extends TopLevel[AlreadyTrading with Double]
  
  /* 7 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 10 */ @js.native
  object ConnectionFailed extends TopLevel[ConnectionFailed with Double]
  
  /* 14 */ @js.native
  object CyberCafeInitiator extends TopLevel[CyberCafeInitiator with Double]
  
  /* 15 */ @js.native
  object CyberCafeTarget extends TopLevel[CyberCafeTarget with Double]
  
  /* 1 */ @js.native
  object Declined extends TopLevel[Declined with Double]
  
  /* 5 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 18 */ @js.native
  object InitiatorBlockedTarget extends TopLevel[InitiatorBlockedTarget with Double]
  
  /* 21 */ @js.native
  object InitiatorNeedsSteamGuard extends TopLevel[InitiatorNeedsSteamGuard with Double]
  
  /* 20 */ @js.native
  object InitiatorNeedsVerifiedEmail extends TopLevel[InitiatorNeedsVerifiedEmail with Double]
  
  /* 25 */ @js.native
  object InitiatorNewDeviceCooldown extends TopLevel[InitiatorNewDeviceCooldown with Double]
  
  /* 24 */ @js.native
  object InitiatorPasswordResetProbation extends TopLevel[InitiatorPasswordResetProbation with Double]
  
  /* 28 */ @js.native
  object InitiatorRecentEmailChange extends TopLevel[InitiatorRecentEmailChange with Double]
  
  /* 26 */ @js.native
  object InitiatorSentInvalidCookie extends TopLevel[InitiatorSentInvalidCookie with Double]
  
  /* 23 */ @js.native
  object InitiatorSteamGuardDuration extends TopLevel[InitiatorSteamGuardDuration with Double]
  
  /* 27 */ @js.native
  object NeedsEmailConfirmation extends TopLevel[NeedsEmailConfirmation with Double]
  
  /* 29 */ @js.native
  object NeedsMobileConfirmation extends TopLevel[NeedsMobileConfirmation with Double]
  
  /* 13 */ @js.native
  object NoResponse extends TopLevel[NoResponse with Double]
  
  /* 6 */ @js.native
  object NotLoggedIn extends TopLevel[NotLoggedIn with Double]
  
  /* 50 */ @js.native
  object OKToDeliver extends TopLevel[OKToDeliver with Double]
  
  /* 16 */ @js.native
  object SchoolLabInitiator extends TopLevel[SchoolLabInitiator with Double]
  
  /* 16 */ @js.native
  object SchoolLabTarget extends TopLevel[SchoolLabTarget with Double]
  
  /* 22 */ @js.native
  object TargetAccountCannotTrade extends TopLevel[TargetAccountCannotTrade with Double]
  
  /* 4 */ @js.native
  object TargetAlreadyTrading extends TopLevel[TargetAlreadyTrading with Double]
  
  /* 8 */ @js.native
  object TooSoon extends TopLevel[TooSoon with Double]
  
  /* 9 */ @js.native
  object TooSoonPenalty extends TopLevel[TooSoonPenalty with Double]
  
  /* 2 */ @js.native
  object TradeBannedInitiator extends TopLevel[TradeBannedInitiator with Double]
  
  /* 3 */ @js.native
  object TradeBannedTarget extends TopLevel[TradeBannedTarget with Double]
  
  /* 30 */ @js.native
  object TradingHoldForClearedTradeOffersInitiator extends TopLevel[TradingHoldForClearedTradeOffersInitiator with Double]
  
  /* 31 */ @js.native
  object WouldExceedMaxAssetCount extends TopLevel[WouldExceedMaxAssetCount with Double]
  
}

