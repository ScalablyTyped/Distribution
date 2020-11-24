package typings.roadsServer.http2ServerMod

import typings.roads.mod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roads-server/types/http2Server", JSImport.Default)
@js.native
class default protected () extends Server {
  /**
    * Constructs a new Server object that helps create Roads servers.
    *
    * @param {Road} road The Road that handles all the routes
    */
  def this(road: Road) = this()
}
