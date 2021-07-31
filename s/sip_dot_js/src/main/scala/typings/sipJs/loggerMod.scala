package typings.sipJs

import typings.sipJs.loggerFactoryMod.LoggerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("sip.js/lib/core/log/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(logger: LoggerFactory, category: String) = this()
    def this(logger: LoggerFactory, category: String, label: String) = this()
    
    var category: js.Any = js.native
    
    def debug(content: String): Unit = js.native
    
    def error(content: String): Unit = js.native
    
    var genericLog: js.Any = js.native
    
    var label: js.Any = js.native
    
    def log(content: String): Unit = js.native
    
    var logger: js.Any = js.native
    
    def warn(content: String): Unit = js.native
  }
}
