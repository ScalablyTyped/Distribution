package typings.send.mod

import typings.node.fsMod.Stats
import typings.node.streamMod.Stream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendStream extends Stream {
  /**
    * Emit error with `status`.
    * @private
    */
  def error(status: Double): Unit = js.native
  def error(status: Double, error: Error): Unit = js.native
  /**
    * @deprecated pass etag as option
    * Enable or disable etag generation.
    */
  def etag(`val`: Boolean): SendStream = js.native
  /**
    * @deprecated pass root as option
    * Set root `path`.
    */
  def from(paths: String): SendStream = js.native
  /**
    * Check if the pathname ends with "/".
    * @private
    */
  def hasTrailingSlash(): Boolean = js.native
  /**
    * Raise error that headers already sent.
    * @private
    */
  def headersAlreadySent(): Unit = js.native
  /**
    * @deprecated use dotfiles option
    * Enable or disable "hidden" (dot) files.
    */
  def hidden(`val`: Boolean): SendStream = js.native
  def index(paths: String): SendStream = js.native
  /**
    * @deprecated pass index as option
    * Set index `paths`, set to a falsy value to disable index support.
    */
  def index(paths: js.Array[String]): SendStream = js.native
  /**
    * Check if the request is cacheable, aka responded with 2xx or 304 (see RFC 2616 section 14.2{5,6}).
    * @private
    */
  def isCachable(): Boolean = js.native
  /**
    * Check if this is a conditional GET request.
    * @private
    */
  def isConditionalGET(): Boolean = js.native
  /**
    * Check if the cache is fresh.
    * @private
    */
  def isFresh(): Boolean = js.native
  /**
    * Check if the range is fresh.
    * @private
    */
  def isRangeFresh(): Boolean = js.native
  /**
    * @deprecated pass maxAge as option
    * Set max-age to `maxAge`.
    */
  def maxage(maxAge: String): SendStream = js.native
  def maxage(maxAge: Double): SendStream = js.native
  /**
    * Respond with 304 not modified.
    * @private
    */
  def notModified(): Unit = js.native
  /**
    * Handle stat() error.
    * @private
    */
  def onStatError(error: Error): Unit = js.native
  /**
    * Redirect to path.
    * @private
    */
  def redirect(path: String): Unit = js.native
  /**
    * Strip content-* header fields.
    * @private
    */
  def removeContentHeaderFields(): Unit = js.native
  /**
    * @deprecated pass root as option
    * Set root `path`.
    */
  def root(paths: String): SendStream = js.native
  /**
    * Transfer `path`.
    */
  def send(path: String): Unit = js.native
  def send(path: String, stat: Stats): Unit = js.native
  /**
    * Transfer file for `path`.
    * @private
    */
  def sendFile(path: String): Unit = js.native
  /**
    * Transfer index for `path`.
    * @private
    */
  def sendIndex(path: String): Unit = js.native
  /**
    * Set response header fields, most fields may be pre-defined.
    * @private
    */
  def setHeader(path: String, stat: Stats): Unit = js.native
  /**
    * Transfer index for `path`.
    * @private
    */
  def stream(path: String): Unit = js.native
  def stream(path: String, options: js.Object): Unit = js.native
  /**
    * Set content-type based on `path` if it hasn't been explicitly set.
    * @private
    */
  def `type`(path: String): Unit = js.native
}

