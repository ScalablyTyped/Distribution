package typings
package sendLib.sendMod.sendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendStream
  extends nodeLib.streamMod.Stream {
  /**
    * Emit error with `status`.
    * @private
    */
  def error(status: scala.Double): scala.Unit = js.native
  def error(status: scala.Double, error: nodeLib.Error): scala.Unit = js.native
  /**
    * @deprecated pass etag as option
    * Enable or disable etag generation.
    */
  def etag(`val`: scala.Boolean): SendStream = js.native
  /**
    * @deprecated pass root as option
    * Set root `path`.
    */
  def from(paths: java.lang.String): SendStream = js.native
  /**
    * Check if the pathname ends with "/".
    * @private
    */
  def hasTrailingSlash(): scala.Boolean = js.native
  /**
    * Raise error that headers already sent.
    * @private
    */
  def headersAlreadySent(): scala.Unit = js.native
  /**
    * @deprecated use dotfiles option
    * Enable or disable "hidden" (dot) files.
    */
  def hidden(`val`: scala.Boolean): SendStream = js.native
  def index(paths: java.lang.String): SendStream = js.native
  /**
    * @deprecated pass index as option
    * Set index `paths`, set to a falsy value to disable index support.
    */
  def index(paths: js.Array[java.lang.String]): SendStream = js.native
  /**
    * Check if the request is cacheable, aka responded with 2xx or 304 (see RFC 2616 section 14.2{5,6}).
    * @private
    */
  def isCachable(): scala.Boolean = js.native
  /**
    * Check if this is a conditional GET request.
    * @private
    */
  def isConditionalGET(): scala.Boolean = js.native
  /**
    * Check if the cache is fresh.
    * @private
    */
  def isFresh(): scala.Boolean = js.native
  /**
    * Check if the range is fresh.
    * @private
    */
  def isRangeFresh(): scala.Boolean = js.native
  /**
    * @deprecated pass maxAge as option
    * Set max-age to `maxAge`.
    */
  def maxage(maxAge: java.lang.String): SendStream = js.native
  def maxage(maxAge: scala.Double): SendStream = js.native
  /**
    * Respond with 304 not modified.
    * @private
    */
  def notModified(): scala.Unit = js.native
  /**
    * Handle stat() error.
    * @private
    */
  def onStatError(error: nodeLib.Error): scala.Unit = js.native
  /**
    * Redirect to path.
    * @private
    */
  def redirect(path: java.lang.String): scala.Unit = js.native
  /**
    * Strip content-* header fields.
    * @private
    */
  def removeContentHeaderFields(): scala.Unit = js.native
  /**
    * @deprecated pass root as option
    * Set root `path`.
    */
  def root(paths: java.lang.String): SendStream = js.native
  /**
    * Transfer `path`.
    */
  def send(path: java.lang.String): scala.Unit = js.native
  def send(path: java.lang.String, stat: nodeLib.fsMod.Stats): scala.Unit = js.native
  /**
    * Transfer file for `path`.
    * @private
    */
  def sendFile(path: java.lang.String): scala.Unit = js.native
  /**
    * Transfer index for `path`.
    * @private
    */
  def sendIndex(path: java.lang.String): scala.Unit = js.native
  /**
    * Set response header fields, most fields may be pre-defined.
    * @private
    */
  def setHeader(path: java.lang.String, stat: nodeLib.fsMod.Stats): scala.Unit = js.native
  /**
    * Transfer index for `path`.
    * @private
    */
  def stream(path: java.lang.String): scala.Unit = js.native
  def stream(path: java.lang.String, options: js.Object): scala.Unit = js.native
  /**
    * Set content-type based on `path` if it hasn't been explicitly set.
    * @private
    */
  def `type`(path: java.lang.String): scala.Unit = js.native
}

