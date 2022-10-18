package typings.samchon

import typings.samchon.protocolServerIserverMod.IServer
import typings.samchon.protocolServerServerMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolServerBaseServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/ServerBase", "ServerBase")
  @js.native
  open class ServerBase protected () extends Server {
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
