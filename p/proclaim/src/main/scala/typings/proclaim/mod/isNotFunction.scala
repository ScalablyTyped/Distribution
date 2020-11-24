package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "isNotFunction")
@js.native
object isNotFunction extends js.Object {
  
  /**
    * Assert that value is not a function.
    */
  def apply(value: js.Any): AssertionError | Unit = js.native
  def apply(value: js.Any, msg: String): AssertionError | Unit = js.native
}
