package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "SessionStatus")
@js.native
object SessionStatus extends js.Object {
  /* 2 */ val STATUS_1XX_RECEIVED: typings.sipJs.enumsMod.SessionStatus.STATUS_1XX_RECEIVED with Double = js.native
  /* 5 */ val STATUS_ANSWERED: typings.sipJs.enumsMod.SessionStatus.STATUS_ANSWERED with Double = js.native
  /* 10 */ val STATUS_ANSWERED_WAITING_FOR_PRACK: typings.sipJs.enumsMod.SessionStatus.STATUS_ANSWERED_WAITING_FOR_PRACK with Double = js.native
  /* 8 */ val STATUS_CANCELED: typings.sipJs.enumsMod.SessionStatus.STATUS_CANCELED with Double = js.native
  /* 12 */ val STATUS_CONFIRMED: typings.sipJs.enumsMod.SessionStatus.STATUS_CONFIRMED with Double = js.native
  /* 11 */ val STATUS_EARLY_MEDIA: typings.sipJs.enumsMod.SessionStatus.STATUS_EARLY_MEDIA with Double = js.native
  /* 3 */ val STATUS_INVITE_RECEIVED: typings.sipJs.enumsMod.SessionStatus.STATUS_INVITE_RECEIVED with Double = js.native
  /* 1 */ val STATUS_INVITE_SENT: typings.sipJs.enumsMod.SessionStatus.STATUS_INVITE_SENT with Double = js.native
  /* 0 */ val STATUS_NULL: typings.sipJs.enumsMod.SessionStatus.STATUS_NULL with Double = js.native
  /* 9 */ val STATUS_TERMINATED: typings.sipJs.enumsMod.SessionStatus.STATUS_TERMINATED with Double = js.native
  /* 7 */ val STATUS_WAITING_FOR_ACK: typings.sipJs.enumsMod.SessionStatus.STATUS_WAITING_FOR_ACK with Double = js.native
  /* 4 */ val STATUS_WAITING_FOR_ANSWER: typings.sipJs.enumsMod.SessionStatus.STATUS_WAITING_FOR_ANSWER with Double = js.native
  /* 6 */ val STATUS_WAITING_FOR_PRACK: typings.sipJs.enumsMod.SessionStatus.STATUS_WAITING_FOR_PRACK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sipJs.enumsMod.SessionStatus with Double] = js.native
}

