package typings.samchon

import typings.samchon.protocolServerIserverMod.IServer
import typings.samchon.protocolServerSharedWorkerServerMod.SharedWorkerServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolServerBaseSharedWorkerServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/SharedWorkerServerBase", "SharedWorkerServerBase")
  @js.native
  open class SharedWorkerServerBase protected () extends SharedWorkerServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    /* private */ var hooker_ : Any = js.native
  }
}
