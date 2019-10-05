package typings.sipDotJs

import typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log/logger", JSImport.Namespace)
@js.native
object libCoreLogLoggerMod extends js.Object {
  @js.native
  class Logger protected () extends js.Object {
    def this(logger: LoggerFactory, category: String) = this()
    def this(logger: LoggerFactory, category: String, label: String) = this()
    var category: js.Any = js.native
    var genericLog: js.Any = js.native
    var label: js.Any = js.native
    var logger: js.Any = js.native
    def debug(content: String): Unit = js.native
    def error(content: String): Unit = js.native
    def log(content: String): Unit = js.native
    def warn(content: String): Unit = js.native
  }
  
}

