package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transport")
@js.native
abstract class Transport protected ()
  extends sipDotJsLib.libTransportMod.Transport {
  def this(logger: sipDotJsLib.libLoggerFactoryMod.Logger, options: js.Any) = this()
}

