package typings.rmcPullToRefresh

import typings.rmcPullToRefresh.propsTypeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-pull-to-refresh", JSImport.Default)
  @js.native
  class default ()
    extends typings.rmcPullToRefresh.pullToRefreshMod.default
  /* static members */
  object default {
    
    @JSImport("rmc-pull-to-refresh", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-pull-to-refresh", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
