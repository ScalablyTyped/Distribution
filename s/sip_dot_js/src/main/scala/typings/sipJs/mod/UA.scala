package typings.sipJs.mod

import typings.sipJs.AnonACCEPTEDBODYTYPES
import typings.sipJs.uAMod.UA.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UA")
@js.native
class UA ()
  extends typings.sipJs.uAMod.UA {
  def this(configuration: Options) = this()
}

/* static members */
@JSImport("sip.js", "UA")
@js.native
object UA extends js.Object {
  val C: AnonACCEPTEDBODYTYPES = js.native
  @js.native
  object DtmfType extends js.Object {
    /* "info" */ val INFO: typings.sipJs.uAMod.UA.DtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipJs.uAMod.UA.DtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.uAMod.UA.DtmfType with String] = js.native
  }
  
}

