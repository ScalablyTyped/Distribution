package typings.sipDotJs.libWebTransportMod

import org.scalablytyped.runtime.TopLevel
import typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CLOSED
import typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CLOSING
import typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_CONNECTING
import typings.sipDotJs.libWebTransportMod.TransportStatus.STATUS_OPEN
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportStatus with Double] = js.native
  /* 3 */ @js.native
  object STATUS_CLOSED extends TopLevel[STATUS_CLOSED with Double]
  
  /* 2 */ @js.native
  object STATUS_CLOSING extends TopLevel[STATUS_CLOSING with Double]
  
  /* 0 */ @js.native
  object STATUS_CONNECTING extends TopLevel[STATUS_CONNECTING with Double]
  
  /* 1 */ @js.native
  object STATUS_OPEN extends TopLevel[STATUS_OPEN with Double]
  
}

