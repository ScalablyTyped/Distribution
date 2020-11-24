package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "almostEqual")
@js.native
object almostEqual extends js.Object {
  
  /**
    * Assert that Math.abs(actual - expected) < (0.5 * Math.pow(10, -precision)).
    */
  def apply(actual: js.Any, expected: js.Any, precision: Double): AssertionError | Unit = js.native
  def apply(actual: js.Any, expected: js.Any, precision: Double, msg: String): AssertionError | Unit = js.native
}
