package typings.sipJs

import typings.sipJs.levelsMod.Levels
import typings.sipJs.loggerFactoryMod.LoggerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("sip.js/lib/core/log/logger", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(logger: LoggerFactory, category: String) = this()
    def this(logger: LoggerFactory, category: String, label: String) = this()
    
    /* private */ var category: Any = js.native
    
    def debug(content: String): Unit = js.native
    
    def error(content: String): Unit = js.native
    
    /* private */ var genericLog: Any = js.native
    
    /* private */ var label: Any = js.native
    
    def level: Levels = js.native
    def level_=(newLevel: Levels): Unit = js.native
    
    def log(content: String): Unit = js.native
    
    /* private */ var logger: Any = js.native
    
    def warn(content: String): Unit = js.native
  }
}
