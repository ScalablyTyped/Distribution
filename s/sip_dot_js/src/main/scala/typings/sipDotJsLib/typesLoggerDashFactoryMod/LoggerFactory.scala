package typings
package sipDotJsLib.typesLoggerDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/logger-factory", "LoggerFactory")
@js.native
class LoggerFactory () extends js.Object {
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
  var level: Levels = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def genericLog(levelToLog: Levels, category: java.lang.String, label: java.lang.String, content: js.Any): scala.Unit = js.native
  def genericLog(levelToLog: Levels, category: java.lang.String, label: js.UndefOr[scala.Nothing], content: js.Any): scala.Unit = js.native
  def getLogger(category: java.lang.String): Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): Logger = js.native
}

