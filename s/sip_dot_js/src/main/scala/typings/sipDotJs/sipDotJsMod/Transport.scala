package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libCoreLogMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transport")
@js.native
abstract class Transport protected ()
  extends typings.sipDotJs.libCoreMod.Transport {
  def this(logger: Logger, options: js.Any) = this()
}

