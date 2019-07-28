package typings.samchon.protocolServerBaseWebServerBaseMod

import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.protocolServerWebServerMod.WebServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/server/base/WebServerBase", "WebServerBase")
@js.native
class WebServerBase protected () extends WebServer {
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

