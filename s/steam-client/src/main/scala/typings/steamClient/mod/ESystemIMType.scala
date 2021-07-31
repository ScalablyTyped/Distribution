package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESystemIMType extends StObject
@JSImport("steam-client", "ESystemIMType")
@js.native
object ESystemIMType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType & Double] = js.native
  
  @js.native
  sealed trait CardWillExpire
    extends StObject
       with ESystemIMType
  /* 3 */ val CardWillExpire: typings.steamClient.mod.ESystemIMType.CardWillExpire & Double = js.native
  
  @js.native
  sealed trait GiftRevoked
    extends StObject
       with ESystemIMType
  /* 7 */ val GiftRevoked: typings.steamClient.mod.ESystemIMType.GiftRevoked & Double = js.native
  
  @js.native
  sealed trait GuestPassGranted
    extends StObject
       with ESystemIMType
  /* 6 */ val GuestPassGranted: typings.steamClient.mod.ESystemIMType.GuestPassGranted & Double = js.native
  
  @js.native
  sealed trait GuestPassReceived
    extends StObject
       with ESystemIMType
  /* 5 */ val GuestPassReceived: typings.steamClient.mod.ESystemIMType.GuestPassReceived & Double = js.native
  
  @js.native
  sealed trait InvalidCard
    extends StObject
       with ESystemIMType
  /* 1 */ val InvalidCard: typings.steamClient.mod.ESystemIMType.InvalidCard & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with ESystemIMType
  /* 10 */ val Max: typings.steamClient.mod.ESystemIMType.Max & Double = js.native
  
  @js.native
  sealed trait RawText
    extends StObject
       with ESystemIMType
  /* 0 */ val RawText: typings.steamClient.mod.ESystemIMType.RawText & Double = js.native
  
  @js.native
  sealed trait RecurringPurchaseFailed
    extends StObject
       with ESystemIMType
  /* 2 */ val RecurringPurchaseFailed: typings.steamClient.mod.ESystemIMType.RecurringPurchaseFailed & Double = js.native
  
  @js.native
  sealed trait SubscriptionExpired
    extends StObject
       with ESystemIMType
  /* 4 */ val SubscriptionExpired: typings.steamClient.mod.ESystemIMType.SubscriptionExpired & Double = js.native
  
  @js.native
  sealed trait SupportMessage
    extends StObject
       with ESystemIMType
  /* 8 */ val SupportMessage: typings.steamClient.mod.ESystemIMType.SupportMessage & Double = js.native
  
  @js.native
  sealed trait SupportMessageClearAlert
    extends StObject
       with ESystemIMType
  /* 9 */ val SupportMessageClearAlert: typings.steamClient.mod.ESystemIMType.SupportMessageClearAlert & Double = js.native
}
