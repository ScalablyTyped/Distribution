package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.httpMod.Server {
  /** List of content-types this server can respond with. */
  var acceptable: js.Array[java.lang.String] = js.native
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.native
  var certificate: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.native
  /** enable DTrace support */
  var dtrace: scala.Boolean = js.native
  /** Custom response formatters */
  var formatters: Formatters = js.native
  /** Handle uncaught exceptions */
  var handleUncaughtExceptions: scala.Boolean = js.native
  var http2: js.UndefOr[scala.Boolean] = js.native
  var key: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.native
  /** bunyan instance. */
  var log: bunyanLib.bunyanMod.^ = js.native
  /** Name of the server. */
  var name: java.lang.String = js.native
  /** Prevents calling next multiple times */
  var onceNext: scala.Boolean = js.native
  var passphrase: js.UndefOr[java.lang.String | scala.Null] = js.native
  /** Pre handlers */
  var preChain: Chain = js.native
  /** Router instance */
  var router: Router = js.native
  var secure: js.UndefOr[scala.Boolean] = js.native
  /** Node server instance */
  var server: nodeLib.httpMod.Server | nodeLib.httpsMod.Server | spdyLib.spdyMod.Server = js.native
  var spdy: js.UndefOr[scala.Boolean] = js.native
  /** Throws error when next() is called more than once, enabled onceNext option */
  var strictNext: scala.Boolean = js.native
  /** Once listen() is called, this will be filled in with where the server is running. */
  var url: java.lang.String = js.native
  var useChain: Chain = js.native
  /** Default version(s) to use in all routes. */
  var versions: js.Array[java.lang.String] = js.native
  def close(callback: js.Function0[_]): js.Any = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def del(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def del(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def del(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def get(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def get(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def get(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Return debug information about the server.
    */
  def getDebugInfo(): js.Any = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def head(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def head(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def head(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Returns the number of currently inflight requests.
    */
  def inflightRequests(): scala.Double = js.native
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
  def listen(args: js.Any*): js.Any = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def opts(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def opts(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def opts(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
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
  def param(name: java.lang.String, fn: RequestHandler): Server = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def patch(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def patch(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def patch(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def post(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def post(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def post(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Gives you hooks to run _before_ any routes are located.  This gives you
    * a chance to intercept the request and change headers, etc., that routing
    * depends on.  Note that req.params will _not_ be set yet.
    * @returns returns self
    */
  def pre(pre: RequestHandlerType*): Server = js.native
  /**
    * Mounts a chain on the given path against this HTTP verb
    *
    * @param   opts if string, the URL to handle.
    *                                 if options, the URL to handle, at minimum.
    * @returns                the newly created route.
    */
  def put(opts: java.lang.String, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def put(opts: RouteOptions, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  def put(opts: stdLib.RegExp, handlers: RequestHandlerType*): Route | scala.Boolean = js.native
  /**
    * Removes a route from the server.
    * You pass in the route 'blob' you got from a mount call.
    * @throws   {TypeError} on bad input.
    * @param       route the route name.
    * @returns          true if route was removed, false if not.
    */
  def rm(route: java.lang.String): scala.Boolean = js.native
  /**
    * Installs a list of handlers to run _before_ the "normal" handlers of all
    * routes.
    *
    * You can pass in any combination of functions or array of functions.
    * @returns returns self
    */
  def use(handlers: RequestHandlerType*): Server = js.native
}

