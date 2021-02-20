package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("rollup-plugin-typescript2/dist/context", "ConsoleContext")
  @js.native
  class ConsoleContext protected () extends IContext {
    def this(verbosity: VerbosityLevel) = this()
    def this(verbosity: VerbosityLevel, prefix: String) = this()
    
    var prefix: js.Any = js.native
    
    var verbosity: js.Any = js.native
  }
  
  @js.native
  sealed trait VerbosityLevel extends StObject
  @JSImport("rollup-plugin-typescript2/dist/context", "VerbosityLevel")
  @js.native
  object VerbosityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VerbosityLevel with Double] = js.native
    
    @js.native
    sealed trait Debug extends VerbosityLevel
    /* 3 */ val Debug: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Debug with Double = js.native
    
    @js.native
    sealed trait Error extends VerbosityLevel
    /* 0 */ val Error: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Error with Double = js.native
    
    @js.native
    sealed trait Info extends VerbosityLevel
    /* 2 */ val Info: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Info with Double = js.native
    
    @js.native
    sealed trait Warning extends VerbosityLevel
    /* 1 */ val Warning: typings.rollupPluginTypescript2.contextMod.VerbosityLevel.Warning with Double = js.native
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
