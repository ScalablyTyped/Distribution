package typings.rmcSteps

import typings.rmcSteps.anon.Current
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-steps/lib", JSImport.Default)
  @js.native
  class default ()
    extends typings.rmcSteps.stepsMod.default
  /* static members */
  object default {
    
    @JSImport("rmc-steps/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-steps/lib", "default.defaultProps")
    @js.native
    def defaultProps: Current = js.native
    @scala.inline
    def defaultProps_=(x: Current): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-steps/lib", "Step")
  @js.native
  class Step ()
    extends typings.rmcSteps.stepMod.default
}
