package typings
package sipDotJsLib.libCoreLogLoggerDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log/logger-factory", "LoggerFactory")
@js.native
class LoggerFactory () extends js.Object {
  var _connector: js.Any = js.native
  var _level: js.Any = js.native
  var builtinEnabled: scala.Boolean = js.native
  var connector: js.UndefOr[
    js.Function4[
      /* level */ java.lang.String, 
      /* category */ java.lang.String, 
      /* label */ js.UndefOr[java.lang.String], 
      /* content */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var level: sipDotJsLib.libCoreLogLevelsMod.Levels = js.native
  var logger: js.Any = js.native
  var loggers: js.Any = js.native
  var print: js.Any = js.native
  def genericLog(
    levelToLog: sipDotJsLib.libCoreLogLevelsMod.Levels,
    category: java.lang.String,
    label: js.UndefOr[scala.Nothing],
    content: js.Any
  ): scala.Unit = js.native
  def genericLog(
    levelToLog: sipDotJsLib.libCoreLogLevelsMod.Levels,
    category: java.lang.String,
    label: java.lang.String,
    content: js.Any
  ): scala.Unit = js.native
  def getLogger(category: java.lang.String): sipDotJsLib.libCoreLogLoggerMod.Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): sipDotJsLib.libCoreLogLoggerMod.Logger = js.native
}

