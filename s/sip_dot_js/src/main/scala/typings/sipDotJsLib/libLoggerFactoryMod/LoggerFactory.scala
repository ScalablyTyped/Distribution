package typings
package sipDotJsLib.libLoggerFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/LoggerFactory", "LoggerFactory")
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
      /* content */ _, 
      scala.Unit
    ]
  ] = js.native
  var level: Levels = js.native
  var logger: js.Any = js.native
  var loggers: js.Any = js.native
  var print: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def genericLog(levelToLog: Levels, category: java.lang.String, label: java.lang.String, content: js.Any): scala.Unit = js.native
  def genericLog(levelToLog: Levels, category: java.lang.String, label: js.UndefOr[scala.Nothing], content: js.Any): scala.Unit = js.native
  def getLogger(category: java.lang.String): Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): Logger = js.native
}

