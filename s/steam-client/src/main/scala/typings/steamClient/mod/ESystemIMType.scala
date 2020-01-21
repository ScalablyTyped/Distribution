package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType with Double] = js.native
  /* 3 */ @js.native
  object CardWillExpire extends TopLevel[CardWillExpire with Double]
  
  /* 7 */ @js.native
  object GiftRevoked extends TopLevel[GiftRevoked with Double]
  
  /* 6 */ @js.native
  object GuestPassGranted extends TopLevel[GuestPassGranted with Double]
  
  /* 5 */ @js.native
  object GuestPassReceived extends TopLevel[GuestPassReceived with Double]
  
  /* 1 */ @js.native
  object InvalidCard extends TopLevel[InvalidCard with Double]
  
  /* 10 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 0 */ @js.native
  object RawText extends TopLevel[RawText with Double]
  
  /* 2 */ @js.native
  object RecurringPurchaseFailed extends TopLevel[RecurringPurchaseFailed with Double]
  
  /* 4 */ @js.native
  object SubscriptionExpired extends TopLevel[SubscriptionExpired with Double]
  
  /* 8 */ @js.native
  object SupportMessage extends TopLevel[SupportMessage with Double]
  
  /* 9 */ @js.native
  object SupportMessageClearAlert extends TopLevel[SupportMessageClearAlert with Double]
  
}

