package typings
package sipDotJsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types", "C")
@js.native
object CNs extends js.Object {
  @js.native
  object DtmfType extends js.Object {
    /* "info" */ val INFO: sipDotJsLib.typesSIPMod.CNs.DtmfType.INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: sipDotJsLib.typesSIPMod.CNs.DtmfType.RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesSIPMod.CNs.DtmfType with java.lang.String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    /* "required" */ val REQUIRED: sipDotJsLib.typesSIPMod.CNs.supported.REQUIRED with java.lang.String = js.native
    /* "supported" */ val SUPPORTED: sipDotJsLib.typesSIPMod.CNs.supported.SUPPORTED with java.lang.String = js.native
    /* "none" */ val UNSUPPORTED: sipDotJsLib.typesSIPMod.CNs.supported.UNSUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesSIPMod.CNs.supported with java.lang.String] = js.native
  }
  
  type DtmfType = sipDotJsLib.typesSIPMod.CNs.DtmfType
  type supported = sipDotJsLib.typesSIPMod.CNs.supported
}

