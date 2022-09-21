package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeNetInfoMod {
  
  @JSImport("pusher-js/types/src/runtimes/react-native/net_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsDispatcher * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reachability * / any */ @JSImport("pusher-js/types/src/runtimes/react-native/net_info", "NetInfo")
  @js.native
  open class NetInfo () extends StObject {
    
    def isOnline(): Boolean = js.native
    
    var online: Boolean = js.native
  }
  
  @JSImport("pusher-js/types/src/runtimes/react-native/net_info", "Network")
  @js.native
  def Network: NetInfo = js.native
  inline def Network_=(x: NetInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Network")(x.asInstanceOf[js.Any])
}
