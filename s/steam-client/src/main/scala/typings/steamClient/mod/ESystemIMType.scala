package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESystemIMType extends js.Object
@JSImport("steam-client", "ESystemIMType")
@js.native
object ESystemIMType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESystemIMType with Double] = js.native
  
  @js.native
  sealed trait CardWillExpire extends ESystemIMType
  /* 3 */ @js.native
  object CardWillExpire extends TopLevel[CardWillExpire with Double]
  
  @js.native
  sealed trait GiftRevoked extends ESystemIMType
  /* 7 */ @js.native
  object GiftRevoked extends TopLevel[GiftRevoked with Double]
  
  @js.native
  sealed trait GuestPassGranted extends ESystemIMType
  /* 6 */ @js.native
  object GuestPassGranted extends TopLevel[GuestPassGranted with Double]
  
  @js.native
  sealed trait GuestPassReceived extends ESystemIMType
  /* 5 */ @js.native
  object GuestPassReceived extends TopLevel[GuestPassReceived with Double]
  
  @js.native
  sealed trait InvalidCard extends ESystemIMType
  /* 1 */ @js.native
  object InvalidCard extends TopLevel[InvalidCard with Double]
  
  @js.native
  sealed trait Max extends ESystemIMType
  /* 10 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait RawText extends ESystemIMType
  /* 0 */ @js.native
  object RawText extends TopLevel[RawText with Double]
  
  @js.native
  sealed trait RecurringPurchaseFailed extends ESystemIMType
  /* 2 */ @js.native
  object RecurringPurchaseFailed extends TopLevel[RecurringPurchaseFailed with Double]
  
  @js.native
  sealed trait SubscriptionExpired extends ESystemIMType
  /* 4 */ @js.native
  object SubscriptionExpired extends TopLevel[SubscriptionExpired with Double]
  
  @js.native
  sealed trait SupportMessage extends ESystemIMType
  /* 8 */ @js.native
  object SupportMessage extends TopLevel[SupportMessage with Double]
  
  @js.native
  sealed trait SupportMessageClearAlert extends ESystemIMType
  /* 9 */ @js.native
  object SupportMessageClearAlert extends TopLevel[SupportMessageClearAlert with Double]
}
