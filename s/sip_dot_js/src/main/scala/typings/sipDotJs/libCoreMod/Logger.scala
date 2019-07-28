package typings.sipDotJs.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Logger")
@js.native
class Logger protected ()
  extends typings.sipDotJs.libCoreLogMod.Logger {
  def this(logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: String) = this()
  def this(
    logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory,
    category: String,
    label: String
  ) = this()
}

