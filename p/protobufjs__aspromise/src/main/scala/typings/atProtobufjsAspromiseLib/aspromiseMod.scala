package typings
package atProtobufjsAspromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/aspromise", JSImport.Namespace)
@js.native
object aspromiseMod extends js.Object {
  /**
   * Returns a promise from a node-style callback function.
   * @memberof util
   * @param {asPromiseCallback} fn Function to call
   * @param {*} ctx Function context
   * @param {...*} params Function arguments
   * @returns {Promise<*>} Promisified function
   */
  def apply(fn: atProtobufjsAspromiseLib.asPromiseCallback, ctx: js.Any, params: js.Any*): stdLib.Promise[_] = js.native
}

