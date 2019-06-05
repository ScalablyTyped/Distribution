package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transport")
@js.native
abstract class Transport protected ()
  extends sipDotJsLib.libCoreMod.Transport {
  def this(logger: sipDotJsLib.libCoreLogMod.Logger, options: js.Any) = this()
}

