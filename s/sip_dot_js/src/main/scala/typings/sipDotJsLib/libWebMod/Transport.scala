package typings
package sipDotJsLib.libWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", "Transport")
@js.native
class Transport protected ()
  extends sipDotJsLib.libWebTransportMod.Transport {
  def this(logger: sipDotJsLib.libCoreMod.Logger) = this()
  def this(logger: sipDotJsLib.libCoreMod.Logger, options: js.Any) = this()
}

/* static members */
@JSImport("sip.js/lib/Web", "Transport")
@js.native
object Transport extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
}

