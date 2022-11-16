package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreWatchlistMod {
  
  @JSImport("pusher-js/types/src/core/watchlist", JSImport.Default)
  @js.native
  open class default protected () extends WatchlistFacade {
    def this(pusher: typings.pusherJs.typesSrcCorePusherMod.default) = this()
  }
  
  @js.native
  trait WatchlistFacade
    extends typings.pusherJs.typesSrcCoreEventsDispatcherMod.default {
    
    /* private */ var bindWatchlistInternalEvent: Any = js.native
    
    def handleEvent(pusherEvent: Any): Unit = js.native
    
    /* private */ var pusher: Any = js.native
  }
}
