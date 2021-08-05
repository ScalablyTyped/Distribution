package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.sharedWorkerServerMod.SharedWorkerServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedWorkerServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/SharedWorkerServerBase", "SharedWorkerServerBase")
  @js.native
  class SharedWorkerServerBase protected () extends SharedWorkerServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    /* private */ var hooker_ : js.Any = js.native
  }
}
