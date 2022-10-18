package typings.samchon

import typings.samchon.protocolServerDedicatedWorkerServerMod.DedicatedWorkerServer
import typings.samchon.protocolServerIserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolServerBaseDedicatedWorkerServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/DedicatedWorkerServerBase", "DedicatedWorkerServerBase")
  @js.native
  open class DedicatedWorkerServerBase protected () extends DedicatedWorkerServer {
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
