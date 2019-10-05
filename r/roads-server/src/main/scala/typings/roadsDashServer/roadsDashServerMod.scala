package typings.roadsDashServer

import typings.roads.roadsMod.Road
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server", JSImport.Namespace)
@js.native
object roadsDashServerMod extends js.Object {
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
  
  @js.native
  class Server protected () extends js.Object {
    /**
      *
      * @param Roads The Road that handles all the routes
      * @param error_handler An overwrite to the standard error handler. Accepts a single parameter (the error) and should return a Roads.Response object
      */
    def this(Roads: Road) = this()
    def this(Roads: Road, error_handler: js.Function1[/* error */ js.Any, _]) = this()
    /**
      * Start the http server. Accepts the same parameters as HttpServer.listen
      * @param port Port which listen the server
      * @param handler Execution tasks after start the server
      */
    def listen(port: Double, handler: js.Function0[_]): js.Any = js.native
  }
  
}

