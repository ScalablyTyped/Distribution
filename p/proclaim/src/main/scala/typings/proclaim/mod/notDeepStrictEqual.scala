package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "notDeepStrictEqual")
@js.native
object notDeepStrictEqual extends js.Object {
  
  /**
    * Assert that actual is not deeply equal to expected, as determined by the strict not equal operator !==.
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError | Unit = js.native
}
