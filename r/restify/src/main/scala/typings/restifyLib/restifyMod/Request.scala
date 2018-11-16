package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends nodeLib.httpMod.IncomingMessage {
  /** available when authorizationParser plugin is used */
  var authorization: js.UndefOr[RequestAuthorization] = js.native
  /** available when bodyParser plugin is used. */
  var body: js.UndefOr[js.Any] = js.native
  /** available when serveStatic plugin is used. */
  var files: js.UndefOr[ScalablyTyped.runtime.StringDictionary[RequestFileInterface]] = js.native
  /** bunyan logger you can piggyback on. */
  var log: bunyanLib.bunyanMod.namespaced = js.native
  /** available when queryParser or bodyParser plugin is used with mapParams enabled. */
  var params: js.UndefOr[js.Any] = js.native
  /** available when queryParser plugin is used. */
  var query: js.UndefOr[js.Any] = js.native
  /** available when authorizationParser plugin is used */
  var username: js.UndefOr[java.lang.String] = js.native
  /**
       * Builds an absolute URI for the request.
       */
  def absoluteUri(path: java.lang.String): java.lang.String = js.native
  /**
       * checks if the accept header is present and has the value requested.
       * e.g., req.accepts('html');
       * @param    types an array of accept type headers
       */
  def accepts(types: java.lang.String): scala.Boolean = js.native
  /**
       * checks if the accept header is present and has the value requested.
       * e.g., req.accepts('html');
       * @param    types an array of accept type headers
       */
  def accepts(types: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
       * checks if the request accepts the encoding types.
       * @param    types an array of accept type headers
       */
  def acceptsEncoding(types: java.lang.String): scala.Boolean = js.native
  /**
       * checks if the request accepts the encoding types.
       * @param    types an array of accept type headers
       */
  def acceptsEncoding(types: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
       * returns the connection state of the request. current valid values are
       * 'close' and 'aborted'.
       */
  def connectionState(): java.lang.String = js.native
  /**
       * pass through to getContentLength.
       */
  def contentLength(): scala.Double = js.native
  /**
       * pass through to getContentType.
       */
  def contentType(): java.lang.String = js.native
  /**
       * Stop the timer for a request handler function.
       * @param       handlerName The name of the handler.
       */
  def endHandlerTimer(handlerName: java.lang.String): scala.Unit = js.native
  /**
       * gets the content-length header off the request.
       */
  def getContentLength(): scala.Double = js.native
  /**
       * gets the content-type header.
       */
  def getContentType(): java.lang.String = js.native
  /**
       * retrieves the complete URI requested by the client.
       */
  def getHref(): java.lang.String = js.native
  /**
       * retrieves the request uuid. was created when the request was setup.
       */
  def getId(): java.lang.String = js.native
  /**
       * retrieves the cleaned up url path.
       * e.g., /foo?a=1  =>  /foo
       */
  def getPath(): java.lang.String = js.native
  /**
       * returns the raw query string
       */
  def getQuery(): java.lang.String = js.native
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
  def getUrl(): nodeLib.urlMod.Url = js.native
  /**
       * returns the accept-version header.
       */
  def getVersion(): java.lang.String = js.native
  /**
       * Get the case-insensitive request header key,
       * and optionally provide a default value (express-compliant).
       * Returns any header off the request. also, 'correct' any
       * correctly spelled 'referrer' header to the actual spelling used.
       * @param key - the key of the header
       * @param defaultValue - default value if header isn't found on the req
       */
  def header(key: java.lang.String): java.lang.String = js.native
  /**
       * Get the case-insensitive request header key,
       * and optionally provide a default value (express-compliant).
       * Returns any header off the request. also, 'correct' any
       * correctly spelled 'referrer' header to the actual spelling used.
       * @param key - the key of the header
       * @param defaultValue - default value if header isn't found on the req
       */
  def header(key: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  /**
       * pass through to getHref.
       */
  def href(): java.lang.String = js.native
  /**
       * pass through to getId.
       */
  def id(): java.lang.String = js.native
  /**
       * Check if the incoming request contains the Content-Type header field, and
       * if it contains the given mime type.
       * @param    type  a content-type header value
       */
  def is(`type`: java.lang.String): scala.Boolean = js.native
  /**
       * Check if the incoming request is chunked.
       */
  def isChunked(): scala.Boolean = js.native
  /**
       * Check if the incoming request is kept alive.
       */
  def isKeepAlive(): scala.Boolean = js.native
  /**
       * Check if the incoming request is encrypted.
       */
  def isSecure(): scala.Boolean = js.native
  /**
       * Check if the incoming request has been upgraded.
       */
  def isUpgradeRequest(): scala.Boolean = js.native
  /**
       * Check if the incoming request is an upload verb.
       */
  def isUpload(): scala.Boolean = js.native
  /**
       * returns the version of the route that matched.
       */
  def matchedVersion(): java.lang.String = js.native
  /**
       * pass through to getPath.
       */
  def path(): java.lang.String = js.native
  /**
       * Start the timer for a request handler function. You must explicitly invoke
       * endHandlerTimer() after invoking this function. Otherwise timing information
       * will be inaccurate.
       * @param       handlerName The name of the handler.
       */
  def startHandlerTimer(handlerName: java.lang.String): scala.Unit = js.native
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
  def time(): scala.Double = js.native
  /**
       * returns any trailer header off the request. also, 'correct' any
       * correctly spelled 'referrer' header to the actual spelling used.
       * @param    name  the name of the header
       * @param    defaultValue default value if header isn't found on the req
       */
  def trailer(name: java.lang.String): java.lang.String = js.native
  /**
       * returns any trailer header off the request. also, 'correct' any
       * correctly spelled 'referrer' header to the actual spelling used.
       * @param    name  the name of the header
       * @param    defaultValue default value if header isn't found on the req
       */
  def trailer(name: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  /**
       * retrieves the user-agent header.
       */
  def userAgent(): java.lang.String = js.native
  /**
       * pass through to getVersion.
       */
  def version(): java.lang.String = js.native
}

