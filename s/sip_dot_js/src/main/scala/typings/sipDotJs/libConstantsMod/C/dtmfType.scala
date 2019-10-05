package typings.sipDotJs.libConstantsMod.C

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dtmfType extends js.Object

@JSImport("sip.js/lib/Constants", "C.dtmfType")
@js.native
object dtmfType extends js.Object {
  @js.native
  sealed trait INFO extends dtmfType
  
  @js.native
  sealed trait RTP extends dtmfType
  
  /* "info" */ val INFO: typings.sipDotJs.libConstantsMod.C.dtmfType.INFO with String = js.native
  /* "rtp" */ val RTP: typings.sipDotJs.libConstantsMod.C.dtmfType.RTP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dtmfType with String] = js.native
}

