package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ESystemIMType extends js.Object

@JSImport("steam-client", "ESystemIMType")
@js.native
object ESystemIMType extends js.Object {
  @js.native
  sealed trait CardWillExpire extends ESystemIMType
  
  @js.native
  sealed trait GiftRevoked extends ESystemIMType
  
  @js.native
  sealed trait GuestPassGranted extends ESystemIMType
  
  @js.native
  sealed trait GuestPassReceived extends ESystemIMType
  
  @js.native
  sealed trait InvalidCard extends ESystemIMType
  
  @js.native
  sealed trait Max extends ESystemIMType
  
  @js.native
  sealed trait RawText extends ESystemIMType
  
  @js.native
  sealed trait RecurringPurchaseFailed extends ESystemIMType
  
  @js.native
  sealed trait SubscriptionExpired extends ESystemIMType
  
  @js.native
  sealed trait SupportMessage extends ESystemIMType
  
  @js.native
  sealed trait SupportMessageClearAlert extends ESystemIMType
  
  /* 3 */ val CardWillExpire: typings.steamDashClient.steamDashClientMod.ESystemIMType.CardWillExpire with Double = js.native
  /* 7 */ val GiftRevoked: typings.steamDashClient.steamDashClientMod.ESystemIMType.GiftRevoked with Double = js.native
  /* 6 */ val GuestPassGranted: typings.steamDashClient.steamDashClientMod.ESystemIMType.GuestPassGranted with Double = js.native
  /* 5 */ val GuestPassReceived: typings.steamDashClient.steamDashClientMod.ESystemIMType.GuestPassReceived with Double = js.native
  /* 1 */ val InvalidCard: typings.steamDashClient.steamDashClientMod.ESystemIMType.InvalidCard with Double = js.native
  /* 10 */ val Max: typings.steamDashClient.steamDashClientMod.ESystemIMType.Max with Double = js.native
  /* 0 */ val RawText: typings.steamDashClient.steamDashClientMod.ESystemIMType.RawText with Double = js.native
  /* 2 */ val RecurringPurchaseFailed: typings.steamDashClient.steamDashClientMod.ESystemIMType.RecurringPurchaseFailed with Double = js.native
  /* 4 */ val SubscriptionExpired: typings.steamDashClient.steamDashClientMod.ESystemIMType.SubscriptionExpired with Double = js.native
  /* 8 */ val SupportMessage: typings.steamDashClient.steamDashClientMod.ESystemIMType.SupportMessage with Double = js.native
  /* 9 */ val SupportMessageClearAlert: typings.steamDashClient.steamDashClientMod.ESystemIMType.SupportMessageClearAlert with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType with Double] = js.native
}

