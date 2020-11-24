package typings.promisifyNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promisify-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Public API for Promisify.  Will resolve modules names using `require`.
    *
    * @param {*} name - Can be a module name, object, or function.
    * @param {Function} test - Optional function to identify async methods.
    * @param {Boolean} noMutate - Optional set to true to avoid mutating the target.
    * @returns {*} exports - The resolved value from require or passed in value.
    */
  def apply(name: String): js.Any = js.native
  def apply(name: String, test: js.UndefOr[scala.Nothing], noMutate: Boolean): js.Any = js.native
  def apply(name: String, test: js.Function): js.Any = js.native
  def apply(name: String, test: js.Function, noMutate: Boolean): js.Any = js.native
  def apply(name: js.Function): js.Any = js.native
  def apply(name: js.Function, test: js.UndefOr[scala.Nothing], noMutate: Boolean): js.Any = js.native
  def apply(name: js.Function, test: js.Function): js.Any = js.native
  def apply(name: js.Function, test: js.Function, noMutate: Boolean): js.Any = js.native
  def apply(name: js.Object): js.Any = js.native
  def apply(name: js.Object, test: js.UndefOr[scala.Nothing], noMutate: Boolean): js.Any = js.native
  def apply(name: js.Object, test: js.Function): js.Any = js.native
  def apply(name: js.Object, test: js.Function, noMutate: Boolean): js.Any = js.native
}
