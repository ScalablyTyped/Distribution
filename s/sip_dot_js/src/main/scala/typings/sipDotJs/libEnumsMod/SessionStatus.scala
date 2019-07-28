package typings.sipDotJs.libEnumsMod

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
  
  /* 2 */ val STATUS_1XX_RECEIVED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_1XX_RECEIVED with Double = js.native
  /* 5 */ val STATUS_ANSWERED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_ANSWERED with Double = js.native
  /* 10 */ val STATUS_ANSWERED_WAITING_FOR_PRACK: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_ANSWERED_WAITING_FOR_PRACK with Double = js.native
  /* 8 */ val STATUS_CANCELED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_CANCELED with Double = js.native
  /* 12 */ val STATUS_CONFIRMED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_CONFIRMED with Double = js.native
  /* 11 */ val STATUS_EARLY_MEDIA: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_EARLY_MEDIA with Double = js.native
  /* 3 */ val STATUS_INVITE_RECEIVED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_INVITE_RECEIVED with Double = js.native
  /* 1 */ val STATUS_INVITE_SENT: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_INVITE_SENT with Double = js.native
  /* 0 */ val STATUS_NULL: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_NULL with Double = js.native
  /* 9 */ val STATUS_TERMINATED: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_TERMINATED with Double = js.native
  /* 7 */ val STATUS_WAITING_FOR_ACK: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ACK with Double = js.native
  /* 4 */ val STATUS_WAITING_FOR_ANSWER: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ANSWER with Double = js.native
  /* 6 */ val STATUS_WAITING_FOR_PRACK: typings.sipDotJs.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_PRACK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SessionStatus with Double] = js.native
}

