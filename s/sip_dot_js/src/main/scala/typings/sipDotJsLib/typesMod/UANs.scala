package typings
package sipDotJsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types", "UA")
@js.native
object UANs extends js.Object {
  @js.native
  object DtmfType extends js.Object {
    /* "info" */ val INFO: sipDotJsLib.typesUaMod.UANs.DtmfType.INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: sipDotJsLib.typesUaMod.UANs.DtmfType.RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesUaMod.UANs.DtmfType with java.lang.String] = js.native
  }
  
  type DtmfType = sipDotJsLib.typesUaMod.UANs.DtmfType
}

