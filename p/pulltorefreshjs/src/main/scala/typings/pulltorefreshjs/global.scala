package typings.pulltorefreshjs

import typings.pulltorefreshjs.mod.Options
import typings.pulltorefreshjs.mod.PullToRefreshInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PullToRefresh {
    
    @JSGlobal("PullToRefresh")
    @js.native
    val ^ : js.Any = js.native
    
    inline def destroyAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[Unit]
    
    inline def init(): PullToRefreshInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[PullToRefreshInstance]
    inline def init(options: Options): PullToRefreshInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[PullToRefreshInstance]
    
    inline def setPassiveMode(isPassive: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPassiveMode")(isPassive.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
