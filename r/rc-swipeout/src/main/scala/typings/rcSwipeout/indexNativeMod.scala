package typings.rcSwipeout

import typings.rcSwipeout.anon.AutoClose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  @JSImport("rc-swipeout/lib/index.native", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcSwipeout.swipeoutMod.default {
    def this(props: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-swipeout/lib/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-swipeout/lib/index.native", "default.defaultProps")
    @js.native
    def defaultProps: AutoClose = js.native
    inline def defaultProps_=(x: AutoClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
