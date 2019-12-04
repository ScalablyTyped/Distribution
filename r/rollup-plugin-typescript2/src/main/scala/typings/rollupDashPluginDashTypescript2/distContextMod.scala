package typings.rollupDashPluginDashTypescript2

import typings.rollupDashPluginDashTypescript2.distContextMod.IContext
import typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/context", JSImport.Namespace)
@js.native
object distContextMod extends js.Object {
  @js.native
  class ConsoleContext protected () extends IContext {
    def this(verbosity: VerbosityLevel) = this()
    def this(verbosity: VerbosityLevel, prefix: String) = this()
    var prefix: js.Any = js.native
    var verbosity: js.Any = js.native
  }
  
  @js.native
  trait IContext extends js.Object {
    def debug(message: String): Unit = js.native
    def debug(message: js.Function0[String]): Unit = js.native
    def error(message: String): Unit = js.native
    def error(message: js.Function0[String]): Unit = js.native
    def info(message: String): Unit = js.native
    def info(message: js.Function0[String]): Unit = js.native
    def warn(message: String): Unit = js.native
    def warn(message: js.Function0[String]): Unit = js.native
  }
  
  @js.native
  sealed trait VerbosityLevel extends js.Object
  
  @js.native
  object VerbosityLevel extends js.Object {
    @js.native
    sealed trait Debug extends VerbosityLevel
    
    @js.native
    sealed trait Error extends VerbosityLevel
    
    @js.native
    sealed trait Info extends VerbosityLevel
    
    @js.native
    sealed trait Warning extends VerbosityLevel
    
    /* 3 */ val Debug: typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel.Debug with Double = js.native
    /* 0 */ val Error: typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel.Error with Double = js.native
    /* 2 */ val Info: typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel.Info with Double = js.native
    /* 1 */ val Warning: typings.rollupDashPluginDashTypescript2.distContextMod.VerbosityLevel.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VerbosityLevel with Double] = js.native
  }
  
}

