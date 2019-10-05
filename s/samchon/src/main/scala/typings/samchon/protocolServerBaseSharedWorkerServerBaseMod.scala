package typings.samchon

import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.protocolServerSharedWorkerServerMod.SharedWorkerServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/SharedWorkerServerBase", JSImport.Namespace)
@js.native
object protocolServerBaseSharedWorkerServerBaseMod extends js.Object {
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
    var hooker_ : js.Any = js.native
  }
  
}

