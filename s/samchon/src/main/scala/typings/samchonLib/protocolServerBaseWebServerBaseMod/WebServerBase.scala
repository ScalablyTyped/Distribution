package typings
package samchonLib.protocolServerBaseWebServerBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/WebServerBase", "WebServerBase")
@js.native
class WebServerBase protected ()
  extends samchonLib.protocolServerWebServerMod.WebServer {
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

