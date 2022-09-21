package typings.rcSteps

import org.scalablytyped.runtime.Instantiable0
import typings.rcSteps.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-steps", JSImport.Default)
  @js.native
  open class default ()
    extends typings.rcSteps.stepsMod.default
  /* static members */
  object default {
    
    @JSImport("rc-steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-steps", "default.Step")
    @js.native
    def Step: Instantiable0[typings.rcSteps.stepMod.default] = js.native
    inline def Step_=(x: Instantiable0[typings.rcSteps.stepMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-steps", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    inline def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-steps", "Step")
  @js.native
  open class Step ()
    extends typings.rcSteps.stepMod.default
}
