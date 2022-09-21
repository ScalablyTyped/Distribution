package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  @JSImport("sip.js/lib/core/log", "Levels")
  @js.native
  object Levels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sipJs.levelsMod.Levels & Double] = js.native
    
    /* 3 */ val debug: typings.sipJs.levelsMod.Levels.debug & Double = js.native
    
    /* 0 */ val error: typings.sipJs.levelsMod.Levels.error & Double = js.native
    
    /* 2 */ val log: typings.sipJs.levelsMod.Levels.log & Double = js.native
    
    /* 1 */ val warn: typings.sipJs.levelsMod.Levels.warn & Double = js.native
  }
  
  @JSImport("sip.js/lib/core/log", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.sipJs.loggerMod.Logger {
    def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String) = this()
    def this(logger: typings.sipJs.loggerFactoryMod.LoggerFactory, category: String, label: String) = this()
  }
  
  @JSImport("sip.js/lib/core/log", "LoggerFactory")
  @js.native
  open class LoggerFactory ()
    extends typings.sipJs.loggerFactoryMod.LoggerFactory
}
