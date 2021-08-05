package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("rollup-plugin-typescript2/dist/context", "ConsoleContext")
  @js.native
  class ConsoleContext protected ()
    extends StObject
       with IContext {
    def this(verbosity: VerbosityLevel) = this()
    def this(verbosity: VerbosityLevel, prefix: String) = this()
    
    /* private */ var prefix: js.Any = js.native
    
    /* private */ var verbosity: js.Any = js.native
  }
  
  @js.native
  sealed trait VerbosityLevel extends StObject
  @JSImport("rollup-plugin-typescript2/dist/context", "VerbosityLevel")
  @js.native
  object VerbosityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VerbosityLevel & Double] = js.native
    
    @js.native
    sealed trait Debug
      extends StObject
         with VerbosityLevel
    /* 3 */ val Debug: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Debug & Double = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with VerbosityLevel
    /* 0 */ val Error: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Error & Double = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with VerbosityLevel
    /* 2 */ val Info: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Info & Double = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with VerbosityLevel
    /* 1 */ val Warning: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Warning & Double = js.native
  }
  
  @js.native
  trait IContext extends StObject {
    
    def debug(message: String): Unit = js.native
    def debug(message: js.Function0[String]): Unit = js.native
    
    def error(message: String): Unit = js.native
    def error(message: js.Function0[String]): Unit = js.native
    
    def info(message: String): Unit = js.native
    def info(message: js.Function0[String]): Unit = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: js.Function0[String]): Unit = js.native
  }
}
