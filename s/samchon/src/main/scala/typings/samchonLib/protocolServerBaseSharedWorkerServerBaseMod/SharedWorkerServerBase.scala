package typings
package samchonLib.protocolServerBaseSharedWorkerServerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/SharedWorkerServerBase", "SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends samchonLib.protocolServerSharedWorkerServerMod.SharedWorkerServer {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  /**
    * @hidden
    */
  var hooker_ : js.Any = js.native
}

