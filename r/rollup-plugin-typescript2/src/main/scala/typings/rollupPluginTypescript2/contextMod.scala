package typings.rollupPluginTypescript2

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rollup-plugin-typescript2/dist/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VerbosityLevel with Double] = js.native
    
    @js.native
    sealed trait Debug extends VerbosityLevel
    /* 3 */ @js.native
    object Debug extends TopLevel[Debug with Double]
    
    @js.native
    sealed trait Error extends VerbosityLevel
    /* 0 */ @js.native
    object Error extends TopLevel[Error with Double]
    
    @js.native
    sealed trait Info extends VerbosityLevel
    /* 2 */ @js.native
    object Info extends TopLevel[Info with Double]
    
    @js.native
    sealed trait Warning extends VerbosityLevel
    /* 1 */ @js.native
    object Warning extends TopLevel[Warning with Double]
  }
}
