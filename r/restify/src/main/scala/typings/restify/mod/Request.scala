package typings.restify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.formidable.mod.File
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends IncomingMessage {
  
  /**
    * Builds an absolute URI for the request.
    */
  def absoluteUri(path: String): String = js.native
  
  /**
    * checks if the accept header is present and has the value requested.
    * e.g., req.accepts('html');
    * @param    types an array of accept type headers
    */
  def accepts(types: String): Boolean = js.native
  def accepts(types: js.Array[String]): Boolean = js.native
  
  /**
    * checks if the request accepts the encoding types.
    * @param    types an array of accept type headers
    */
  def acceptsEncoding(types: String): Boolean = js.native
  def acceptsEncoding(types: js.Array[String]): Boolean = js.native
  
  /** available when authorizationParser plugin is used */
  var authorization: js.UndefOr[RequestAuthorization] = js.native
  
  /** available when bodyParser plugin is used. */
  var body: js.UndefOr[js.Any] = js.native
  
  /**
    * returns the connection state of the request. current valid values are
    * 'close' and 'aborted'.
    */
  def connectionState(): String = js.native
  
  /**
    * pass through to getContentLength.
    */
  def contentLength(): Double = js.native
  
  /**
    * pass through to getContentType.
    */
  def contentType(): String = js.native
  
  /**
    * Stop the timer for a request handler function.
    * @param       handlerName The name of the handler.
    */
  def endHandlerTimer(handlerName: String): Unit = js.native
  
  /** available when multipartBodyParser plugin is used. */
  var files: js.UndefOr[StringDictionary[js.UndefOr[File]]] = js.native
  
  /**
    * gets the content-length header off the request.
    */
  def getContentLength(): Double = js.native
  
  /**
    * gets the content-type header.
    */
  def getContentType(): String = js.native
  
  /**
    * retrieves the complete URI requested by the client.
    */
  def getHref(): String = js.native
  
  /**
    * retrieves the request uuid. was created when the request was setup.
    */
  def getId(): String = js.native
  
  /**
    * retrieves the cleaned up url path.
    * e.g., /foo?a=1  =>  /foo
    */
  def getPath(): String = js.native
  
  /**
    * returns the raw query string
    */
  def getQuery(): String = js.native
  
  /**
    * returns the route object to which the current request was matched to.
    * Route info object structure:
    * {
    *  path: '/ping/:name',
    *  method: 'GET',
    *  versions: [],
    *  name: 'getpingname'
    * }
    */
  def getRoute(): RouteSpec = js.native
  
  /**
    * returns a parsed URL object.
    */
  def getUrl(): Url = js.native
  
  /**
    * returns the accept-version header.
    */
  def getVersion(): String = js.native
  
  /**
    * Get the case-insensitive request header key,
    * and optionally provide a default value (express-compliant).
    * Returns any header off the request. also, 'correct' any
    * correctly spelled 'referrer' header to the actual spelling used.
    * @param key - the key of the header
    * @param defaultValue - default value if header isn't found on the req
    */
  def header(key: String): String = js.native
  def header(key: String, defaultValue: String): String = js.native
  
  /**
    * pass through to getHref.
    */
  def href(): String = js.native
  
  /**
    * pass through to getId.
    */
  def id(): String = js.native
  
  /**
    * Check if the incoming request contains the Content-Type header field, and
    * if it contains the given mime type.
    * @param    type  a content-type header value
    */
  def is(`type`: String): Boolean = js.native
  
  /**
    * Check if the incoming request is chunked.
    */
  def isChunked(): Boolean = js.native
  
  /**
    * Check if the incoming request is kept alive.
    */
  def isKeepAlive(): Boolean = js.native
  
  /**
    * Check if the incoming request is encrypted.
    */
  def isSecure(): Boolean = js.native
  
  /**
    * Check if the incoming request has been upgraded.
    */
  def isUpgradeRequest(): Boolean = js.native
  
  /**
    * Check if the incoming request is an upload verb.
    */
  def isUpload(): Boolean = js.native
  
  /** bunyan logger you can piggyback on. */
  var log: typings.bunyan.mod.^ = js.native
  
  /**
    * returns the version of the route that matched.
    */
  def matchedVersion(): String = js.native
  
  /** available when queryParser or bodyParser plugin is used with mapParams enabled. */
  var params: js.UndefOr[js.Any] = js.native
  
  /**
    * pass through to getPath.
    */
  def path(): String = js.native
  
  /** available when queryParser plugin is used. */
  var query: js.UndefOr[js.Any] = js.native
  
  /**
    * Start the timer for a request handler function. You must explicitly invoke
    * endHandlerTimer() after invoking this function. Otherwise timing information
    * will be inaccurate.
    * @param       handlerName The name of the handler.
    */
  def startHandlerTimer(handlerName: String): Unit = js.native
  
  // /**
  //  * pass through to getQuery.
  //  * @public
  //  * @function query
  //  * @returns {String}
  //  */
  // query(): string;
  /**
    * returns ms since epoch when request was setup.
    */
  def time(): Double = js.native
  
  /**
    * returns any trailer header off the request. also, 'correct' any
    * correctly spelled 'referrer' header to the actual spelling used.
    * @param    name  the name of the header
    * @param    defaultValue default value if header isn't found on the req
    */
  def trailer(name: String): String = js.native
  def trailer(name: String, defaultValue: String): String = js.native
  
  /**
    * retrieves the user-agent header.
    */
  def userAgent(): String = js.native
  
  /** available when authorizationParser plugin is used */
  var username: js.UndefOr[String] = js.native
  
  /**
    * pass through to getVersion.
    */
  def version(): String = js.native
}
