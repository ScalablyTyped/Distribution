package typings.proclaim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proclaim", "isNotEnumerable")
@js.native
object isNotEnumerable extends js.Object {
  
  /**
    * Assert that obj[property] is not enumerable.
    */
  def apply(`object`: js.Object, property: js.Any): AssertionError | Unit = js.native
  def apply(`object`: js.Object, property: js.Any, msg: String): AssertionError | Unit = js.native
}
