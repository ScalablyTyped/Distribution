package typings
package atProtobufjsFetchLib.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/fetch", JSImport.Namespace)
@js.native
object fetchModMembers extends js.Object {
  /**
   * Fetches the contents of a file.
   * @memberof util
   * @param {string} filename File path or url
   * @param {FetchOptions} options Fetch options
   * @param {FetchCallback} callback Callback function
   * @returns {undefined}
   */
  def apply(filename: java.lang.String, options: FetchOptions, callback: atProtobufjsFetchLib.FetchCallback): scala.Unit = js.native
  /**
   * Fetches the contents of a file.
   * @name util.fetch
   * @function
   * @param {string} path File path or url
   * @param {FetchOptions} [options] Fetch options
   * @returns {Promise<string|Uint8Array>} Promise
   * @variation 3
   */
  def apply(path: java.lang.String): js.Promise[java.lang.String | stdLib.Uint8Array] = js.native
  /**
   * Fetches the contents of a file.
   * @name util.fetch
   * @function
   * @param {string} path File path or url
   * @param {FetchCallback} callback Callback function
   * @returns {undefined}
   * @variation 2
   */
  def apply(path: java.lang.String, callback: atProtobufjsFetchLib.FetchCallback): scala.Unit = js.native
  /**
   * Fetches the contents of a file.
   * @name util.fetch
   * @function
   * @param {string} path File path or url
   * @param {FetchOptions} [options] Fetch options
   * @returns {Promise<string|Uint8Array>} Promise
   * @variation 3
   */
  def apply(path: java.lang.String, options: FetchOptions): js.Promise[java.lang.String | stdLib.Uint8Array] = js.native
}

