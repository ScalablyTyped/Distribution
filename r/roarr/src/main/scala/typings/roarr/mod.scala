package typings.roarr

import typings.roarr.distSrcTypesMod.JsonObject
import typings.roarr.distSrcTypesMod.LogLevelName
import typings.roarr.distSrcTypesMod.Logger
import typings.roarr.distSrcTypesMod.RoarrGlobalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roarr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("roarr", "ROARR")
  @js.native
  val ROARR_ : RoarrGlobalState = js.native
  
  @JSImport("roarr", "Roarr")
  @js.native
  val Roarr: Logger[JsonObject] = js.native
  
  inline def getLogLevelName(numericLogLevel: Double): LogLevelName = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogLevelName")(numericLogLevel.asInstanceOf[js.Any]).asInstanceOf[LogLevelName]
  
  object logLevels {
    
    @JSImport("roarr", "logLevels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("roarr", "logLevels.debug")
    @js.native
    def debug: Double = js.native
    inline def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("roarr", "logLevels.error")
    @js.native
    def error: Double = js.native
    inline def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("roarr", "logLevels.fatal")
    @js.native
    def fatal: Double = js.native
    inline def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("roarr", "logLevels.info")
    @js.native
    def info: Double = js.native
    inline def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("roarr", "logLevels.trace")
    @js.native
    def trace: Double = js.native
    inline def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("roarr", "logLevels.warn")
    @js.native
    def warn: Double = js.native
    inline def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
}
