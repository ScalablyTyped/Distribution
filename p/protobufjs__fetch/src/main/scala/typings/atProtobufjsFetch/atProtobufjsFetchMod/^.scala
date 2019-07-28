package typings.atProtobufjsFetch.atProtobufjsFetchMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/fetch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Fetches the contents of a file.
    * @memberof util
    * @param {string} filename File path or url
    * @param {FetchOptions} options Fetch options
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    */
  def apply(filename: String, options: FetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchOptions} [options] Fetch options
    * @returns {Promise<string|Uint8Array>} Promise
    * @variation 3
    */
  def apply(path: String): js.Promise[String | Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @name util.fetch
    * @function
    * @param {string} path File path or url
    * @param {FetchCallback} callback Callback function
    * @returns {undefined}
    * @variation 2
    */
  def apply(path: String, callback: FetchCallback): Unit = js.native
  def apply(path: String, options: FetchOptions): js.Promise[String | Uint8Array] = js.native
}

