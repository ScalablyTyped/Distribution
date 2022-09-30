package typings.reactQuery

import typings.reactQuery.subscribableMod.Listener
import typings.reactQuery.subscribableMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onlineManagerMod {
  
  @JSImport("react-query/types/core/onlineManager", "OnlineManager")
  @js.native
  open class OnlineManager_ () extends Subscribable[Listener] {
    
    /* private */ var cleanup: Any = js.native
    
    def isOnline(): Boolean = js.native
    
    def onOnline(): Unit = js.native
    
    /* private */ var online: Any = js.native
    
    def setEventListener(setup: SetupFn): Unit = js.native
    
    def setOnline(): Unit = js.native
    def setOnline(online: Boolean): Unit = js.native
    
    /* private */ var setup: Any = js.native
  }
  
  @JSImport("react-query/types/core/onlineManager", "onlineManager")
  @js.native
  val onlineManager: OnlineManager_ = js.native
  
  type SetupFn = js.Function1[
    /* setOnline */ js.Function1[/* online */ js.UndefOr[Boolean], Unit], 
    js.UndefOr[js.Function0[Unit]]
  ]
}
