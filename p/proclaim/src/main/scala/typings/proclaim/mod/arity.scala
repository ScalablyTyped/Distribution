package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "arity")
@js.native
object arity extends js.Object {
  
  /**
    * Assert that fn.length === expected.
    */
  def apply(fn: js.Function0[Unit], expected: js.Any): AssertionError | Unit = js.native
  def apply(fn: js.Function0[Unit], expected: js.Any, msg: String): AssertionError | Unit = js.native
}
