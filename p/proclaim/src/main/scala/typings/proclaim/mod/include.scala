package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "include")
@js.native
object include extends js.Object {
  
  /**
    * Assert that haystack contains needle.
    */
  def apply(haystack: js.Any, needle: js.Any): AssertionError | Unit = js.native
  def apply(haystack: js.Any, needle: js.Any, msg: String): AssertionError | Unit = js.native
}
