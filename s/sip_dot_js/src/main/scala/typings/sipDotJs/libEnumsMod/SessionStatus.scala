package typings.sipDotJs.libEnumsMod

import org.scalablytyped.runtime.TopLevel
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_1XX_RECEIVED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_ANSWERED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_ANSWERED_WAITING_FOR_PRACK
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_CANCELED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_CONFIRMED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_EARLY_MEDIA
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_INVITE_RECEIVED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_INVITE_SENT
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_NULL
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_TERMINATED
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ACK
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ANSWER
import typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_PRACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionStatus extends js.Object

@JSImport("sip.js/lib/Enums", "SessionStatus")
@js.native
object SessionStatus extends js.Object {
  @js.native
  sealed trait STATUS_1XX_RECEIVED extends SessionStatus
  
  @js.native
  sealed trait STATUS_ANSWERED extends SessionStatus
  
  @js.native
  sealed trait STATUS_ANSWERED_WAITING_FOR_PRACK extends SessionStatus
  
  @js.native
  sealed trait STATUS_CANCELED extends SessionStatus
  
  @js.native
  sealed trait STATUS_CONFIRMED extends SessionStatus
  
  @js.native
  sealed trait STATUS_EARLY_MEDIA extends SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_RECEIVED extends SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_SENT extends SessionStatus
  
  @js.native
  sealed trait STATUS_NULL extends SessionStatus
  
  @js.native
  sealed trait STATUS_TERMINATED extends SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ACK extends SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ANSWER extends SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_PRACK extends SessionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SessionStatus with Double] = js.native
  /* 2 */ @js.native
  object STATUS_1XX_RECEIVED extends TopLevel[STATUS_1XX_RECEIVED with Double]
  
  /* 5 */ @js.native
  object STATUS_ANSWERED extends TopLevel[STATUS_ANSWERED with Double]
  
  /* 10 */ @js.native
  object STATUS_ANSWERED_WAITING_FOR_PRACK extends TopLevel[STATUS_ANSWERED_WAITING_FOR_PRACK with Double]
  
  /* 8 */ @js.native
  object STATUS_CANCELED extends TopLevel[STATUS_CANCELED with Double]
  
  /* 12 */ @js.native
  object STATUS_CONFIRMED extends TopLevel[STATUS_CONFIRMED with Double]
  
  /* 11 */ @js.native
  object STATUS_EARLY_MEDIA extends TopLevel[STATUS_EARLY_MEDIA with Double]
  
  /* 3 */ @js.native
  object STATUS_INVITE_RECEIVED extends TopLevel[STATUS_INVITE_RECEIVED with Double]
  
  /* 1 */ @js.native
  object STATUS_INVITE_SENT extends TopLevel[STATUS_INVITE_SENT with Double]
  
  /* 0 */ @js.native
  object STATUS_NULL extends TopLevel[STATUS_NULL with Double]
  
  /* 9 */ @js.native
  object STATUS_TERMINATED extends TopLevel[STATUS_TERMINATED with Double]
  
  /* 7 */ @js.native
  object STATUS_WAITING_FOR_ACK extends TopLevel[STATUS_WAITING_FOR_ACK with Double]
  
  /* 4 */ @js.native
  object STATUS_WAITING_FOR_ANSWER extends TopLevel[STATUS_WAITING_FOR_ANSWER with Double]
  
  /* 6 */ @js.native
  object STATUS_WAITING_FOR_PRACK extends TopLevel[STATUS_WAITING_FOR_PRACK with Double]
  
}

