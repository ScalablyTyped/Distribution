package typings.sipDotJs.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransportStatus extends js.Object

@JSImport("sip.js/lib/Web/Transport", "TransportStatus")
@js.native
object TransportStatus extends js.Object {
  @js.native
  sealed trait STATUS_CLOSED extends TransportStatus
  
  @js.native
  sealed trait STATUS_CLOSING extends TransportStatus
  
  @js.native
  sealed trait STATUS_CONNECTING extends TransportStatus
  
  @js.native
  sealed trait STATUS_OPEN extends TransportStatus
  
  /* 3 */ val STATUS_CLOSED: typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CLOSED with Double = js.native
  /* 2 */ val STATUS_CLOSING: typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CLOSING with Double = js.native
  /* 0 */ val STATUS_CONNECTING: typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CONNECTING with Double = js.native
  /* 1 */ val STATUS_OPEN: typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_OPEN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportStatus with Double] = js.native
}

