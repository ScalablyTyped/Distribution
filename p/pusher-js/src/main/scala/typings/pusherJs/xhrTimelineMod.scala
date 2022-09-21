package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrTimelineMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/runtimes/isomorphic/timeline/xhr_timeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAgent(
      sender: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimelineSender */ Any,
      useTLS: Boolean
    ): js.Function2[/* data */ Any, /* callback */ js.Function, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAgent")(sender.asInstanceOf[js.Any], useTLS.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* data */ Any, /* callback */ js.Function, Unit]]
    
    @JSImport("pusher-js/types/src/runtimes/isomorphic/timeline/xhr_timeline", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
}
