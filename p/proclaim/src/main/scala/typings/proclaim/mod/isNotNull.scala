package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "isNotNull")
@js.native
object isNotNull extends js.Object {
  
  /**
    * Assert that value !== null.
    */
  def apply(value: js.Any): AssertionError | Unit = js.native
  def apply(value: js.Any, msg: String): AssertionError | Unit = js.native
}
