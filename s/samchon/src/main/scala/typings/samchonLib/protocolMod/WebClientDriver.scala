package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "WebClientDriver")
@js.native
class WebClientDriver protected ()
  extends samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver {
  /**
    * Initialization Constructor.
    *
    * @param connection Connection driver, a socket for web-socket.
    * @param path Requested path.
    * @param session_id Session ID, an identifier of the remote client.
    */
  def this(connection: js.Any, path: java.lang.String, session_id: java.lang.String) = this()
}

