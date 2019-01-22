package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "SharedWorkerServerBase")
@js.native
class SharedWorkerServerBase protected ()
  extends samchonLib.protocolServerBaseSharedWorkerServerBaseMod.SharedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
}

