package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UA")
@js.native
object UANs extends js.Object {
  @js.native
  object DtmfType extends js.Object {
    /* "info" */ val INFO: typings.sipDotJs.libUAMod.UANs.DtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipDotJs.libUAMod.UANs.DtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libUAMod.UANs.DtmfType with String] = js.native
  }
  
}

