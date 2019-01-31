package typings
package sipDotJsLib.typesLoggerDashFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/logger-factory", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(logger: LoggerFactory, category: java.lang.String) = this()
  def this(logger: LoggerFactory, category: java.lang.String, label: java.lang.String) = this()
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def debug(content: java.lang.String): scala.Unit = js.native
  def error(content: java.lang.String): scala.Unit = js.native
  def log(content: java.lang.String): scala.Unit = js.native
  def warn(content: java.lang.String): scala.Unit = js.native
}

