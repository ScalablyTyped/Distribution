package typings.rmcFeedback

import typings.rmcFeedback.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-feedback", JSImport.Default)
  @js.native
  open class default ()
    extends typings.rmcFeedback.touchFeedbackMod.default
  /* static members */
  object default {
    
    @JSImport("rmc-feedback", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-feedback", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
