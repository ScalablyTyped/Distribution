package typings
package samchonLib.protocolServerBaseServerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/ServerBase", "ServerBase")
@js.native
class ServerBase protected ()
  extends samchonLib.protocolServerServerMod.Server {
  /**
    * Construct from a *hooker*.
    *
    * @param hooker A hooker throwing responsibility of server's role.
    */
  def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  /**
    * @hidden
    */
  var `hooker_`: js.Any = js.native
}

