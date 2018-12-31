package typings
package roadsDashServerLib.roadsDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server", "Server")
@js.native
class Server protected () extends js.Object {
  /**
    *
    * @param Roads The Road that handles all the routes
    * @param error_handler An overwrite to the standard error handler. Accepts a single parameter (the error) and should return a Roads.Response object
    */
  def this(Roads: roadsLib.roadsMod.Road) = this()
  def this(Roads: roadsLib.roadsMod.Road, error_handler: js.Function1[/* error */ js.Any, _]) = this()
  /**
    * Start the http server. Accepts the same parameters as HttpServer.listen
    * @param port Port which listen the server
    * @param handler Execution tasks after start the server
    */
  def listen(port: scala.Double, handler: js.Function0[_]): js.Any = js.native
}

