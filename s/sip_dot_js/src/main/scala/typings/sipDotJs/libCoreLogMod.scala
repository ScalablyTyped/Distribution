package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log", JSImport.Namespace)
@js.native
object libCoreLogMod extends js.Object {
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
  
  @js.native
  class LoggerFactory ()
    extends typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: typings.sipDotJs.libCoreLogLevelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typings.sipDotJs.libCoreLogLevelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typings.sipDotJs.libCoreLogLevelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typings.sipDotJs.libCoreLogLevelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sipDotJs.libCoreLogLevelsMod.Levels with Double] = js.native
  }
  
}

