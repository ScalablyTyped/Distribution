package typings
package samchonLib.protocolServerBaseDedicatedWorkerServerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/DedicatedWorkerServerBase", "DedicatedWorkerServerBase")
@js.native
class DedicatedWorkerServerBase protected ()
  extends samchonLib.protocolServerDedicatedWorkerServerMod.DedicatedWorkerServer {
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

