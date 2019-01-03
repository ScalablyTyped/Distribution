package typings
package sipDotJsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types", "Session")
@js.native
object SessionNs extends js.Object {
  @js.native
  object C extends js.Object {
    /* 2 */ val STATUS_1XX_RECEIVED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_1XX_RECEIVED with scala.Double = js.native
    /* 5 */ val STATUS_ANSWERED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_ANSWERED with scala.Double = js.native
    /* 10 */ val STATUS_ANSWERED_WAITING_FOR_PRACK: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_ANSWERED_WAITING_FOR_PRACK with scala.Double = js.native
    /* 8 */ val STATUS_CANCELED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_CANCELED with scala.Double = js.native
    /* 12 */ val STATUS_CONFIRMED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_CONFIRMED with scala.Double = js.native
    /* 11 */ val STATUS_EARLY_MEDIA: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_EARLY_MEDIA with scala.Double = js.native
    /* 3 */ val STATUS_INVITE_RECEIVED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_INVITE_RECEIVED with scala.Double = js.native
    /* 1 */ val STATUS_INVITE_SENT: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_INVITE_SENT with scala.Double = js.native
    /* 0 */ val STATUS_NULL: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_NULL with scala.Double = js.native
    /* 9 */ val STATUS_TERMINATED: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_TERMINATED with scala.Double = js.native
    /* 7 */ val STATUS_WAITING_FOR_ACK: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_WAITING_FOR_ACK with scala.Double = js.native
    /* 4 */ val STATUS_WAITING_FOR_ANSWER: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_WAITING_FOR_ANSWER with scala.Double = js.native
    /* 6 */ val STATUS_WAITING_FOR_PRACK: sipDotJsLib.typesSessionMod.SessionNs.C.STATUS_WAITING_FOR_PRACK with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[sipDotJsLib.typesSessionMod.SessionNs.C with scala.Double] = js.native
  }
  
  type C = sipDotJsLib.typesSessionMod.SessionNs.C
}

