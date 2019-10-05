package typings.samchon

import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.protocolServerServerMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/ServerBase", JSImport.Namespace)
@js.native
object protocolServerBaseServerBaseMod extends js.Object {
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

