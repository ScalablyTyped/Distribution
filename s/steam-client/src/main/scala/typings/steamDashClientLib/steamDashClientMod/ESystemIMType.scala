package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ESystemIMType extends js.Object

@JSImport("steam-client", "ESystemIMType")
@js.native
object ESystemIMType extends js.Object {
  @js.native
  sealed trait CardWillExpire
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait GiftRevoked
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait GuestPassGranted
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait GuestPassReceived
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait InvalidCard
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait RawText
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait RecurringPurchaseFailed
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait SubscriptionExpired
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait SupportMessage
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  @js.native
  sealed trait SupportMessageClearAlert
    extends steamDashClientLib.steamDashClientMod.ESystemIMType
  
  /* 3 */ val CardWillExpire: CardWillExpire with scala.Double = js.native
  /* 7 */ val GiftRevoked: GiftRevoked with scala.Double = js.native
  /* 6 */ val GuestPassGranted: GuestPassGranted with scala.Double = js.native
  /* 5 */ val GuestPassReceived: GuestPassReceived with scala.Double = js.native
  /* 1 */ val InvalidCard: InvalidCard with scala.Double = js.native
  /* 10 */ val Max: Max with scala.Double = js.native
  /* 0 */ val RawText: RawText with scala.Double = js.native
  /* 2 */ val RecurringPurchaseFailed: RecurringPurchaseFailed with scala.Double = js.native
  /* 4 */ val SubscriptionExpired: SubscriptionExpired with scala.Double = js.native
  /* 8 */ val SupportMessage: SupportMessage with scala.Double = js.native
  /* 9 */ val SupportMessageClearAlert: SupportMessageClearAlert with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ESystemIMType with scala.Double] = js.native
}

