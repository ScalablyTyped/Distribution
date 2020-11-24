package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "deepStrictEqual")
@js.native
object deepStrictEqual extends js.Object {
  
  /**
    * Assert that actual is deeply equal to expected, as determined by the strict equality operator ===.
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
