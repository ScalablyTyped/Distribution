package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "deepEqual")
@js.native
object deepEqual extends js.Object {
  
  /**
    * Assert that actual is deeply equal to expected.
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
