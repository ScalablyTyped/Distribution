package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESystemIMType extends StObject
@JSImport("steam-client", "ESystemIMType")
@js.native
object ESystemIMType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType with Double] = js.native
  
  @js.native
  sealed trait CardWillExpire extends ESystemIMType
  /* 3 */ val CardWillExpire: typings.steamClient.mod.ESystemIMType.CardWillExpire with Double = js.native
  
  @js.native
  sealed trait GiftRevoked extends ESystemIMType
  /* 7 */ val GiftRevoked: typings.steamClient.mod.ESystemIMType.GiftRevoked with Double = js.native
  
  @js.native
  sealed trait GuestPassGranted extends ESystemIMType
  /* 6 */ val GuestPassGranted: typings.steamClient.mod.ESystemIMType.GuestPassGranted with Double = js.native
  
  @js.native
  sealed trait GuestPassReceived extends ESystemIMType
  /* 5 */ val GuestPassReceived: typings.steamClient.mod.ESystemIMType.GuestPassReceived with Double = js.native
  
  @js.native
  sealed trait InvalidCard extends ESystemIMType
  /* 1 */ val InvalidCard: typings.steamClient.mod.ESystemIMType.InvalidCard with Double = js.native
  
  @js.native
  sealed trait Max extends ESystemIMType
  /* 10 */ val Max: typings.steamClient.mod.ESystemIMType.Max with Double = js.native
  
  @js.native
  sealed trait RawText extends ESystemIMType
  /* 0 */ val RawText: typings.steamClient.mod.ESystemIMType.RawText with Double = js.native
  
  @js.native
  sealed trait RecurringPurchaseFailed extends ESystemIMType
  /* 2 */ val RecurringPurchaseFailed: typings.steamClient.mod.ESystemIMType.RecurringPurchaseFailed with Double = js.native
  
  @js.native
  sealed trait SubscriptionExpired extends ESystemIMType
  /* 4 */ val SubscriptionExpired: typings.steamClient.mod.ESystemIMType.SubscriptionExpired with Double = js.native
  
  @js.native
  sealed trait SupportMessage extends ESystemIMType
  /* 8 */ val SupportMessage: typings.steamClient.mod.ESystemIMType.SupportMessage with Double = js.native
  
  @js.native
  sealed trait SupportMessageClearAlert extends ESystemIMType
  /* 9 */ val SupportMessageClearAlert: typings.steamClient.mod.ESystemIMType.SupportMessageClearAlert with Double = js.native
}
