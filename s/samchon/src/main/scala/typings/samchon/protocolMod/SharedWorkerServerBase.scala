package typings.samchon.protocolMod

import typings.samchon.protocolServerIServerMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends typings.samchon.protocolServerBaseSharedWorkerServerBaseMod.SharedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

