package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.serverMod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverBaseMod {
  
  @JSImport("samchon/protocol/server/base/ServerBase", "ServerBase")
  @js.native
  class ServerBase protected () extends Server {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    var hooker_ : js.Any = js.native
  }
}
