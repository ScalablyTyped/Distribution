package typings.sipDotJs.libUAMod.UA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DtmfType extends js.Object

@JSImport("sip.js/lib/UA", "UA.DtmfType")
@js.native
object DtmfType extends js.Object {
  @js.native
  sealed trait INFO extends DtmfType
  
  @js.native
  sealed trait RTP extends DtmfType
  
  /* "info" */ val INFO: typings.sipDotJs.libUAMod.UA.DtmfType.INFO with String = js.native
  /* "rtp" */ val RTP: typings.sipDotJs.libUAMod.UA.DtmfType.RTP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DtmfType with String] = js.native
}

