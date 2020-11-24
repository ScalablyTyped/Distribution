package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "doesNotInclude")
@js.native
object doesNotInclude extends js.Object {
  
  /**
    * Assert that haystack does not contain needle.
    */
  def apply(haystack: js.Any, needle: js.Any): AssertionError | Unit = js.native
  def apply(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = js.native
}
