package typings.samchon.protocolMod

import typings.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "DedicatedWorkerServerBase")
@js.native
class DedicatedWorkerServerBase protected ()
  extends typings.samchon.dedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: IServer) = this()
}

