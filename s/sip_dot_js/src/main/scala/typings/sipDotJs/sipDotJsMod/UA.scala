package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.Anon_ACCEPTEDBODYTYPES
import typings.sipDotJs.libUAMod.UA.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UA")
@js.native
class UA ()
  extends typings.sipDotJs.libUAMod.UA {
  def this(configuration: Options) = this()
}

/* static members */
@JSImport("sip.js", "UA")
@js.native
object UA extends js.Object {
  val C: Anon_ACCEPTEDBODYTYPES = js.native
  @js.native
  object DtmfType extends js.Object {
    /* "info" */ val INFO: typings.sipDotJs.libUAMod.UA.DtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipDotJs.libUAMod.UA.DtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libUAMod.UA.DtmfType with String] = js.native
  }
  
}

