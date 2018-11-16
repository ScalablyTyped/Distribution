package typings
package promisifyDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promisify-node", JSImport.Namespace)
@js.native
object promisifyDashNodeMod extends js.Object {
  /**
   * Public API for Promisify.  Will resolve modules names using `require`.
   *
   * @param {*} name - Can be a module name, object, or function.
   * @param {Function} test - Optional function to identify async methods.
   * @param {Boolean} noMutate - Optional set to true to avoid mutating the target.
   * @returns {*} exports - The resolved value from require or passed in value.
   */
  def apply(name: java.lang.String | js.Object | js.Function): js.Any = js.native
  /**
   * Public API for Promisify.  Will resolve modules names using `require`.
   *
   * @param {*} name - Can be a module name, object, or function.
   * @param {Function} test - Optional function to identify async methods.
   * @param {Boolean} noMutate - Optional set to true to avoid mutating the target.
   * @returns {*} exports - The resolved value from require or passed in value.
   */
  def apply(name: java.lang.String | js.Object | js.Function, test: js.Function): js.Any = js.native
  /**
   * Public API for Promisify.  Will resolve modules names using `require`.
   *
   * @param {*} name - Can be a module name, object, or function.
   * @param {Function} test - Optional function to identify async methods.
   * @param {Boolean} noMutate - Optional set to true to avoid mutating the target.
   * @returns {*} exports - The resolved value from require or passed in value.
   */
  def apply(name: java.lang.String | js.Object | js.Function, test: js.Function, noMutate: scala.Boolean): js.Any = js.native
}

