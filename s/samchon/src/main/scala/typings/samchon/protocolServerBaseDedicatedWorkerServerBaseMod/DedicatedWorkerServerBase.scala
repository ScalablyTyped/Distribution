package typings.samchon.protocolServerBaseDedicatedWorkerServerBaseMod

import typings.samchon.protocolServerDedicatedWorkerServerMod.DedicatedWorkerServer
import typings.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/DedicatedWorkerServerBase", "DedicatedWorkerServerBase")
@js.native
class DedicatedWorkerServerBase protected () extends DedicatedWorkerServer {
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

