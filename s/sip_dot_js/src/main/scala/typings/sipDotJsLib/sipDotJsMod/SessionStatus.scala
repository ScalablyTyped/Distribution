package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "SessionStatus")
@js.native
object SessionStatus extends js.Object {
  /* 2 */ val STATUS_1XX_RECEIVED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_1XX_RECEIVED with scala.Double = js.native
  /* 5 */ val STATUS_ANSWERED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_ANSWERED with scala.Double = js.native
  /* 10 */ val STATUS_ANSWERED_WAITING_FOR_PRACK: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_ANSWERED_WAITING_FOR_PRACK with scala.Double = js.native
  /* 8 */ val STATUS_CANCELED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_CANCELED with scala.Double = js.native
  /* 12 */ val STATUS_CONFIRMED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_CONFIRMED with scala.Double = js.native
  /* 11 */ val STATUS_EARLY_MEDIA: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_EARLY_MEDIA with scala.Double = js.native
  /* 3 */ val STATUS_INVITE_RECEIVED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_INVITE_RECEIVED with scala.Double = js.native
  /* 1 */ val STATUS_INVITE_SENT: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_INVITE_SENT with scala.Double = js.native
  /* 0 */ val STATUS_NULL: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_NULL with scala.Double = js.native
  /* 9 */ val STATUS_TERMINATED: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_TERMINATED with scala.Double = js.native
  /* 7 */ val STATUS_WAITING_FOR_ACK: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ACK with scala.Double = js.native
  /* 4 */ val STATUS_WAITING_FOR_ANSWER: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_ANSWER with scala.Double = js.native
  /* 6 */ val STATUS_WAITING_FOR_PRACK: sipDotJsLib.libEnumsMod.SessionStatus.STATUS_WAITING_FOR_PRACK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libEnumsMod.SessionStatus with scala.Double] = js.native
}

