package typings.sipJs

import typings.sipJs.coreMod.Logger
import typings.sipJs.transportOptionsMod.TransportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/transport", JSImport.Namespace)
@js.native
object webTransportMod extends js.Object {
  @js.native
  class Transport protected ()
    extends typings.sipJs.transportTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    var defaultOptions: js.Any = js.native
  }
  
}

