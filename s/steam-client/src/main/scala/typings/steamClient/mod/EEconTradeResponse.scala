package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EEconTradeResponse extends js.Object
@JSImport("steam-client", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse with Double] = js.native
  
  @js.native
  sealed trait Accepted extends EEconTradeResponse
  /* 0 */ @js.native
  object Accepted extends TopLevel[Accepted with Double]
  
  @js.native
  sealed trait AlreadyHasTradeRequest extends EEconTradeResponse
  /* 12 */ @js.native
  object AlreadyHasTradeRequest extends TopLevel[AlreadyHasTradeRequest with Double]
  
  @js.native
  sealed trait AlreadyTrading extends EEconTradeResponse
  /* 11 */ @js.native
  object AlreadyTrading extends TopLevel[AlreadyTrading with Double]
  
  @js.native
  sealed trait Cancel extends EEconTradeResponse
  /* 7 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  @js.native
  sealed trait ConnectionFailed extends EEconTradeResponse
  /* 10 */ @js.native
  object ConnectionFailed extends TopLevel[ConnectionFailed with Double]
  
  @js.native
  sealed trait CyberCafeInitiator extends EEconTradeResponse
  /* 14 */ @js.native
  object CyberCafeInitiator extends TopLevel[CyberCafeInitiator with Double]
  
  @js.native
  sealed trait CyberCafeTarget extends EEconTradeResponse
  /* 15 */ @js.native
  object CyberCafeTarget extends TopLevel[CyberCafeTarget with Double]
  
  @js.native
  sealed trait Declined extends EEconTradeResponse
  /* 1 */ @js.native
  object Declined extends TopLevel[Declined with Double]
  
  @js.native
  sealed trait Disabled extends EEconTradeResponse
  /* 5 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  @js.native
  sealed trait InitiatorBlockedTarget extends EEconTradeResponse
  /* 18 */ @js.native
  object InitiatorBlockedTarget extends TopLevel[InitiatorBlockedTarget with Double]
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard extends EEconTradeResponse
  /* 21 */ @js.native
  object InitiatorNeedsSteamGuard extends TopLevel[InitiatorNeedsSteamGuard with Double]
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail extends EEconTradeResponse
  /* 20 */ @js.native
  object InitiatorNeedsVerifiedEmail extends TopLevel[InitiatorNeedsVerifiedEmail with Double]
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown extends EEconTradeResponse
  /* 25 */ @js.native
  object InitiatorNewDeviceCooldown extends TopLevel[InitiatorNewDeviceCooldown with Double]
  
  @js.native
  sealed trait InitiatorPasswordResetProbation extends EEconTradeResponse
  /* 24 */ @js.native
  object InitiatorPasswordResetProbation extends TopLevel[InitiatorPasswordResetProbation with Double]
  
  @js.native
  sealed trait InitiatorRecentEmailChange extends EEconTradeResponse
  /* 28 */ @js.native
  object InitiatorRecentEmailChange extends TopLevel[InitiatorRecentEmailChange with Double]
  
  @js.native
  sealed trait InitiatorSentInvalidCookie extends EEconTradeResponse
  /* 26 */ @js.native
  object InitiatorSentInvalidCookie extends TopLevel[InitiatorSentInvalidCookie with Double]
  
  @js.native
  sealed trait InitiatorSteamGuardDuration extends EEconTradeResponse
  /* 23 */ @js.native
  object InitiatorSteamGuardDuration extends TopLevel[InitiatorSteamGuardDuration with Double]
  
  @js.native
  sealed trait NeedsEmailConfirmation extends EEconTradeResponse
  /* 27 */ @js.native
  object NeedsEmailConfirmation extends TopLevel[NeedsEmailConfirmation with Double]
  
  @js.native
  sealed trait NeedsMobileConfirmation extends EEconTradeResponse
  /* 29 */ @js.native
  object NeedsMobileConfirmation extends TopLevel[NeedsMobileConfirmation with Double]
  
  @js.native
  sealed trait NoResponse extends EEconTradeResponse
  /* 13 */ @js.native
  object NoResponse extends TopLevel[NoResponse with Double]
  
  @js.native
  sealed trait NotLoggedIn extends EEconTradeResponse
  /* 6 */ @js.native
  object NotLoggedIn extends TopLevel[NotLoggedIn with Double]
  
  @js.native
  sealed trait OKToDeliver extends EEconTradeResponse
  /* 50 */ @js.native
  object OKToDeliver extends TopLevel[OKToDeliver with Double]
  
  @js.native
  sealed trait SchoolLabInitiator extends EEconTradeResponse
  /* 16 */ @js.native
  object SchoolLabInitiator extends TopLevel[SchoolLabInitiator with Double]
  
  @js.native
  sealed trait SchoolLabTarget extends EEconTradeResponse
  /* 16 */ @js.native
  object SchoolLabTarget extends TopLevel[SchoolLabTarget with Double]
  
  @js.native
  sealed trait TargetAccountCannotTrade extends EEconTradeResponse
  /* 22 */ @js.native
  object TargetAccountCannotTrade extends TopLevel[TargetAccountCannotTrade with Double]
  
  @js.native
  sealed trait TargetAlreadyTrading extends EEconTradeResponse
  /* 4 */ @js.native
  object TargetAlreadyTrading extends TopLevel[TargetAlreadyTrading with Double]
  
  @js.native
  sealed trait TooSoon extends EEconTradeResponse
  /* 8 */ @js.native
  object TooSoon extends TopLevel[TooSoon with Double]
  
  @js.native
  sealed trait TooSoonPenalty extends EEconTradeResponse
  /* 9 */ @js.native
  object TooSoonPenalty extends TopLevel[TooSoonPenalty with Double]
  
  @js.native
  sealed trait TradeBannedInitiator extends EEconTradeResponse
  /* 2 */ @js.native
  object TradeBannedInitiator extends TopLevel[TradeBannedInitiator with Double]
  
  @js.native
  sealed trait TradeBannedTarget extends EEconTradeResponse
  /* 3 */ @js.native
  object TradeBannedTarget extends TopLevel[TradeBannedTarget with Double]
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator extends EEconTradeResponse
  /* 30 */ @js.native
  object TradingHoldForClearedTradeOffersInitiator extends TopLevel[TradingHoldForClearedTradeOffersInitiator with Double]
  
  @js.native
  sealed trait WouldExceedMaxAssetCount extends EEconTradeResponse
  /* 31 */ @js.native
  object WouldExceedMaxAssetCount extends TopLevel[WouldExceedMaxAssetCount with Double]
}
