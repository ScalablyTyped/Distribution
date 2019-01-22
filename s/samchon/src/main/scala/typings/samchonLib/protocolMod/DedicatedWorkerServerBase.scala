package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "DedicatedWorkerServerBase")
@js.native
class DedicatedWorkerServerBase protected ()
  extends samchonLib.protocolServerBaseDedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
}

