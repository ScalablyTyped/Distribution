package typings
package sipDotJsLib.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransportStatus extends js.Object

@JSImport("sip.js/lib/Web/Transport", "TransportStatus")
@js.native
object TransportStatus extends js.Object {
  @js.native
  sealed trait STATUS_CLOSED
    extends sipDotJsLib.libWebTransportMod.TransportStatus
  
  @js.native
  sealed trait STATUS_CLOSING
    extends sipDotJsLib.libWebTransportMod.TransportStatus
  
  @js.native
  sealed trait STATUS_CONNECTING
    extends sipDotJsLib.libWebTransportMod.TransportStatus
  
  @js.native
  sealed trait STATUS_OPEN
    extends sipDotJsLib.libWebTransportMod.TransportStatus
  
  /* 3 */ val STATUS_CLOSED: STATUS_CLOSED with scala.Double = js.native
  /* 2 */ val STATUS_CLOSING: STATUS_CLOSING with scala.Double = js.native
  /* 0 */ val STATUS_CONNECTING: STATUS_CONNECTING with scala.Double = js.native
  /* 1 */ val STATUS_OPEN: STATUS_OPEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libWebTransportMod.TransportStatus with scala.Double] = js.native
}

