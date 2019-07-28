package typings.sipDotJs.libCoreLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log", "Logger")
@js.native
class Logger protected ()
  extends typings.sipDotJs.libCoreLogLoggerMod.Logger {
  def this(logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: String) = this()
  def this(
    logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory,
    category: String,
    label: String
  ) = this()
}

