package typings
package sipDotJsLib.libCoreLogLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(logger: sipDotJsLib.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: java.lang.String) = this()
  def this(logger: sipDotJsLib.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: java.lang.String, label: java.lang.String) = this()
  var category: js.Any = js.native
  var genericLog: js.Any = js.native
  var label: js.Any = js.native
  var logger: js.Any = js.native
  def debug(content: java.lang.String): scala.Unit = js.native
  def error(content: java.lang.String): scala.Unit = js.native
  def log(content: java.lang.String): scala.Unit = js.native
  def warn(content: java.lang.String): scala.Unit = js.native
}

