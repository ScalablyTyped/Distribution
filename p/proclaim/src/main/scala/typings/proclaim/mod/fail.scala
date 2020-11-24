package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "fail")
@js.native
object fail extends js.Object {
  
  /**
    * Throw an assertion error.
    */
  def apply(actual: js.Any, expected: js.Any): AssertionError = js.native
  def apply(actual: js.Any, expected: js.Any, msg: js.UndefOr[scala.Nothing], operator: String): AssertionError = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String): AssertionError = js.native
  def apply(actual: js.Any, expected: js.Any, msg: String, operator: String): AssertionError = js.native
}
