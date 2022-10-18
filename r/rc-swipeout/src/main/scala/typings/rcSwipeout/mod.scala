package typings.rcSwipeout

import typings.rcSwipeout.anon.AutoClose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-swipeout", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.rcSwipeout.libSwipeoutMod.default {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-swipeout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-swipeout", "default.defaultProps")
    @js.native
    def defaultProps: AutoClose = js.native
    inline def defaultProps_=(x: AutoClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
