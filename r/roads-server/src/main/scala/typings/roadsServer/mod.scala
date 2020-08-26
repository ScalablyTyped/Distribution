package typings.roadsServer

import typings.node.httpsMod.ServerOptions
import typings.roads.mod.Road
import typings.roadsServer.http2ServerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Http2Server protected () extends default {
    /**
      * Constructs a new Server object that helps create Roads servers.
      *
      * @param {Road} road The Road that handles all the routes
      */
    def this(road: Road) = this()
  }
  
  @js.native
  class Server protected ()
    extends typings.roadsServer.httpServerMod.default {
    /**
      * Constructs a new Server object that helps create Roads servers.
      *
      * @todo  tests
      * @param {Roads} road The Road that handles all the routes
      * @param {Function} error_handler An overwrite to the standard error handler. Accepts a single parameter (the error) and should return a Roads.Response object.
      * @param {Object} httpsOptions HTTPS servers require additional data. You can pass all of those parameters here. Valid values can be found in the node docs: https://nodejs.org/api/https.html#https_https_createserver_options_requestlistener
      */
    def this(road: Road) = this()
    def this(road: Road, error_handler: js.Function) = this()
    def this(road: Road, error_handler: js.UndefOr[scala.Nothing], httpsOptions: ServerOptions) = this()
    def this(road: Road, error_handler: js.Function, httpsOptions: ServerOptions) = this()
  }
  
}

