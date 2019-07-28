package typings.roadsDashServer.roadsDashServerMod

import typings.roads.roadsMod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server", "Http2Server")
@js.native
class Http2Server protected () extends js.Object {
  /**
    *
    * @param Roads The Road that handles all the routes
    */
  def this(Roads: Road) = this()
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    * @param port Port which listen the server
    * @param handler Execution tasks after start the server
    */
  def listen(port: Double, handler: js.Function0[_]): js.Any = js.native
}

