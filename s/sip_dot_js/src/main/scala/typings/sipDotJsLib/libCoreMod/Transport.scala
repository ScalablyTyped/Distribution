package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Transport")
@js.native
abstract class Transport protected ()
  extends sipDotJsLib.libCoreTransportMod.Transport {
  def this(logger: sipDotJsLib.libCoreLogMod.Logger, options: js.Any) = this()
}

