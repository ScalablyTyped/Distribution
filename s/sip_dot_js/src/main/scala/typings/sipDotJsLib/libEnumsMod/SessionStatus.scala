package typings
package sipDotJsLib.libEnumsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionStatus extends js.Object

@JSImport("sip.js/lib/Enums", "SessionStatus")
@js.native
object SessionStatus extends js.Object {
  @js.native
  sealed trait STATUS_1XX_RECEIVED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_ANSWERED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_ANSWERED_WAITING_FOR_PRACK
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_CANCELED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_CONFIRMED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_EARLY_MEDIA
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_RECEIVED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_INVITE_SENT
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_NULL
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_TERMINATED
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ACK
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_ANSWER
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  @js.native
  sealed trait STATUS_WAITING_FOR_PRACK
    extends sipDotJsLib.libEnumsMod.SessionStatus
  
  /* 2 */ val STATUS_1XX_RECEIVED: STATUS_1XX_RECEIVED with scala.Double = js.native
  /* 5 */ val STATUS_ANSWERED: STATUS_ANSWERED with scala.Double = js.native
  /* 10 */ val STATUS_ANSWERED_WAITING_FOR_PRACK: STATUS_ANSWERED_WAITING_FOR_PRACK with scala.Double = js.native
  /* 8 */ val STATUS_CANCELED: STATUS_CANCELED with scala.Double = js.native
  /* 12 */ val STATUS_CONFIRMED: STATUS_CONFIRMED with scala.Double = js.native
  /* 11 */ val STATUS_EARLY_MEDIA: STATUS_EARLY_MEDIA with scala.Double = js.native
  /* 3 */ val STATUS_INVITE_RECEIVED: STATUS_INVITE_RECEIVED with scala.Double = js.native
  /* 1 */ val STATUS_INVITE_SENT: STATUS_INVITE_SENT with scala.Double = js.native
  /* 0 */ val STATUS_NULL: STATUS_NULL with scala.Double = js.native
  /* 9 */ val STATUS_TERMINATED: STATUS_TERMINATED with scala.Double = js.native
  /* 7 */ val STATUS_WAITING_FOR_ACK: STATUS_WAITING_FOR_ACK with scala.Double = js.native
  /* 4 */ val STATUS_WAITING_FOR_ANSWER: STATUS_WAITING_FOR_ANSWER with scala.Double = js.native
  /* 6 */ val STATUS_WAITING_FOR_PRACK: STATUS_WAITING_FOR_PRACK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.SessionStatus with scala.Double] = js.native
}

