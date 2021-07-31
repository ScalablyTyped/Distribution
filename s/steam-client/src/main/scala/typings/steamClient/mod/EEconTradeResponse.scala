package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EEconTradeResponse extends StObject
@JSImport("steam-client", "EEconTradeResponse")
@js.native
object EEconTradeResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EEconTradeResponse & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with EEconTradeResponse
  /* 0 */ val Accepted: typings.steamClient.mod.EEconTradeResponse.Accepted & Double = js.native
  
  @js.native
  sealed trait AlreadyHasTradeRequest
    extends StObject
       with EEconTradeResponse
  /* 12 */ val AlreadyHasTradeRequest: typings.steamClient.mod.EEconTradeResponse.AlreadyHasTradeRequest & Double = js.native
  
  @js.native
  sealed trait AlreadyTrading
    extends StObject
       with EEconTradeResponse
  /* 11 */ val AlreadyTrading: typings.steamClient.mod.EEconTradeResponse.AlreadyTrading & Double = js.native
  
  @js.native
  sealed trait Cancel
    extends StObject
       with EEconTradeResponse
  /* 7 */ val Cancel: typings.steamClient.mod.EEconTradeResponse.Cancel & Double = js.native
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with EEconTradeResponse
  /* 10 */ val ConnectionFailed: typings.steamClient.mod.EEconTradeResponse.ConnectionFailed & Double = js.native
  
  @js.native
  sealed trait CyberCafeInitiator
    extends StObject
       with EEconTradeResponse
  /* 14 */ val CyberCafeInitiator: typings.steamClient.mod.EEconTradeResponse.CyberCafeInitiator & Double = js.native
  
  @js.native
  sealed trait CyberCafeTarget
    extends StObject
       with EEconTradeResponse
  /* 15 */ val CyberCafeTarget: typings.steamClient.mod.EEconTradeResponse.CyberCafeTarget & Double = js.native
  
  @js.native
  sealed trait Declined
    extends StObject
       with EEconTradeResponse
  /* 1 */ val Declined: typings.steamClient.mod.EEconTradeResponse.Declined & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EEconTradeResponse
  /* 5 */ val Disabled: typings.steamClient.mod.EEconTradeResponse.Disabled & Double = js.native
  
  @js.native
  sealed trait InitiatorBlockedTarget
    extends StObject
       with EEconTradeResponse
  /* 18 */ val InitiatorBlockedTarget: typings.steamClient.mod.EEconTradeResponse.InitiatorBlockedTarget & Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsSteamGuard
    extends StObject
       with EEconTradeResponse
  /* 21 */ val InitiatorNeedsSteamGuard: typings.steamClient.mod.EEconTradeResponse.InitiatorNeedsSteamGuard & Double = js.native
  
  @js.native
  sealed trait InitiatorNeedsVerifiedEmail
    extends StObject
       with EEconTradeResponse
  /* 20 */ val InitiatorNeedsVerifiedEmail: typings.steamClient.mod.EEconTradeResponse.InitiatorNeedsVerifiedEmail & Double = js.native
  
  @js.native
  sealed trait InitiatorNewDeviceCooldown
    extends StObject
       with EEconTradeResponse
  /* 25 */ val InitiatorNewDeviceCooldown: typings.steamClient.mod.EEconTradeResponse.InitiatorNewDeviceCooldown & Double = js.native
  
  @js.native
  sealed trait InitiatorPasswordResetProbation
    extends StObject
       with EEconTradeResponse
  /* 24 */ val InitiatorPasswordResetProbation: typings.steamClient.mod.EEconTradeResponse.InitiatorPasswordResetProbation & Double = js.native
  
  @js.native
  sealed trait InitiatorRecentEmailChange
    extends StObject
       with EEconTradeResponse
  /* 28 */ val InitiatorRecentEmailChange: typings.steamClient.mod.EEconTradeResponse.InitiatorRecentEmailChange & Double = js.native
  
  @js.native
  sealed trait InitiatorSentInvalidCookie
    extends StObject
       with EEconTradeResponse
  /* 26 */ val InitiatorSentInvalidCookie: typings.steamClient.mod.EEconTradeResponse.InitiatorSentInvalidCookie & Double = js.native
  
  @js.native
  sealed trait InitiatorSteamGuardDuration
    extends StObject
       with EEconTradeResponse
  /* 23 */ val InitiatorSteamGuardDuration: typings.steamClient.mod.EEconTradeResponse.InitiatorSteamGuardDuration & Double = js.native
  
  @js.native
  sealed trait NeedsEmailConfirmation
    extends StObject
       with EEconTradeResponse
  /* 27 */ val NeedsEmailConfirmation: typings.steamClient.mod.EEconTradeResponse.NeedsEmailConfirmation & Double = js.native
  
  @js.native
  sealed trait NeedsMobileConfirmation
    extends StObject
       with EEconTradeResponse
  /* 29 */ val NeedsMobileConfirmation: typings.steamClient.mod.EEconTradeResponse.NeedsMobileConfirmation & Double = js.native
  
  @js.native
  sealed trait NoResponse
    extends StObject
       with EEconTradeResponse
  /* 13 */ val NoResponse: typings.steamClient.mod.EEconTradeResponse.NoResponse & Double = js.native
  
  @js.native
  sealed trait NotLoggedIn
    extends StObject
       with EEconTradeResponse
  /* 6 */ val NotLoggedIn: typings.steamClient.mod.EEconTradeResponse.NotLoggedIn & Double = js.native
  
  @js.native
  sealed trait OKToDeliver
    extends StObject
       with EEconTradeResponse
  /* 50 */ val OKToDeliver: typings.steamClient.mod.EEconTradeResponse.OKToDeliver & Double = js.native
  
  @js.native
  sealed trait SchoolLabInitiator
    extends StObject
       with EEconTradeResponse
  /* 16 */ val SchoolLabInitiator: typings.steamClient.mod.EEconTradeResponse.SchoolLabInitiator & Double = js.native
  
  @js.native
  sealed trait SchoolLabTarget
    extends StObject
       with EEconTradeResponse
  /* 16 */ val SchoolLabTarget: typings.steamClient.mod.EEconTradeResponse.SchoolLabTarget & Double = js.native
  
  @js.native
  sealed trait TargetAccountCannotTrade
    extends StObject
       with EEconTradeResponse
  /* 22 */ val TargetAccountCannotTrade: typings.steamClient.mod.EEconTradeResponse.TargetAccountCannotTrade & Double = js.native
  
  @js.native
  sealed trait TargetAlreadyTrading
    extends StObject
       with EEconTradeResponse
  /* 4 */ val TargetAlreadyTrading: typings.steamClient.mod.EEconTradeResponse.TargetAlreadyTrading & Double = js.native
  
  @js.native
  sealed trait TooSoon
    extends StObject
       with EEconTradeResponse
  /* 8 */ val TooSoon: typings.steamClient.mod.EEconTradeResponse.TooSoon & Double = js.native
  
  @js.native
  sealed trait TooSoonPenalty
    extends StObject
       with EEconTradeResponse
  /* 9 */ val TooSoonPenalty: typings.steamClient.mod.EEconTradeResponse.TooSoonPenalty & Double = js.native
  
  @js.native
  sealed trait TradeBannedInitiator
    extends StObject
       with EEconTradeResponse
  /* 2 */ val TradeBannedInitiator: typings.steamClient.mod.EEconTradeResponse.TradeBannedInitiator & Double = js.native
  
  @js.native
  sealed trait TradeBannedTarget
    extends StObject
       with EEconTradeResponse
  /* 3 */ val TradeBannedTarget: typings.steamClient.mod.EEconTradeResponse.TradeBannedTarget & Double = js.native
  
  @js.native
  sealed trait TradingHoldForClearedTradeOffersInitiator
    extends StObject
       with EEconTradeResponse
  /* 30 */ val TradingHoldForClearedTradeOffersInitiator: typings.steamClient.mod.EEconTradeResponse.TradingHoldForClearedTradeOffersInitiator & Double = js.native
  
  @js.native
  sealed trait WouldExceedMaxAssetCount
    extends StObject
       with EEconTradeResponse
  /* 31 */ val WouldExceedMaxAssetCount: typings.steamClient.mod.EEconTradeResponse.WouldExceedMaxAssetCount & Double = js.native
}
