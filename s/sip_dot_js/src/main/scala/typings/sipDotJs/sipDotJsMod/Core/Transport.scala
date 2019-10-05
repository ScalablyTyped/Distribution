package typings.sipDotJs.sipDotJsMod.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Transport")
@js.native
abstract class Transport protected ()
  extends typings.sipDotJs.libCoreMod.Transport {
  /**
    * Constructor
    * @param logger - Logger.
    * @param options - Options bucket. Deprecated.
    */
  def this(logger: typings.sipDotJs.libCoreLogMod.Logger) = this()
  def this(logger: typings.sipDotJs.libCoreLogMod.Logger, options: js.Any) = this()
}

