package typings.sipJs

import typings.sipJs.libCoreLogLevelsMod.Levels
import typings.sipJs.libCoreLogLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLogLoggerFactoryMod {
  
  @JSImport("sip.js/lib/core/log/logger-factory", "LoggerFactory")
  @js.native
  open class LoggerFactory () extends StObject {
    
    /* private */ var _connector: Any = js.native
    
    /* private */ var _level: Any = js.native
    
    var builtinEnabled: Boolean = js.native
    
    def connector: js.UndefOr[
        js.Function4[
          /* level */ String, 
          /* category */ String, 
          /* label */ js.UndefOr[String], 
          /* content */ Any, 
          Unit
        ]
      ] = js.native
    def connector_=(
      value: js.UndefOr[
          js.Function4[
            /* level */ String, 
            /* category */ String, 
            /* label */ js.UndefOr[String], 
            /* content */ Any, 
            Unit
          ]
        ]
    ): Unit = js.native
    
    def genericLog(levelToLog: Levels, category: String, label: String, content: Any): Unit = js.native
    def genericLog(levelToLog: Levels, category: String, label: Unit, content: Any): Unit = js.native
    
    def getLogger(category: String): Logger = js.native
    def getLogger(category: String, label: String): Logger = js.native
    
    def level: Levels = js.native
    def level_=(newLevel: Levels): Unit = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var loggers: Any = js.native
    
    /* private */ var print: Any = js.native
  }
}
