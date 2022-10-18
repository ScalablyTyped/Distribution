package typings.restify.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.spdy.mod.Server_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server
  extends typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ] {
  
  /** List of content-types this server can respond with. */
  var acceptable: js.Array[String] = js.native
  
  /**
    * Returns the server address. Wraps node's address().
    */
  def address(): AddressInterface = js.native
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var certificate: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  /**
    * Shuts down this server, and invokes callback (optionally) when done.
    * Wraps node's close().
    * @param     callback optional callback to invoke when done.
    */
  def close(): Any = js.native
  def close(callback: js.Function0[Any]): Any = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def del(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def del(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def del(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /** enable DTrace support */
  var dtrace: Boolean = js.native
  
  /** Custom response formatters */
  var formatters: Formatters_ = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def get(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def get(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def get(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /**
    * Return debug information about the server.
    */
  def getDebugInfo(): Any = js.native
  
  /** Handle uncaught exceptions */
  var handleUncaughtExceptions: Boolean = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def head(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def head(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def head(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  var http2: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns the number of currently inflight requests.
    */
  def inflightRequests(): Double = js.native
  
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  /**
    * Gets the server up and listening. Wraps node's listen().
    *
    * You can call like:
    *  server.listen(80)
    *  server.listen(80, '127.0.0.1')
    *  server.listen('/tmp/server.sock')
    *
    * @throws   {TypeError}
    * @param     callback optionally get notified when listening.
    */
  def listen(args: Any*): Any = js.native
  
  /** bunyan instance. */
  var log: typings.bunyan.mod.^ = js.native
  
  /** Name of the server. */
  var name: String = js.native
  
  /** Prevents calling next multiple times */
  var onceNext: Boolean = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def opts(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def opts(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def opts(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /**
    * Minimal port of the functionality offered by Express.js Route Param
    * Pre-conditions
    * @link http://expressjs.com/guide.html#route-param%20pre-conditions
    *
    * This basically piggy-backs on the `server.use` method. It attaches a
    * new middleware function that only fires if the specified parameter exists
    * in req.params
    *
    * Exposes an API:
    *   server.param("user", function (req, res, next) {
    *     // load the user's information here, always making sure to call next()
    *   });
    *
    * @param      name The name of the URL param to respond to
    * @param    fn   The middleware function to execute
    * @returns         returns self
    */
  def param(name: String, fn: RequestHandler): Server = js.native
  
  var passphrase: js.UndefOr[String | Null] = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def patch(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def patch(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def patch(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def post(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def post(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def post(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /**
    * Gives you hooks to run _before_ any routes are located.  This gives you
    * a chance to intercept the request and change headers, etc., that routing
    * depends on.  Note that req.params will _not_ be set yet.
    * @returns returns self
    */
  def pre(pre: RequestHandlerType*): Server = js.native
  
  /** Pre handlers */
  var preChain: Chain = js.native
  
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def put(opts: String, handlers: RequestHandlerType*): Route | Boolean = js.native
  def put(opts: js.RegExp, handlers: RequestHandlerType*): Route | Boolean = js.native
  def put(opts: RouteOptions, handlers: RequestHandlerType*): Route | Boolean = js.native
  
  /**
    * Removes a route from the server.
    * You pass in the route 'blob' you got from a mount call.
    * @throws   {TypeError} on bad input.
    * @param       route the route name.
    * @returns          true if route was removed, false if not.
    */
  def rm(route: String): Boolean = js.native
  
  /** Router instance */
  var router: Router = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  /** Node server instance */
  var server: (typings.node.httpMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) | (typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) | Server_ = js.native
  
  var spdy: js.UndefOr[Boolean] = js.native
  
  /** Throws error when next() is called more than once, enabled onceNext option */
  var strictNext: Boolean = js.native
  
  /** Once listen() is called, this will be filled in with where the server is running. */
  var url: String = js.native
  
  /**
    * Installs a list of handlers to run _before_ the "normal" handlers of all
    * routes.
    *
    * You can pass in any combination of functions or array of functions.
    * @returns returns self
    */
  def use(handlers: RequestHandlerType*): Server = js.native
  
  var useChain: Chain = js.native
  
  /** Default version(s) to use in all routes. */
  var versions: js.Array[String] = js.native
}
