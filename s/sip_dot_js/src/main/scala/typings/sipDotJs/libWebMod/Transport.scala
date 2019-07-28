package typings.sipDotJs.libWebMod

import typings.sipDotJs.libCoreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", "Transport")
@js.native
class Transport protected ()
  extends typings.sipDotJs.libWebTransportMod.Transport {
  def this(logger: Logger) = this()
  def this(logger: Logger, options: js.Any) = this()
}

/* static members */
@JSImport("sip.js/lib/Web", "Transport")
@js.native
object Transport extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
}

