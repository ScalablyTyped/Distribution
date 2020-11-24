package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "lessThan")
@js.native
object lessThan extends js.Object {
  
  /**
    * Assert that actual < expected.
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
